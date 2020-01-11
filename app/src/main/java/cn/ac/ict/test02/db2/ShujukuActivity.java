package cn.ac.ict.test02.db2;

import androidx.appcompat.app.AppCompatActivity;
import cn.ac.ict.test02.R;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ShujukuActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText etsearch, etadd, etadd2, etadd3, etadd4, etold, etnew, etdelete;
    private Button btnadd, btnclean1, btnupdata, btnclean2, btndelete, btnclean3, btnsearchall, btndeleteall;
    private TextView tvshow, tvshowall;
    private SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shujuku);
        initView();
        MyDataBase mydb = new MyDataBase(ShujukuActivity.this, "test2_db", null, 1);
        db = mydb.getWritableDatabase();
    }

    private void initView() {
        etsearch = findViewById(R.id.et0);
        etadd = findViewById(R.id.et1);
        etadd2 = findViewById(R.id.et12);
        etadd3 = findViewById(R.id.et13);
        etadd4 = findViewById(R.id.et14);
        etold = findViewById(R.id.et2);
        etnew = findViewById(R.id.et3);
        etdelete = findViewById(R.id.et4);

        btnadd = findViewById(R.id.add);
        btnupdata = findViewById(R.id.updata);
        btndelete = findViewById(R.id.delete);
        btnsearchall = findViewById(R.id.search_all);
        btndeleteall = findViewById(R.id.delete_all);
        btnclean1 = findViewById(R.id.clean1);
        btnclean2 = findViewById(R.id.clean2);
        btnclean3 = findViewById(R.id.clean3);

        tvshow = findViewById(R.id.show);
        tvshowall = findViewById(R.id.show_all);

        btnadd.setOnClickListener(ShujukuActivity.this);
        btnupdata.setOnClickListener(ShujukuActivity.this);
        btndelete.setOnClickListener(ShujukuActivity.this);
        btnsearchall.setOnClickListener(ShujukuActivity.this);
        btndeleteall.setOnClickListener(ShujukuActivity.this);
        btnclean1.setOnClickListener(ShujukuActivity.this);
        btnclean2.setOnClickListener(ShujukuActivity.this);
        btnclean3.setOnClickListener(ShujukuActivity.this);

        etsearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String str = etsearch.getText().toString().trim();
                tvshow.setText(str);
                searchData(str);
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.add:
                addData();
                break;
            case R.id.updata:
                updata();
                break;
            case R.id.delete:
                deleteData();
                break;
            case R.id.search_all:
                searchAllData();
                break;
            case R.id.delete_all:
                deleteAllData();
                break;
            case R.id.clean1:
                etadd.setText("");
                break;
            case R.id.clean2:
                etold.setText("");
                etnew.setText("");
                break;
            case R.id.clean3:
                etdelete.setText("");
                break;
        }
    }

    private void deleteAllData() {
        tvshowall.setText("");
        tvshowall.setHint("查询内容为空");
    }

    private void searchAllData() {
        Cursor cursor = db.query("test", new String[]{"tid", "name", "sex"}, null, null, null, null, null);
        StringBuilder showdata = new StringBuilder();
        while (cursor.moveToNext()) {
            String tid = cursor.getString(cursor.getColumnIndex("tid"));
            String name = cursor.getString(cursor.getColumnIndex("name"));
            String sex = cursor.getString(cursor.getColumnIndex("sex"));
            showdata.append("\n" + tid + " " + name + " " + sex + " " );
        }
        tvshowall.setText(showdata.toString());
        cursor.close();
    }

    private void searchData(String str) {
        Cursor cursor = db.query("test", null, "name=?", new String[]{str}, null, null, null);
        StringBuilder showdata = new StringBuilder();
        while (cursor.moveToNext()) {
            String tid = cursor.getString(cursor.getColumnIndex("tid"));
            Log.e("sss", "searchData: "+tid );
            showdata.append("\n" + tid);
        }
        tvshowall.setText(showdata.toString());
        cursor.close();
    }

    private void deleteData() {
        db.delete("test", "name=?", new String[]{etdelete.getText().toString().trim()});
    }

    private void updata() {
        ContentValues values = new ContentValues();
        values.put("name", etnew.getText().toString().trim());
        db.update("test", values, "name=?", new String[]{etold.getText().toString().trim()});
    }

    private void addData() {
        ContentValues values = new ContentValues();
        values.put("tid", etadd.getText().toString().trim());
        values.put("name", etadd2.getText().toString().trim());
        values.put("sex", etadd3.getText().toString().trim());
        db.insert("test", null, values);
    }

}
