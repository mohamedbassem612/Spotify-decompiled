package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class mku implements ky11 {
    public final iu30 a;
    public nku b;

    public mku(iu30 iu30Var) {
        this.a = iu30Var;
    }

    @Override // p.ky11
    public final void b() {
        this.b = (nku) this.a.invoke(qxd0.a);
    }

    @Override // p.ky11
    public final void h() {
        nku nkuVar = this.b;
        if (nkuVar != null) {
            nkuVar.dispose();
        }
        this.b = null;
    }

    @Override // p.ky11
    public final void f() {
    }
}
