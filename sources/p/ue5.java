package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ue5 {
    public final azf0 a;
    public final yyf0 b;

    public ue5(azf0 azf0Var, yyf0 yyf0Var) {
        this.a = azf0Var;
        this.b = yyf0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ue5)) {
            return false;
        }
        ue5 ue5Var = (ue5) obj;
        return this.a.equals(ue5Var.a) && u890.j(this.b, ue5Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
