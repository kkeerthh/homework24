import heirs.ClassicMusic;
import heirs.PopMusic;
import heirs.RockMusic;
import music.MusicStyles;

public class MainMusic {
    public static void main(String[] args) {
        PopMusic popBand = new PopMusic();
        RockMusic rockMusic = new RockMusic();
        ClassicMusic classicMusic = new ClassicMusic();

        MusicStyles[] musicBands = {popBand, rockMusic, classicMusic};

        for (MusicStyles band : musicBands) {
            System.out.print("Band: ");
            if (band instanceof PopMusic) {
                System.out.println("Pop Band. Playing pop music");
            } else if (band instanceof RockMusic) {
                System.out.println("Rock Band. Playing rock music");
            } else if (band instanceof ClassicMusic) {
                System.out.println("Classic Band. Playing classic music");
            }
            band.playMusic();
        }
    }
}
