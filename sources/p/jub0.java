package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class jub0 implements ysb0 {
    public final /* synthetic */ upb0 a;

    public jub0(upb0 upb0Var) {
        this.a = upb0Var;
    }

    public final float a() {
        upb0 upb0Var = this.a;
        return kln1.v(((err0) upb0Var.d.c).s(), ((err0) upb0Var.d.d).s());
    }

    public final int b() {
        upb0 upb0Var = this.a;
        return (-upb0Var.h().o) + upb0Var.h().s;
    }

    public final float c() {
        upb0 upb0Var = this.a;
        return kln1.u(((err0) upb0Var.d.c).s(), ((err0) upb0Var.d.d).s(), upb0Var.d());
    }

    public final d4h d() {
        return new d4h(-1, -1);
    }

    public final int e() {
        upb0 upb0Var = this.a;
        return (int) (upb0Var.h().r == qqq0.a ? upb0Var.h().p() & 4294967295L : upb0Var.h().p() >> 32);
    }

    public final Object f(int i, cy9 cy9Var) {
        Object objI = upb0.i(this.a, i, cy9Var);
        return objI == d9n.a ? objI : rih1.a;
    }
}
