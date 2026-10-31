package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class h7a1 {
    public final vb81 a;

    public h7a1(vb81 vb81Var) {
        this.a = vb81Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h7a1) && this.a.equals(((h7a1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
