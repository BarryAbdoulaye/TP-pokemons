package com.example.pokemon;

import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

import java.util.ArrayList;
import java.util.List;

public class Evolution extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragsevol, container, false);
        Bundle bundle = this.getArguments();

        if (bundle != null) {
            String unviersalevolutionstage = bundle.getString("unviersalevolutionstage");
            List<String> universalevolutionline = new ArrayList<>();
            universalevolutionline = bundle.getStringArrayList("unviersalevolutionline");
            TextView textView3 = (TextView) view.findViewById(R.id.ohoh);
            ImageView imageView = (ImageView) view.findViewById(R.id.imageevoll);
            textView3.append(unviersalevolutionstage);

            for (int i = 1; i <= universalevolutionline.size(); i++) {
                String url = String.valueOf(universalevolutionline);
                String aa = String.valueOf((universalevolutionline));
                String a = aa.substring(1);
                String b = a.substring(0, a.length() - 1);
                final String virgule = ",";
                String c = b.replaceAll(" ", "");
                String mots[] = c.split(virgule);
                String cap = mots[i - 1].substring(0, 1).toLowerCase() + mots[i - 1].substring(1);
                if (universalevolutionline.size() == 1) {
                    String pok1 = mots[0].substring(0, 1).toLowerCase() + mots[0].substring(1);
                    RelativeLayout rl = (RelativeLayout) view.findViewById(R.id.relative);
                    ImageView imageView1 = new ImageView(getActivity());
                    rl.addView(imageView1);
                    RelativeLayout.LayoutParams par1 = (RelativeLayout.LayoutParams) imageView1.getLayoutParams();
                    par1.width = 400;
                    par1.height = 400;
                    par1.leftMargin = 0;
                    par1.bottomMargin = 300;
                    par1.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
                    imageView1.setLayoutParams(par1);
                    String url1 = "https://img.pokemondb.net/artwork/large/" + pok1 + ".jpg";
                    Glide.with(getContext())
                            .load(url1)
                            .diskCacheStrategy(DiskCacheStrategy.ALL)//cache 0
                            .into(imageView1);
                }
                if (universalevolutionline.size() == 2) {
                    String pok1 = mots[0].substring(0, 1).toLowerCase() + mots[0].substring(1);
                    String pok2 = mots[1].substring(0, 1).toLowerCase() + mots[1].substring(1);
                    RelativeLayout rl = (RelativeLayout) view.findViewById(R.id.relative);
                    ImageView imageView1 = new ImageView(getActivity());
                    ImageView imageView2 = new ImageView(getActivity());
                    rl.addView(imageView1);
                    rl.addView(imageView2);
                    RelativeLayout.LayoutParams par1 = (RelativeLayout.LayoutParams) imageView1.getLayoutParams();
                    RelativeLayout.LayoutParams par2 = (RelativeLayout.LayoutParams) imageView2.getLayoutParams();
                    par1.width = 300;
                    par1.height = 300;
                    par1.leftMargin = 0;
                    par1.bottomMargin = 300;
                    par1.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
                    imageView1.setLayoutParams(par1);
                    par2.width = 300;
                    par2.height = 300;
                    par2.leftMargin = 350;
                    par2.bottomMargin = 300;
                    par2.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
                    imageView2.setLayoutParams(par2);
                    String url1 = "https://img.pokemondb.net/artwork/large/" + pok1 + ".jpg";
                    String url2 = "https://img.pokemondb.net/artwork/large/" + pok2 + ".jpg";
                    Glide.with(getContext())
                            .load(url1)
                            .diskCacheStrategy(DiskCacheStrategy.ALL)//cache 0
                            .into(imageView1);
                    Glide.with(getContext())
                            .load(url2)
                            .diskCacheStrategy(DiskCacheStrategy.ALL)//cache 0
                            .into(imageView2);
                }
                if (universalevolutionline.size() == 3) {
                    String pok1 = mots[0].substring(0, 1).toLowerCase() + mots[0].substring(1);
                    String pok2 = mots[1].substring(0, 1).toLowerCase() + mots[1].substring(1);
                    String pok3 = mots[2].substring(0, 1).toLowerCase() + mots[2].substring(1);
                    RelativeLayout rl = (RelativeLayout) view.findViewById(R.id.relative);
                    ImageView imageView1 = new ImageView(getActivity());
                    ImageView imageView2 = new ImageView(getActivity());
                    ImageView imageView3 = new ImageView(getActivity());
                    rl.addView(imageView1);
                    rl.addView(imageView2);
                    rl.addView(imageView3);
                    RelativeLayout.LayoutParams par1 = (RelativeLayout.LayoutParams) imageView1.getLayoutParams();
                    RelativeLayout.LayoutParams par2 = (RelativeLayout.LayoutParams) imageView2.getLayoutParams();
                    RelativeLayout.LayoutParams par3 = (RelativeLayout.LayoutParams) imageView3.getLayoutParams();
                    par1.width = 300;
                    par1.height = 300;
                    par1.leftMargin = 0;
                    par1.bottomMargin = 300;
                    par1.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
                    imageView1.setLayoutParams(par1);
                    par2.width = 300;
                    par2.height = 300;
                    par2.leftMargin = 350;
                    par2.bottomMargin = 300;
                    par2.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
                    imageView2.setLayoutParams(par2);
                    par3.width = 300;
                    par3.height = 300;
                    par3.leftMargin = 700;
                    par3.bottomMargin = 300;
                    par3.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
                    imageView3.setLayoutParams(par3);
                    String url1 = "https://img.pokemondb.net/artwork/large/" + pok1 + ".jpg";
                    String url2 = "https://img.pokemondb.net/artwork/large/" + pok2 + ".jpg";
                    String url3 = "https://img.pokemondb.net/artwork/large/" + pok3 + ".jpg";
                    Glide.with(getContext())
                            .load(url1)
                            .diskCacheStrategy(DiskCacheStrategy.ALL)//cache 0
                            .into(imageView1);
                    Glide.with(getContext())
                            .load(url2)
                            .diskCacheStrategy(DiskCacheStrategy.ALL)//cache 0
                            .into(imageView2);
                    Glide.with(getContext())
                            .load(url3)
                            .diskCacheStrategy(DiskCacheStrategy.ALL)//cache 0
                            .into(imageView3);
                }

            }
        }

        return view;
    }

}
