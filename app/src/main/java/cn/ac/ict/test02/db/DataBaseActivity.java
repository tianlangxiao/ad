package cn.ac.ict.test02.db;

import androidx.appcompat.app.AppCompatActivity;
import cn.ac.ict.test02.R;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DataBaseActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText etsearch, etadd, etold, etnew, etdelete;
    private Button btnadd, btnclean1, btnupdata, btnclean2, btndelete, btnclean3, btnsearchall, btndeleteall;
    private TextView tvshow, tvshowall;
    private SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);
        initView();
        MyDb mydb = new MyDb(DataBaseActivity.this, "test_db", null, 1);
        db = mydb.getWritableDatabase();
    }

    private void initView() {
        etsearch = findViewById(R.id.et0);
        etadd = findViewById(R.id.et1);
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

        btnadd.setOnClickListener(DataBaseActivity.this);
        btnupdata.setOnClickListener(DataBaseActivity.this);
        btndelete.setOnClickListener(DataBaseActivity.this);
        btnsearchall.setOnClickListener(DataBaseActivity.this);
        btndeleteall.setOnClickListener(DataBaseActivity.this);
        btnclean1.setOnClickListener(DataBaseActivity.this);
        btnclean2.setOnClickListener(DataBaseActivity.this);
        btnclean3.setOnClickListener(DataBaseActivity.this);

        etsearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                tvshow.setText(etsearch.getText().toString().trim());
                searchData(etsearch.getText().toString().trim());
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
        Cursor cursor = db.query("user", new String[]{"name"}, null, null, null, null, null);
        StringBuilder showdata = new StringBuilder();
        while (cursor.moveToNext()) {
            String name = cursor.getString(cursor.getColumnIndex("name"));
            showdata.append("\n" + name);
        }
        tvshowall.setText(showdata.toString());
        cursor.close();
    }

    private void searchData(String str) {
        Cursor cursor = db.query("user", null, "name=?", new String[]{str}, null, null, null);
        StringBuilder showdata = new StringBuilder();
        while (cursor.moveToNext()) {
            String name = cursor.getString(cursor.getColumnIndex("name"));
            showdata.append("\n" + name);
        }
        tvshowall.setText(showdata.toString());
        cursor.close();
    }

    private void deleteData() {
        db.delete("user", "name=?", new String[]{etdelete.getText().toString().trim()});
    }

    private void updata() {
        ContentValues values = new ContentValues();
        values.put("name", etnew.getText().toString().trim());
        db.update("user", values, "name=?", new String[]{etold.getText().toString().trim()});
    }

    private void addData() {
        ContentValues values = new ContentValues();
        values.put("name", etadd.getText().toString().trim());
        db.insert("user", null, values);
    }

}
