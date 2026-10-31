package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class y04 implements iv30 {
    public final /* synthetic */ vu30 a;

    public y04(vu30 vu30Var) {
        this.a = vu30Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof y04) {
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
