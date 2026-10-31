package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class nzw0 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final String f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;

    public nzw0(int i, String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = str4;
        this.f = str5;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = z4;
    }

    public static nzw0 a(nzw0 nzw0Var, int i, String str, String str2, boolean z, boolean z2, boolean z3, int i2) {
        String str3 = nzw0Var.a;
        String str4 = nzw0Var.b;
        String str5 = nzw0Var.c;
        if ((i2 & 8) != 0) {
            i = nzw0Var.d;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            str = nzw0Var.e;
        }
        String str6 = str;
        if ((i2 & 32) != 0) {
            str2 = nzw0Var.f;
        }
        String str7 = str2;
        boolean z4 = (i2 & 64) != 0 ? nzw0Var.g : z;
        boolean z5 = (i2 & 128) != 0 ? nzw0Var.h : z2;
        boolean z6 = (i2 & 256) != 0 ? nzw0Var.i : z3;
        boolean z7 = nzw0Var.j;
        nzw0Var.getClass();
        return new nzw0(i3, str3, str4, str5, str6, str7, z4, z5, z6, z7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nzw0)) {
            return false;
        }
        nzw0 nzw0Var = (nzw0) obj;
        return u890.j(this.a, nzw0Var.a) && u890.j(this.b, nzw0Var.b) && u890.j(this.c, nzw0Var.c) && this.d == nzw0Var.d && u890.j(this.e, nzw0Var.e) && u890.j(this.f, nzw0Var.f) && this.g == nzw0Var.g && this.h == nzw0Var.h && this.i == nzw0Var.i && this.j == nzw0Var.j;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iK = ab80.k(this.d, (iD + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.e;
        int iHashCode = (iK + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        return Boolean.hashCode(this.j) + xcg1.g(xcg1.g(xcg1.g((iHashCode + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.g), 31, this.h), 31, this.i);
    }

    public /* synthetic */ nzw0(String str, String str2, String str3, boolean z) {
        this(1, str, str2, str3, null, null, false, false, false, z);
    }
}
