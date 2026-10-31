package p;

import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class olt0 implements byf0 {
    public final r0s0 a;
    public final erd b;
    public final wmy c;
    public final ilt0 d;
    public faa0 e;
    public final llm f;

    public olt0(r0s0 r0s0Var, erd erdVar, wmy wmyVar, ilt0 ilt0Var, q8n q8nVar) {
        this.a = r0s0Var;
        this.b = erdVar;
        this.c = wmyVar;
        this.d = ilt0Var;
        this.f = smo1.e(q8nVar);
    }

    @Override // p.byf0
    public final void c() {
        ilt0 ilt0Var = this.d;
        yqg yqgVar = ilt0Var.b;
        dma1 dma1Var = ilt0Var.a;
        el4 el4Var = (el4) this.b.a.get();
        if (el4Var.c() || el4Var.a()) {
            bma1 bma1Var = ilt0.c;
            int iL = dma1Var.l(bma1Var, -1);
            if (iL != -1 && yqgVar.d().get(6) == iL) {
                return;
            }
            int i = yqgVar.d().get(6);
            hma1 hma1VarEdit = dma1Var.edit();
            hma1VarEdit.b(bma1Var, i);
            hma1VarEdit.g();
            faa0 faa0Var = this.e;
            if (faa0Var != null) {
                faa0Var.d(null);
            }
            this.e = c921.y(this.f, (o8n) null, 0, new i2p0(this, (lnm) null, (byte) 23), 3);
        }
    }

    @Override // p.byf0
    public final void d() {
        faa0 faa0Var = this.e;
        if (faa0Var != null) {
            faa0Var.d(null);
        }
    }

    @Override // p.byf0
    public final void g(ViewGroup viewGroup) {
    }
}
