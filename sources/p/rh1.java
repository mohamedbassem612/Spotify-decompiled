package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rh1 {
    public final uho a;
    public final vnb1 b;
    public final boolean c;

    public rh1(uho uhoVar, vnb1 vnb1Var, boolean z) {
        this.a = uhoVar;
        this.b = vnb1Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rh1)) {
            return false;
        }
        rh1 rh1Var = (rh1) obj;
        return this.a.equals(rh1Var.a) && u890.j(this.b, rh1Var.b) && this.c == rh1Var.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        vnb1 vnb1Var = this.b;
        return Boolean.hashCode(this.c) + ((iHashCode + (vnb1Var == null ? 0 : vnb1Var.hashCode())) * 31);
    }
}
