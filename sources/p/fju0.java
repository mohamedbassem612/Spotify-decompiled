package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class fju0 implements kju0 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;

    public fju0(String str, String str2, int i, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fju0)) {
            return false;
        }
        fju0 fju0Var = (fju0) obj;
        return u890.j(this.a, fju0Var.a) && u890.j(this.b, fju0Var.b) && u890.j(this.c, fju0Var.c) && this.d == fju0Var.d;
    }

    public final int hashCode() {
        return l1d.C(this.d) + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
