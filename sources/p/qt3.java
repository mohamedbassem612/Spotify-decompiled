package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qt3 {
    public final ve3 a;
    public final et3 b;
    public final et3 c;

    public qt3(ve3 ve3Var, et3 et3Var, et3 et3Var2) {
        this.a = ve3Var;
        this.b = et3Var;
        this.c = et3Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qt3)) {
            return false;
        }
        qt3 qt3Var = (qt3) obj;
        return this.a == qt3Var.a && this.b == qt3Var.b && this.c == qt3Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
