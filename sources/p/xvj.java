package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class xvj {
    public final xu30 a;
    public final vu30 b;
    public final zu30 c;
    public final boolean d;

    public xvj(xu30 xu30Var, j2i j2iVar, j2i j2iVar2, boolean z, int i) {
        xu30Var = (i & 1) != 0 ? null : xu30Var;
        j2iVar = (i & 2) != 0 ? null : j2iVar;
        j2iVar2 = (i & 4) != 0 ? null : j2iVar2;
        z = (i & 8) != 0 ? false : z;
        this.a = xu30Var;
        this.b = j2iVar;
        this.c = j2iVar2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xvj)) {
            return false;
        }
        xvj xvjVar = (xvj) obj;
        return u890.j(this.a, xvjVar.a) && u890.j(this.b, xvjVar.b) && u890.j(this.c, xvjVar.c) && this.d == xvjVar.d;
    }

    public final int hashCode() {
        xu30 xu30Var = this.a;
        int iHashCode = (xu30Var == null ? 0 : xu30Var.hashCode()) * 31;
        vu30 vu30Var = this.b;
        int iHashCode2 = (iHashCode + (vu30Var == null ? 0 : vu30Var.hashCode())) * 31;
        zu30 zu30Var = this.c;
        return xcg1.g((iHashCode2 + (zu30Var != null ? zu30Var.hashCode() : 0)) * 31, 961, this.d);
    }
}
