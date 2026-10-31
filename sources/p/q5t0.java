package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class q5t0 {
    public int a;
    public int b;
    public long c = 0;
    public long d = r5t0.b;
    public long e = 0;

    public int U(ul3 ul3Var) {
        return Integer.MIN_VALUE;
    }

    public int X() {
        return (int) (this.c & 4294967295L);
    }

    public int Y() {
        return (int) (this.c >> 32);
    }

    public final void a0() {
        this.a = yoi1.p((int) (this.c >> 32), hjl.k(this.d), hjl.i(this.d));
        int iP = yoi1.p((int) (this.c & 4294967295L), hjl.j(this.d), hjl.h(this.d));
        this.b = iP;
        int i = this.a;
        long j = this.c;
        this.e = (((long) ((i - ((int) (j >> 32))) / 2)) << 32) | (4294967295L & ((long) ((iP - ((int) (j & 4294967295L))) / 2)));
    }

    public void f0(long j, float f, be50 be50Var) {
        e0(j, f, null);
    }

    public Object g() {
        return null;
    }

    public final void h0(long j) {
        if (yr80.b(this.c, j)) {
            return;
        }
        this.c = j;
        a0();
    }

    public final void k0(long j) {
        if (hjl.c(this.d, j)) {
            return;
        }
        this.d = j;
        a0();
    }

    public void e0(long j, float f, iu30 iu30Var) {
    }
}
