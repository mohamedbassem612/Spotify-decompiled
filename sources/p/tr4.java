package p;

import android.media.MediaPlayer;
import com.spotify.base.java.logging.Logger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class tr4 implements MediaPlayer.OnErrorListener {
    public final /* synthetic */ vr4 a;
    public final /* synthetic */ ohd b;

    public tr4(vr4 vr4Var, ohd ohdVar) {
        this.a = vr4Var;
        this.b = ohdVar;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        Logger.k(cy30.i(i, "MediaPlayer error: what=", i2, ", extra="), new Object[0]);
        vr4 vr4Var = this.a;
        vr4Var.b = null;
        this.b.q((Throwable) null);
        vr4Var.b();
        return false;
    }
}
