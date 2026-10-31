package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class nmt implements omt {
    public final ne71 a;
    public final j471 b;
    public final tv80 c;

    public nmt(ne71 ne71Var, j471 j471Var, tv80 tv80Var) {
        this.a = ne71Var;
        this.b = j471Var;
        this.c = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nmt)) {
            return false;
        }
        nmt nmtVar = (nmt) obj;
        return this.a.equals(nmtVar.a) && this.b.equals(nmtVar.b) && u890.j(this.c, nmtVar.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        tv80 tv80Var = this.c;
        return iHashCode + (tv80Var == null ? 0 : tv80Var.hashCode());
    }
}
