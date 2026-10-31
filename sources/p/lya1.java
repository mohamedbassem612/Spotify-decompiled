package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class lya1 implements aac0 {
    public final /* synthetic */ x8c0 a;
    public final /* synthetic */ p811 b;
    public final /* synthetic */ nxq0 c;
    public final /* synthetic */ nxq0 d;
    public final /* synthetic */ p811 e;

    public lya1(x8c0 x8c0Var, p811 p811Var, nxq0 nxq0Var, nxq0 nxq0Var2, p811 p811Var2) {
        this.a = x8c0Var;
        this.b = p811Var;
        this.c = nxq0Var;
        this.d = nxq0Var2;
        this.e = p811Var2;
    }

    public final void q(iac0 iac0Var, k8c0 k8c0Var) {
        tac0 tac0Var = this.d.a;
        tac0 tac0Var2 = this.c.a;
        x8c0 x8c0Var = this.a;
        w8c0 w8c0VarB = x8c0Var.b();
        p811 p811Var = this.b;
        Object obj = p811Var.a;
        if (w8c0VarB == obj) {
            return;
        }
        if (w8c0VarB.a((w8c0) obj)) {
            tac0Var2.i(w8c0VarB);
            tac0Var.i(w8c0VarB);
        } else {
            tac0Var.i(w8c0VarB);
            tac0Var2.i(w8c0VarB);
        }
        p811Var.a = w8c0VarB;
        if (w8c0VarB == w8c0.a) {
            Object obj2 = this.e.a;
            if (obj2 != null) {
                x8c0Var.d((hac0) obj2);
            } else {
                u890.C("observer");
                throw null;
            }
        }
    }
}
