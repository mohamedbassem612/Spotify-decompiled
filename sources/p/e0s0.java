package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class e0s0 {
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;
    public final cd90 e;
    public final String f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public e0s0(String str, String str2, boolean z, String str3, cd90 cd90Var, String str4, boolean z2, boolean z3, boolean z4) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = cd90Var;
        this.f = str4;
        this.g = z2;
        this.h = z3;
        this.i = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0s0)) {
            return false;
        }
        e0s0 e0s0Var = (e0s0) obj;
        return u890.j(this.a, e0s0Var.a) && u890.j(this.b, e0s0Var.b) && this.c == e0s0Var.c && this.d.equals(e0s0Var.d) && this.e.equals(e0s0Var.e) && this.f.equals(e0s0Var.f) && this.g == e0s0Var.g && this.h == e0s0Var.h && this.i == e0s0Var.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + xcg1.g(xcg1.g(cy30.d(f4i1.b(cy30.d(xcg1.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e.a), 31, this.f), 31, this.g), 31, this.h);
    }
}
