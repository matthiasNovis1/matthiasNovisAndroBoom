package com.example.matthiasnovis.androboommatthiasnovis;


public class Profil {
    private String email;
    boolean isConnected;
    private String uid;
    private String status;
    private int score = 0;
    enum BombStatut { IDLE, AWAITING, BOMBER, BOMBED };
    private String otherUserUID;
    private String otherUseremail;


    public Profil() {
    }

    public int getScore(){

        return score;
    }


    public void setScore(int score){

        this.score=score;
    }

    public String getEmail() {
        return email;
    }
    public String getOtherUserUID() {
        return otherUserUID;
    }


    public String getOtherUseremail() {
        return otherUseremail;
    }

    public void setOtherUserUID(String otherUserId) {
        this.otherUserUID = otherUserId;
    }


    public void setOtherUseremail(String email) {
this.otherUseremail = email;
    }

    public String getStatut() {
        return status;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public boolean isConnected() {
        return isConnected;
    }
    public void setConnected(boolean connected) {
        isConnected = connected;
    }
    public String getUid() {
        return uid;
    }
    public void setUid(String uid) {
        this.uid = uid;
    }
}