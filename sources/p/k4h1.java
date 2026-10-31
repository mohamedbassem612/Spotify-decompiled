package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final /* synthetic */ class k4h1 implements gqw, iv30 {
    public final /* synthetic */ kj21 a;

    public k4h1(kj21 kj21Var) {
        this.a = kj21Var;
    }

    @Override // p.gqw
    public final /* synthetic */ wpw a(iqw iqwVar, iqw iqwVar2, jqw jqwVar) {
        return (wpw) this.a.invoke(iqwVar, iqwVar2, jqwVar);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof gqw) && (obj instanceof iv30)) {
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
}
