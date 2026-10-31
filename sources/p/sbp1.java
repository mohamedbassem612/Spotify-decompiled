package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class sbp1 extends qbp1 {
    public final long[] d;

    /* JADX WARN: Illegal instructions before constructor call */
    public sbp1(bym1 bym1Var) {
        long[] jArr = new long[10];
        long[] jArr2 = new long[10];
        long[] jArr3 = new long[10];
        long[] jArr4 = new long[10];
        super(jArr, jArr2, jArr4);
        this.d = jArr3;
        fqn1 fqn1Var = (fqn1) bym1Var.b;
        zqo1.v(jArr, (long[]) fqn1Var.c, (long[]) fqn1Var.b);
        zqo1.w(jArr2, (long[]) fqn1Var.c, (long[]) fqn1Var.b);
        System.arraycopy((long[]) fqn1Var.d, 0, jArr3, 0, 10);
        zqo1.z(jArr4, (long[]) bym1Var.c, hcp1.b);
    }

    public final void a(long[] jArr, long[] jArr2) {
        zqo1.z(jArr, jArr2, this.d);
    }
}
