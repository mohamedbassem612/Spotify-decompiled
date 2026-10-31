package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class jjr0 {
    public final c380 a;
    public final Integer b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public jjr0(c380 c380Var, Integer num, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.a = c380Var;
        this.b = num;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = z6;
        this.i = z7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jjr0)) {
            return false;
        }
        jjr0 jjr0Var = (jjr0) obj;
        return u890.j(this.a, jjr0Var.a) && u890.j(this.b, jjr0Var.b) && this.c == jjr0Var.c && this.d == jjr0Var.d && this.e == jjr0Var.e && this.f == jjr0Var.f && this.g == jjr0Var.g && this.h == jjr0Var.h && this.i == jjr0Var.i;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return Boolean.hashCode(this.i) + xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }
}
