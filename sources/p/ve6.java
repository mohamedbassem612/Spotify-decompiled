package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ve6 {
    public final tob1 a;
    public final tob1 b;

    public ve6(ven0 ven0Var, ven0 ven0Var2) {
        this.a = ven0Var;
        this.b = ven0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ve6)) {
            return false;
        }
        ve6 ve6Var = (ve6) obj;
        return this.a.equals(ve6Var.a) && this.b.equals(ve6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
