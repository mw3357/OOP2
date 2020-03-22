package com.example.actionbar;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

public class PersonViewHolder extends RecyclerView.ViewHolder {
    public CardView cardView;
    public TextView personName;
    public TextView personInfo;
    public ImageView personsPhoto;

    public PersonViewHolder(@NonNull View itemView) {
        super(itemView);
    }

    public PersonViewHolder(View itemView, final Context context) {
        super(itemView);
        cardView = (CardView) itemView.findViewById(R.id.card_view);
        personName = (TextView) itemView.findViewById(R.id.person_name_view);
        personInfo = (TextView) itemView.findViewById(R.id.person_age_view);
        personsPhoto = (ImageView) itemView.findViewById(R.id.photo_image_view);

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, personName.getText(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}
