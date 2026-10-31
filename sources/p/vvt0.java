package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class vvt0 implements gwt0 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final boolean e;

    public vvt0(int i, String str, String str2, boolean z, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vvt0)) {
            return false;
        }
        vvt0 vvt0Var = (vvt0) obj;
        return u890.j(this.a, vvt0Var.a) && u890.j(this.b, vvt0Var.b) && u890.j(this.c, vvt0Var.c) && this.d == vvt0Var.d && this.e == vvt0Var.e;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Boolean.hashCode(this.e) + ab80.k(this.d, cy30.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31);
    }
}
