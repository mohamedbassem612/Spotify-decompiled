package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class l4f1 implements mfv0 {
    public final /* synthetic */ int a;

    public l4f1(int i) {
        this.a = i;
    }

    public final long a(ur80 ur80Var, long j, flb0 flb0Var, long j2) {
        int iF = l1d.f(ur80Var.d(), (int) (j2 >> 32), 2, ur80Var.a);
        int i = ur80Var.b - ((int) (j2 & 4294967295L));
        int i2 = this.a;
        int i3 = i - i2;
        if (i3 < 0) {
            i3 = ur80Var.d + i2;
        }
        return (((long) iF) << 32) | (((long) i3) & 4294967295L);
    }
}
