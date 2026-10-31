package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class b911 {
    public final pp90 a;
    public final pp90 b;

    public b911(pp90 pp90Var, pp90 pp90Var2) {
        this.a = pp90Var;
        this.b = pp90Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b911)) {
            return false;
        }
        b911 b911Var = (b911) obj;
        return u890.j(this.a, b911Var.a) && u890.j(this.b, b911Var.b);
    }

    public final int hashCode() {
        pp90 pp90Var = this.a;
        int iHashCode = (pp90Var == null ? 0 : pp90Var.hashCode()) * 31;
        pp90 pp90Var2 = this.b;
        return iHashCode + (pp90Var2 != null ? pp90Var2.hashCode() : 0);
    }
}
