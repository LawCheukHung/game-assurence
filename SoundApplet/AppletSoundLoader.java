import java.applet.*;
import java.net.URL;
import javax.swing.*;

class AppletSoundLoader extends Thread {
    JApplet applet;
    AppletSoundList soundList;
    URL baseURL;
    String relativeURL;

    public AppletSoundLoader(JApplet applet, AppletSoundList soundList,
                       URL baseURL, String relativeURL) {
        System.out.println(relativeURL);
        this.applet = applet;
        this.soundList = soundList;
        this.baseURL = baseURL;
        this.relativeURL = relativeURL;
        setPriority(MIN_PRIORITY);
        start();
    }

    public void run() {
        AudioClip audioClip = applet.getAudioClip(baseURL, relativeURL);
        soundList.putClip(audioClip, relativeURL);
    }
}
