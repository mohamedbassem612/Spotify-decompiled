package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class pn8 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final q8b e;
    public final String f;
    public final d8r0 g;
    public final int h;

    public pn8(String str, String str2, String str3, String str4, q8b q8bVar, String str5, d8r0 d8r0Var, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = q8bVar;
        this.f = str5;
        this.g = d8r0Var;
        this.h = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pn8)) {
            return false;
        }
        pn8 pn8Var = (pn8) obj;
        return u890.j(this.a, pn8Var.a) && u890.j(this.b, pn8Var.b) && u890.j(this.c, pn8Var.c) && u890.j(this.d, pn8Var.d) && this.e.equals(pn8Var.e) && u890.j(this.f, pn8Var.f) && this.g.equals(pn8Var.g) && this.h == pn8Var.h;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return Integer.hashCode(this.h) + hrt.i(this.g, cy30.d((this.e.hashCode() + xcg1.g(cy30.d((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, false)) * 31, 31, this.f), 31);
    }
}
