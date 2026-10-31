package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xb50 {
    public final String a;
    public final boolean b;

    public xb50(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xb50)) {
            return false;
        }
        xb50 xb50Var = (xb50) obj;
        return u890.j(this.a, xb50Var.a) && this.b == xb50Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
