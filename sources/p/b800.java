package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class b800 {
    public final g3p1 a;

    public b800(g3p1 g3p1Var) {
        this.a = g3p1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b800) && this.a.equals(((b800) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
