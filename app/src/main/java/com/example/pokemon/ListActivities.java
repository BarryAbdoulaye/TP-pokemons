package com.example.pokemon;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.Manifest;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ListActivities extends AppCompatActivity {
    private final int READ_EXTERNAL_STORAGE = 100;
    List<Data.Pokemon> pokemons;
    List<Data> results;
    public int pokemonsize = 0;
    private int start = 0;
    private int end = 0;
    private ArrayList<Integer> numerodepokemons = new ArrayList<Integer>();

    private String urlpoke = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.liste_activite);

        pokemons = new ArrayList<>();
        results = new ArrayList<>();

        RecyclerView recyclerViewpics = (RecyclerView) findViewById(R.id.recyclerViewPics);
        GridLayoutManager layoutManagerpics = new GridLayoutManager(this, 3);
        recyclerViewpics.setLayoutManager(layoutManagerpics);
        recyclerViewpics.setHasFixedSize(true);
        Adapter recyclerAdapterpics = new Adapter(getApplicationContext(), pokemons, numerodepokemons, start, end);
        recyclerViewpics.setAdapter(recyclerAdapterpics);

        final ImageButton imageButtongen1 = (ImageButton) findViewById(R.id.gen1);
        final ImageButton imageButtongen2 = (ImageButton) findViewById(R.id.gen2);
        final ImageButton imageButtongen3 = (ImageButton) findViewById(R.id.gen3);
        final ImageButton imageButtongen4 = (ImageButton) findViewById(R.id.gen4);
        final ImageButton imageButtongen5 = (ImageButton) findViewById(R.id.gen5);
        final ImageButton imageButtongen6 = (ImageButton) findViewById(R.id.gen6);
        final ImageButton imageButtongen7 = (ImageButton) findViewById(R.id.gen7);
        final ImageButton imageButtongen8 = (ImageButton) findViewById(R.id.gen8);

        final LayoutInflater factory = getLayoutInflater();
        final View textEntryView = factory.inflate(R.layout.row, null);
        final ImageView imageButtongen9 = (ImageView) textEntryView.findViewById(R.id.imagedetails);


        LocalBroadcastManager.getInstance(this).registerReceiver(mMessageReceiver,
                new IntentFilter("custom-message"));
        Pokemons poke = new Retrofit.Builder()
                .baseUrl(Pokemons.ENDPOINT)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(Pokemons.class);


        imageButtongen1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View button) {
                button.setSelected(!button.isSelected());
                if (button.isSelected()) {
                    setTitle("Pokemon Generation 1");
                    imageButtongen2.setSelected(false);
                    imageButtongen3.setSelected(false);
                    imageButtongen4.setSelected(false);
                    imageButtongen5.setSelected(false);
                    imageButtongen6.setSelected(false);
                    imageButtongen7.setSelected(false);
                    imageButtongen8.setSelected(false);
                    poke.getPokemons1gen().enqueue(new Callback<Data>() {
                        @Override
                        public void onResponse(Call<Data> call, Response<Data> response) {
                            pokemons = response.body().getResults();
                            recyclerAdapterpics.setpokemons(pokemons, start, end);
                        }

                        @Override
                        public void onFailure(Call<Data> call, Throwable t) {
                        }
                    });

                } else {

                }

            }
        });

        imageButtongen2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View button) {
                button.setSelected(!button.isSelected());
                if (button.isSelected()) {
                    setTitle("Pokemon Generation 2");
                    imageButtongen1.setSelected(false);
                    imageButtongen3.setSelected(false);
                    imageButtongen4.setSelected(false);
                    imageButtongen5.setSelected(false);
                    imageButtongen6.setSelected(false);
                    imageButtongen7.setSelected(false);
                    imageButtongen8.setSelected(false);
                    poke.getPokemons2gen().enqueue(new Callback<Data>() {
                        @Override
                        public void onResponse(Call<Data> call, Response<Data> response) {
                            pokemons = response.body().getResults();
                            recyclerAdapterpics.setpokemons(pokemons, start, end);
                        }

                        @Override
                        public void onFailure(Call<Data> call, Throwable t) {
                        }
                    });
                } else {
                }
            }
        });

        imageButtongen3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View button) {
                button.setSelected(!button.isSelected());
                if (button.isSelected()) {
                    setTitle("Pokemon Génération 3");
                    imageButtongen1.setSelected(false);
                    imageButtongen2.setSelected(false);
                    imageButtongen4.setSelected(false);
                    imageButtongen5.setSelected(false);
                    imageButtongen6.setSelected(false);
                    imageButtongen7.setSelected(false);
                    imageButtongen8.setSelected(false);
                    poke.getPokemons3gen().enqueue(new Callback<Data>() {
                        @Override
                        public void onResponse(Call<Data> call, Response<Data> response) {
                            pokemons = response.body().getResults();
                            recyclerAdapterpics.setpokemons(pokemons, start, end);
                        }

                        @Override
                        public void onFailure(Call<Data> call, Throwable t) {
                        }
                    });
                } else {
                }
            }
        });
        imageButtongen4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View button) {
                button.setSelected(!button.isSelected());
                if (button.isSelected()) {
                    setTitle("Pokemon Generation 4");
                    imageButtongen1.setSelected(false);
                    imageButtongen2.setSelected(false);
                    imageButtongen3.setSelected(false);
                    imageButtongen5.setSelected(false);
                    imageButtongen6.setSelected(false);
                    imageButtongen7.setSelected(false);
                    imageButtongen8.setSelected(false);
                    poke.getPokemons4gen().enqueue(new Callback<Data>() {
                        @Override
                        public void onResponse(Call<Data> call, Response<Data> response) {
                            pokemons = response.body().getResults();
                            recyclerAdapterpics.setpokemons(pokemons, start, end);
                        }

                        @Override
                        public void onFailure(Call<Data> call, Throwable t) {
                        }
                    });
                } else {
                }
            }
        });
        imageButtongen5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View button) {
                button.setSelected(!button.isSelected());
                if (button.isSelected()) {
                    setTitle("Pokemon Generation 5");
                    imageButtongen1.setSelected(false);
                    imageButtongen2.setSelected(false);
                    imageButtongen3.setSelected(false);
                    imageButtongen4.setSelected(false);
                    imageButtongen6.setSelected(false);
                    imageButtongen7.setSelected(false);
                    imageButtongen8.setSelected(false);
                    poke.getPokemons5gen().enqueue(new Callback<Data>() {
                        @Override
                        public void onResponse(Call<Data> call, Response<Data> response) {
                            pokemons = response.body().getResults();
                            recyclerAdapterpics.setpokemons(pokemons, start, end);
                        }

                        @Override
                        public void onFailure(Call<Data> call, Throwable t) {
                        }
                    });
                } else {
                }
            }
        });
        imageButtongen6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View button) {
                button.setSelected(!button.isSelected());
                if (button.isSelected()) {
                    setTitle("Pokemon Génération 6");
                    imageButtongen1.setSelected(false);
                    imageButtongen2.setSelected(false);
                    imageButtongen3.setSelected(false);
                    imageButtongen4.setSelected(false);
                    imageButtongen5.setSelected(false);
                    imageButtongen7.setSelected(false);
                    imageButtongen8.setSelected(false);
                    poke.getPokemons6gen().enqueue(new Callback<Data>() {
                        @Override
                        public void onResponse(Call<Data> call, Response<Data> response) {
                            pokemons = response.body().getResults();
                            recyclerAdapterpics.setpokemons(pokemons, start, end);
                        }

                        @Override
                        public void onFailure(Call<Data> call, Throwable t) {
                        }
                    });
                } else {
                }
            }
        });
        imageButtongen7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View button) {
                button.setSelected(!button.isSelected());
                if (button.isSelected()) {
                    setTitle("Pokemon Génération 7");
                    imageButtongen1.setSelected(false);
                    imageButtongen2.setSelected(false);
                    imageButtongen3.setSelected(false);
                    imageButtongen4.setSelected(false);
                    imageButtongen5.setSelected(false);
                    imageButtongen6.setSelected(false);
                    imageButtongen8.setSelected(false);
                    poke.getPokemons7gen().enqueue(new Callback<Data>() {
                        @Override
                        public void onResponse(Call<Data> call, Response<Data> response) {
                            pokemons = response.body().getResults();
                            recyclerAdapterpics.setpokemons(pokemons, start, end);
                        }

                        @Override
                        public void onFailure(Call<Data> call, Throwable t) {
                        }
                    });
                } else {
                }
            }
        });
        imageButtongen8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View button) {
                button.setSelected(!button.isSelected());
                if (button.isSelected()) {
                    setTitle("Pokemon Génération 8");
                    imageButtongen1.setSelected(false);
                    imageButtongen2.setSelected(false);
                    imageButtongen3.setSelected(false);
                    imageButtongen4.setSelected(false);
                    imageButtongen5.setSelected(false);
                    imageButtongen6.setSelected(false);
                    imageButtongen7.setSelected(false);
                    poke.getPokemons8gen().enqueue(new Callback<Data>() {
                        @Override
                        public void onResponse(Call<Data> call, Response<Data> response) {
                            pokemons = response.body().getResults();
                            recyclerAdapterpics.setpokemons(pokemons, start, end);
                        }

                        @Override
                        public void onFailure(Call<Data> call, Throwable t) {
                        }
                    });
                } else {
                }
            }
        });


        if (ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED)
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, READ_EXTERNAL_STORAGE);

    }

    public BroadcastReceiver mMessageReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            final Intentapplication app = (Intentapplication) getApplicationContext();
            String pokeurl = intent.getStringExtra("pokeurl");
            Intent intent1 = new Intent(ListActivities.this, Activities.class);
            app.seturl(pokeurl);
            intent.putExtra("pokeurl", pokeurl);
            startActivity(intent1);
        }
    };


}