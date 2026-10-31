package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class beo0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final int f;
    public final boolean g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;

    public beo0(String str, String str2, String str3, String str4, int i, int i2, boolean z, String str5, String str6, String str7, String str8) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = i2;
        this.g = z;
        this.h = str5;
        this.i = str6;
        this.j = str7;
        this.k = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof beo0)) {
            return false;
        }
        beo0 beo0Var = (beo0) obj;
        return u890.j(this.a, beo0Var.a) && u890.j(this.b, beo0Var.b) && u890.j(this.c, beo0Var.c) && u890.j(this.d, beo0Var.d) && this.e == beo0Var.e && this.f == beo0Var.f && this.g == beo0Var.g && u890.j(this.h, beo0Var.h) && u890.j(this.i, beo0Var.i) && u890.j(this.j, beo0Var.j) && u890.j(this.k, beo0Var.k);
    }

    public final int hashCode() {
        return this.k.hashCode() + cy30.d(cy30.d(cy30.d(xcg1.g(kaa0.f(this.f, kaa0.f(this.e, cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31), 31, this.g), 31, this.h), 31, this.i), 31, this.j);
    }
}
