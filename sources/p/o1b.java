package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class o1b {
    public final xjf1 a;
    public final boolean b;

    public o1b(xjf1 xjf1Var, boolean z) {
        this.a = xjf1Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o1b)) {
            return false;
        }
        o1b o1bVar = (o1b) obj;
        return u890.j(this.a, o1bVar.a) && this.b == o1bVar.b;
    }

    public final int hashCode() {
        xjf1 xjf1Var = this.a;
        return Boolean.hashCode(this.b) + ((xjf1Var == null ? 0 : xjf1Var.hashCode()) * 31);
    }
}
