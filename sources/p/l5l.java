package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class l5l implements m5l {
    public final hry0 a;

    public l5l(hry0 hry0Var) {
        this.a = hry0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l5l) && u890.j(this.a, ((l5l) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
