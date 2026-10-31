package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ugu0 {
    public final String a;
    public final String b = "";
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final boolean g;
    public final boolean h;
    public final String i;
    public final boolean j;

    public ugu0(String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = z;
        this.h = z2;
        this.i = str6;
        this.j = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ugu0)) {
            return false;
        }
        ugu0 ugu0Var = (ugu0) obj;
        return this.a.equals(ugu0Var.a) && this.b.equals(ugu0Var.b) && this.c.equals(ugu0Var.c) && this.d.equals(ugu0Var.d) && this.e.equals(ugu0Var.e) && this.f.equals(ugu0Var.f) && this.g == ugu0Var.g && this.h == ugu0Var.h && this.i.equals(ugu0Var.i) && this.j == ugu0Var.j;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.j) + xcg1.g(cy30.d(xcg1.g(xcg1.g(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, true);
    }
}
