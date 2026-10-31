package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class q2a0 {
    public final String a;
    public final lp90 b;
    public final l0l c;

    public q2a0(String str, lp90 lp90Var, l0l l0lVar) {
        this.a = str;
        this.b = lp90Var;
        this.c = l0lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q2a0)) {
            return false;
        }
        q2a0 q2a0Var = (q2a0) obj;
        return u890.j(this.a, q2a0Var.a) && this.b.equals(q2a0Var.b) && u890.j(this.c, q2a0Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        l0l l0lVar = this.c;
        return iHashCode + (l0lVar == null ? 0 : l0lVar.hashCode());
    }
}
