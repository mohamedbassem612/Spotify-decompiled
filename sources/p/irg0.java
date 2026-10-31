package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class irg0 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public irg0(String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
    }

    public static irg0 a(irg0 irg0Var, boolean z, boolean z2) {
        String str = irg0Var.a;
        String str2 = irg0Var.b;
        String str3 = irg0Var.c;
        boolean z3 = irg0Var.f;
        boolean z4 = irg0Var.g;
        irg0Var.getClass();
        return new irg0(str, str2, str3, z, z2, z3, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof irg0)) {
            return false;
        }
        irg0 irg0Var = (irg0) obj;
        return u890.j(this.a, irg0Var.a) && u890.j(this.b, irg0Var.b) && u890.j(this.c, irg0Var.c) && this.d == irg0Var.d && this.e == irg0Var.e && this.f == irg0Var.f && this.g == irg0Var.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + xcg1.g(xcg1.g(xcg1.g(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }
}
