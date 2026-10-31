package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class qbp1 {
    public final long[] a;
    public final long[] b;
    public final long[] c;

    public qbp1() {
        qbp1 qbp1Var = fcp1.a;
        this.a = Arrays.copyOf(qbp1Var.a, 10);
        this.b = Arrays.copyOf(qbp1Var.b, 10);
        this.c = Arrays.copyOf(qbp1Var.c, 10);
    }

    public void a(long[] jArr, long[] jArr2) {
        System.arraycopy(jArr2, 0, jArr, 0, 10);
    }

    public final void b(qbp1 qbp1Var, int i) {
        cwl1.s0(this.a, qbp1Var.a, i);
        cwl1.s0(this.b, qbp1Var.b, i);
        cwl1.s0(this.c, qbp1Var.c, i);
    }

    public qbp1(long[] jArr, long[] jArr2, long[] jArr3) {
        this.a = jArr;
        this.b = jArr2;
        this.c = jArr3;
    }
}
