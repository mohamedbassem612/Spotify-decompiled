package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ydu0 {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final iko h;

    public ydu0(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, iko ikoVar) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
        this.h = ikoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ydu0)) {
            return false;
        }
        ydu0 ydu0Var = (ydu0) obj;
        return this.a.equals(ydu0Var.a) && this.b == ydu0Var.b && this.c == ydu0Var.c && this.d == ydu0Var.d && this.e == ydu0Var.e && this.f == ydu0Var.f && this.g == ydu0Var.g && this.h == ydu0Var.h;
    }

    public final int hashCode() {
        return this.h.hashCode() + xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }
}
