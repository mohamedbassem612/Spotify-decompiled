package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ehz0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;

    public ehz0(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ehz0)) {
            return false;
        }
        ehz0 ehz0Var = (ehz0) obj;
        return this.a.equals(ehz0Var.a) && this.b.equals(ehz0Var.b) && this.c.equals(ehz0Var.c) && this.d.equals(ehz0Var.d) && this.e.equals(ehz0Var.e) && this.f.equals(ehz0Var.f) && this.g.equals(ehz0Var.g) && this.h.equals(ehz0Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }
}
