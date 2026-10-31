package p;

import android.os.Looper;
import android.os.SystemClock;
import android.view.Surface;
import android.view.SurfaceHolder;
import androidx.media3.common.PlaybackException;
import java.util.IdentityHashMap;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ffu0 implements r8u0 {
    public final r8u0 a;
    public final IdentityHashMap b = new IdentityHashMap();

    public ffu0(r8u0 r8u0Var) {
        this.a = r8u0Var;
    }

    public final void A() {
        l1();
        this.a.A();
    }

    public final void A0(int i, int i2) {
        l1();
        this.a.A0(i, i2);
    }

    public final void B(int i) {
        l1();
        this.a.B(i);
    }

    public final boolean B0() {
        l1();
        return this.a.B0();
    }

    public final void D(int i, int i2, List list) {
        l1();
        this.a.D(i, i2, list);
    }

    public final int D0() {
        l1();
        return this.a.D0();
    }

    public final boolean E() {
        return this.a.E();
    }

    public final void E0(k0g1 k0g1Var) {
        l1();
        this.a.E0(k0g1Var);
    }

    public final void F(int i) {
        l1();
        this.a.F(i);
    }

    public final void F0(yoh0 yoh0Var) {
        l1();
        this.a.F0(yoh0Var);
    }

    public final void G0(List list, int i, long j) {
        l1();
        this.a.G0(list, i, j);
    }

    public final void H(int i, int i2) {
        l1();
        this.a.H(i, i2);
    }

    public final void H0(int i) {
        l1();
        this.a.H0(i);
    }

    public final void I(SurfaceHolder surfaceHolder) {
        l1();
        this.a.I(surfaceHolder);
    }

    public final long I0() {
        l1();
        return this.a.I0();
    }

    public final void J(o8u0 o8u0Var) {
        l1();
        synchronized (this.b) {
            try {
                df30 df30Var = (df30) this.b.get(o8u0Var);
                if (df30Var == null) {
                    df30Var = new df30(this, o8u0Var);
                }
                this.a.J(df30Var);
                this.b.put(o8u0Var, df30Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void K() {
        l1();
        this.a.K();
    }

    public final long K0() {
        l1();
        return this.a.K0();
    }

    public final PlaybackException L() {
        l1();
        return this.a.L();
    }

    public final void M(boolean z) {
        l1();
        this.a.M(z);
    }

    public final void M0(int i, List list) {
        l1();
        this.a.M0(i, list);
    }

    public final long N0() {
        l1();
        return this.a.N0();
    }

    public final void O() {
        l1();
        this.a.O();
    }

    public final boolean O0() {
        l1();
        return this.a.O0();
    }

    public final void P(o8u0 o8u0Var) {
        l1();
        synchronized (this.b) {
            o8u0 o8u0Var2 = (o8u0) this.b.remove(o8u0Var);
            r8u0 r8u0Var = this.a;
            if (o8u0Var2 != null) {
                o8u0Var = o8u0Var2;
            }
            r8u0Var.P(o8u0Var);
        }
    }

    public final tqh0 P0() {
        l1();
        return this.a.P0();
    }

    public final void Q(yoh0 yoh0Var) {
        l1();
        this.a.Q(yoh0Var);
    }

    public final int Q0() {
        l1();
        return this.a.Q0();
    }

    public final void R() {
        l1();
        this.a.R();
    }

    public final void R0(int i, int i2) {
        l1();
        this.a.R0(i, i2);
    }

    public final void S0(int i, int i2, int i3) {
        l1();
        this.a.S0(i, i2, i3);
    }

    public final void T(int i) {
        l1();
        this.a.T(i);
    }

    public final void T0(List list) {
        l1();
        this.a.T0(list);
    }

    public final o3g1 U() {
        l1();
        return this.a.U();
    }

    public final boolean U0() {
        l1();
        return this.a.U0();
    }

    public final boolean V() {
        l1();
        return this.a.V();
    }

    public final boolean V0() {
        l1();
        return this.a.V0();
    }

    public final qeo W() {
        l1();
        return this.a.W();
    }

    public final int X() {
        l1();
        return this.a.X();
    }

    public final long X0() {
        l1();
        return this.a.X0();
    }

    public final boolean Y(int i) {
        l1();
        return this.a.Y(i);
    }

    public final void Y0(int i) {
        l1();
        this.a.Y0(i);
    }

    public final void Z(boolean z) {
        l1();
        this.a.Z(z);
    }

    public final void Z0() {
        l1();
        this.a.Z0();
    }

    public final void a() {
        l1();
        this.a.a();
    }

    public final void a1() {
        l1();
        this.a.a1();
    }

    public final boolean b() {
        l1();
        return this.a.b();
    }

    public final boolean b0() {
        l1();
        return this.a.b0();
    }

    public final tqh0 b1() {
        l1();
        return this.a.b1();
    }

    public final float c() {
        l1();
        return this.a.c();
    }

    public final int c0() {
        l1();
        return this.a.c0();
    }

    public final void c1(List list) {
        l1();
        this.a.c1(list);
    }

    public final void d() {
        l1();
        this.a.d();
    }

    public final sqe1 d0() {
        l1();
        return this.a.d0();
    }

    public final long d1() {
        l1();
        return this.a.d1();
    }

    public final void e() {
        l1();
        this.a.e();
    }

    public final Looper e0() {
        return this.a.e0();
    }

    public final boolean e1() {
        l1();
        return this.a.e1();
    }

    public final void f(long j) {
        l1();
        this.a.f(j);
    }

    public final void f0() {
        l1();
        this.a.f0();
    }

    public final p8u0 f1() {
        boolean zY = Y(16);
        boolean zY2 = Y(17);
        int iQ0 = zY2 ? Q0() : 0;
        dm5.y(iQ0 >= 0);
        int iV0 = zY2 ? v0() : 0;
        dm5.y(iV0 >= 0);
        if (zY2) {
            sqe1 sqe1VarD0 = d0();
            if (!sqe1VarD0.p()) {
                dm5.y(iQ0 < sqe1VarD0.o());
                oqe1 oqe1VarN = sqe1VarD0.n(iQ0, new oqe1(), 0L);
                dm5.y(iV0 == zoi1.j(iV0, oqe1VarN.n, oqe1VarN.o));
            }
        }
        long jK0 = 0;
        yoh0 yoh0VarU = zY ? u() : null;
        long jV = zY ? v() : 0L;
        if (zY) {
            jK0 = K0();
        }
        return new p8u0(null, iQ0, yoh0VarU, null, iV0, jV, jK0, zY ? X() : -1, zY ? D0() : -1);
    }

    public final void g(float f) {
        l1();
        this.a.g(f);
    }

    public final k0g1 g0() {
        l1();
        return this.a.g0();
    }

    public final xg61 g1() {
        boolean zY = Y(16);
        return new xg61(f1(), zY && o(), SystemClock.elapsedRealtime(), zY ? getDuration() : -9223372036854775807L, zY ? N0() : 0L, zY ? w() : 0, zY ? p() : 0L, zY ? l0() : -9223372036854775807L, zY ? u0() : -9223372036854775807L, zY ? X0() : 0L);
    }

    public final long getDuration() {
        l1();
        return this.a.getDuration();
    }

    public final int getPlaybackState() {
        l1();
        return this.a.getPlaybackState();
    }

    public final int getRepeatMode() {
        l1();
        return this.a.getRepeatMode();
    }

    public final void h(float f) {
        l1();
        this.a.h(f);
    }

    public final void h0() {
        l1();
        this.a.h0();
    }

    public final yoh0 h1() {
        if (Y(16)) {
            return u();
        }
        return null;
    }

    public final boolean i() {
        l1();
        return this.a.i();
    }

    public final void i0(tqh0 tqh0Var) {
        l1();
        this.a.i0(tqh0Var);
    }

    public final sqe1 i1() {
        if (Y(17)) {
            return d0();
        }
        return h1() != null ? new efu0(this) : sqe1.a;
    }

    public final void j() {
        l1();
        this.a.j();
    }

    public final int j0() {
        l1();
        return this.a.j0();
    }

    public final tqh0 j1() {
        return Y(18) ? b1() : tqh0.M;
    }

    public final void k0(yoh0 yoh0Var, long j) {
        l1();
        this.a.k0(yoh0Var, j);
    }

    public final boolean k1() {
        return Y(23) && U0();
    }

    public final k2u0 l() {
        l1();
        return this.a.l();
    }

    public final long l0() {
        l1();
        return this.a.l0();
    }

    public final void l1() {
        dm5.y(Looper.myLooper() == this.a.e0());
    }

    public final void m(k2u0 k2u0Var) {
        l1();
        this.a.m(k2u0Var);
    }

    public final void m0(int i, long j) {
        l1();
        this.a.m0(i, j);
    }

    public final void n(Surface surface) {
        l1();
        this.a.n(surface);
    }

    public final m8u0 n0() {
        l1();
        return this.a.n0();
    }

    public final boolean o() {
        l1();
        return this.a.o();
    }

    public final void o0(boolean z) {
        l1();
        this.a.o0(z);
    }

    public final long p() {
        l1();
        return this.a.p();
    }

    public final boolean q() {
        l1();
        return this.a.q();
    }

    public final long q0() {
        l1();
        return this.a.q0();
    }

    public final void r(po7 po7Var, boolean z) {
        this.a.r(po7Var, z);
    }

    public final void r0(int i, yoh0 yoh0Var) {
        l1();
        this.a.r0(i, yoh0Var);
    }

    public final void s() {
        l1();
        this.a.s();
    }

    public final void setRepeatMode(int i) {
        l1();
        this.a.setRepeatMode(i);
    }

    public final void stop() {
        l1();
        this.a.stop();
    }

    public final yoh0 u() {
        l1();
        return this.a.u();
    }

    public final long u0() {
        l1();
        return this.a.u0();
    }

    public final long v() {
        l1();
        return this.a.v();
    }

    public final int v0() {
        l1();
        return this.a.v0();
    }

    public final int w() {
        l1();
        return this.a.w();
    }

    public final z1k1 w0() {
        l1();
        return this.a.w0();
    }

    public final void x() {
        l1();
        this.a.x();
    }

    public final po7 x0() {
        l1();
        return this.a.x0();
    }

    public final void y() {
        l1();
        this.a.y();
    }

    public final xqt y0() {
        l1();
        return this.a.y0();
    }

    public final void z(int i, boolean z) {
        l1();
        this.a.z(i, z);
    }
}
