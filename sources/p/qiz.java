package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.betamax.player.exception.BetamaxException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qiz implements c0u0 {
    public final yu0 a;
    public final uoa b;
    public BetamaxException c;
    public long d;
    public boolean e;
    public boolean f;

    public qiz(yu0 yu0Var, uoa uoaVar) {
        this.a = yu0Var;
        this.b = uoaVar;
    }

    public final void J(long j, long j2) {
        this.f = false;
    }

    public final void O(long j, long j2) {
        this.f = true;
    }

    public final void S(long j, long j2) {
        this.e = true;
    }

    public final void i(BetamaxException betamaxException, long j, long j2) {
        BetamaxException betamaxException2 = this.c;
        xjz xjzVar = betamaxException2 != null ? betamaxException2.a : null;
        xjz xjzVar2 = betamaxException.a;
        uoa uoaVar = this.b;
        if (xjzVar == xjzVar2 && j == this.d) {
            Logger.h(betamaxException, "Failed to recover from error; aborting playback.", new Object[0]);
            uoaVar.u();
            return;
        }
        this.c = betamaxException;
        this.d = j;
        if ((this.a.b.c || this.e) && !this.f) {
            Logger.h(betamaxException, "Recoverable error occurred; attempting to resume playback.", new Object[0]);
            uoaVar.l();
        }
    }
}
