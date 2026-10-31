package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kj3 extends nj3 {
    public final dsa0 a;

    public kj3(dsa0 dsa0Var) {
        this.a = dsa0Var;
    }

    @Override // p.nj3
    public final dsa0 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kj3) && u890.j(this.a, ((kj3) obj).a);
    }

    public final int hashCode() {
        dsa0 dsa0Var = this.a;
        if (dsa0Var == null) {
            return 0;
        }
        return dsa0Var.hashCode();
    }
}
