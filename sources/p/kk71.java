package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class kk71 {
    public final String a;
    public final String b;
    public final String c;
    public final hl71 d;
    public final te71 e;

    public kk71(String str, String str2, String str3, te71 te71Var, hl71 hl71Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = hl71Var;
        this.e = te71Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kk71)) {
            return false;
        }
        kk71 kk71Var = (kk71) obj;
        return u890.j(this.a, kk71Var.a) && u890.j(this.b, kk71Var.b) && u890.j(this.c, kk71Var.c) && u890.j(this.d, kk71Var.d) && u890.j(this.e, kk71Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31);
    }
}
