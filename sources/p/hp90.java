package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class hp90 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public hp90(String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = z2;
        this.g = z3;
    }

    public static hp90 a(hp90 hp90Var, String str, String str2) {
        String str3 = hp90Var.a;
        String str4 = hp90Var.c;
        boolean z = hp90Var.e;
        boolean z2 = hp90Var.f;
        boolean z3 = hp90Var.g;
        hp90Var.getClass();
        return new hp90(str3, str, str4, str2, z, z2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hp90)) {
            return false;
        }
        hp90 hp90Var = (hp90) obj;
        return u890.j(this.a, hp90Var.a) && u890.j(this.b, hp90Var.b) && u890.j(this.c, hp90Var.c) && u890.j(this.d, hp90Var.d) && this.e == hp90Var.e && this.f == hp90Var.f && this.g == hp90Var.g;
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return Boolean.hashCode(this.g) + xcg1.g(xcg1.g((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.e), 31, this.f);
    }
}
