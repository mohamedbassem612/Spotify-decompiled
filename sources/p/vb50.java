package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class vb50 {
    public final String a;
    public final boolean b;

    public vb50(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vb50)) {
            return false;
        }
        vb50 vb50Var = (vb50) obj;
        return u890.j(this.a, vb50Var.a) && this.b == vb50Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
