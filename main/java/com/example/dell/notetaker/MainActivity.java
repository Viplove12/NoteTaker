package com.example.dell.notetaker;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.List;

import static com.example.dell.notetaker.R.attr.title;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button addNote;
    DatabaseHandler databaseHandler;
    public static NotesAdapter notesAdapter;
    List<Note> noteList;
    ListView noteListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addNote=(Button)findViewById(R.id.addNote);
        addNote.setOnClickListener(this);

        databaseHandler=new DatabaseHandler(this);
        noteList=databaseHandler.getAllNotes();

        notesAdapter=new NotesAdapter(this,noteList);

        noteListView=(ListView)findViewById(R.id.listViewNotes);

        try{
            noteListView.setAdapter(notesAdapter);
        }catch(NullPointerException e){
            e.printStackTrace();
        }

        noteListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });


    }
    @Override
    protected void onResume() {
        super.onResume();
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.addNote:
                Intent myIntent = new Intent(MainActivity.this, EditNoteActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("source", "addPress");
                myIntent.putExtras(bundle);
                startActivity(myIntent);
                break;
            default:
                break;

        }
    }


}
