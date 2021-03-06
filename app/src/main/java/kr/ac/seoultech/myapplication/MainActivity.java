package kr.ac.seoultech.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private final static String TAG = MainActivity. class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "on create");

        Button btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(this);
        Button btn2 = (Button) findViewById(R.id.btn2);
        btn2.setOnClickListener(this);
        Button btn3 = (Button) findViewById(R.id.btn3);
        btn3.setOnClickListener(this);
        Button btn_simpleList = (Button) findViewById(R.id.btn_simpleList);
        btn_simpleList.setOnClickListener(this);
        Button btn_todo_list = (Button) findViewById(R.id.btn_todo_list);
        btn_todo_list.setOnClickListener(this);
        Button btn_todo_list_db = (Button) findViewById(R.id.btn_todo_list_db);
        btn_todo_list_db.setOnClickListener(this);
        Button btn_http_image = (Button) findViewById(R.id.btn_http_image);
        btn_http_image.setOnClickListener(this);


    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "on start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "on resume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "on pause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "on stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "on destroy");
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn1: {
                Toast.makeText(this, String.valueOf(R.id.btn1), Toast.LENGTH_LONG).show();
                break;
            }
            case R.id.btn2: {
                Intent intent = new Intent(this, SubActivity.class);
                startActivity(intent);
                break;

            }
            case R.id.btn3: {
                Intent intent = new Intent(this, LoginActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.btn_simpleList: {
                startActivity(new Intent(this, SimpleListActivity.class));
                break;
            }
            case R.id.btn_todo_list : {
                startActivity(new Intent(this, TodoListActivity.class));
                break;
            }
            case R.id.btn_todo_list_db : {
                startActivity(new Intent(this, TodoListDbActivity.class));
                break;
            }
            case R.id.btn_http_image : {
                startActivity(new Intent(this, HttpImageActivity.class));
                break;
            }
        }
    }
}
