package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class r160 {
    public final z0i a;
    public final Integer b;
    public final boolean c;
    public final ew50 d;
    public final boolean e;

    public r160(z0i z0iVar, Integer num, boolean z, ew50 ew50Var, boolean z2) {
        this.a = z0iVar;
        this.b = num;
        this.c = z;
        this.d = ew50Var;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r160)) {
            return false;
        }
        r160 r160Var = (r160) obj;
        return u890.j(this.a, r160Var.a) && u890.j(this.b, r160Var.b) && this.c == r160Var.c && u890.j(this.d, r160Var.d) && this.e == r160Var.e;
    }

    public final int hashCode() {
        z0i z0iVar = this.a;
        int iHashCode = (z0iVar == null ? 0 : z0iVar.hashCode()) * 31;
        Integer num = this.b;
        int iG = xcg1.g((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.c);
        ew50 ew50Var = this.d;
        return Boolean.hashCode(this.e) + ((iG + (ew50Var != null ? ew50Var.hashCode() : 0)) * 31);
    }
}
