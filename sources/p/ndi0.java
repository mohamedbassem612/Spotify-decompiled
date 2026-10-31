package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ndi0 {
    public final String a;
    public final x360 b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;

    public ndi0(String str, x360 x360Var, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.a = str;
        this.b = x360Var;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = str9;
        this.k = str10;
        this.l = str11;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.h;
    }

    public final String c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ndi0)) {
            return false;
        }
        ndi0 ndi0Var = (ndi0) obj;
        return this.a.equals(ndi0Var.a) && u890.j(this.b, ndi0Var.b) && this.c.equals(ndi0Var.c) && this.d.equals(ndi0Var.d) && this.e.equals(ndi0Var.e) && this.f.equals(ndi0Var.f) && this.g.equals(ndi0Var.g) && this.h.equals(ndi0Var.h) && this.i.equals(ndi0Var.i) && this.j.equals(ndi0Var.j) && this.k.equals(ndi0Var.k) && this.l.equals(ndi0Var.l);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        x360 x360Var = this.b;
        return this.l.hashCode() + cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d((iHashCode + (x360Var == null ? 0 : x360Var.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k);
    }
}
