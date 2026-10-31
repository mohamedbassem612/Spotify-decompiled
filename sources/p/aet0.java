package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class aet0 {
    public final String a;
    public final String b;
    public final gn10 c;
    public final ou80 d;

    public aet0(String str, String str2, gn10 gn10Var, ou80 ou80Var) {
        this.a = str;
        this.b = str2;
        this.c = gn10Var;
        this.d = ou80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aet0)) {
            return false;
        }
        aet0 aet0Var = (aet0) obj;
        return u890.j(this.a, aet0Var.a) && u890.j(this.b, aet0Var.b) && u890.j(this.c, aet0Var.c) && u890.j(this.d, aet0Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        ou80 ou80Var = this.d;
        return iHashCode2 + (ou80Var != null ? ou80Var.a.hashCode() : 0);
    }

    public /* synthetic */ aet0(String str, ou80 ou80Var) {
        this(str, null, mno1.Z, ou80Var);
    }
}
