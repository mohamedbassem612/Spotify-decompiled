package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class too implements woo {
    public final r920 a;
    public final r920 b;
    public final ha20 c;

    public too(r920 r920Var, r920 r920Var2, ha20 ha20Var) {
        this.a = r920Var;
        this.b = r920Var2;
        this.c = ha20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof too)) {
            return false;
        }
        too tooVar = (too) obj;
        return u890.j(this.a, tooVar.a) && u890.j(this.b, tooVar.b) && this.c == tooVar.c;
    }

    public final int hashCode() {
        r920 r920Var = this.a;
        int iHashCode = (r920Var == null ? 0 : r920Var.hashCode()) * 31;
        r920 r920Var2 = this.b;
        int iHashCode2 = (iHashCode + (r920Var2 == null ? 0 : r920Var2.hashCode())) * 31;
        ha20 ha20Var = this.c;
        return iHashCode2 + (ha20Var != null ? ha20Var.hashCode() : 0);
    }
}
