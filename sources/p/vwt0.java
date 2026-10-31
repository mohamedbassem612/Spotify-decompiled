package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class vwt0 {
    public final String a;
    public final boolean b;

    public vwt0(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vwt0)) {
            return false;
        }
        vwt0 vwt0Var = (vwt0) obj;
        return u890.j(this.a, vwt0Var.a) && this.b == vwt0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
