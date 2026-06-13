package Week2.oopPOTW.live;
import Week2.oopPOTW.music.Playable;
import Week2.oopPOTW.music.string.Veena;
import Week2.oopPOTW.music.wind.Saxophone;

public class Test {
    public static void main(String[] args) {

        Veena v = new Veena();
        Saxophone s = new Saxophone();

        v.play();
        s.play();



        Playable p1 = new Veena();
        Playable p2 = new Saxophone();

        p1.play();
        p2.play();
    }
}
