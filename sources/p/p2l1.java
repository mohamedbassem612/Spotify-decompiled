package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class p2l1 {
    public final String a;
    public final String b;
    public final f291 c;
    public final int d;
    public final j0p1 e;
    public final String f;

    public p2l1(String str, String str2, f291 f291Var, int i, j0p1 j0p1Var, String str3) {
        this.a = str;
        this.b = str2;
        this.c = f291Var;
        this.d = i;
        this.e = j0p1Var;
        this.f = str3;
    }

    public static p2l1 a(p2l1 p2l1Var, String str, j0p1 j0p1Var, int i) {
        String str2 = p2l1Var.a;
        if ((i & 2) != 0) {
            str = p2l1Var.b;
        }
        String str3 = str;
        f291 f291Var = p2l1Var.c;
        int i2 = (i & 8) != 0 ? p2l1Var.d : 3;
        if ((i & 32) != 0) {
            j0p1Var = p2l1Var.e;
        }
        return new p2l1(str2, str3, f291Var, i2, j0p1Var, p2l1Var.f);
    }

    public final int b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p2l1)) {
            return false;
        }
        p2l1 p2l1Var = (p2l1) obj;
        return this.a.equals(p2l1Var.a) && u890.j(this.b, p2l1Var.b) && u890.j(this.c, p2l1Var.c) && this.d == p2l1Var.d && u890.j(this.e, p2l1Var.e) && u890.j(this.f, p2l1Var.f);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (this.e.hashCode() + xcg1.g(ab80.k(this.d, (this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31), 31, false)) * 31;
        String str2 = this.f;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
