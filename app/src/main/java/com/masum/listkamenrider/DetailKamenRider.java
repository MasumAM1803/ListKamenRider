package com.masum.listkamenrider;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class DetailKamenRider extends AppCompatActivity {

    public static final String EXTRA_ACTOR = "extra_actor";
    public static final String EXTRA_PLAYED = "extra_played";
    public static final String EXTRA_EPISODE = "extra_episode";
    public static final String EXTRA_SHOWTIME = "extra_showtime";
    public static final String EXTRA_NAME = "extra_name";
    public static final String EXTRA_DETAIL = "extra_detail";
    public static final String EXTRA_FORM = "extra_form";
    public static final String EXTRA_IMG = "extra_img";

    ImageView imgKamenRider;
    TextView tvKamenRiderActor, tvKamenRiderPlayed, tvKamenRiderEpisode, tvKamenRiderShowTime ,tvKamenRiderName, tvKamenRiderDetail, tvKamenRiderForm;

    private ArrayList<KamenRider> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_kamen_rider);

        tvKamenRiderActor = findViewById(R.id.tv_kamenRiderActor);
        tvKamenRiderPlayed = findViewById(R.id.tv_kamenRiderPlayed);
        tvKamenRiderEpisode = findViewById(R.id.tv_kamenRiderEpisode);
        tvKamenRiderShowTime = findViewById(R.id.tv_kamenRiderShowTime);
        tvKamenRiderName = findViewById(R.id.tv_kamenRiderName);
        tvKamenRiderDetail = findViewById(R.id.tv_kamenRiderDetail);
        tvKamenRiderForm = findViewById(R.id.tv_kamenRiderForm);
        imgKamenRider = findViewById(R.id.img_detailKamenRider);

        String KRactor = getIntent().getStringExtra(EXTRA_ACTOR);
        String KRplayed = getIntent().getStringExtra(EXTRA_PLAYED);
        String KRepisode = getIntent().getStringExtra(EXTRA_EPISODE);
        String KRshowtime = getIntent().getStringExtra(EXTRA_SHOWTIME);
        String KRname = getIntent().getStringExtra(EXTRA_NAME);
        String KRdetail = getIntent().getStringExtra(EXTRA_DETAIL);
        String KRform = getIntent().getStringExtra(EXTRA_FORM);
        int imgKR = getIntent().getIntExtra(EXTRA_IMG, 0);

        String tKRActor = KRactor;
        String tKRAPlayed = KRplayed;
        String tKREpisode = KRepisode;
        String tKRShowTime = KRshowtime;
        String tKRName = "Kamen Rider " + KRname;
        String tKRDetail = KRdetail;
        String tKRform = KRform;
        int KRimg = imgKR;

        tvKamenRiderActor.setText(tKRActor);
        tvKamenRiderPlayed.setText(tKRAPlayed);
        tvKamenRiderEpisode.setText(tKREpisode);
        tvKamenRiderShowTime.setText(tKRShowTime);
        tvKamenRiderName.setText(tKRName);
        tvKamenRiderDetail.setText(tKRDetail);
        tvKamenRiderForm.setText(tKRform);
        imgKamenRider.setImageResource(KRimg);
    }
}
