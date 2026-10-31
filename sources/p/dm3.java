package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class dm3 implements mfv0 {
    public final tl3 a;
    public final long b;

    public dm3(tl3 tl3Var, long j) {
        this.a = tl3Var;
        this.b = j;
    }

    public final long a(ur80 ur80Var, long j, flb0 flb0Var, long j2) {
        long jA = this.a.a(0L, (((long) ur80Var.d()) << 32) | (((long) ur80Var.b()) & 4294967295L), flb0Var);
        long jA2 = this.a.a(0L, j2, flb0Var);
        long j3 = (((long) (-((int) (jA2 >> 32)))) << 32) | (((long) (-((int) (jA2 & 4294967295L)))) & 4294967295L);
        long j4 = this.b;
        return qr80.d(qr80.d(qr80.d(ur80Var.c(), jA), j3), (((long) ((int) (j4 & 4294967295L))) & 4294967295L) | (((long) (((int) (j4 >> 32)) * (flb0Var == flb0.a ? 1 : -1))) << 32));
    }
}
