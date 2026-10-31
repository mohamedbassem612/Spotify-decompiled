package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class gji0 {
    public final boolean a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;

    public gji0(boolean z, String str, String str2, String str3, int i, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = i;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        this.k = str9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gji0)) {
            return false;
        }
        gji0 gji0Var = (gji0) obj;
        return this.a == gji0Var.a && this.b.equals(gji0Var.b) && this.c.equals(gji0Var.c) && this.d.equals(gji0Var.d) && this.e == gji0Var.e && this.f.equals(gji0Var.f) && this.g.equals(gji0Var.g) && this.h.equals(gji0Var.h) && u890.j(this.i, gji0Var.i) && this.j.equals(gji0Var.j) && this.k.equals(gji0Var.k);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d(ab80.k(this.e, cy30.d(cy30.d(cy30.d(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31, this.f), 31, this.g), 31, this.h);
        String str = this.i;
        return this.k.hashCode() + cy30.d((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.j);
    }
}
