package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class mk10 implements n8h1, p8h1 {
    public final txk0 a;
    public final r6h1 b;
    public final l7h1 c;

    public mk10(txk0 txk0Var, r6h1 r6h1Var, l7h1 l7h1Var) {
        this.a = txk0Var;
        this.b = r6h1Var;
        this.c = l7h1Var;
    }

    public final r6h1 b() {
        return this.b;
    }

    public final l7h1 e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof mk10) {
            mk10 mk10Var = (mk10) obj;
            if (this.a == mk10Var.a && this.b.equals(mk10Var.b) && u890.j(this.c, mk10Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.e.a.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
