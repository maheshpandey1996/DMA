package com.example.todo_list;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import java.util.UUID;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_TODO_ID = "todo_id";
    public UUID todoId;

    public static Intent newIntent(Context packageContext, UUID todoId) {
        Intent intent = new Intent(packageContext, MainActivity.class);
        intent.putExtra(EXTRA_TODO_ID, todoId);
        return intent;    }

        /*    To decouple the fragment and make it reusable, the TodoFragment has a newInstance method    that receives a todoId and returns the fragment     */
        protected Fragment createFragment(){

            todoId = (UUID) getIntent().getSerializableExtra(EXTRA_TODO_ID);
            return todo_list.newInstance(todoId);    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragment_container);
        if (fragment == null){
            todo_list todoListFragment = new todo_list();
            fm.beginTransaction()
                    .add(R.id.fragment_container, todoListFragment)
                    .commit();
        }
    }
}

