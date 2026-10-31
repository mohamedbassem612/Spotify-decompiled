package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class a900 implements d6m {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final mek h;

    public a900(String str, String str2, String str3, String str4, String str5, String str6, String str7, mek mekVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = mekVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a900)) {
            return false;
        }
        a900 a900Var = (a900) obj;
        return this.a.equals(a900Var.a) && this.b.equals(a900Var.b) && this.c.equals(a900Var.c) && this.d.equals(a900Var.d) && this.e.equals(a900Var.e) && this.f.equals(a900Var.f) && u890.j(this.g, a900Var.g) && this.h == a900Var.h;
    }

    public final int hashCode() {
        return this.h.hashCode() + cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }
}
