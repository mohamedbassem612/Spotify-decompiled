package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class scc0 {
    public final boolean a;
    public final nq6 b;
    public final int c;

    public scc0(boolean z, nq6 nq6Var, int i) {
        this.a = z;
        this.b = nq6Var;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof scc0)) {
            return false;
        }
        scc0 scc0Var = (scc0) obj;
        return this.a == scc0Var.a && this.b.equals(scc0Var.b) && this.c == scc0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31);
    }
}
