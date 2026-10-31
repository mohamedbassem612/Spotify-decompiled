package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class l17 extends o17 {
    public final g07 a;
    public final String b;
    public final a6t0 c;

    public l17(String str, g07 g07Var) {
        this.a = g07Var;
        this.b = str;
        this.c = new a6t0(str, null);
    }

    public final g07 a() {
        return this.a;
    }

    public final m5n1 b() {
        return this.c;
    }

    public final boolean c() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l17)) {
            return false;
        }
        l17 l17Var = (l17) obj;
        return this.a.equals(l17Var.a) && u890.j(this.b, l17Var.b);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + cy30.d(this.a.hashCode() * 31, 961, this.b);
    }
}
