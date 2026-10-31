package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class pc9 extends pim0 {
    public bhe1 O0;
    public final /* synthetic */ qc9 P0;

    public pc9(qc9 qc9Var) {
        this.P0 = qc9Var;
    }

    @Override // p.pim0
    public final void A1() {
        qc9 qc9Var = this.P0;
        if (qc9Var.a == this) {
            qc9Var.a = null;
        }
        bhe1 bhe1Var = this.O0;
        if (bhe1Var != null) {
            bhe1Var.b();
        }
        this.O0 = null;
    }

    @Override // p.pim0
    public final void z1() {
        qc9 qc9Var = this.P0;
        qc9Var.a = this;
        if (qc9Var.b != null) {
            this.O0 = grn1.t(this, 0L, 0L, new b6(this, qc9Var, (byte) 6));
        }
    }
}
