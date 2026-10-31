package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gjz0 {
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final boolean e;
    public final jlz0 f;
    public final String g;
    public final String h;

    static {
        jlz0 jlz0Var = jlz0.i;
    }

    public gjz0(String str, String str2, int i, String str3, boolean z, jlz0 jlz0Var, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = z;
        this.f = jlz0Var;
        this.g = str4;
        this.h = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gjz0)) {
            return false;
        }
        gjz0 gjz0Var = (gjz0) obj;
        return this.a.equals(gjz0Var.a) && this.b.equals(gjz0Var.b) && this.c == gjz0Var.c && u890.j(this.d, gjz0Var.d) && this.e == gjz0Var.e && this.f.equals(gjz0Var.f) && this.g.equals(gjz0Var.g) && u890.j(this.h, gjz0Var.h);
    }

    public final int hashCode() {
        int iD = cy30.d((this.f.hashCode() + xcg1.g(cy30.d(ab80.k(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d), 31, this.e)) * 31, 31, this.g);
        String str = this.h;
        return iD + (str == null ? 0 : str.hashCode());
    }
}
