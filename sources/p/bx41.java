package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class bx41 extends xyn1 {
    public final String b;
    public final tv80 c;
    public final String d;

    public bx41(String str, String str2, tv80 tv80Var) {
        this.b = str;
        this.c = tv80Var;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bx41)) {
            return false;
        }
        bx41 bx41Var = (bx41) obj;
        return u890.j(this.b, bx41Var.b) && u890.j(this.c, bx41Var.c) && u890.j(this.d, bx41Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        tv80 tv80Var = this.c;
        return this.d.hashCode() + ((iHashCode + (tv80Var == null ? 0 : tv80Var.hashCode())) * 31);
    }

    public /* synthetic */ bx41(String str, tv80 tv80Var) {
        this(str, str, tv80Var);
    }
}
