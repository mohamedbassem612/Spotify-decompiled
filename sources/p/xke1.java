package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xke1 {
    public final String a;
    public final boolean b;

    public xke1(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xke1)) {
            return false;
        }
        xke1 xke1Var = (xke1) obj;
        return u890.j(this.a, xke1Var.a) && this.b == xke1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
