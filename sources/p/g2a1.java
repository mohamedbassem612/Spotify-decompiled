package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class g2a1 implements m2a1 {
    public final jg61 a;

    public g2a1(jg61 jg61Var) {
        this.a = jg61Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g2a1) && this.a.equals(((g2a1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
