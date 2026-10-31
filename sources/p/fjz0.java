package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class fjz0 {
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final String e = "";
    public final jlz0 f;

    static {
        jlz0 jlz0Var = jlz0.i;
    }

    public fjz0(String str, String str2, int i, String str3, jlz0 jlz0Var) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.f = jlz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fjz0)) {
            return false;
        }
        fjz0 fjz0Var = (fjz0) obj;
        return this.a.equals(fjz0Var.a) && this.b.equals(fjz0Var.b) && this.c == fjz0Var.c && u890.j(this.d, fjz0Var.d) && this.e.equals(fjz0Var.e) && this.f.equals(fjz0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + xcg1.g(cy30.d(cy30.d(ab80.k(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d), 31, this.e), 31, false);
    }
}
