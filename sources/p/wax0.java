package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class wax0 extends yax0 {
    public final r830 a;

    public wax0(r830 r830Var) {
        this.a = r830Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wax0) && this.a == ((wax0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
