package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qdt extends rdt {
    public final boolean a;
    public final x7i1 b;

    public qdt(boolean z, x7i1 x7i1Var) {
        this.a = z;
        this.b = x7i1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qdt)) {
            return false;
        }
        qdt qdtVar = (qdt) obj;
        return this.a == qdtVar.a && u890.j(this.b, qdtVar.b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        x7i1 x7i1Var = this.b;
        return iHashCode + (x7i1Var == null ? 0 : x7i1Var.hashCode());
    }
}
