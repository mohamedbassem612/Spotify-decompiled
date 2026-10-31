package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class c0b1 {
    public final String a;
    public final String b;
    public final o2u0 c;
    public final o2u0 d;
    public final ki0 e;
    public final boolean f;
    public final boolean g;

    public c0b1(String str, String str2, o2u0 o2u0Var, o2u0 o2u0Var2, ji0 ji0Var, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = o2u0Var;
        this.d = o2u0Var2;
        this.e = ji0Var;
        this.f = z;
        this.g = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0b1)) {
            return false;
        }
        c0b1 c0b1Var = (c0b1) obj;
        return u890.j(this.a, c0b1Var.a) && u890.j(this.b, c0b1Var.b) && u890.j(this.c, c0b1Var.c) && u890.j(this.d, c0b1Var.d) && u890.j(this.e, c0b1Var.e) && this.f == c0b1Var.f && this.g == c0b1Var.g;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        o2u0 o2u0Var = this.c;
        int iHashCode = (iD + (o2u0Var == null ? 0 : o2u0Var.hashCode())) * 31;
        o2u0 o2u0Var2 = this.d;
        int iHashCode2 = (iHashCode + (o2u0Var2 == null ? 0 : o2u0Var2.hashCode())) * 31;
        ki0 ki0Var = this.e;
        return Boolean.hashCode(this.g) + xcg1.g((iHashCode2 + (ki0Var != null ? ki0Var.hashCode() : 0)) * 31, 31, this.f);
    }

    public /* synthetic */ c0b1(int i, String str, String str2, boolean z) {
        this(str, (i & 2) != 0 ? "" : str2, null, null, null, true, z);
    }
}
