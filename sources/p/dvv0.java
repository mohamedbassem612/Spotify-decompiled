package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class dvv0 {
    public final aq50 a;
    public final int b;

    public dvv0(aq50 aq50Var, int i) {
        this.a = aq50Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dvv0)) {
            return false;
        }
        dvv0 dvv0Var = (dvv0) obj;
        return this.a.equals(dvv0Var.a) && this.b == dvv0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
