package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class dsu0 implements gsu0 {
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final String f;
    public final yru0 g;
    public final boolean h;

    public dsu0(String str, String str2, boolean z, boolean z2, String str3, String str4, yru0 yru0Var, boolean z3) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
        this.e = str3;
        this.f = str4;
        this.g = yru0Var;
        this.h = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dsu0)) {
            return false;
        }
        dsu0 dsu0Var = (dsu0) obj;
        return this.a.equals(dsu0Var.a) && this.b.equals(dsu0Var.b) && this.c == dsu0Var.c && this.d == dsu0Var.d && u890.j(this.e, dsu0Var.e) && u890.j(this.f, dsu0Var.f) && u890.j(this.g, dsu0Var.g) && this.h == dsu0Var.h;
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        int iHashCode = (iG + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        yru0 yru0Var = this.g;
        return Boolean.hashCode(this.h) + ((iHashCode2 + (yru0Var != null ? yru0Var.hashCode() : 0)) * 31);
    }
}
