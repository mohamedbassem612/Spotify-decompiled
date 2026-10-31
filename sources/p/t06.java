package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class t06 implements x06, r06 {
    public final /* synthetic */ r06 a;
    public final flb0 b;

    public t06(r06 r06Var, flb0 flb0Var) {
        this.a = r06Var;
        this.b = flb0Var;
    }

    public final hfh0 B(int i, int i2, Map map, iu30 iu30Var, iu30 iu30Var2) {
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            qf80.c("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new s06(i, i2, map, iu30Var);
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
        return this.a.N0(f);
    }

    public final float U0() {
        return this.a.U0();
    }

    public final boolean W() {
        return this.a.W();
    }

    public final float X0(float f) {
        return this.a.X0(f);
    }

    public final flb0 getLayoutDirection() {
        return this.b;
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
        return this.a.v0();
    }

    public final float y(long j) {
        return this.a.y(j);
    }
}
