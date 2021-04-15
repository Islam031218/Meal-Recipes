package com.example.recyrcviev;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity   {
    public static ArrayList < Good > goods;
    GoodAdapter goodAdapter;
    ConstraintLayout constraintLayout;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //recyclerView
        //listView

        constraintLayout = findViewById(R.id.consLayout);
        createArrayList();
        buildRecyclerView();

    }


    private void buildRecyclerView(){
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);

        goodAdapter =new GoodAdapter(goods);

        goodAdapter.setGoodClickListener(new GoodItemClickListener() {
            @Override
            public void onClickItem(int position) {
                Intent intent = new Intent(MainActivity.this, Detailss.class);
                intent.putExtra("post",String.valueOf(position));
                startActivity(intent);
            }

        });
        recyclerView.setAdapter(goodAdapter);
    }
    private  void createArrayList(){
        goods = new ArrayList<>();
        goods.add(new Good(R.drawable.limon, "Праздничный торт с лимоном и бузиной ", "Украсьте этот " +
                "простой торт из цветов бузины и лимона съедобными цветами, чтобы получить эффектный праздничный десерт. " +
                "Идеально подходит для свадьбы или дня рождения","35 MINS"));

        goods.add(new Good(R.drawable.limon, "Праздничный торт с лимоном и бузиной ", "Украсьте этот " +
                "простой торт из цветов бузины и лимона съедобными цветами, чтобы получить эффектный праздничный десерт. " +
                "Идеально подходит для свадьбы или дня рождения","35 MINS"));

        goods.add(new Good(R.drawable.limon, "Праздничный торт с лимоном и бузиной ", "Украсьте этот " +
                "простой торт из цветов бузины и лимона съедобными цветами, чтобы получить эффектный праздничный десерт. " +
                "Идеально подходит для свадьбы или дня рождения","35 MINS"));

        goods.add(new Good(R.drawable.limon, "Праздничный торт с лимоном и бузиной ", "Украсьте этот " +
                "простой торт из цветов бузины и лимона съедобными цветами, чтобы получить эффектный праздничный десерт. " +
                "Идеально подходит для свадьбы или дня рождения","35 MINS"));

        goods.add(new Good(R.drawable.limon, "Праздничный торт с лимоном и бузиной ", "Украсьте этот " +
                "простой торт из цветов бузины и лимона съедобными цветами, чтобы получить эффектный праздничный десерт. " +
                "Идеально подходит для свадьбы или дня рождения","35 MINS"));

        goods.add(new Good(R.drawable.limon, "Праздничный торт с лимоном и бузиной ", "Украсьте этот " +
                "простой торт из цветов бузины и лимона съедобными цветами, чтобы получить эффектный праздничный десерт. " +
                "Идеально подходит для свадьбы или дня рождения","35 MINS"));

        goods.add(new Good(R.drawable.limon, "Праздничный торт с лимоном и бузиной ", "Украсьте этот " +
                "простой торт из цветов бузины и лимона съедобными цветами, чтобы получить эффектный праздничный десерт. " +
                "Идеально подходит для свадьбы или дня рождения","35 MINS"));

        goods.add(new Good(R.drawable.limon, "Праздничный торт с лимоном и бузиной ", "Украсьте этот " +
                "простой торт из цветов бузины и лимона съедобными цветами, чтобы получить эффектный праздничный десерт. " +
                "Идеально подходит для свадьбы или дня рождения","35 MINS"));

        goods.add(new Good(R.drawable.limon, "Праздничный торт с лимоном и бузиной ", "Украсьте этот " +
                "простой торт из цветов бузины и лимона съедобными цветами, чтобы получить эффектный праздничный десерт. " +
                "Идеально подходит для свадьбы или дня рождения","35 MINS"));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.basket:
                startActivity(new Intent(MainActivity.this, Favourites.class));
        }
        return super.onOptionsItemSelected(item);
    }


}