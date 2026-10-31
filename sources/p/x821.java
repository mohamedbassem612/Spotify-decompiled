package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class x821 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final m821 h;

    public x821(String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, m821 m821Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = m821Var;
    }

    public static x821 a(x821 x821Var, boolean z, boolean z2, int i) {
        String str = x821Var.a;
        String str2 = x821Var.b;
        String str3 = x821Var.c;
        String str4 = x821Var.d;
        if ((i & 16) != 0) {
            z = x821Var.e;
        }
        boolean z3 = z;
        if ((i & 32) != 0) {
            z2 = x821Var.f;
        }
        return new x821(str, str2, str3, str4, z3, z2, x821Var.g, x821Var.h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x821)) {
            return false;
        }
        x821 x821Var = (x821) obj;
        return this.a.equals(x821Var.a) && u890.j(this.b, x821Var.b) && u890.j(this.c, x821Var.c) && u890.j(this.d, x821Var.d) && this.e == x821Var.e && this.f == x821Var.f && this.g == x821Var.g && u890.j(this.h, x821Var.h);
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g(xcg1.g(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        m821 m821Var = this.h;
        return iG + (m821Var == null ? 0 : m821Var.hashCode());
    }
}
