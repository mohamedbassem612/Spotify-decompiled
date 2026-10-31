package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class jrw implements lrw {
    public final moy0 a;

    public jrw(moy0 moy0Var) {
        this.a = moy0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jrw) && this.a.equals(((jrw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
