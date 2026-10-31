package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class r56 {
    public final z740 a;

    public r56(z740 z740Var) {
        this.a = z740Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r56) && this.a.equals(((r56) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
