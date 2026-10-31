package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xql {
    public final String a;
    public final String b;
    public final zy3 c;

    public xql(String str, String str2, zy3 zy3Var) {
        this.a = str;
        this.b = str2;
        this.c = zy3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xql)) {
            return false;
        }
        xql xqlVar = (xql) obj;
        return this.a.equals(xqlVar.a) && this.b.equals(xqlVar.b) && u890.j(this.c, xqlVar.c);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        zy3 zy3Var = this.c;
        return iD + (zy3Var == null ? 0 : zy3Var.hashCode());
    }
}
