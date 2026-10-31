package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class sq81 {
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;
    public final int e;
    public final String f;
    public final boolean g;
    public final boolean h;
    public final String i;

    public sq81(String str, String str2, boolean z, String str3, int i, String str4, boolean z2, boolean z3, String str5) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = i;
        this.f = str4;
        this.g = z2;
        this.h = z3;
        this.i = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sq81)) {
            return false;
        }
        sq81 sq81Var = (sq81) obj;
        return this.a.equals(sq81Var.a) && this.b.equals(sq81Var.b) && this.c == sq81Var.c && this.d.equals(sq81Var.d) && this.e == sq81Var.e && this.f.equals(sq81Var.f) && this.g == sq81Var.g && this.h == sq81Var.h && this.i.equals(sq81Var.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + xcg1.g(xcg1.g(cy30.d(ab80.k(this.e, cy30.d(xcg1.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31, this.f), 31, this.g), 31, this.h);
    }
}
