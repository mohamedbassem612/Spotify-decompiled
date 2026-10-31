package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class xl61 {
    public final double a;
    public final String b;
    public final String c;
    public final iu30 d;

    public xl61(double d, String str, String str2, v7l v7lVar) {
        this.a = d;
        this.b = str;
        this.c = str2;
        this.d = v7lVar;
    }

    public final iu30 a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xl61)) {
            return false;
        }
        xl61 xl61Var = (xl61) obj;
        return Double.compare(this.a, xl61Var.a) == 0 && this.b.equals(xl61Var.b) && u890.j(this.c, xl61Var.c) && u890.j(this.d, xl61Var.d);
    }

    public final int hashCode() {
        int iD = cy30.d(Double.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        iu30 iu30Var = this.d;
        return iHashCode + (iu30Var != null ? iu30Var.hashCode() : 0);
    }
}
