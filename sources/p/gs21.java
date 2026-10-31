package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gs21 {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final int e;
    public final String f;
    public final int g;
    public final int h;

    public gs21(String str, String str2, String str3, long j, int i, String str4, int i2, int i3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = i;
        this.f = str4;
        this.g = i2;
        this.h = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gs21)) {
            return false;
        }
        gs21 gs21Var = (gs21) obj;
        return u890.j(this.a, gs21Var.a) && u890.j(this.b, gs21Var.b) && u890.j(this.c, gs21Var.c) && this.d == gs21Var.d && this.e == gs21Var.e && this.f.equals(gs21Var.f) && this.g == gs21Var.g && this.h == gs21Var.h;
    }

    public final int hashCode() {
        return Integer.hashCode(this.h) + kaa0.f(this.g, cy30.d(kaa0.f(this.e, cy30.f(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), this.d, 31), 31), 31, this.f), 31);
    }
}
