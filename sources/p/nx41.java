package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class nx41 extends xyn1 {
    public final String b;
    public final String c;
    public final tv80 d;
    public final boolean e;

    public nx41(String str, String str2, tv80 tv80Var, boolean z) {
        this.b = str;
        this.c = str2;
        this.d = tv80Var;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nx41)) {
            return false;
        }
        nx41 nx41Var = (nx41) obj;
        return u890.j(this.b, nx41Var.b) && u890.j(this.c, nx41Var.c) && u890.j(this.d, nx41Var.d) && this.e == nx41Var.e;
    }

    public final int hashCode() {
        int iD = cy30.d(this.b.hashCode() * 31, 31, this.c);
        tv80 tv80Var = this.d;
        return Boolean.hashCode(this.e) + ((iD + (tv80Var == null ? 0 : tv80Var.hashCode())) * 31);
    }
}
