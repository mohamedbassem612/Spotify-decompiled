package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class khw implements diw {
    public final u1q0 a;

    public khw(u1q0 u1q0Var) {
        this.a = u1q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof khw) && this.a == ((khw) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
