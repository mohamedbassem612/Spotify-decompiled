package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class j08 {
    public final String a;
    public final i08 b;
    public final qtt0 c;

    public j08(String str, i08 i08Var, qtt0 qtt0Var) {
        this.a = str;
        this.b = i08Var;
        this.c = qtt0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j08)) {
            return false;
        }
        j08 j08Var = (j08) obj;
        return u890.j(this.a, j08Var.a) && u890.j(this.b, j08Var.b) && this.c == j08Var.c;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        i08 i08Var = this.b;
        int iHashCode2 = (iHashCode + (i08Var == null ? 0 : i08Var.hashCode())) * 31;
        qtt0 qtt0Var = this.c;
        return iHashCode2 + (qtt0Var != null ? qtt0Var.hashCode() : 0);
    }

    public /* synthetic */ j08(String str, qtt0 qtt0Var, int i) {
        this(str, (i08) null, (i & 4) != 0 ? null : qtt0Var);
    }
}
