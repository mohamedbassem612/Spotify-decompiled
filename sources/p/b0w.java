package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class b0w extends l0w {
    public final hb9 a;

    public b0w(hb9 hb9Var) {
        this.a = hb9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b0w) && this.a.equals(((b0w) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
