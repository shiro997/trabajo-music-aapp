package co.edu.konradlorenz.cardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ArtistActivity extends AppCompatActivity {
    private ArrayList<String> artistList;
    private ArrayAdapter<String> neoAdapter;
    private ListView neoListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist);
        //Adding artist lists
        neoListView=(ListView)findViewById(R.id.lviArtistList);
        String[] val= new String[]{"Greenday","Aerosmith","Metallica"};
        neoAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,val);
        neoListView.setAdapter(neoAdapter);
    }
}
