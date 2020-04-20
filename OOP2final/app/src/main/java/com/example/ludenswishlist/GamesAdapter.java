package com.example.ludenswishlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import androidx.recyclerview.widget.RecyclerView.Adapter;
import java.util.List;

public class GamesAdapter extends Adapter<GameViewHolder> {
    private List<Game> games;
    private Context context;

    public GamesAdapter(List<Game> games, Context context) {
        this.games = games;
        this.context = context;
    }

    public GameViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_game, parent, false);
        return new GameViewHolder(view, context);
    }

    public void onBindViewHolder(GameViewHolder holder, int position) {
        Game game = games.get(position);
        holder.gameName.setText(game.gameName);
        holder.gamePlatform.setText(game.platform);
        holder.gameGenre.setText(game.genre);
        holder.gameReleaseDate.setText(game.releaseDate);
        holder.gameStudio.setText(game.studio);
        holder.gamePhoto.setImageResource(game.gameId);
    }
    public int getItemCount() {
        return games.size();
    }
}
