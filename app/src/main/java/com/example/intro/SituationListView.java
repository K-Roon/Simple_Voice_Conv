package com.example.intro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SituationListView extends BaseAdapter {
    TextView txtsituation;
    ImageView imgicon;
    ArrayList<SituationList> sitList = new ArrayList<SituationList>();
    private static final String TAG = "result";

    public void addItem (int imgid, String text) {
        sitList.add(new SituationList(imgid, text));
        Log.i(TAG, "addItem: " + imgid + " " + text);
    }

    public void clearSituation() {
        sitList.clear();
    }

    public int getCount(){return sitList.size();}

    public Object getItem(int position) {return sitList.get(position);}

    public long getItemId(int position) {return (long)position;}

    public View getView(int position, View view, ViewGroup viewGroup) {
        final Context context = viewGroup.getContext();
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(R.layout.activity_situation_list_view, viewGroup, false);

        txtsituation = (TextView) view.findViewById(R.id.txtsituation);
        imgicon = (ImageView) view.findViewById(R.id.imgicon);
        SituationList situationList = this.sitList.get(position);
        Log.i(TAG, "getView: 갯뷰");
        txtsituation.setText(situationList.getText());
        imgicon.setImageResource(situationList.getImgid());
        return view;
    }
}
