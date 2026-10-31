package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class p0h {
    public final t9k1 a;

    public p0h(t9k1 t9k1Var) {
        this.a = t9k1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p0h) && this.a.equals(((p0h) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
