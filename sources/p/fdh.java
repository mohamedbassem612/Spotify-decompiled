package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class fdh implements ooe1 {
    public final ooe1[] a;

    public fdh(ooe1... ooe1VarArr) {
        this.a = ooe1VarArr;
    }

    @Override // p.ooe1
    public final void a(boolean z) {
        for (int i = 0; i < 2; i++) {
            this.a[i].a(z);
        }
    }

    @Override // p.ooe1
    public final void b(pne1 pne1Var) {
        for (int i = 0; i < 2; i++) {
            this.a[i].b(pne1Var);
        }
    }

    @Override // p.ooe1
    public final void setEnabled(boolean z) {
        for (int i = 0; i < 2; i++) {
            this.a[i].setEnabled(z);
        }
    }
}
