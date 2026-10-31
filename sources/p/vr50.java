package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class vr50 implements mfv0 {
    public final tl3 a;
    public final jyp0 b;
    public long c = 0;

    public vr50(tl3 tl3Var, jyp0 jyp0Var) {
        this.a = tl3Var;
        this.b = jyp0Var;
    }

    public final long a(ur80 ur80Var, long j, flb0 flb0Var, long j2) {
        long jA = this.b.a();
        if ((9223372034707292159L & jA) == 9205357640488583168L) {
            jA = this.c;
        }
        this.c = jA;
        return qr80.d(qr80.d(ur80Var.c(), dm5.c0(jA)), this.a.a(j2, 0L, flb0Var));
    }
}
