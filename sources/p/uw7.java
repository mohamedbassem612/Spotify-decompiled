package p;

import android.media.AudioDeviceInfo;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class uw7 implements mw7 {
    public final AudioManager a;
    public final km3 b;
    public final ConcurrentHashMap c = new ConcurrentHashMap();
    public final ConcurrentHashMap d = new ConcurrentHashMap();
    public final ConcurrentHashMap e = new ConcurrentHashMap();

    public uw7(AudioManager audioManager, km3 km3Var) {
        this.a = audioManager;
        this.b = km3Var;
    }

    public final int a(int i, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener2 = (AudioManager.OnAudioFocusChangeListener) this.d.remove(new qw7(i, onAudioFocusChangeListener));
        if (onAudioFocusChangeListener2 == null) {
            return 0;
        }
        this.b.I(i);
        return this.a.abandonAudioFocus(onAudioFocusChangeListener2);
    }

    public final int b(av7 av7Var, int i) {
        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = (AudioManager.OnAudioFocusChangeListener) this.d.remove(new qw7(i, av7Var.d()));
        if (onAudioFocusChangeListener == null) {
            return 0;
        }
        AudioFocusRequest audioFocusRequestF = kw7.f(av7Var, onAudioFocusChangeListener);
        this.b.I(i);
        return this.a.abandonAudioFocusRequest(audioFocusRequestF);
    }

    public final qt7[] c() {
        AudioDeviceInfo[] devices = this.a.getDevices(2);
        ArrayList arrayList = new ArrayList(devices.length);
        for (AudioDeviceInfo audioDeviceInfo : devices) {
            audioDeviceInfo.getClass();
            arrayList.add(new rt7(audioDeviceInfo));
        }
        return (qt7[]) arrayList.toArray(new qt7[0]);
    }

    public final int d() {
        try {
            return this.a.getStreamVolume(3);
        } catch (NullPointerException unused) {
            return 0;
        }
    }

    public final int e(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, int i, int i2, int i3) {
        if (Build.VERSION.SDK_INT < 26) {
            int iRequestAudioFocus = this.a.requestAudioFocus((AudioManager.OnAudioFocusChangeListener) this.d.computeIfAbsent(new qw7(i3, onAudioFocusChangeListener), new sw7(this, i3, onAudioFocusChangeListener)), i, i2);
            this.b.J(iRequestAudioFocus, i, i2, i3);
            return iRequestAudioFocus;
        }
        km3 km3Var = new km3((byte) 21);
        km3Var.S();
        km3Var.R();
        ow3 ow3VarU = km3Var.u();
        mgc mgcVar = new mgc(i2, (byte) 5);
        mgcVar.P(ow3VarU);
        if (onAudioFocusChangeListener != null) {
            mgcVar.S(onAudioFocusChangeListener);
        }
        return f(mgcVar.g(), i3);
    }

    public final int f(av7 av7Var, int i) {
        int iRequestAudioFocus;
        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListenerD = av7Var.d();
        try {
            iRequestAudioFocus = this.a.requestAudioFocus(kw7.f(av7Var, (AudioManager.OnAudioFocusChangeListener) this.d.computeIfAbsent(new qw7(i, onAudioFocusChangeListenerD), new sw7(this, i, onAudioFocusChangeListenerD))));
        } catch (NullPointerException unused) {
            iRequestAudioFocus = 0;
        }
        this.b.K(iRequestAudioFocus, av7Var, i);
        return iRequestAudioFocus;
    }

    public final void g(int i) {
        this.a.setMode(i);
    }
}
