package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class a7m1 {
    public final String a;
    public final String b;
    public final n1x c;

    public a7m1(String str, String str2, n1x n1xVar) {
        this.a = str;
        this.b = str2;
        this.c = n1xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a7m1)) {
            return false;
        }
        a7m1 a7m1Var = (a7m1) obj;
        return this.a.equals(a7m1Var.a) && this.b.equals(a7m1Var.b) && this.c.equals(a7m1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
