package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ovu0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final kvu0 e;
    public final String f;
    public final boolean g;
    public final g6p1 h;

    public ovu0(String str, String str2, String str3, String str4, kvu0 kvu0Var, String str5, boolean z, g6p1 g6p1Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = kvu0Var;
        this.f = str5;
        this.g = z;
        this.h = g6p1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ovu0)) {
            return false;
        }
        ovu0 ovu0Var = (ovu0) obj;
        return u890.j(this.a, ovu0Var.a) && u890.j(this.b, ovu0Var.b) && u890.j(this.c, ovu0Var.c) && u890.j(this.d, ovu0Var.d) && this.e.equals(ovu0Var.e) && u890.j(this.f, ovu0Var.f) && this.g == ovu0Var.g && this.h.equals(ovu0Var.h);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return this.h.hashCode() + xcg1.g(cy30.d((this.e.hashCode() + ((iD + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.f), 31, this.g);
    }
}
