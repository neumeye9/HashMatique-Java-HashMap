import java.util.*;

class Hashmatique{
    public static void main(String[] args){

        HashMap <String,String> trackList = new HashMap<>();

        System.out.println(trackList);

        trackList.put("I Want You To Want Me", "Lyrics1");
        trackList.put("Paradise City", "Lyrics2");
        trackList.put("Hello", "Lyrics3");
        trackList.put("Sweet Emotion", "Lyrics4");

        System.out.println(trackList);

        String lyrics = trackList.get("Paradise City");
        System.out.println(lyrics);

        Iterator it = trackList.entrySet().iterator();

        while(it.hasNext()){
            Map.Entry pair = (Map.Entry)it.next();
            System.out.println(pair.getKey() + "=" + pair.getValue());
            it.remove();

        }
    }
}