package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class oz41 extends q151 {
    public final String a;
    public final String b;
    public final tv80 c;

    public oz41(String str, String str2, tv80 tv80Var) {
        this.a = str;
        this.b = str2;
        this.c = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oz41)) {
            return false;
        }
        oz41 oz41Var = (oz41) obj;
        return u890.j(this.a, oz41Var.a) && u890.j(this.b, oz41Var.b) && u890.j(this.c, oz41Var.c);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        tv80 tv80Var = this.c;
        return iD + (tv80Var == null ? 0 : tv80Var.hashCode());
    }
}
