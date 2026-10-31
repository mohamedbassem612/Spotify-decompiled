package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class hc80 implements e9j1 {
    public final fq0 a;

    public hc80(fq0 fq0Var) {
        this.a = fq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hc80) && u890.j(this.a, ((hc80) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
