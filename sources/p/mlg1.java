package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class mlg1 extends nmn1 {
    public final boolean b;
    public final String c;
    public final tv80 d;

    public mlg1(String str, tv80 tv80Var, boolean z) {
        this.b = z;
        this.c = str;
        this.d = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mlg1)) {
            return false;
        }
        mlg1 mlg1Var = (mlg1) obj;
        return this.b == mlg1Var.b && u890.j(this.c, mlg1Var.c) && u890.j(this.d, mlg1Var.d);
    }

    public final int hashCode() {
        int iD = cy30.d(Boolean.hashCode(this.b) * 31, 31, this.c);
        tv80 tv80Var = this.d;
        return iD + (tv80Var == null ? 0 : tv80Var.hashCode());
    }
}
