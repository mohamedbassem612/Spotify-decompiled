package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class fc1 {
    public final String a;
    public final String b;
    public final y0x0 c;
    public final String d;
    public final h290 e;
    public final String f;
    public final h290 g;

    public fc1(String str, String str2, y0x0 y0x0Var, String str3, h290 h290Var, String str4, h290 h290Var2) {
        this.a = str;
        this.b = str2;
        this.c = y0x0Var;
        this.d = str3;
        this.e = h290Var;
        this.f = str4;
        this.g = h290Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fc1)) {
            return false;
        }
        fc1 fc1Var = (fc1) obj;
        return u890.j(this.a, fc1Var.a) && this.b.equals(fc1Var.b) && this.c.equals(fc1Var.c) && this.d.equals(fc1Var.d) && this.e.equals(fc1Var.e) && this.f.equals(fc1Var.f) && this.g.equals(fc1Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + cy30.d(kk0.g(this.e, cy30.d((this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d), 31), 31, this.f);
    }
}
