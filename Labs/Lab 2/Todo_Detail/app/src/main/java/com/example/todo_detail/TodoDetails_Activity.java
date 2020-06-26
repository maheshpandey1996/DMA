package com.example.todo_detail;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TextView;

public class TodoDetails_Activity extends AppCompatActivity {
    private TextView textView;
    private String[] description;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_todo_details_);

        Resources res = getResources();
        description = res.getStringArray(R.array.todo_description);

        int x = getIntent().getIntExtra("tasks", 0);


        textView = findViewById(R.id.textView2);
//        textView.setText(""+currentIndex);
        textView.setText(description[x]);
    }
}
