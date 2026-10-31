package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zu20 extends fsa {
    public final pta a;
    public final j331 b;

    public zu20(pta ptaVar, j331 j331Var) {
        this.a = ptaVar;
        this.b = j331Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zu20)) {
            return false;
        }
        zu20 zu20Var = (zu20) obj;
        return this.a.equals(zu20Var.a) && this.b.equals(zu20Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
