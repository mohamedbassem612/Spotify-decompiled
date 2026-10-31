package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class s0c0 implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ t0c0 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;

    public s0c0(t0c0 t0c0Var, boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = t0c0Var;
        this.c = z2;
        this.d = z3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.a;
        efu efuVar = efu.a;
        t0c0 t0c0Var = this.b;
        if (z) {
            t0c0Var.b("create_playlist", efuVar);
        }
        if (this.c) {
            t0c0Var.b("follow_podcast", efuVar);
        }
        if (this.d) {
            bma1 bma1Var = t0c0.o;
            bma1 bma1Var2 = t0c0.f42p;
            long jB = t0c0Var.e.b();
            if (!t0c0Var.c().n(bma1Var2)) {
                hma1 hma1VarEdit = t0c0Var.c().edit();
                hma1VarEdit.c(bma1Var2, jB);
                hma1VarEdit.h();
            } else if (jB >= t0c0Var.c().j(bma1Var2) + 1209600000) {
                hma1 hma1VarEdit2 = t0c0Var.c().edit();
                hma1VarEdit2.a(bma1Var, true);
                hma1VarEdit2.h();
            }
        }
    }
}
