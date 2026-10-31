package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class cwc1 {
    public final c380 a;

    public cwc1(c380 c380Var) {
        this.a = c380Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cwc1) && u890.j(this.a, ((cwc1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
