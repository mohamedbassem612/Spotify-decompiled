package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class r9l1 implements o5s {
    public final gg11 a;
    public final xau b;

    public r9l1(abu abuVar, gg11 gg11Var) {
        this.a = gg11Var;
        this.b = abuVar instanceof xau ? (xau) abuVar : null;
    }

    public final void onCreate(iac0 iac0Var) {
        y8l1 y8l1Var;
        xau xauVar = this.b;
        if (xauVar == null || (y8l1Var = (y8l1) this.a.get(xauVar.h())) == null) {
            return;
        }
        y8l1Var.onCreate();
    }

    public final void onDestroy(iac0 iac0Var) {
        y8l1 y8l1Var;
        xau xauVar = this.b;
        if (xauVar == null || (y8l1Var = (y8l1) this.a.get(xauVar.h())) == null) {
            return;
        }
        y8l1Var.onDestroy();
    }
}
