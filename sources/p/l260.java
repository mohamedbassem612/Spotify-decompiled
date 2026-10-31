package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class l260 {
    public final vu30 a;
    public final maa b;
    public final xu30 c;

    public l260(maa maaVar, vu30 vu30Var, xu30 xu30Var) {
        this.a = vu30Var;
        this.b = maaVar;
        this.c = xu30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l260)) {
            return false;
        }
        l260 l260Var = (l260) obj;
        return u890.j(this.a, l260Var.a) && this.b.equals(l260Var.b) && u890.j(this.c, l260Var.c);
    }

    public final int hashCode() {
        vu30 vu30Var = this.a;
        int iHashCode = vu30Var == null ? 0 : vu30Var.hashCode();
        return this.c.hashCode() + ((this.b.hashCode() + (iHashCode * 31)) * 31);
    }
}
