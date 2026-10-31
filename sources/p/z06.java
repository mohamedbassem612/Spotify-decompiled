package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class z06 implements x06, ifh0, d6f0 {
    public final cmb0 a;
    public v06 b;
    public boolean c;

    public z06(cmb0 cmb0Var, v06 v06Var) {
        this.a = cmb0Var;
        this.b = v06Var;
    }

    public final hfh0 B(int i, int i2, Map map, iu30 iu30Var, iu30 iu30Var2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            qf80.c("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new y06(i, i2, map, iu30Var, iu30Var2, this);
    }

    public final long I(int i) {
        return this.a.I(i);
    }

    public final long L(float f) {
        return this.a.L(f);
    }

    public final float M0(int i) {
        return this.a.M0(i);
    }

    public final float N0(float f) {
        return f / this.a.h();
    }

    public final hfh0 S(int i, int i2, Map map, iu30 iu30Var) {
        return this.a.B(i, i2, map, (iu30) null, iu30Var);
    }

    public final float U0() {
        return this.a.U0();
    }

    public final boolean W() {
        return false;
    }

    public final float X0(float f) {
        return this.a.h() * f;
    }

    public final elb0 a(elb0 elb0Var) {
        a6f0 a6f0Var;
        if (elb0Var instanceof a6f0) {
            return elb0Var;
        }
        if (elb0Var instanceof ndo0) {
            z5f0 z5f0VarC1 = ((ndo0) elb0Var).c1();
            return (z5f0VarC1 == null || (a6f0Var = z5f0VarC1.X0) == null) ? elb0Var : a6f0Var;
        }
        qf80.b("Unsupported LayoutCoordinates");
        jah.d();
        return null;
    }

    public final boolean c() {
        return this.c;
    }

    public final v06 d() {
        return this.b;
    }

    public final void e(boolean z) {
        this.c = z;
    }

    public final void f(v06 v06Var) {
        this.b = v06Var;
    }

    public final flb0 getLayoutDirection() {
        return ((ndo0) this.a).U0.a1;
    }

    public final float h() {
        return this.a.h();
    }

    public final int i0(float f) {
        return this.a.i0(f);
    }

    public final long k1(long j) {
        return this.a.k1(j);
    }

    public final float q0(long j) {
        return this.a.q0(j);
    }

    public final long s(float f) {
        return this.a.s(f);
    }

    public final long t(long j) {
        return this.a.t(j);
    }

    @Override // p.r06
    public final long v0() {
        amb0 amb0Var = this.a.G1;
        amb0Var.getClass();
        hfh0 hfh0VarA0 = amb0Var.A0();
        return (((long) hfh0VarA0.getWidth()) << 32) | (((long) hfh0VarA0.getHeight()) & 4294967295L);
    }

    public final float y(long j) {
        return this.a.y(j);
    }
}
