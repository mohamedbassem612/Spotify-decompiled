package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class v5h0 implements z5h0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final c380 e;
    public final boolean f;
    public final boolean g;
    public final String h;
    public final boolean i;
    public final boolean j;

    public v5h0(String str, String str2, String str3, String str4, c380 c380Var, boolean z, boolean z2, String str5, boolean z3, boolean z4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = c380Var;
        this.f = z;
        this.g = z2;
        this.h = str5;
        this.i = z3;
        this.j = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v5h0)) {
            return false;
        }
        v5h0 v5h0Var = (v5h0) obj;
        return this.a.equals(v5h0Var.a) && this.b.equals(v5h0Var.b) && this.c.equals(v5h0Var.c) && u890.j(this.d, v5h0Var.d) && u890.j(this.e, v5h0Var.e) && this.f == v5h0Var.f && this.g == v5h0Var.g && u890.j(this.h, v5h0Var.h) && this.i == v5h0Var.i && this.j == v5h0Var.j;
    }

    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g(kk0.f(this.e, cy30.d(cy30.d(cy30.d(this.a.hashCode() * 961, 31, this.b), 31, this.c), 31, this.d), 31), 31, this.f), 31, this.g);
        String str = this.h;
        return Boolean.hashCode(this.j) + xcg1.g((iG + (str == null ? 0 : str.hashCode())) * 31, 31, this.i);
    }
}
