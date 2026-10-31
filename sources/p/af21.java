package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class af21 implements aac0 {
    public final /* synthetic */ k8c0 a;
    public final /* synthetic */ p811 b;
    public final /* synthetic */ c9n c;
    public final /* synthetic */ k8c0 d;
    public final /* synthetic */ ohd e;
    public final /* synthetic */ xgn0 f;
    public final /* synthetic */ vu30 g;

    public af21(k8c0 k8c0Var, p811 p811Var, c9n c9nVar, k8c0 k8c0Var2, ohd ohdVar, xgn0 xgn0Var, vu30 vu30Var) {
        this.a = k8c0Var;
        this.b = p811Var;
        this.c = c9nVar;
        this.d = k8c0Var2;
        this.e = ohdVar;
        this.f = xgn0Var;
        this.g = vu30Var;
    }

    @Override // p.aac0
    public final void q(iac0 iac0Var, k8c0 k8c0Var) {
        k8c0 k8c0Var2 = this.a;
        p811 p811Var = this.b;
        if (k8c0Var == k8c0Var2) {
            p811Var.a = c921.y(this.c, (o8n) null, 0, new ciw0(this.f, this.g, (lnm) null, (byte) 12), 3);
            return;
        }
        if (k8c0Var == this.d) {
            faa0 faa0Var = (faa0) p811Var.a;
            if (faa0Var != null) {
                ha71.o(faa0Var);
            }
            p811Var.a = null;
        }
        if (k8c0Var == k8c0.ON_DESTROY) {
            this.e.resumeWith(rih1.a);
        }
    }
}
