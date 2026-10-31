package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class pqb0 {
    public final ajn0 a;
    public final mb11 b;

    public pqb0(ajn0 ajn0Var, mb11 mb11Var) {
        this.a = ajn0Var;
        this.b = mb11Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof pqb0) {
            return u890.j(this.a, ((pqb0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
