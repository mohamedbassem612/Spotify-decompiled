package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class shb0 implements xhb0 {
    public final qhs0 a;
    public final wro b;

    public shb0(qhs0 qhs0Var, wro wroVar) {
        this.a = qhs0Var;
        this.b = wroVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof shb0)) {
            return false;
        }
        shb0 shb0Var = (shb0) obj;
        return this.a.equals(shb0Var.a) && u890.j(this.b, shb0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
