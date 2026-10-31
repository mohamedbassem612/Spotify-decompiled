package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ap90 {
    public final yo90 a;
    public final ro90 b;
    public final to90 c;
    public final uo90 d;
    public final uo90 e;

    public ap90(yo90 yo90Var, ro90 ro90Var, to90 to90Var, uo90 uo90Var) {
        this.a = yo90Var;
        this.b = ro90Var;
        this.c = to90Var;
        this.d = uo90Var;
        this.e = uo90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ap90)) {
            return false;
        }
        ap90 ap90Var = (ap90) obj;
        return this.a.equals(ap90Var.a) && this.b.equals(ap90Var.b) && u890.j(this.c, ap90Var.c) && this.d.equals(ap90Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.a.hashCode() * 31)) * 31;
        to90 to90Var = this.c;
        return this.d.hashCode() + ((iHashCode + (to90Var == null ? 0 : to90Var.hashCode())) * 31);
    }
}
