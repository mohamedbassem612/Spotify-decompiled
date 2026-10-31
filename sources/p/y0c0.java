package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class y0c0 extends hki0 {
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final int h;
    public final boolean i;

    public y0c0(String str, String str2, int i, String str3, String str4, String str5, String str6, int i2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = i2;
        this.i = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0c0)) {
            return false;
        }
        y0c0 y0c0Var = (y0c0) obj;
        return this.a.equals(y0c0Var.a) && this.b.equals(y0c0Var.b) && this.c == y0c0Var.c && this.d.equals(y0c0Var.d) && this.e.equals(y0c0Var.e) && this.f.equals(y0c0Var.f) && this.g.equals(y0c0Var.g) && this.h == y0c0Var.h && this.i == y0c0Var.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + kaa0.f(this.h, cy30.d(cy30.d(cy30.d(cy30.d(kaa0.f(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31);
    }
}
