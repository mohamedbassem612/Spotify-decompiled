package p;

import androidx.appcompat.widget.AppCompatImageView;
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.betamax.player.exception.BetamaxException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class nrj1 implements c0u0 {
    public final /* synthetic */ cds a;

    public nrj1(cds cdsVar) {
        this.a = cdsVar;
    }

    public final void L(BetamaxException betamaxException, long j, long j2) {
        this.a.k();
    }

    public final void R(r4t r4tVar, int i, long j, long j2) {
        this.a.k();
    }

    public final void S(long j, long j2) {
        p1f0 p1f0Var = this.a.i;
        ((AppCompatImageView) p1f0Var.b).animate().alpha(0.0f).setDuration(300L).setListener(null);
        ((VideoSurfaceView) p1f0Var.h).animate().setDuration(300L).alpha(1.0f).setListener(null);
    }

    public final void i(BetamaxException betamaxException, long j, long j2) {
        this.a.k();
    }
}
