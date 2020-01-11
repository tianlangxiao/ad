package cn.ac.ict.test02;

import androidx.appcompat.app.AppCompatActivity;
import cn.ac.ict.test02.okhttp.CallBackUtil;
import cn.ac.ict.test02.okhttp.OkhttpUtil;
import okhttp3.Call;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;

import com.google.gson.Gson;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

//下载文件

public class DownLoadActivity extends AppCompatActivity implements Handler.Callback{
    String baseUrl = "http://file-ictpar-com.oss-cn-beijing.aliyuncs.com/";
    int status;
    List<String> list1;
    List<String> list2;
    String TAG = "DownLoadActivity";

    Handler handler;
    Timer timer;
int count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_down_load);

        list1 = new ArrayList<>();
        list2 = new ArrayList<>();
        makeRootDirectory("/sdcard/load");
        findViewById(R.id.click).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downLoad();
            }
        });
        findViewById(R.id.click2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                timer = new Timer();
                timer.schedule(task, 5000, 5000);
                handler = new Handler(DownLoadActivity.this);
            }
        });
    }
    TimerTask task = new TimerTask() {
        @Override
        public void run() {
            count++;
            Message message = handler.obtainMessage();
            message.what = 1;
            handler.sendMessage(message);
        }
    };
    @Override
    public boolean handleMessage(Message msg) {
        switch (msg.what) {
            case 1:
               downFile(count);
                break;
        }
        return false;
    }

    private void downFile(int count) {
        OkhttpUtil.okHttpDownloadFile(baseUrl + list1.get(count), new CallBackUtil.CallBackFile("/sdcard/load", list2.get(count)) {
            @Override
            public void onFailure(Call call, Exception e) {
                Log.e(TAG, "onFailure: "+call );
                Log.e(TAG, "onFailure: "+e );
            }

            @Override
            public void onResponse(File response) {

                Log.e(TAG, "onResponse: " + response);
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        timer.cancel();
    }
    private void downLoad() {
        String url = "http://par.ict.ac.cn:10000/2/event/eventbydate/Parkinson/0/1";

        OkhttpUtil.okHttpGet(url, new CallBackUtil.CallBackString() {
            @Override
            public void onFailure(Call call, Exception e) {
                Log.e(TAG, "onFailure: "+e );
            }

            @Override
            public void onResponse(String response) {
                try {
                    JSONObject json = new JSONObject(response);
                    status = json.getInt("status");
                } catch (JSONException e) {
                    e.printStackTrace();
                }

                if (status == 0) {
                    Gson gson = new Gson();
                    LoadData loadData = gson.fromJson(response, LoadData.class);

                    for (LoadData.ResultBean.DataBean bean : loadData.getResult().getData()) {
                        list1.add(bean.getFile());
                        list2.add(bean.getPatient()+"_"+bean.getType()+"_" + bean.getFile().replace("Parkins/",""));

                    }
                }
            }
        });

    }

    /**
     * 将字符串写入到文本文件中
     */
    public void writeTxtToFile(String strcontent, String filePath, String fileName) {
        //生成文件夹之后，再生成文件，不然会出错
        makeFilePath(filePath, fileName);
        String strFilePath = filePath + fileName;
        // 每次写入时，都换行写
        String strContent = strcontent + "\r\n";
        try {
            File file = new File(strFilePath);
            if (!file.exists()) {
                Log.d("TestFile", "Create the file:" + strFilePath);
                file.getParentFile().mkdirs();
                file.createNewFile();
            }
            RandomAccessFile raf = new RandomAccessFile(file, "rwd");
            raf.seek(file.length());
            raf.write(strContent.getBytes());
            raf.close();
        } catch (Exception e) {
            Log.e("TestFile", "Error on write File:" + e);
        }
    }

    /**
     * 生成文件夹
     */
    public void makeRootDirectory(String filePath) {
        File file = null;
        try {
            file = new File(filePath);
            if (!file.exists()) {
                file.mkdir();
            }
        } catch (Exception e) {
            Log.i("error:", e + "");
        }
    }

    /**
     * 生成文件
     */
    public File makeFilePath(String filePath, String fileName) {
        File file = null;
        makeRootDirectory(filePath);
        try {
            file = new File(filePath + fileName);
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return file;
    }

}
