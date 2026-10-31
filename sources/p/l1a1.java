package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class l1a1 extends q1a1 {
    public final jg61 a;

    public l1a1(jg61 jg61Var) {
        this.a = jg61Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l1a1) && this.a.equals(((l1a1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
