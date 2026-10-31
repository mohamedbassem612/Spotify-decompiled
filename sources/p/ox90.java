package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ox90 {
    public final c9c0 a;
    public final ser b;
    public final yt91 c;

    public ox90(c9c0 c9c0Var, ser serVar, yt91 yt91Var) {
        this.a = c9c0Var;
        this.b = serVar;
        this.c = yt91Var;
    }

    public final void a(int i, String str) {
        pp90 pp90Var = (pp90) this.a.b.current().getValue();
        if (pp90Var != null) {
            this.b.a(str, nik1.t5.a, new tx90(pp90Var.a).a());
            return;
        }
        int iC = l1d.C(i);
        int i2 = 1;
        if (iC != 0) {
            if (iC != 1) {
                eg.o();
                return;
            }
            i2 = 2;
        }
        this.c.l(i2);
    }
}
