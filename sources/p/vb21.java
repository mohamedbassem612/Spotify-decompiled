package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class vb21 {
    public final String a;
    public final String b;
    public final String c;
    public final Integer d;
    public final boolean e;

    public vb21(Integer num, String str, String str2, String str3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = num;
        this.e = z;
    }

    public static vb21 a(vb21 vb21Var, boolean z) {
        return new vb21(vb21Var.d, vb21Var.a, vb21Var.b, vb21Var.c, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vb21)) {
            return false;
        }
        vb21 vb21Var = (vb21) obj;
        return u890.j(this.a, vb21Var.a) && this.b.equals(vb21Var.b) && u890.j(this.c, vb21Var.c) && u890.j(this.d, vb21Var.d) && this.e == vb21Var.e;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.d;
        return Boolean.hashCode(this.e) + ((iHashCode + (num != null ? num.hashCode() : 0)) * 31);
    }
}
