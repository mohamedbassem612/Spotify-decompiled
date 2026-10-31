package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hy31 {
    public final String a;
    public final String b;
    public final double c;
    public final double d;

    public hy31(String str, String str2, double d, double d2) {
        this.a = str;
        this.b = str2;
        this.c = d;
        this.d = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hy31)) {
            return false;
        }
        hy31 hy31Var = (hy31) obj;
        return u890.j(this.a, hy31Var.a) && u890.j(this.b, hy31Var.b) && Double.compare(this.c, hy31Var.c) == 0 && Double.compare(this.d, hy31Var.d) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.d) + xcg1.e(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31);
    }
}
