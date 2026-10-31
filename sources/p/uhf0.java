package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class uhf0 implements yhf0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final xdi1 e;

    public uhf0(String str, String str2, String str3, String str4, xdi1 xdi1Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = xdi1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uhf0)) {
            return false;
        }
        uhf0 uhf0Var = (uhf0) obj;
        return this.a.equals(uhf0Var.a) && u890.j(this.b, uhf0Var.b) && u890.j(this.c, uhf0Var.c) && u890.j(this.d, uhf0Var.d) && this.e.equals(uhf0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
