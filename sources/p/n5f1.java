package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class n5f1 implements mfv0 {
    public final int a;

    public n5f1(int i) {
        this.a = i;
    }

    public final long a(ur80 ur80Var, long j, flb0 flb0Var, long j2) {
        int i = (int) (j2 >> 32);
        int iF = l1d.f(ur80Var.d(), i, 2, ur80Var.a);
        if (iF < 0) {
            iF = ur80Var.a;
        } else if (iF + i > ((int) (j >> 32))) {
            iF = ur80Var.c - i;
        }
        int i2 = ur80Var.b - ((int) (j2 & 4294967295L));
        int i3 = this.a;
        int i4 = i2 - i3;
        if (i4 < 0) {
            i4 = ur80Var.d + i3;
        }
        return (((long) iF) << 32) | (((long) i4) & 4294967295L);
    }
}
