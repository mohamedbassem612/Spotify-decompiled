package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final /* synthetic */ class j4h1 implements fqw, iv30 {
    public final /* synthetic */ lhx a;

    public j4h1(lhx lhxVar) {
        this.a = lhxVar;
    }

    public final /* synthetic */ laa a(fai0 fai0Var) {
        return (laa) this.a.invoke(fai0Var);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof fqw) && (obj instanceof iv30)) {
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
