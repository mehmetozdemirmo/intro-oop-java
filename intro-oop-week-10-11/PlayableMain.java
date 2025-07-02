import java.util.ArrayList;

public class PlayableMain {
    public static void main(String[] args) {
        ArrayList <Playable> playables=new ArrayList<>();
        playables.add(new Guitar());
        playables.add(new Drum());

        for(Playable playable:playables){
            playable.play();
        }


    }
}
