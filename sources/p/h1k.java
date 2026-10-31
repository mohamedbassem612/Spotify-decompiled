package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class h1k implements k1k {
    public final ovl1 a;

    public h1k(ovl1 ovl1Var) {
        this.a = ovl1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h1k) && u890.j(this.a, ((h1k) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
