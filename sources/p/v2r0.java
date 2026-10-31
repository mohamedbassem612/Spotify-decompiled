package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class v2r0 {
    public final w2r0 a;

    public v2r0(w2r0 w2r0Var) {
        this.a = w2r0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v2r0) && this.a == ((v2r0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
