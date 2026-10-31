package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class c990 implements ifh0, p890 {
    public final /* synthetic */ p890 a;
    public final flb0 b;

    public c990(p890 p890Var, flb0 flb0Var) {
        this.a = p890Var;
        this.b = flb0Var;
    }

    @Override // p.ifh0
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
        return new b990(i, i2, map, iu30Var);
    }

    @Override // p.wat
    public final long I(int i) {
        return this.a.I(i);
    }

    @Override // p.wat
    public final long L(float f) {
        return this.a.L(f);
    }

    @Override // p.wat
    public final float M0(int i) {
        return this.a.M0(i);
    }

    @Override // p.wat
    public final float N0(float f) {
        return this.a.N0(f);
    }

    @Override // p.wat
    public final float U0() {
        return this.a.U0();
    }

    @Override // p.p890
    public final boolean W() {
        return this.a.W();
    }

    @Override // p.wat
    public final float X0(float f) {
        return this.a.X0(f);
    }

    @Override // p.p890
    public final flb0 getLayoutDirection() {
        return this.b;
    }

    @Override // p.wat
    public final float h() {
        return this.a.h();
    }

    @Override // p.wat
    public final int i0(float f) {
        return this.a.i0(f);
    }

    @Override // p.wat
    public final long k1(long j) {
        return this.a.k1(j);
    }

    @Override // p.wat
    public final float q0(long j) {
        return this.a.q0(j);
    }

    @Override // p.wat
    public final long s(float f) {
        return this.a.s(f);
    }

    @Override // p.wat
    public final long t(long j) {
        return this.a.t(j);
    }

    @Override // p.wat
    public final float y(long j) {
        return this.a.y(j);
    }
}
