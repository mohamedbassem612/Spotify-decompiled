package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class s7k0 {
    public final Float a;
    public final String b;
    public final r7k0 c;
    public final String d;
    public final jfv e;
    public final boolean f;
    public final boolean g;
    public final int h;

    public s7k0(Float f, String str, r7k0 r7k0Var, String str2, jfv jfvVar, boolean z, boolean z2, int i) {
        this.a = f;
        this.b = str;
        this.c = r7k0Var;
        this.d = str2;
        this.e = jfvVar;
        this.f = z;
        this.g = z2;
        this.h = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s7k0)) {
            return false;
        }
        s7k0 s7k0Var = (s7k0) obj;
        return u890.j(this.a, s7k0Var.a) && u890.j(this.b, s7k0Var.b) && this.c.equals(s7k0Var.c) && u890.j(this.d, s7k0Var.d) && u890.j(this.e, s7k0Var.e) && this.f == s7k0Var.f && this.g == s7k0Var.g && this.h == s7k0Var.h;
    }

    public final int hashCode() {
        Float f = this.a;
        int iHashCode = (f == null ? 0 : f.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        String str2 = this.d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        jfv jfvVar = this.e;
        int iG = xcg1.g(xcg1.g((iHashCode3 + (jfvVar == null ? 0 : Long.hashCode(jfvVar.a))) * 31, 31, this.f), 31, this.g);
        int i = this.h;
        return iG + (i != 0 ? l1d.C(i) : 0);
    }
}
