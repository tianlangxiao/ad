package cn.ac.ict.test02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

public class Main2Activity extends AppCompatActivity {

    private static final String TAG = Main2Activity.class.getSimpleName();
    private int[] msg = {1, 1, 1, 2, 2, 2, 3, 3, 4, 5};
    private int[] all=new int[10];
    private String[] str={"1","2","3","4","5","6","7","8","9","10"};
    private int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        for (int i = 0; i < msg.length; i++) {
           all[10-i-1]=msg[i];
        }
        for (int i = 0; i < all.length; i++) {
            Log.e(TAG, "onCreate: all  "+all[i] );
            if (count != all[i]) {
                Log.e(TAG, "onCreate str: " + str[i]);
            }
            count=all[i];
        }
    }
}
