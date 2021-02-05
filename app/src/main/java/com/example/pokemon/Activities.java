package com.example.pokemon;

import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * cette classe pour traiter les details des differentes activités
 */
public class Activities extends AppCompatActivity {
    List<Details> details;
    String id = "";
    String height = "";
    String weight = "";
    String description = "";
    String name = "";
    List<String> evolutionline;
    Integer evolutionstage;
    String universalheight = "";
    String universalweight = "";
    String universaltypes = "";
    String universaltypesswitch = "";
    String universaldescription = "";
    String universalname = "";
    List<String> universalevolutionline;
    String universalevolutionstage = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detailsdesactivites);
        setTitle("Details pokemons");
        final Intentapplication app = (Intentapplication) getApplicationContext();
        String pokeurl = "";
        pokeurl = app.geturl();
        String url = pokeurl;
        String a = url.substring(0, url.length() - 1);
        String b = "https://pokeapi.co/api/v2/pokemon/";
        String c = a.substring(b.length());

        universalevolutionline = new ArrayList<>();
        evolutionline = new ArrayList<>();
        TextView textView = (TextView) findViewById(R.id.index);
        final ImageView imageview = (ImageView) findViewById(R.id.details);

        details = new ArrayList<>();
        Pokemons poke = new Retrofit.Builder()
                .baseUrl(Pokemons.ENDPOINT2)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(Pokemons.class);
        int cc = Integer.parseInt(c);
        if (cc >= 808) {
            Intent intent1 = new Intent(this, ListActivities.class);
            startActivity(intent1);
            CharSequence text = "Pokemon NOT available yet";
            int duration = Toast.LENGTH_LONG;
            Toast toast = Toast.makeText(getApplicationContext(), text, duration);
            toast.show();
        } else {
            poke.getPokemonsdetails(c).enqueue(new Callback<List<Details>>() {
                @Override
                public void onResponse(Call<List<Details>> call, Response<List<Details>> response) {
                    details = response.body();
                    for (int i = 0; i < details.size(); i++) {
                        id = response.body().get(i).getNumber();
                        height = response.body().get(i).getHeight();
                        weight = response.body().get(i).getWeight();
                        description = response.body().get(i).getDescription();
                        name = response.body().get(i).getName();
                        evolutionstage = response.body().get(i).getFamily().getEvolutionStage();
                        evolutionline = response.body().get(i).getFamily().getEvolutionLine();
                        List<String> types = response.body().get(i).getTypes();
                        universalheight = height;
                        universalweight = weight;
                        universaltypes = String.valueOf(types);
                        universaldescription = description;
                        universalname = name;
                        universalevolutionline = evolutionline;
                        universalevolutionstage = Integer.toString(evolutionstage);
                        textView.setText(id);

                        BottomNavigationView bottomNav = findViewById(R.id.activity_main_bottom_navigation);
                        bottomNav.setOnNavigationItemSelectedListener(navListener);


                        if (universaltypes != null) {
                            if (universaltypes.contains(",")) {
                                final String virgule = ",";
                                String mots[] = universaltypes.split(virgule);
                                String type = mots[0].substring(1);
                                universaltypesswitch = type;
                            } else {
                                String type = universaltypes.substring(1);
                                String type1 = type.substring(0, type.length() - 1);
                                universaltypesswitch = type1;
                            }
                        }

                        GradientDrawable shape = new GradientDrawable();
                        shape.setShape(GradientDrawable.RECTANGLE);
                        shape.setCornerRadii(new float[]{0, 0, 0, 0, 150f, 150f, 150f, 150f});
                        switch (universaltypesswitch) {
                            case "Steel":
                                bottomNav.setBackgroundResource(R.color.coloracier);
                                shape.setColor(getResources().getColor(R.color.coloracier));
                                break;
                            case "Ground":
                                bottomNav.setBackgroundResource(R.color.colorsol);
                                shape.setColor(getResources().getColor(R.color.colorsol));
                                break;
                            case "Fighting":
                                bottomNav.setBackgroundResource(R.color.colorcombat);
                                shape.setColor(getResources().getColor(R.color.colorcombat));
                                break;
                            case "Dragon":
                                bottomNav.setBackgroundResource(R.color.colordragon);
                                shape.setColor(getResources().getColor(R.color.colordragon));
                                break;
                            case "Fairy":
                                bottomNav.setBackgroundResource(R.color.colorfee);
                                shape.setColor(getResources().getColor(R.color.colorfee));
                                break;
                            case "Normal":
                                bottomNav.setBackgroundResource(R.color.colornormal);
                                shape.setColor(getResources().getColor(R.color.colornormal));
                                break;
                            case "Ghost":
                                bottomNav.setBackgroundResource(R.color.colorspectre);
                                shape.setColor(getResources().getColor(R.color.colorspectre));
                                break;
                            case "Flying":
                                bottomNav.setBackgroundResource(R.color.colorvol);
                                shape.setColor(getResources().getColor(R.color.colorvol));
                                break;
                            case "Psychic":
                                bottomNav.setBackgroundResource(R.color.colorpsy);
                                shape.setColor(getResources().getColor(R.color.colorpsy));
                                break;
                            case "Grass":
                                bottomNav.setBackgroundResource(R.color.colorplante);
                                shape.setColor(getResources().getColor(R.color.colorplante));
                                break;
                            case "Fire":
                                bottomNav.setBackgroundResource(R.color.colorfeu);
                                shape.setColor(getResources().getColor(R.color.colorfeu));
                                break;
                            case "Water":
                                bottomNav.setBackgroundResource(R.color.coloreau);
                                shape.setColor(getResources().getColor(R.color.coloreau));
                                break;
                            case "Electric":
                                bottomNav.setBackgroundResource(R.color.colorelectrik);
                                shape.setColor(getResources().getColor(R.color.colorelectrik));
                                break;
                            case "Poison":
                                bottomNav.setBackgroundResource(R.color.colorpoison);
                                shape.setColor(getResources().getColor(R.color.colorpoison));
                                break;
                            case "Bug":
                                bottomNav.setBackgroundResource(R.color.colorinsecte);
                                shape.setColor(getResources().getColor(R.color.colorinsecte));
                                break;
                            case "Dark":
                                bottomNav.setBackgroundResource(R.color.colortenebre);
                                shape.setColor(getResources().getColor(R.color.colortenebre));
                                break;
                            case "Ice":
                                bottomNav.setBackgroundResource(R.color.colorglace);
                                shape.setColor(getResources().getColor(R.color.colorglace));
                                break;
                            case "Rock":
                                bottomNav.setBackgroundResource(R.color.colorroche);
                                shape.setColor(getResources().getColor(R.color.colorroche));
                                break;
                        }

                        RelativeLayout myRelativeLayout = (RelativeLayout) findViewById(R.id.myRelativeLayout);
                        myRelativeLayout.setBackground(shape);
                    }
                    String url2 = "https://pokeres.bastionbot.org/images/pokemon/" + id + ".png";
                    Glide.with(Activities.this)
                            .load(url2)
                            .diskCacheStrategy(DiskCacheStrategy.NONE)//cache 0
                            .into(imageview);
                }

                @Override
                public void onFailure(Call<List<Details>> call, Throwable t) {
                }
            });

        }

    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    final ImageView imageview1 = (ImageView) findViewById(R.id.imageevol);
                    Fragment selectedFragment = null;
                    switch (item.getItemId()) {
                        case R.id.action_description:
                            selectedFragment = new Description();
                            Bundle bundle = new Bundle();
                            bundle.putString("height", universalheight);
                            bundle.putString("weight", universalweight);
                            bundle.putString("types", universaltypes);
                            bundle.putString("description", universaldescription);
                            bundle.putString("name", universalname);
                            selectedFragment.setArguments(bundle);
                            break;
                        case R.id.action_evolution:
                            selectedFragment = new Evolution();
                            Bundle bundlee = new Bundle();
                            bundlee.putString("unviersalevolutionstage", universalevolutionstage);
                            bundlee.putStringArrayList("unviersalevolutionline", (ArrayList<String>) universalevolutionline);
                            selectedFragment.setArguments(bundlee);
                            break;
                    }
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                            selectedFragment).commit();
                    return true;
                }
            };


}



