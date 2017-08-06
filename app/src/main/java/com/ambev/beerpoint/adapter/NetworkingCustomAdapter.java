package com.ambev.beerpoint.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.ambev.beerpoint.R;
import com.ambev.beerpoint.helper.DownloadImageTask;
import com.ambev.beerpoint.model.Networking;
import com.ambev.beerpoint.model.Person;

import java.util.List;

/**
 * Created by matheuscatossi on 01/07/17.
 */

public class NetworkingCustomAdapter extends RecyclerView.Adapter<NetworkingCustomAdapter.MyViewHolder> {

    private Context mContext;
    private List<Person> networkingList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView name;
        public ImageView img_person;
        public LinearLayout ll_card_evento;

        public MyViewHolder(View view) {
            super(view);
            name          = (TextView)  view.findViewById(R.id.name);
            img_person    = (ImageView) view.findViewById(R.id.img_person);
        }
    }

    public NetworkingCustomAdapter(Context mContext, List<Person> networkingList) {
        this.mContext = mContext;
        this.networkingList = networkingList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_item_doctor, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {

        final Person evento = networkingList.get(position);
        holder.name.setText(evento.getName());

//        holder.doctor.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(mContext, listSchedulesActivity.class);
//                intent.putExtra("id", "" + evento.getId());
//                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//                mContext.startActivity(intent);
//            }
//        });

        new DownloadImageTask(holder.img_person).execute("https://image.freepik.com/free-photo/doctor-smiling-with-stethoscope_1154-36.jpg");
    }

    @Override
    public int getItemCount() {
        return networkingList.size();
    }

}
