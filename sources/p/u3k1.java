package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class u3k1 {
    public final k3k1 a;

    public u3k1(k3k1 k3k1Var) {
        this.a = k3k1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u3k1) && this.a.equals(((u3k1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
