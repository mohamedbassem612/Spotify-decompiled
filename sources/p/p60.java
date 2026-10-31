package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class p60 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final float f;
    public final String g;
    public final String h;
    public final String i;
    public final int j;
    public final k20 k;
    public final String l;

    public p60(String str, String str2, String str3, String str4, String str5, float f, String str6, String str7, String str8, int i, k20 k20Var, String str9, int i2) {
        str = (i2 & 1) != 0 ? "" : str;
        str2 = (i2 & 2) != 0 ? "#FFFFFF" : str2;
        str3 = (i2 & 4) != 0 ? "" : str3;
        str4 = (i2 & 8) != 0 ? "" : str4;
        str5 = (i2 & 16) != 0 ? "" : str5;
        f = (i2 & 32) != 0 ? 0.0f : f;
        str6 = (i2 & 64) != 0 ? "" : str6;
        str7 = (i2 & 128) != 0 ? "" : str7;
        str8 = (i2 & 256) != 0 ? "" : str8;
        i = (i2 & 512) != 0 ? 4 : i;
        k20Var = (i2 & 1024) != 0 ? b6j0.b : k20Var;
        str9 = (i2 & 2048) != 0 ? "" : str9;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = f;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = i;
        this.k = k20Var;
        this.l = str9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p60)) {
            return false;
        }
        p60 p60Var = (p60) obj;
        return this.a.equals(p60Var.a) && this.b.equals(p60Var.b) && this.c.equals(p60Var.c) && this.d.equals(p60Var.d) && this.e.equals(p60Var.e) && Float.compare(this.f, p60Var.f) == 0 && this.g.equals(p60Var.g) && this.h.equals(p60Var.h) && this.i.equals(p60Var.i) && this.j == p60Var.j && this.k.equals(p60Var.k) && this.l.equals(p60Var.l);
    }

    public final int hashCode() {
        return this.l.hashCode() + ((this.k.hashCode() + ab80.k(this.j, cy30.d(cy30.d(cy30.d(x0d.f(cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31)) * 31);
    }
}
