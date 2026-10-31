package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ru41 {
    public final pu41 a;
    public final rm51 b;

    public ru41(pu41 pu41Var, rm51 rm51Var) {
        this.a = pu41Var;
        this.b = rm51Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ru41)) {
            return false;
        }
        ru41 ru41Var = (ru41) obj;
        return this.a.equals(ru41Var.a) && u890.j(this.b, ru41Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        rm51 rm51Var = this.b;
        return iHashCode + (rm51Var == null ? 0 : rm51Var.hashCode());
    }
}
