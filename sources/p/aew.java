package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class aew {
    public final String a;
    public final lst0 b;
    public final tv80 c;

    public aew(String str, lst0 lst0Var, tv80 tv80Var) {
        this.a = str;
        this.b = lst0Var;
        this.c = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aew)) {
            return false;
        }
        aew aewVar = (aew) obj;
        return u890.j(this.a, aewVar.a) && u890.j(this.b, aewVar.b) && u890.j(this.c, aewVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        lst0 lst0Var = this.b;
        int iHashCode2 = (iHashCode + (lst0Var == null ? 0 : lst0Var.hashCode())) * 31;
        tv80 tv80Var = this.c;
        return iHashCode2 + (tv80Var != null ? tv80Var.hashCode() : 0);
    }
}
