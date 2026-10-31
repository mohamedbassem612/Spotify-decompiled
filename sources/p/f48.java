package p;

import com.spotify.playbacknative.AudioDriverListener;
import com.spotify.playbacknative.AudioTrackAdapter;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class f48 implements AudioDriverListener {
    public final /* synthetic */ g48 a;

    public f48(g48 g48Var) {
        this.a = g48Var;
    }

    public final void onAudioTrackCreated(AudioTrackAdapter audioTrackAdapter) {
        this.a.b.set(audioTrackAdapter.getAudioSessionId());
    }

    public final void onAudioTrackDestroyed(AudioTrackAdapter audioTrackAdapter) {
        this.a.b.compareAndSet(audioTrackAdapter.getAudioSessionId(), 0);
    }

    public final void onPaused(boolean z, int i) {
        g48 g48Var = this.a;
        int i2 = g48Var.b.get();
        if (i2 == i || i2 == 0) {
            Iterator it = g48Var.c.iterator();
            while (it.hasNext()) {
                i48 i48Var = ((h48) it.next()).a;
                i48Var.d = z;
                i48Var.b.onNext(z || i48Var.e ? ut7.b : ut7.a);
            }
        }
    }

    public final void onFlushComplete(int i) {
    }

    public final void onFlushStart(int i) {
    }
}
