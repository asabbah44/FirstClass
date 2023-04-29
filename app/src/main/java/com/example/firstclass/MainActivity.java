package com.example.firstclass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.firstclass.Model.Book;
import com.example.firstclass.Model.DABook;

import java.util.ArrayList;
import java.util.List;
import java.util.PrimitiveIterator;

public class MainActivity extends AppCompatActivity {

    private Spinner lspinner;
    private Button btn;
    private TextView textView;
    private ListView lview ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lspinner = findViewById(R.id.spinner);
        textView=(TextView) findViewById(R.id.txtview);
        lview=findViewById(R.id.LbookList);
        DABook books=new DABook();
        ArrayAdapter<String> catAd=new ArrayAdapter<>(MainActivity.this,
                androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,books.getcat());
        lspinner.setAdapter(catAd);

        btn = findViewById(R.id.btnsubmit);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                List<Book> list=books.getBooksByCat(lspinner.getSelectedItem().toString());
                ArrayList<String> s=new ArrayList();
                for (Book i :list)
                      {
                        s.add(i.getTitle());
                       }
               ArrayAdapter<String > bAd=new ArrayAdapter<>(MainActivity.this,
                       androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,s);
                lview.setAdapter(bAd);



            }
        });

    }

//    public void btnSubmit(View view) {
//        DABook books=new DABook();
//        String selectCat = lspinner.getSelectedItem().toString();
//        books.getBooksByCat("Java");
//
//        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
//
//    }




}