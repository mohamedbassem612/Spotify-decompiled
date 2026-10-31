package p;

import androidx.media3.exoplayer.ExoPlaybackException;
import app.p000rive.semantics.SemanticState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class jca implements rbu0 {
    public boolean N0;
    public boolean O0;
    public p2i0 Q0;
    public exs S0;
    public long X;
    public long Y;
    public final byte b;
    public ld21 d;
    public int e;
    public dbu0 f;
    public rdd1 g;
    public byte h;
    public p641 i;
    public ie30[] t;
    public final Object a = new Object();
    public final w2z c = new w2z((byte) 26);
    public long Z = Long.MIN_VALUE;
    public sqe1 P0 = sqe1.a;
    public long R0 = -9223372036854775807L;

    /* JADX WARN: Multi-variable type inference failed */
    public jca(int i) {
        this.b = i;
    }

    public static int a(int i, int i2, int i3, int i4) {
        return i | i2 | i3 | SemanticState.Focused | i4;
    }

    public static boolean u(int i, boolean z) {
        int i2 = i & 7;
        if (i2 != 4) {
            return z && i2 == 3;
        }
        return true;
    }

    public final int G(w2z w2zVar, gar garVar, int i) {
        boolean z = (i & 1) != 0;
        p641 p641Var = this.i;
        p641Var.getClass();
        int iC = p641Var.c(w2zVar, garVar, i);
        if (iC == -4) {
            if (garVar.f(4)) {
                if (!z) {
                    this.Z = Long.MIN_VALUE;
                }
                return this.N0 ? -4 : -3;
            }
            long j = garVar.f + this.X;
            garVar.f = j;
            if (!z) {
                this.Z = Math.max(this.Z, j);
                return iC;
            }
        } else if (iC == -5) {
            ie30 ie30Var = (ie30) w2zVar.c;
            ie30Var.getClass();
            long j2 = ie30Var.u;
            if (j2 != Long.MAX_VALUE) {
                ge30 ge30VarA = ie30Var.a();
                ge30VarA.t = j2 + this.X;
                w2zVar.c = new ie30(ge30VarA);
            }
        }
        return iC;
    }

    public final void H() {
        dm5.y(this.h == 0);
        A();
    }

    public abstract void I(long j, long j2);

    public final void J(ie30[] ie30VarArr, p641 p641Var, long j, long j2, p2i0 p2i0Var) {
        dm5.y(!this.N0);
        this.i = p641Var;
        this.Q0 = p2i0Var;
        U();
        if (this.Z == Long.MIN_VALUE) {
            this.Z = j;
        }
        this.t = ie30VarArr;
        this.X = j2;
        E(ie30VarArr, j, j2, p2i0Var);
    }

    public final void K() {
        dm5.y(this.h == 0);
        this.c.b();
        B();
    }

    public final void L(long j, boolean z) {
        this.N0 = false;
        this.Y = j;
        this.Z = j;
        if (!z) {
            p641 p641Var = this.i;
            p641Var.getClass();
            z = p641Var.s(j - this.X) != 0;
        }
        z(j, false, z);
    }

    public final void M() {
        this.N0 = true;
    }

    public final void O(sqe1 sqe1Var) {
        if (this.P0.equals(sqe1Var)) {
            return;
        }
        this.P0 = sqe1Var;
        U();
        F();
    }

    public final void P() {
        dm5.y(this.h == 1);
        this.h = (byte) 2;
        C();
    }

    public final void Q() {
        dm5.y(this.h == 2);
        this.h = (byte) 1;
        D();
    }

    public int R(ie30 ie30Var) {
        return "application/x-camera-motion".equals(ie30Var.f66p) ? a(4, 0, 0, 0) : a(0, 0, 0, 0);
    }

    public int S() {
        return 0;
    }

    public boolean T(long j) {
        return false;
    }

    public final void U() {
        p2i0 p2i0Var;
        if (this.P0.p() || (p2i0Var = this.Q0) == null) {
            this.R0 = -9223372036854775807L;
            return;
        }
        int iB = this.P0.b(p2i0Var.a);
        if (iB == -1) {
            this.R0 = -9223372036854775807L;
            return;
        }
        dqe1 dqe1VarF = this.P0.f(iB, new dqe1(), false);
        this.R0 = dqe1VarF.d;
        int i = p2i0Var.b;
        if (i != -1) {
            this.R0 = dqe1VarF.g.a(i).g[p2i0Var.c];
            return;
        }
        int i2 = p2i0Var.e;
        if (i2 != -1) {
            long j = dqe1VarF.g.a(i2).a;
            if (j != Long.MIN_VALUE) {
                this.R0 = j;
            }
        }
    }

    public final ExoPlaybackException c(Throwable th, ie30 ie30Var, boolean z, int i) {
        int iR;
        if (ie30Var == null || this.O0) {
            iR = 4;
        } else {
            this.O0 = true;
            try {
                iR = R(ie30Var) & 7;
                this.O0 = false;
            } catch (ExoPlaybackException unused) {
                this.O0 = false;
                iR = 4;
            } catch (Throwable th2) {
                this.O0 = false;
                throw th2;
            }
        }
        return new ExoPlaybackException(1, th, i, i(), this.e, ie30Var, ie30Var == null ? 4 : iR, this.Q0, z);
    }

    public final void d() {
        dm5.y(this.h == 1);
        this.c.b();
        this.h = (byte) 0;
        this.i = null;
        this.t = null;
        this.N0 = false;
        x();
        this.Q0 = null;
        this.R0 = -9223372036854775807L;
    }

    public final void e(ld21 ld21Var, ie30[] ie30VarArr, p641 p641Var, boolean z, boolean z2, long j, long j2, p2i0 p2i0Var) {
        dm5.y(this.h == 0);
        this.d = ld21Var;
        this.Q0 = p2i0Var;
        this.h = (byte) 1;
        y(z, z2);
        J(ie30VarArr, p641Var, j, j2, p2i0Var);
        this.N0 = false;
        this.Y = j;
        this.Z = j;
        z(j, z, true);
    }

    public long g(long j, long j2) {
        if (this.h == 1) {
            return (v() || t()) ? 1000000L : 10000L;
        }
        return 10000L;
    }

    public wjh0 h() {
        return null;
    }

    public String i() {
        return "CameraMotionRenderer";
    }

    public final long j() {
        return this.Z;
    }

    public final int k() {
        return this.h;
    }

    public final p641 o() {
        return this.i;
    }

    public final boolean q() {
        return this.Z == Long.MIN_VALUE;
    }

    public final void r(int i, dbu0 dbu0Var, rdd1 rdd1Var) {
        this.e = i;
        this.f = dbu0Var;
        this.g = rdd1Var;
    }

    public final boolean s() {
        return this.N0;
    }

    public boolean t() {
        return q();
    }

    public boolean v() {
        return true;
    }

    public final void w() {
        p641 p641Var = this.i;
        p641Var.getClass();
        p641Var.e();
    }

    public void A() {
    }

    public void B() {
    }

    public void C() {
    }

    public void D() {
    }

    public void F() {
    }

    public void f() {
    }

    public void x() {
    }

    public void N(float f, float f2) {
    }

    public void b(int i, Object obj) {
    }

    public void y(boolean z, boolean z2) {
    }

    public void z(long j, boolean z, boolean z2) {
    }

    public void E(ie30[] ie30VarArr, long j, long j2, p2i0 p2i0Var) {
    }
}
