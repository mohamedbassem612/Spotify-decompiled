package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pp10 {
    public final String a;
    public final eo10 b;

    public pp10(String str, eo10 eo10Var) {
        this.a = str;
        this.b = eo10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pp10)) {
            return false;
        }
        pp10 pp10Var = (pp10) obj;
        return this.a.equals(pp10Var.a) && u890.j(this.b, pp10Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        eo10 eo10Var = this.b;
        return iHashCode + (eo10Var == null ? 0 : eo10Var.hashCode());
    }
}
