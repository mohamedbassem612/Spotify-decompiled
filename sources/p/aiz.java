package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.base.java.logging.Logger;
import com.spotify.betamax.player.exception.BetamaxException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class aiz extends t0u0 {
    public final /* synthetic */ byte u1;
    public final xu0 v1;
    public final ao0 w1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aiz(xu0 xu0Var, yu0 yu0Var, ao0 ao0Var, byte b) {
        super(yu0Var);
        this.u1 = b;
        this.v1 = xu0Var;
        this.w1 = ao0Var;
    }

    @Override // p.t0u0
    public void J(long j, long j2) {
        aiz aizVar;
        switch (this.u1) {
            case 2:
                if (this.q1) {
                    co0 co0Var = co0.RESUMED;
                    xu0 xu0Var = this.v1;
                    aizVar = this;
                    t0u0.X(aizVar, this.w1, co0Var, xu0Var.a, Long.valueOf(j), null, xu0Var.c, 8);
                } else {
                    aizVar = this;
                }
                super.J(j, j2);
                break;
            default:
                super.J(j, j2);
                break;
        }
    }

    public void L(BetamaxException betamaxException, long j, long j2) {
        switch (this.u1) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                Logger.l(betamaxException, "Fatal error occurred during ad playback", new Object[0]);
                break;
        }
    }

    @Override // p.t0u0
    public void O(long j, long j2) {
        aiz aizVar;
        switch (this.u1) {
            case 2:
                if (this.q1) {
                    aizVar = this;
                } else {
                    co0 co0Var = co0.PAUSED;
                    xu0 xu0Var = this.v1;
                    aizVar = this;
                    t0u0.X(aizVar, this.w1, co0Var, xu0Var.a, Long.valueOf(j), null, xu0Var.c, 8);
                }
                super.O(j, j2);
                break;
            default:
                super.O(j, j2);
                break;
        }
    }

    @Override // p.t0u0
    public void R(r4t r4tVar, int i, long j, long j2) {
        switch (this.u1) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                super.R(r4tVar, i, j, j2);
                zhz zhzVar = new zhz(i, this, j);
                boolean z = this.r1;
                this.r1 = true;
                zhzVar.invoke();
                this.r1 = z;
                break;
            case 3:
                super.R(r4tVar, i, j, j2);
                int iC = l1d.C(i);
                if (iC == 0) {
                    Z(co0.ENDED, j);
                } else if (iC != 1) {
                    if (iC != 2 && iC != 3 && iC != 4 && iC != 5) {
                        eg.o();
                    } else if (!this.q1) {
                        Z(co0.TERMINATED, j);
                    }
                }
                break;
            default:
                super.R(r4tVar, i, j, j2);
                break;
        }
    }

    public void S(long j, long j2) {
        switch (this.u1) {
            case 1:
                super.S(j, j2);
                lpa lpaVar = new lpa(this, j, (byte) 1);
                boolean z = this.r1;
                this.r1 = true;
                lpaVar.invoke();
                this.r1 = z;
                break;
            default:
                super.S(j, j2);
                break;
        }
    }

    @Override // p.t0u0
    public void V(long j) {
        switch (this.u1) {
            case 3:
                Z(co0.STARTED, j);
                break;
        }
    }

    public void Y(Long l, String str) {
        co0 co0Var = co0.ERROR;
        xu0 xu0Var = this.v1;
        W(this.w1, co0Var, xu0Var.a, Long.valueOf(l.longValue()), str, xu0Var.c);
    }

    public void Z(co0 co0Var, long j) {
        xu0 xu0Var = this.v1;
        t0u0.X(this, this.w1, co0Var, xu0Var.a, Long.valueOf(j), null, xu0Var.c, 8);
    }

    public void i(BetamaxException betamaxException, long j, long j2) {
        switch (this.u1) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                Logger.h(betamaxException, "Recoverable error occurred during ad playback", new Object[0]);
                break;
        }
    }
}
