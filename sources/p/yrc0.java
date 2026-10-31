package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class yrc0 {
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final int f;

    public yrc0(String str, String str2, boolean z, int i, boolean z2, boolean z3) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = i;
    }

    public final boolean a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yrc0)) {
            return false;
        }
        yrc0 yrc0Var = (yrc0) obj;
        return u890.j(this.a, yrc0Var.a) && this.b.equals(yrc0Var.b) && this.c == yrc0Var.c && this.d == yrc0Var.d && this.e == yrc0Var.e && this.f == yrc0Var.f;
    }

    public final int hashCode() {
        return l1d.C(this.f) + xcg1.g(xcg1.g(xcg1.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }
}
