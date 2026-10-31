package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class f5l1 implements g5l1 {
    public final g1f0 a;

    public f5l1(g1f0 g1f0Var) {
        this.a = g1f0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f5l1) && u890.j(this.a, ((f5l1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
