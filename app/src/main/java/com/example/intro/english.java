package com.example.intro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import javax.security.auth.login.LoginException;

public class english extends AppCompatActivity {
    SituationListView situationListView = new SituationListView();
    private static final String TAG = "result";
    ListView list_situ;
    SoundPool sp;
    private MediaPlayer mp;
    Intent intent;
    String langu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english);
        list_situ = findViewById(R.id.list_situ);
        sp = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
        intent = getIntent();
        langu = intent.getStringExtra("lang");

        final int[] list_say_en = {R.raw.can_u_speak_korean_en, R.raw.famous_tour_attr_en, R.raw.hello_en, R.raw.help_me_en, R.raw.how_much_is_it_en, R.raw.how_to_go_en, R.raw.i_like_that_en,
                R.raw.nearly_hospital_en, R.raw.not_want_en, R.raw.okay_en, R.raw.restroom_en, R.raw.say_again_en, R.raw.sorry_en, R.raw.thanku_en};
        final int[] list_say_ch = {R.raw.can_u_speak_korean_ch, R.raw.famous_tour_attr_ch, R.raw.hello_ch, R.raw.help_me_ch, R.raw.how_much_is_it_ch, R.raw.how_to_go_ch, R.raw.i_like_that_ch,
                R.raw.nearly_hospital_ch, R.raw.not_want_ch, R.raw.okay_ch, R.raw.restroom_ch, R.raw.say_again_ch, R.raw.sorry_ch, R.raw.thanku_ch
        };
        final int[] list_say_jp = {R.raw.can_u_speak_korean_jp, R.raw.famous_tour_attr_jp, R.raw.hello_jp, R.raw.help_me_jp, R.raw.how_much_is_it_jp, R.raw.how_to_go_jp, R.raw.i_like_that_jp,
                R.raw.nearly_hospital_jp, R.raw.not_want_jp, R.raw.okay_jp, R.raw.restroom_jp, R.raw.say_again_jp, R.raw.sorry_jp, R.raw.thanku_jp
        };


        final String[] list = {"한국어로 말하실 수 있습니까?", "유명한 관광지가 어디입니까?", "안녕하세요", "도와주세요!", "얼마입니까?", "어떻게 가나요?", "전 이게 좋습니다",
                "가까운 병원이 어디있나요?", "원하지 않습니다", "괜찮아요", "화장실이 어디있나요?", "다시 한 번 말해주세요.", "죄송합니다", "감사합니다"};


        final ArrayAdapter<String> adapter;
        adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, list);
        list_situ.setAdapter(adapter);

        list_situ.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //Toast.makeText(getApplicationContext(), ((TextView) view).getText() + list_explain[i], Toast.LENGTH_LONG).show();
                if (langu.equals("en")) {
                    mp = MediaPlayer.create(getApplicationContext(), list_say_en[i]);
                    mp.setLooping(false);
                    mp.start();
                    //sp.play(1, 1, 1, 0, 0, 1.0f);
                    Log.i(TAG, "onItemClick: " + list_say_en[i]);
                } else if (langu.equals("ch")) {
                    mp = MediaPlayer.create(getApplicationContext(), list_say_ch[i]);
                    mp.setLooping(false);
                    mp.start();
                    //sp.play(1, 1, 1, 0, 0, 1.0f);
                    Log.i(TAG, "onItemClick: " + list_say_ch[i]);
                } else if (langu.equals("jp")) {
                    mp = MediaPlayer.create(getApplicationContext(), list_say_jp[i]);
                    mp.setLooping(false);
                    mp.start();
                    //sp.play(1, 1, 1, 0, 0, 1.0f);
                    Log.i(TAG, "onItemClick: " + list_say_jp[i]);
                }

            }
        });

    }
}

