package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class umd implements vmd {
    public final z740 a;

    public umd(z740 z740Var) {
        this.a = z740Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof umd) && u890.j(this.a, ((umd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
