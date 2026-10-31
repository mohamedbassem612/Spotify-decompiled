package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class nj71 extends pj71 {
    public final hj71 a;

    public nj71(hj71 hj71Var) {
        this.a = hj71Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nj71) && u890.j(this.a, ((nj71) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
