package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class j0w extends l0w {
    public final xb41 a;

    public j0w(xb41 xb41Var) {
        this.a = xb41Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j0w) && this.a.equals(((j0w) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
