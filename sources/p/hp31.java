package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final /* synthetic */ class hp31 implements iv30 {
    public final /* synthetic */ dg30 a;

    public hp31(dg30 dg30Var) {
        this.a = dg30Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hp31) {
            return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // p.iv30
    public final cv30 getFunctionDelegate() {
        return new tv30(0, this.a, dg30.class, "getIntent", "getIntent()Landroid/content/Intent;", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
