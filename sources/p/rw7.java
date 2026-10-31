package p;

import android.media.AudioManager;
import com.spotify.messages.AudioManagerProxyEvent;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rw7 implements AudioManager.OnAudioFocusChangeListener {
    public final /* synthetic */ uw7 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ AudioManager.OnAudioFocusChangeListener c;

    public rw7(uw7 uw7Var, int i, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
        this.a = uw7Var;
        this.b = i;
        this.c = onAudioFocusChangeListener;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        String strE;
        km3 km3Var = this.a.b;
        ow7 ow7VarN = AudioManagerProxyEvent.n();
        ow7VarN.s(td6.c(this.b));
        ow7VarN.z("FOCUS_CHANGED");
        if (i == -3) {
            strE = "AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK";
        } else if (i == -2) {
            strE = "AUDIOFOCUS_LOSS_TRANSIENT";
        } else if (i != -1) {
            strE = i != 1 ? gvg.e(i, "UNKNOWN(", ")") : "AUDIOFOCUS_GAIN";
        } else {
            strE = "AUDIOFOCUS_LOSS";
        }
        ow7VarN.u(strE);
        ((t2j0) km3Var.b).a(ow7VarN.build());
        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.c;
        if (onAudioFocusChangeListener != null) {
            onAudioFocusChangeListener.onAudioFocusChange(i);
        }
    }
}
