package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){
        int up = 0;
        int down =0;
        //down playlist
        for(int i =startIndex; i < playList.length; i++){
            if (playList[i].equals(selection)){
                break;

            }
            if (i + 1 > playList.length -1){
                i= -1;
            }
            down += 1;
        }
        //up playlist
        for (int i = startIndex; i >= 0; i--){
            if (playList[i].equals(selection)){
                break;
            }
            if (i - 1 < 0){
                i=playList.length;
            }
            up += 1;
        }
        if (down > up){
            return up;
        }
        else {
            return down;
        }
        }
    }

