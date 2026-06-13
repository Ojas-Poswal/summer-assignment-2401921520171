package Week2.oopPOTW.music.wind;

import Week2.oopPOTW.music.Playable;
public class Saxophone implements Playable {
    @Override
    public void play() {
        System.out.println("We are playing the Saxophone!");
    }
}
