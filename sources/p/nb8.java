package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class nb8 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final boolean g;
    public final k4m h;
    public final pk1 i;

    public nb8(String str, String str2, String str3, String str4, String str5, String str6, boolean z, k4m k4mVar, pk1 pk1Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = z;
        this.h = k4mVar;
        this.i = pk1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nb8)) {
            return false;
        }
        nb8 nb8Var = (nb8) obj;
        return u890.j(this.a, nb8Var.a) && this.b.equals(nb8Var.b) && this.c.equals(nb8Var.c) && u890.j(this.d, nb8Var.d) && u890.j(this.e, nb8Var.e) && u890.j(this.f, nb8Var.f) && this.g == nb8Var.g && this.h == nb8Var.h && this.i.equals(nb8Var.i);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return this.i.hashCode() + p3d1.g(this.h, xcg1.g(cy30.d((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f), 31, this.g), 31);
    }
}
