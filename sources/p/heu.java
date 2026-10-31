package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class heu {
    public final ji0 a;

    public heu(ji0 ji0Var) {
        this.a = ji0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof heu) && u890.j(this.a, ((heu) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
