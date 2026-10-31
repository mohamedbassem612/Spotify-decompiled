package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class j9a implements r8u0 {
    public Object a;

    public j9a() {
        this.a = new oqe1();
    }

    @Override // p.r8u0
    public boolean B0() {
        int iK;
        sqe1 sqe1VarD0 = d0();
        if (sqe1VarD0.p()) {
            iK = -1;
        } else {
            int iQ0 = Q0();
            int repeatMode = getRepeatMode();
            if (repeatMode == 1) {
                repeatMode = 0;
            }
            iK = sqe1VarD0.k(iQ0, repeatMode, V0());
        }
        return iK != -1;
    }

    @Override // p.r8u0
    public boolean E() {
        return true;
    }

    @Override // p.r8u0
    public void F(int i) {
        H(i, i + 1);
    }

    @Override // p.r8u0
    public void F0(yoh0 yoh0Var) {
        c1(b380.t(yoh0Var));
    }

    @Override // p.r8u0
    public void H0(int i) {
        g1(i, 10, -9223372036854775807L, false);
    }

    @Override // p.r8u0
    public void K() {
        if (d0().p() || o()) {
            f1(7);
            return;
        }
        boolean zB0 = B0();
        if (e1() && !O0()) {
            if (zB0) {
                i1(7);
                return;
            } else {
                f1(7);
                return;
            }
        }
        if (!zB0 || v() > q0()) {
            h1(7, 0L);
        } else {
            i1(7);
        }
    }

    @Override // p.r8u0
    public boolean O0() {
        sqe1 sqe1VarD0 = d0();
        return !sqe1VarD0.p() && sqe1VarD0.m(Q0(), (oqe1) this.a).h;
    }

    @Override // p.r8u0
    public void Q(yoh0 yoh0Var) {
        c1(b380.t(yoh0Var));
    }

    @Override // p.r8u0
    public void R() {
        int iE;
        sqe1 sqe1VarD0 = d0();
        if (sqe1VarD0.p()) {
            iE = -1;
        } else {
            int iQ0 = Q0();
            int repeatMode = getRepeatMode();
            if (repeatMode == 1) {
                repeatMode = 0;
            }
            iE = sqe1VarD0.e(iQ0, repeatMode, V0());
        }
        if (iE == -1) {
            f1(8);
        } else if (iE == Q0()) {
            g1(Q0(), 8, -9223372036854775807L, true);
        } else {
            g1(iE, 8, -9223372036854775807L, false);
        }
    }

    @Override // p.r8u0
    public void R0(int i, int i2) {
        if (i != i2) {
            S0(i, i + 1, i2);
        }
    }

    @Override // p.r8u0
    public void T0(List list) {
        M0(Integer.MAX_VALUE, list);
    }

    @Override // p.r8u0
    public boolean V() {
        int iE;
        sqe1 sqe1VarD0 = d0();
        if (sqe1VarD0.p()) {
            iE = -1;
        } else {
            int iQ0 = Q0();
            int repeatMode = getRepeatMode();
            if (repeatMode == 1) {
                repeatMode = 0;
            }
            iE = sqe1VarD0.e(iQ0, repeatMode, V0());
        }
        return iE != -1;
    }

    @Override // p.r8u0
    public boolean Y(int i) {
        return n0().a(i);
    }

    @Override // p.r8u0
    public void Z0() {
        long jV = v() + I0();
        long duration = getDuration();
        if (duration != -9223372036854775807L) {
            jV = Math.min(jV, duration);
        }
        h1(12, Math.max(jV, 0L));
    }

    @Override // p.r8u0
    public void a() {
        M(false);
    }

    @Override // p.r8u0
    public void a1() {
        long jV = v() + (-d1());
        long duration = getDuration();
        if (duration != -9223372036854775807L) {
            jV = Math.min(jV, duration);
        }
        h1(11, Math.max(jV, 0L));
    }

    @Override // p.r8u0
    public boolean b0() {
        sqe1 sqe1VarD0 = d0();
        return !sqe1VarD0.p() && sqe1VarD0.m(Q0(), (oqe1) this.a).i;
    }

    @Override // p.r8u0
    public boolean e1() {
        sqe1 sqe1VarD0 = d0();
        return !sqe1VarD0.p() && sqe1VarD0.m(Q0(), (oqe1) this.a).c();
    }

    @Override // p.r8u0
    public void f(long j) {
        h1(5, j);
    }

    public void f1(int i) {
        g1(-1, i, -9223372036854775807L, false);
    }

    public abstract void g1(int i, int i2, long j, boolean z);

    @Override // p.r8u0
    public void h(float f) {
        m(l().b(f));
    }

    @Override // p.r8u0
    public void h0() {
        int iE;
        if (d0().p() || o()) {
            f1(9);
            return;
        }
        if (!V()) {
            if (e1() && b0()) {
                g1(Q0(), 9, -9223372036854775807L, false);
                return;
            } else {
                f1(9);
                return;
            }
        }
        sqe1 sqe1VarD0 = d0();
        if (sqe1VarD0.p()) {
            iE = -1;
        } else {
            int iQ0 = Q0();
            int repeatMode = getRepeatMode();
            if (repeatMode == 1) {
                repeatMode = 0;
            }
            iE = sqe1VarD0.e(iQ0, repeatMode, V0());
        }
        if (iE == -1) {
            f1(9);
        } else if (iE == Q0()) {
            g1(Q0(), 9, -9223372036854775807L, true);
        } else {
            g1(iE, 9, -9223372036854775807L, false);
        }
    }

    public void h1(int i, long j) {
        g1(Q0(), i, j, false);
    }

    @Override // p.r8u0
    public boolean i() {
        return getPlaybackState() == 3 && q() && c0() == 0;
    }

    public void i1(int i) {
        int iK;
        sqe1 sqe1VarD0 = d0();
        if (sqe1VarD0.p()) {
            iK = -1;
        } else {
            int iQ0 = Q0();
            int repeatMode = getRepeatMode();
            if (repeatMode == 1) {
                repeatMode = 0;
            }
            iK = sqe1VarD0.k(iQ0, repeatMode, V0());
        }
        if (iK == -1) {
            f1(i);
        } else if (iK == Q0()) {
            g1(Q0(), i, -9223372036854775807L, true);
        } else {
            g1(iK, i, -9223372036854775807L, false);
        }
    }

    @Override // p.r8u0
    public void j() {
        M(true);
    }

    @Override // p.r8u0
    public void k0(yoh0 yoh0Var, long j) {
        G0(b380.t(yoh0Var), 0, j);
    }

    @Override // p.r8u0
    public long l0() {
        oqe1 oqe1Var = (oqe1) this.a;
        sqe1 sqe1VarD0 = d0();
        if (sqe1VarD0.p() || sqe1VarD0.m(Q0(), oqe1Var).f == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return (oqe1Var.a() - oqe1Var.f) - K0();
    }

    @Override // p.r8u0
    public void m0(int i, long j) {
        g1(i, 10, j, false);
    }

    @Override // p.r8u0
    public void r0(int i, yoh0 yoh0Var) {
        D(i, i + 1, b380.t(yoh0Var));
    }

    @Override // p.r8u0
    public void s() {
        H(0, Integer.MAX_VALUE);
    }

    @Override // p.r8u0
    public yoh0 u() {
        sqe1 sqe1VarD0 = d0();
        if (sqe1VarD0.p()) {
            return null;
        }
        return sqe1VarD0.m(Q0(), (oqe1) this.a).c;
    }

    @Override // p.r8u0
    public long u0() {
        sqe1 sqe1VarD0 = d0();
        if (sqe1VarD0.p()) {
            return -9223372036854775807L;
        }
        return sqe1VarD0.m(Q0(), (oqe1) this.a).b();
    }

    @Override // p.r8u0
    public int w() {
        if (!Y(16)) {
            return 0;
        }
        long jN0 = N0();
        long duration = getDuration();
        if (jN0 == -9223372036854775807L || duration == -9223372036854775807L) {
            return 0;
        }
        if (duration == 0) {
            return 100;
        }
        return zoi1.j(zoi1.b0(jN0, duration), 0, 100);
    }

    @Override // p.r8u0
    public void x() {
        i1(6);
    }

    @Override // p.r8u0
    public void y() {
        g1(Q0(), 4, -9223372036854775807L, false);
    }
}
