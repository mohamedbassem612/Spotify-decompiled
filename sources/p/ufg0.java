package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ufg0 {
    public final wqn1 a;
    public final of8 b;

    public ufg0(wqn1 wqn1Var, of8 of8Var) {
        this.a = wqn1Var;
        this.b = of8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ufg0)) {
            return false;
        }
        ufg0 ufg0Var = (ufg0) obj;
        return this.a.equals(ufg0Var.a) && this.b.equals(ufg0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
