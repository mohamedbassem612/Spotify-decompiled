package p;

import com.spotify.betamax.common.SunsetUpgradeRequiredException;
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.betamax.player.exception.BetamaxException;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hdu0 extends q5u0 {
    public final np00 N0;
    public final Long O0;
    public final Scheduler P0;
    public final long Q0;
    public Disposable R0;
    public k5u0 S0;
    public boolean T0;
    public Long U0;
    public boolean V0;
    public boolean W0;
    public final m0u0 X;
    public final Disposable X0;
    public final m9n Y;
    public final phi0 Z;

    public hdu0(m0u0 m0u0Var, oot0 oot0Var, m9n m9nVar, phi0 phi0Var, np00 np00Var, Long l, Scheduler scheduler, Observable observable, boolean z) {
        super(m0u0Var, oot0Var);
        this.X = m0u0Var;
        this.Y = m9nVar;
        this.Z = phi0Var;
        this.N0 = np00Var;
        this.O0 = l;
        this.P0 = scheduler;
        long j = 0;
        if (z) {
            long j2 = oot0Var.a;
            if (j2 >= 0 && oot0Var.b > j2) {
                j = j2;
            }
        }
        this.Q0 = j;
        this.X0 = observable.subscribe(new ixp0(this, (byte) 20));
    }

    @Override // p.q5u0
    public final void B(boolean z, boolean z2, float f, VideoSurfaceView videoSurfaceView, long j) {
        super.B(z, z2, f, videoSurfaceView, j);
        W();
    }

    @Override // p.q5u0
    public final void G(float f, long j, long j2) {
        super.G(f, j, j2);
        W();
    }

    @Override // p.q5u0
    public final void H(VideoSurfaceView videoSurfaceView, long j, long j2) {
        super.H(videoSurfaceView, j, j2);
        W();
    }

    @Override // p.q5u0
    public final void J(long j, long j2) {
        super.J(j, j2);
        W();
    }

    @Override // p.q5u0
    public final void K(long j, long j2) {
        super.K(j, j2);
        W();
        k5u0 k5u0VarA = a();
        if (k5u0VarA == null || e4p1.l(k5u0VarA, (Long) null).g) {
            return;
        }
        V();
        Long l = this.O0;
        if (l != null) {
            long jLongValue = l.longValue();
            this.R0 = Observable.timer(jLongValue, TimeUnit.SECONDS, this.P0).subscribe(new gdu0(this, this.X, jLongValue, (byte) 0), xfs0.h);
        }
    }

    @Override // p.q5u0
    public final void L(BetamaxException betamaxException, long j, long j2) {
        xjz xjzVar = betamaxException.a;
        super.L(betamaxException, j, j2);
        W();
        m0u0 m0u0Var = this.X;
        String str = (String) m0u0Var.b().get("endvideo_track_uri");
        if (str == null) {
            str = "";
        }
        if (nhc1.Y(str, "spotify:room", false) && xjzVar == xjz.ERROR_GONE) {
            return;
        }
        for (Throwable cause = betamaxException; cause != null; cause = cause.getCause()) {
            if (cause instanceof SunsetUpgradeRequiredException) {
                return;
            }
        }
        xjz xjzVar2 = xjz.ERROR_AUDIO_ONLY_NOT_ALLOWED;
        m9n m9nVar = this.Y;
        if (xjzVar == xjzVar2) {
            m9nVar.b(n9n.a);
            return;
        }
        if (xjzVar == xjz.ERROR_MANIFEST_DELETED) {
            m9nVar.b(n9n.b);
            return;
        }
        if (xjzVar == xjz.ERROR_UNAVAILABLE) {
            m9nVar.b(n9n.b);
        } else if (xjzVar != xjz.ERROR_IN_OFFLINE_MODE) {
            m9nVar.b.accept(m9nVar.a.c(i3p1.x(betamaxException, m0u0Var)));
        }
    }

    @Override // p.q5u0
    public final void N(ev7 ev7Var, long j, long j2) {
        super.N(ev7Var, j, j2);
        W();
    }

    @Override // p.q5u0
    public final void O(long j, long j2) {
        super.O(j, j2);
        W();
        V();
    }

    @Override // p.q5u0
    public final void R(r4t r4tVar, int i, long j, long j2) {
        k5u0 k5u0VarA;
        this.T0 = true;
        super.R(r4tVar, i, j, j2);
        m9n m9nVar = this.Y;
        if (m9nVar.a() && (k5u0VarA = a()) != null) {
            m9nVar.b.accept(m9nVar.a.a(T(k5u0VarA, Long.valueOf(j))));
        }
        if (i == 1) {
            m9nVar.b(new crj1(sg01.b, (yjh1) null, (String) this.X.a.d.get("playback_id"), (Long) null, 8));
        }
        V();
    }

    public final zcu0 T(k5u0 k5u0Var, Long l) {
        zcu0 zcu0VarL = e4p1.l(k5u0Var, l);
        long j = this.Q0;
        if (j == 0) {
            return zcu0VarL;
        }
        Long l2 = zcu0VarL.c;
        Long lValueOf = l2 != null ? Long.valueOf(l2.longValue() + j) : null;
        Long l3 = zcu0VarL.q;
        Long lValueOf2 = l3 != null ? Long.valueOf(l3.longValue() + j) : null;
        Long l4 = zcu0VarL.d;
        return zcu0.a(zcu0VarL, 0L, lValueOf, l4 != null ? Long.valueOf(l4.longValue() + j) : null, (ucu0) null, lValueOf2, 65523);
    }

    public final void U() {
        this.X0.dispose();
        V();
    }

    public final void V() {
        Disposable disposable = this.R0;
        if (disposable != null) {
            disposable.dispose();
        }
        this.R0 = null;
    }

    public final void W() {
        k5u0 k5u0VarA;
        boolean z;
        boolean z2;
        boolean z3;
        if (this.T0 || (k5u0VarA = a()) == null) {
            return;
        }
        float f = k5u0VarA.f;
        boolean z4 = k5u0VarA.g;
        boolean z5 = k5u0VarA.e;
        if (!this.W0 || z5 || z4 || f <= 0.0f) {
            k5u0 k5u0Var = this.S0;
            boolean zEquals = false;
            if (k5u0Var == null) {
                z = z4;
                z2 = z5;
                z3 = false;
            } else {
                z = z4;
                z2 = z5;
                z3 = false;
                zEquals = k5u0.b(k5u0VarA, 0L, (Long) null, (Long) null, false, 0.0f, false, (Integer) null, (List) null, (String) null, (jgc1) null, 0, false, false, 32765).equals(k5u0.b(k5u0Var, 0L, (Long) null, (Long) null, false, 0.0f, false, (Integer) null, (List) null, (String) null, (jgc1) null, 0, false, false, 32765));
            }
            if (zEquals) {
                return;
            }
            if (this.V0) {
                if (z2) {
                    this.V0 = z3;
                } else if (!this.W0) {
                    this.U0 = null;
                    this.V0 = z3;
                }
            }
            this.S0 = k5u0VarA;
            m9n m9nVar = this.Y;
            if (m9nVar.a()) {
                Long l = this.U0;
                m9nVar.b.accept(m9nVar.a.a(T(k5u0VarA, l)));
                if (l == null || this.W0 || z2 || z || f <= 0.0f) {
                    return;
                }
                this.V0 = true;
            }
        }
    }

    @Override // p.q5u0
    public final void d(long j, long j2, boolean z) {
        super.d(j, j2, z);
        W();
    }

    @Override // p.q5u0
    public final void i(BetamaxException betamaxException, long j, long j2) {
        super.i(betamaxException, j, j2);
        W();
        xau0 xau0VarX = i3p1.x(betamaxException, this.X);
        m9n m9nVar = this.Y;
        m9nVar.b.accept(m9nVar.a.c(xau0VarX));
    }

    @Override // p.q5u0
    public final void j(int i, jgc1 jgc1Var, long j) {
        super.j(i, jgc1Var, j);
        W();
    }

    @Override // p.q5u0
    public final void k(long j, long j2) {
        super.k(j, j2);
        W();
    }

    public final void l(long j, long j2, long j3, boolean z) {
        super.m(j2, j3);
        this.W0 = false;
        W();
    }

    @Override // p.q5u0
    public final void m(long j, long j2) {
        koe1 koe1Var;
        super.m(j, j2);
        this.W0 = false;
        W();
        V();
        m0u0 m0u0Var = this.X;
        phi0 phi0Var = this.Z;
        phi0Var.f = m0u0Var;
        np00 np00Var = (np00) phi0Var.d;
        np00 np00Var2 = this.N0;
        if (np00Var == np00Var2) {
            return;
        }
        if (np00Var != null && (koe1Var = (koe1) phi0Var.e) != null) {
            np00Var.c(koe1Var);
        }
        phi0Var.d = np00Var2;
        Long l = (Long) phi0Var.c;
        if (l == null || l.longValue() < 0 || ((np00) phi0Var.d) == null) {
            return;
        }
        phi0Var.w();
    }

    @Override // p.q5u0
    public final void n(long j, long j2, boolean z) {
        k5u0 k5u0VarA;
        super.n(j, j2, z);
        if (this.T0 || (k5u0VarA = a()) == null) {
            return;
        }
        if (!this.W0 || k5u0VarA.e || k5u0VarA.g || k5u0VarA.f <= 0.0f) {
            m9n m9nVar = this.Y;
            if (m9nVar.a()) {
                m9nVar.b.accept(m9nVar.a.a(zcu0.a(T(k5u0VarA, null), j2, (Long) null, (Long) null, (ucu0) null, (Long) null, 131070)));
            }
        }
    }

    @Override // p.q5u0
    public final void p(long j, long j2, long j3, boolean z) {
        if (!this.W0) {
            this.U0 = Long.valueOf(j);
            this.V0 = false;
        }
        this.W0 = true;
        super.p(j, j2, j3, z);
        W();
    }

    @Override // p.q5u0
    public final void v(yhg0 yhg0Var, long j) {
        super.v(yhg0Var, j);
        W();
    }
}
