package com.example.ludenswishlist;

public class Game {
    public int gameId;
    public String gameName;
    public String genre;
    public String platform;
    public String studio;
    public String releaseDate;
    public boolean wantToPlay;
    public String shareDate;

    public Game(String gameName, String genre, String platform, String studio, String releaseDate, int gameId) {
        this.gameName = gameName;
        this.genre = genre;
        this.platform = platform;
        this.studio = studio;
        this.releaseDate = releaseDate;
        this.gameId = gameId;
    }

    public Game(int gameId, String gameName, String genre, String platform, String studio, String releaseDate, boolean wantToPlay, String shareDate) {
        this.gameId = gameId;
        this.gameName = gameName;
        this.genre = genre;
        this.platform = platform;
        this.studio = studio;
        this.releaseDate = releaseDate;
        this.wantToPlay = wantToPlay;
        this.shareDate = shareDate;
    }
    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public boolean isWantToPlay() {
        return wantToPlay;
    }

    public void setWantToPlay(boolean wantToPlay) {
        this.wantToPlay = wantToPlay;
    }

    public String getShareDate() {
        return shareDate;
    }

    public void setShareDate(String shareDate) {
        this.shareDate = shareDate;
    }


}
