package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class o5e1 implements dr20, iv30 {
    public final /* synthetic */ bey0 a;

    public o5e1(bey0 bey0Var) {
        this.a = bey0Var;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof dr20) && (obj instanceof iv30)) {
            return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
        }
        return false;
    }

    public final cv30 getFunctionDelegate() {
        return this.a;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // p.dr20
    public final float invoke() {
        return ((Number) this.a.get()).floatValue();
    }
}
