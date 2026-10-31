package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class p740 {
    public final String a;
    public final l1z b;
    public final v740 c;

    public p740(String str, l1z l1zVar, v740 v740Var) {
        this.a = str;
        this.b = l1zVar;
        this.c = v740Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p740)) {
            return false;
        }
        p740 p740Var = (p740) obj;
        return u890.j(this.a, p740Var.a) && u890.j(this.b, p740Var.b) && u890.j(this.c, p740Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        l1z l1zVar = this.b;
        int iHashCode2 = (iHashCode + (l1zVar == null ? 0 : l1zVar.hashCode())) * 31;
        v740 v740Var = this.c;
        return iHashCode2 + (v740Var != null ? v740Var.a.hashCode() : 0);
    }
}
