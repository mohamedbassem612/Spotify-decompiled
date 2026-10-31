package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class li71 {
    public final bb71 a;
    public final a6q0 b;
    public final int c;
    public final String d;
    public final String e;
    public final String f;
    public final te71 g;

    public li71(bb71 bb71Var, a6q0 a6q0Var, int i, String str, String str2, String str3, te71 te71Var) {
        this.a = bb71Var;
        this.b = a6q0Var;
        this.c = i;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = te71Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof li71)) {
            return false;
        }
        li71 li71Var = (li71) obj;
        return this.a.equals(li71Var.a) && u890.j(this.b, li71Var.b) && this.c == li71Var.c && u890.j(this.d, li71Var.d) && u890.j(this.e, li71Var.e) && u890.j(this.f, li71Var.f) && u890.j(this.g, li71Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + cy30.d(cy30.d(cy30.d(kaa0.f(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31), 31, this.d), 31, this.e), 31, this.f);
    }
}
