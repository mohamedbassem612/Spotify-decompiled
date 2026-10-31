package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class hpo0 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final cpo0 e;

    public hpo0(String str, String str2, String str3, int i, cpo0 cpo0Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = cpo0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hpo0)) {
            return false;
        }
        hpo0 hpo0Var = (hpo0) obj;
        return this.a.equals(hpo0Var.a) && this.b.equals(hpo0Var.b) && this.c.equals(hpo0Var.c) && this.d == hpo0Var.d && this.e.equals(hpo0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ab80.k(this.d, cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31);
    }
}
