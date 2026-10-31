package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class w370 implements z370 {
    public final String a;
    public final String b;
    public final String c;
    public final yfh0 d;
    public final String e;
    public final String f;
    public final String g;
    public final boolean h;
    public final fsd1 i;

    public w370(String str, String str2, String str3, yfh0 yfh0Var, String str4, String str5, String str6, boolean z, fsd1 fsd1Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = yfh0Var;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = z;
        this.i = fsd1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w370)) {
            return false;
        }
        w370 w370Var = (w370) obj;
        return this.a.equals(w370Var.a) && this.b.equals(w370Var.b) && this.c.equals(w370Var.c) && this.d.equals(w370Var.d) && this.e.equals(w370Var.e) && u890.j(this.f, w370Var.f) && this.g.equals(w370Var.g) && this.h == w370Var.h && u890.j(this.i, w370Var.i);
    }

    public final int hashCode() {
        int iD = cy30.d((this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31, 31, this.e);
        String str = this.f;
        int iG = xcg1.g(cy30.d((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.g), 31, this.h);
        fsd1 fsd1Var = this.i;
        return iG + (fsd1Var != null ? fsd1Var.hashCode() : 0);
    }
}
