package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class xvt0 implements gwt0 {
    public final String a;
    public final String b;
    public final boolean c;

    public xvt0(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xvt0)) {
            return false;
        }
        xvt0 xvt0Var = (xvt0) obj;
        return u890.j(this.a, xvt0Var.a) && u890.j(this.b, xvt0Var.b) && this.c == xvt0Var.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Boolean.hashCode(this.c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
