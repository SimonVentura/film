package com.example.filmandroidventura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    ListView lvfilm;
    Button btnEsci;
    String film[] = {"spiderman","batman","titanic"}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvfilm = (ListView)findViewById(R.id.lvFilm);
        ArrayAdapter<String> aaFilm = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,fiml);
        lvfilm.setAdapter(aaFilm);

        btnEsci = (Button)findViewById(R.id.btnEsci);
        btnEsci.setOnclickListener(View.OnClickListener()
        {
            @override
            public void onCLick (View view){
                Toast.makeText(getApplicationContext(),"vuoi uscire", Toast.LENGTH_LONG.show();
            }
        });
    }
}