package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class sba0 implements vba0 {
    public final pp90 a;

    public sba0(pp90 pp90Var) {
        this.a = pp90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sba0) && this.a.equals(((sba0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
