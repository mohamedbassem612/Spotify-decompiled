package p;

import android.widget.ProgressBar;
import com.spotify.betamax.player.exception.BetamaxException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ths implements c0u0 {
    public final /* synthetic */ uhs a;
    public final /* synthetic */ iu30 b;

    public ths(uhs uhsVar, iu30 iu30Var) {
        this.a = uhsVar;
        this.b = iu30Var;
    }

    public final void L(BetamaxException betamaxException, long j, long j2) {
        this.b.invoke(e4w0.a);
        ((ProgressBar) this.a.e.e).setVisibility(8);
    }

    public final void i(BetamaxException betamaxException, long j, long j2) {
        this.b.invoke(e4w0.a);
        ((ProgressBar) this.a.e.e).setVisibility(8);
    }

    public final void m(long j, long j2) {
        ((ProgressBar) this.a.e.e).setVisibility(8);
    }
}
