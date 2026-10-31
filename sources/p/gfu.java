package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class gfu implements mfu {
    public final n6c0 a;

    public gfu(n6c0 n6c0Var) {
        this.a = n6c0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gfu) && u890.j(this.a, ((gfu) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
