public class Tv implements CanOnOff, CanChangeChannel, CanChangeVolume
{
    boolean state = false;
    int channel = 1;
    int volume = 1;
    
    public void on() {
        state = true;
    }
    
    public void off() {
        state = false;
    }
    
    public void showStatus() {
        if (state == true) {
            System.out.println("The TV is turned on");
            System.out.println("Channel: " + channel);
            System.out.println("Volume: " + volume);
        } else {
            System.out.println("The TV is turned off");        
        }
    }
    
    public void channelUp() {
        if (state) {
            setChannel(channel + 1);
        }
    }
    
    public void channelDown() {
        if (state) {
            setChannel(channel - 1);
        }
    }
    
    public void setChannel(int channelNo) {
        if (state) {
            if (channelNo >= 1 && channelNo <= 99) {
                channel = channelNo;
            }
        }
    }
    
    public void volumeUp() {
        if (state) {
            setVolume(volume + 1);
        }
    }
    
    public void volumeDown() {
        if (state) {
            setVolume(volume - 1);
        }
    }
    
    public void setVolume(int newVolume) {
        if (state) {
            if (newVolume >= 1 && newVolume <= 10) {
                volume = newVolume;
            }
        }
    }
    
    
    public static void main(String[] args) {
        Tv tv1 = new Tv();
        System.out.println("_____________");
        
        /*
        tv1.on();
        tv1.showStatus();
        tv1.channelUp();
        tv1.setChannel(7);
        tv1.setChannel(142);
        tv1.showStatus();
        tv1.channelDown();
        tv1.showStatus();
        tv1.off();
        tv1.showStatus();
        */
       
       tv1.on();
       tv1.showStatus();
       tv1.setChannel(15);
       tv1.setVolume(7);
       tv1.showStatus();
       tv1.off();
       tv1.showStatus();
    }
}