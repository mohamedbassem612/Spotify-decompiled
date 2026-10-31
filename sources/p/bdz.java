package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class bdz implements w6g1, iv30 {
    public final /* synthetic */ tf a;

    public bdz(tf tfVar) {
        this.a = tfVar;
    }

    public final /* synthetic */ Object a(String str, String str2, ioj0 ioj0Var) {
        return this.a.invoke(str, str2, ioj0Var);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof w6g1) && (obj instanceof iv30)) {
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
