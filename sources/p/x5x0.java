package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class x5x0 extends q6x0 {
    public final Boolean a;
    public final String b;
    public final String c;
    public final tv80 d;
    public final String e;

    public x5x0(Boolean bool, String str, String str2, tv80 tv80Var, String str3) {
        this.a = bool;
        this.b = str;
        this.c = str2;
        this.d = tv80Var;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x5x0)) {
            return false;
        }
        x5x0 x5x0Var = (x5x0) obj;
        return u890.j(this.a, x5x0Var.a) && u890.j(this.b, x5x0Var.b) && u890.j(this.c, x5x0Var.c) && u890.j(this.d, x5x0Var.d) && u890.j(this.e, x5x0Var.e);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        int iHashCode = (this.d.hashCode() + cy30.d(cy30.d((bool == null ? 0 : bool.hashCode()) * 31, 31, this.b), 31, this.c)) * 31;
        String str = this.e;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
