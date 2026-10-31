package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ct30 implements wf81 {
    public static final bma1 c = bma1.b.k("side_drawer_accessory_expanded");
    public final dma1 a;
    public final xe01 b;

    public ct30(dma1 dma1Var) {
        this.a = dma1Var;
        bma1 bma1Var = c;
        this.b = d5p1.t(new p3t(((ima1) dma1Var).q(bma1Var), (byte) 25), smo1.e(igu.b), new alb1(0L, Long.MAX_VALUE), Boolean.valueOf(dma1Var.h(bma1Var, true)));
    }

    public final void a(boolean z) {
        hma1 hma1VarEdit = this.a.edit();
        hma1VarEdit.a(c, z);
        hma1VarEdit.g();
    }

    public final xe01 b() {
        return this.b;
    }

    public final boolean c() {
        return this.a.h(c, true);
    }
}
