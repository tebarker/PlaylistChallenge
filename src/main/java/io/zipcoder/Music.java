package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){

        int next = goingForward(startIndex, selection);
        int back = goingBackwards(startIndex, selection);

        if (back > next) {
            return next;
        } else {
            return back;
        }
    }

    public Integer goingForward(Integer startIndex, String selection) {
        int forwardCount = 0;
        for (int i = startIndex; !playList[i].contains(selection); i++) {
            if (i == playList.length - 1) {
                i = -1;
            }
            forwardCount++;

        }
        return forwardCount;
    }


    public Integer goingBackwards(Integer startIndex, String selection){
        int backCount = 0;
        for(int i = startIndex; !playList[i].contains(selection); i--){
            if(i == 0){
                i = playList.length;
            } backCount++;

        } return backCount;
    }



}


