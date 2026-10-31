package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class yan0 {
    public final jo70 a;
    public final hll b;
    public final xkk1 c;

    public yan0(hll hllVar, jo70 jo70Var, xkk1 xkk1Var) {
        this.a = jo70Var;
        this.b = hllVar;
        this.c = xkk1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yan0)) {
            return false;
        }
        yan0 yan0Var = (yan0) obj;
        return this.a.equals(yan0Var.a) && this.b.equals(yan0Var.b) && this.c.equals(yan0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
