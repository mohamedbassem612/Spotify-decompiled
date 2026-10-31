package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class tlr0 implements ez00 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final String g;
    public final String h;
    public final z5a i;

    public tlr0(String str, String str2, String str3, String str4, String str5, int i, String str6, String str7, z5a z5aVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = i;
        this.g = str6;
        this.h = str7;
        this.i = z5aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tlr0)) {
            return false;
        }
        tlr0 tlr0Var = (tlr0) obj;
        return this.a.equals(tlr0Var.a) && this.b.equals(tlr0Var.b) && this.c.equals(tlr0Var.c) && this.d.equals(tlr0Var.d) && this.e.equals(tlr0Var.e) && this.f == tlr0Var.f && this.g.equals(tlr0Var.g) && this.h.equals(tlr0Var.h) && this.i.equals(tlr0Var.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + cy30.d(cy30.d(ab80.k(this.f, cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31, this.g), 31, this.h);
    }
}
