package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class eeo0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;

    public eeo0(String str, String str2, String str3, String str4, int i, boolean z, boolean z2, String str5, String str6, String str7, String str8) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = z;
        this.g = z2;
        this.h = str5;
        this.i = str6;
        this.j = str7;
        this.k = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eeo0)) {
            return false;
        }
        eeo0 eeo0Var = (eeo0) obj;
        return this.a.equals(eeo0Var.a) && this.b.equals(eeo0Var.b) && this.c.equals(eeo0Var.c) && this.d.equals(eeo0Var.d) && this.e == eeo0Var.e && this.f == eeo0Var.f && this.g == eeo0Var.g && this.h.equals(eeo0Var.h) && this.i.equals(eeo0Var.i) && this.j.equals(eeo0Var.j) && this.k.equals(eeo0Var.k);
    }

    public final int hashCode() {
        return this.k.hashCode() + cy30.d(cy30.d(cy30.d(xcg1.g(xcg1.g(kaa0.f(this.e, cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j);
    }
}
