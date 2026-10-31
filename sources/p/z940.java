package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class z940 {
    public final String a;
    public final String b;
    public final kqj0 c;
    public final double d;

    public z940(String str, String str2, kqj0 kqj0Var, double d) {
        this.a = str;
        this.b = str2;
        this.c = kqj0Var;
        this.d = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z940)) {
            return false;
        }
        z940 z940Var = (z940) obj;
        return u890.j(this.a, z940Var.a) && u890.j(this.b, z940Var.b) && u890.j(this.c, z940Var.c) && Double.compare(this.d, z940Var.d) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.d) + ((this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public /* synthetic */ z940(String str, String str2, kqj0 kqj0Var) {
        this(str, str2, kqj0Var, 1.0d);
    }
}
