package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class cbd1 implements hbd1 {
    public final x6n a;
    public final xu30 b;

    public cbd1(x6n x6nVar, xu30 xu30Var) {
        this.a = x6nVar;
        this.b = xu30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cbd1)) {
            return false;
        }
        cbd1 cbd1Var = (cbd1) obj;
        return u890.j(this.a, cbd1Var.a) && u890.j(this.b, cbd1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public /* synthetic */ cbd1(x6n x6nVar) {
        this(x6nVar, xi81.T0);
    }
}
