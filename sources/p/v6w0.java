package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class v6w0 {
    public final e9w0 a;
    public final hzu0 b;

    public v6w0(e9w0 e9w0Var, hzu0 hzu0Var) {
        this.a = e9w0Var;
        this.b = hzu0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v6w0) {
            v6w0 v6w0Var = (v6w0) obj;
            return this.a.equals(v6w0Var.a) && this.b == v6w0Var.b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
