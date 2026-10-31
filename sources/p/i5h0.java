package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class i5h0 implements z5h0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final c380 f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public i5h0(String str, String str2, String str3, String str4, int i, c380 c380Var, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = c380Var;
        this.g = z;
        this.h = z2;
        this.i = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i5h0)) {
            return false;
        }
        i5h0 i5h0Var = (i5h0) obj;
        return this.a.equals(i5h0Var.a) && this.b.equals(i5h0Var.b) && this.c.equals(i5h0Var.c) && u890.j(this.d, i5h0Var.d) && this.e == i5h0Var.e && u890.j(this.f, i5h0Var.f) && this.g == i5h0Var.g && this.h == i5h0Var.h && this.i == i5h0Var.i;
    }

    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + xcg1.g(xcg1.g(kk0.f(this.f, ab80.k(this.e, cy30.d(cy30.d(cy30.d(this.a.hashCode() * 961, 31, this.b), 31, this.c), 31, this.d), 31), 31), 31, this.g), 31, this.h);
    }
}
