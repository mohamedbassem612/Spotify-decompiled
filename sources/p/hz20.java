package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final /* synthetic */ class hz20 implements iv30 {
    public final /* synthetic */ iu30 a;

    public hz20(iu30 iu30Var) {
        this.a = iu30Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hz20) {
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
