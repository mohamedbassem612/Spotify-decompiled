package p;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class m58 extends AudioTrack$StreamEventCallback {
    public final /* synthetic */ n58 a;

    public m58(n58 n58Var) {
        this.a = n58Var;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i) {
        ((o58) this.a.c).i.h(-1, new um5((byte) 28));
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        ((o58) this.a.c).i.h(-1, new um5((byte) 29));
    }

    public final void onTearDown(AudioTrack audioTrack) {
        ((o58) this.a.c).i.h(-1, new um5((byte) 28));
    }
}
