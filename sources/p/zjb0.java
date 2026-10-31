package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zjb0 extends cbp1 {
    public final pta c;
    public final j331 d;

    public zjb0(pta ptaVar, j331 j331Var) {
        this.c = ptaVar;
        this.d = j331Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zjb0)) {
            return false;
        }
        zjb0 zjb0Var = (zjb0) obj;
        return u890.j(this.c, zjb0Var.c) && u890.j(this.d, zjb0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }
}
