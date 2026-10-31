package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class tbf0 extends pim0 implements zlb0 {
    public int O0;
    public int P0;

    public final hfh0 d(ifh0 ifh0Var, afh0 afh0Var, long j) {
        long jA;
        long jD = jjl.d(j, o0c.c(this.O0, this.P0));
        if (hjl.h(j) == Integer.MAX_VALUE && hjl.i(j) != Integer.MAX_VALUE) {
            int i = (int) (jD >> 32);
            int i2 = (this.P0 * i) / this.O0;
            jA = jjl.a(i, i, i2, i2);
        } else if (hjl.i(j) != Integer.MAX_VALUE || hjl.h(j) == Integer.MAX_VALUE) {
            int i3 = (int) (jD >> 32);
            int i4 = (int) (jD & 4294967295L);
            jA = jjl.a(i3, i3, i4, i4);
        } else {
            int i5 = (int) (jD & 4294967295L);
            int i6 = (this.O0 * i5) / this.P0;
            jA = jjl.a(i6, i6, i5, i5);
        }
        q5t0 q5t0VarH = afh0Var.H(jA);
        return ifh0Var.S(q5t0VarH.a, q5t0VarH.b, b7x.a, new f2(q5t0VarH, (byte) 22));
    }
}
