package co.edu.konradlorenz.cardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class AlbumsActivity extends AppCompatActivity {
    private ArrayList<String> albumList;
    private ArrayAdapter<String> neoAdapter;
    private ListView neoListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums);
        //Adding artist lists
        neoListView=(ListView)findViewById(R.id.lviAlbumList);
        String[] val= new String[]{"Rock","Clasico","Pop"};
        neoAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,val);
        neoListView.setAdapter(neoAdapter);
    }
}
