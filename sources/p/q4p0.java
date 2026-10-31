package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class q4p0 implements whm0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final e090 d;
    public final String e;
    public final String f;

    public q4p0(boolean z, boolean z2, boolean z3, e090 e090Var, String str, String str2) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = e090Var;
        this.e = str;
        this.f = str2;
    }

    public static q4p0 b(q4p0 q4p0Var, boolean z, boolean z2, boolean z3, e090 e090Var, String str, String str2, int i) {
        if ((i & 1) != 0) {
            z = q4p0Var.a;
        }
        boolean z4 = z;
        if ((i & 2) != 0) {
            z2 = q4p0Var.b;
        }
        boolean z5 = z2;
        if ((i & 4) != 0) {
            z3 = q4p0Var.c;
        }
        boolean z6 = z3;
        if ((i & 8) != 0) {
            e090Var = q4p0Var.d;
        }
        e090 e090Var2 = e090Var;
        if ((i & 16) != 0) {
            str = q4p0Var.e;
        }
        String str3 = str;
        if ((i & 32) != 0) {
            str2 = q4p0Var.f;
        }
        q4p0Var.getClass();
        return new q4p0(z4, z5, z6, e090Var2, str3, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q4p0)) {
            return false;
        }
        q4p0 q4p0Var = (q4p0) obj;
        return this.a == q4p0Var.a && this.b == q4p0Var.b && this.c == q4p0Var.c && u890.j(this.d, q4p0Var.d) && u890.j(this.e, q4p0Var.e) && u890.j(this.f, q4p0Var.f);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + xcg1.g(xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c)) * 31;
        String str = this.e;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public /* synthetic */ q4p0(int i) {
        this(false, false, false, a090.a, null, null);
    }
}
