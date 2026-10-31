package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class rk7 implements mfv0 {
    public final wat a;

    public rk7(wat watVar) {
        this.a = watVar;
    }

    public final long a(ur80 ur80Var, long j, flb0 flb0Var, long j2) {
        wat watVar = this.a;
        int iI0 = watVar.i0(16.0f);
        int iI1 = watVar.i0(8.0f);
        int iI2 = watVar.i0(16.0f);
        int i = flb0Var == flb0.b ? (ur80Var.c + iI1) - ((int) (j2 >> 32)) : ur80Var.a - iI1;
        int i2 = (((int) (j >> 32)) - iI2) - ((int) (j2 >> 32));
        if (i > i2) {
            i = i2;
        }
        if (i < iI2) {
            i = iI2;
        }
        int i3 = (ur80Var.b - iI0) - ((int) (j2 & 4294967295L));
        if (i3 >= iI2) {
            iI2 = i3;
        }
        return (((long) iI2) & 4294967295L) | (((long) i) << 32);
    }
}
