package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class tyr0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;

    public tyr0(String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = z5;
        this.j = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tyr0)) {
            return false;
        }
        tyr0 tyr0Var = (tyr0) obj;
        return u890.j(this.a, tyr0Var.a) && u890.j(this.b, tyr0Var.b) && u890.j(this.c, tyr0Var.c) && u890.j(this.d, tyr0Var.d) && this.e == tyr0Var.e && this.f == tyr0Var.f && this.g == tyr0Var.g && this.h == tyr0Var.h && this.i == tyr0Var.i && this.j == tyr0Var.j;
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return Boolean.hashCode(this.j) + xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
    }
}
