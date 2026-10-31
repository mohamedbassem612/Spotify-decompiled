package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hyc0 {
    public final boolean a;
    public final x7i1 b;
    public final gyc0 c;

    public hyc0(boolean z, x7i1 x7i1Var, gyc0 gyc0Var) {
        this.a = z;
        this.b = x7i1Var;
        this.c = gyc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hyc0)) {
            return false;
        }
        hyc0 hyc0Var = (hyc0) obj;
        return this.a == hyc0Var.a && u890.j(this.b, hyc0Var.b) && u890.j(this.c, hyc0Var.c);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        x7i1 x7i1Var = this.b;
        int iHashCode2 = (iHashCode + (x7i1Var == null ? 0 : x7i1Var.hashCode())) * 31;
        gyc0 gyc0Var = this.c;
        return iHashCode2 + (gyc0Var != null ? gyc0Var.hashCode() : 0);
    }
}
