package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class kef1 {
    public final String a;
    public final String b;
    public final cvt0 c;
    public final String d;
    public final int e;
    public final boolean f;
    public final boolean g;

    public kef1(String str, String str2, cvt0 cvt0Var, String str3, int i, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = cvt0Var;
        this.d = str3;
        this.e = i;
        this.f = z;
        this.g = z2;
    }

    public final int a() {
        return this.e;
    }

    public final cvt0 b() {
        return this.c;
    }

    public final String c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kef1)) {
            return false;
        }
        kef1 kef1Var = (kef1) obj;
        return u890.j(this.a, kef1Var.a) && u890.j(this.b, kef1Var.b) && u890.j(this.c, kef1Var.c) && u890.j(this.d, kef1Var.d) && this.e == kef1Var.e && this.f == kef1Var.f && this.g == kef1Var.g;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        cvt0 cvt0Var = this.c;
        return Boolean.hashCode(this.g) + xcg1.g(kaa0.f(this.e, cy30.d((iD + (cvt0Var == null ? 0 : cvt0Var.hashCode())) * 31, 31, this.d), 31), 31, this.f);
    }
}
