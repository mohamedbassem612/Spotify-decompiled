package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class lsw {
    public final xcn0 a;

    public lsw(xcn0 xcn0Var) {
        this.a = xcn0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lsw) && this.a == ((lsw) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
