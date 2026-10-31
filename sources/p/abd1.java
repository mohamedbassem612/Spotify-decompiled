package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class abd1 implements hbd1 {
    public final tka0 a;
    public final xu30 b;

    public abd1(tka0 tka0Var, xu30 xu30Var) {
        this.a = tka0Var;
        this.b = xu30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof abd1)) {
            return false;
        }
        abd1 abd1Var = (abd1) obj;
        return u890.j(this.a, abd1Var.a) && u890.j(this.b, abd1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public /* synthetic */ abd1(tka0 tka0Var) {
        this(tka0Var, xi81.S0);
    }
}
