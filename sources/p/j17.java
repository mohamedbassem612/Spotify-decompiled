package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class j17 extends o17 {
    public final g07 a;
    public final String b;
    public final String c;
    public final a6t0 d;

    public j17(String str, String str2, g07 g07Var) {
        this.a = g07Var;
        this.b = str;
        this.c = str2;
        this.d = new a6t0(str, str2);
    }

    public final g07 a() {
        return this.a;
    }

    public final m5n1 b() {
        return this.d;
    }

    public final boolean c() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j17)) {
            return false;
        }
        j17 j17Var = (j17) obj;
        return this.a.equals(j17Var.a) && u890.j(this.b, j17Var.b) && u890.j(this.c, j17Var.c);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return Boolean.hashCode(false) + ((iD + (str == null ? 0 : str.hashCode())) * 31);
    }
}
