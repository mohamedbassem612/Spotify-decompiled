package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rus0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final boolean h;
    public final boolean i;
    public final boolean j;

    public rus0(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = z;
        this.i = z2;
        this.j = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rus0)) {
            return false;
        }
        rus0 rus0Var = (rus0) obj;
        return u890.j(this.a, rus0Var.a) && u890.j(this.b, rus0Var.b) && this.c.equals(rus0Var.c) && this.d.equals(rus0Var.d) && this.e.equals(rus0Var.e) && this.f.equals(rus0Var.f) && this.g.equals(rus0Var.g) && this.h == rus0Var.h && this.i == rus0Var.i && this.j == rus0Var.j;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.j) + xcg1.g(xcg1.g(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
    }
}
