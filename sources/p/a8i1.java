package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class a8i1 {
    public final boolean a;
    public final jhm b;
    public final jhm c;

    public a8i1(boolean z, jhm jhmVar, jhm jhmVar2) {
        this.a = z;
        this.b = jhmVar;
        this.c = jhmVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a8i1)) {
            return false;
        }
        a8i1 a8i1Var = (a8i1) obj;
        return this.a == a8i1Var.a && u890.j(this.b, a8i1Var.b) && u890.j(this.c, a8i1Var.c);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        jhm jhmVar = this.b;
        int iHashCode2 = (iHashCode + (jhmVar == null ? 0 : jhmVar.hashCode())) * 31;
        jhm jhmVar2 = this.c;
        return iHashCode2 + (jhmVar2 != null ? jhmVar2.hashCode() : 0);
    }
}
