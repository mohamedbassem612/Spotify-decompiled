package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class k5l implements m5l {
    public final hry0 a;

    public k5l(hry0 hry0Var) {
        this.a = hry0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k5l) && u890.j(this.a, ((k5l) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
