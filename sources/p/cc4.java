package p;

import androidx.media3.common.PlaybackException;
import com.spotify.base.java.logging.Logger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class cc4 implements o8u0 {
    public final /* synthetic */ ec4 a;
    public final /* synthetic */ ohd b;

    public cc4(ec4 ec4Var, ohd ohdVar) {
        this.a = ec4Var;
        this.b = ohdVar;
    }

    public final void H(int i) {
        if (i == 4) {
            po7 po7Var = ec4.f;
            this.a.b(this, false);
            ohd ohdVar = this.b;
            if (ohdVar.s() instanceof ago0) {
                ohdVar.resumeWith(rih1.a);
            }
        }
    }

    public final void n(PlaybackException playbackException) {
        po7 po7Var = ec4.f;
        ec4 ec4Var = this.a;
        ec4Var.getClass();
        Logger.e(playbackException, "AndroidCueAudioPlayer playback failed", new Object[0]);
        ec4Var.b(this, true);
        ohd ohdVar = this.b;
        if (ohdVar.s() instanceof ago0) {
            ohdVar.resumeWith(new m231(playbackException));
        }
    }
}
