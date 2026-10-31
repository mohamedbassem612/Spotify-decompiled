package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class m8m1 implements j3k, aac0 {
    public final ha4 a;
    public final h4k b;
    public boolean c;
    public x8c0 d;
    public vu30 e = osj.a;

    public m8m1(ha4 ha4Var, h4k h4kVar) {
        this.a = ha4Var;
        this.b = h4kVar;
    }

    public final void a(vu30 vu30Var) {
        this.a.setOnReadyForComposition(new sdu(this, vu30Var, (byte) 1));
    }

    @Override // p.j3k
    public final void dispose() {
        if (!this.c) {
            this.c = true;
            ha4 ha4Var = this.a;
            ha4Var.getView().setTag(2131431714, null);
            x8c0 x8c0Var = this.d;
            if (x8c0Var != null) {
                x8c0Var.d(this);
            }
            this.d = null;
            sku skuVar = ha4Var.g;
            if (skuVar != null) {
                skuVar.b.invoke();
            }
            ha4Var.g = null;
        }
        this.b.dispose();
    }

    @Override // p.aac0
    public final void q(iac0 iac0Var, k8c0 k8c0Var) {
        if (k8c0Var == k8c0.ON_DESTROY) {
            dispose();
        } else {
            if (k8c0Var != k8c0.ON_CREATE || this.c) {
                return;
            }
            a(this.e);
        }
    }
}
