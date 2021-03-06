package com.example.todo_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        if (savedInstanceState!=null)
        {
            //x=savedInstanceState.getInt(TODO_INDEX,0);
            x=savedInstanceState.getInt("tasks",0 );
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Resources res=getResources();
        tasks=res.getStringArray(R.array.todos);
        textView=findViewById(R.id.textView);
        textView.setText(tasks[x]);
        Log.d("MainActivity", "onCreate: ");


    }

    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putInt("tasks",x);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MainActivity", "onStart: ");
    }

    @Override
    protected void onPause() {
        super.onPause();

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MainActivity", "onResume: ");
    }

    //public  static  final String TODO_INDEX="todoIndex";
    public  int x=0;

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MainActivity", "onStop: ");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();


    }



    //private  String[] tasks={"play football","study","diner","sleep"};
   private String[] tasks;
    private TextView textView;
    //int currentIndex=0;

    public void prev_click(View view) {
    }

    public void next_click(View view) {
        //if ( currentIndex < (tasks.length -1))
        x= ++x%tasks.length;

        //currentIndex++;

        Log.d("MainActivity", "value of current index: "+x);

        textView.setText(tasks[x]);}


    }

