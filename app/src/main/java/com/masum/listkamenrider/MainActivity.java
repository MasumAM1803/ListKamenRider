package com.masum.listkamenrider;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{

    private RecyclerView rvKamenRider;
    private ArrayList<KamenRider> list = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvKamenRider = findViewById(R.id.rv_kamenRider);
        rvKamenRider.setHasFixedSize(true);

        list.addAll(KamenRiderData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvKamenRider.setLayoutManager(new LinearLayoutManager(this));
        ListKamenRiderAdapter listKamenRiderAdapter = new ListKamenRiderAdapter(list);
        rvKamenRider.setAdapter(listKamenRiderAdapter);

        listKamenRiderAdapter.setOnItemClickCallback(new ListKamenRiderAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(KamenRider data) {
                showSelectedKamenRider(data);
            }
        });
    }

    private void showSelectedKamenRider(KamenRider kamenRider){
        Intent detailIntent = new Intent(MainActivity.this, DetailKamenRider.class);
        detailIntent.putExtra(DetailKamenRider.EXTRA_ACTOR, kamenRider.getActor());
        detailIntent.putExtra(DetailKamenRider.EXTRA_PLAYED, kamenRider.getPlayed());
        detailIntent.putExtra(DetailKamenRider.EXTRA_EPISODE, kamenRider.getEpisode());
        detailIntent.putExtra(DetailKamenRider.EXTRA_SHOWTIME, kamenRider.getShowtime());
        detailIntent.putExtra(DetailKamenRider.EXTRA_NAME, kamenRider.getName());
        detailIntent.putExtra(DetailKamenRider.EXTRA_DETAIL, kamenRider.getDetail());
        detailIntent.putExtra(DetailKamenRider.EXTRA_FORM, kamenRider.getForm());
        detailIntent.putExtra(DetailKamenRider.EXTRA_IMG, kamenRider.getPhoto());
        startActivity(detailIntent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.action_about:
                Intent aboutIntent = new Intent(MainActivity.this, AboutMe.class);
                startActivity(aboutIntent);
                break;
        }
    }
}
