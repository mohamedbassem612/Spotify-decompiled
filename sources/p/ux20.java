package p;

import android.os.Handler;
import com.spotify.base.java.logging.Logger;
import com.spotify.player.model.AudioStream;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ux20 implements lw7 {
    public final yfu a;
    public final Handler b;
    public final CopyOnWriteArrayList c;

    public ux20(yfu yfuVar, Handler handler, CopyOnWriteArrayList copyOnWriteArrayList) {
        this.a = yfuVar;
        this.b = handler;
        this.c = copyOnWriteArrayList;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        boolean z;
        AudioStream audioStream;
        enh0 enh0Var;
        yfu yfuVar = this.a;
        synchronized (yfuVar.b) {
            xx20 xx20Var = (xx20) yfuVar.c;
            z = xx20Var.a;
            audioStream = xx20Var.b;
            enh0Var = xx20Var.c;
        }
        Logger.g("Audio focus change: %d, HasAudioFocus = %b for AudioStreamType %s", Integer.valueOf(i), Boolean.valueOf(z), audioStream);
        if (i == -3) {
            this.a.s(false);
            this.b.post(new c57(this, !ujo1.k(enh0Var), (byte) 5));
        } else if (i == -2) {
            this.a.s(false);
            this.b.post(new tx20(this, (byte) 2));
        } else if (i == -1) {
            this.a.s(false);
            this.b.post(new tx20(this, (byte) 1));
        } else {
            if (i != 1) {
                return;
            }
            this.a.s(true);
            this.b.post(new tx20(this, (byte) 0));
        }
    }
}
