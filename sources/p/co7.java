package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class co7 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final int f;

    public co7(int i, String str, String str2, String str3, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = z2;
        this.f = i;
    }

    public static co7 a(co7 co7Var, String str, String str2, String str3, boolean z, boolean z2, int i, int i2) {
        if ((i2 & 1) != 0) {
            str = co7Var.a;
        }
        String str4 = str;
        if ((i2 & 2) != 0) {
            str2 = co7Var.b;
        }
        String str5 = str2;
        if ((i2 & 4) != 0) {
            str3 = co7Var.c;
        }
        String str6 = str3;
        if ((i2 & 8) != 0) {
            z = co7Var.d;
        }
        boolean z3 = z;
        if ((i2 & 16) != 0) {
            z2 = co7Var.e;
        }
        boolean z4 = z2;
        if ((i2 & 32) != 0) {
            i = co7Var.f;
        }
        return new co7(i, str4, str5, str6, z3, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof co7)) {
            return false;
        }
        co7 co7Var = (co7) obj;
        return this.a.equals(co7Var.a) && u890.j(this.b, co7Var.b) && u890.j(this.c, co7Var.c) && this.d == co7Var.d && this.e == co7Var.e && this.f == co7Var.f;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return l1d.C(this.f) + xcg1.g(xcg1.g((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.d), 31, this.e);
    }
}
