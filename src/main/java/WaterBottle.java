public class WaterBottle {
    public static Object getVolume;
    public static int setTakeVolume;
    private int volume;

    public WaterBottle(int volume){
        this.volume = volume;
    }

    public int getVolume(){
        return this.volume;
    }

    public void setTakeVolume(int getVolume) {
        this.volume = getVolume - 10 ;
    }

    public void setFillVolume(int volume) {
        this.volume = volume + 10;
    }


    //    The volume should start at 100.
//    Add a drink function that takes 10 from the volume each time it is called.
//    Create an empty function that brings the volume down to 0.
//    Create a fill function that fills the volume back to 100.

}
