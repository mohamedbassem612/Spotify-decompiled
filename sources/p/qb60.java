package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qb60 implements rb60 {
    public final rlx0 a;
    public final String b;

    public qb60(rlx0 rlx0Var) {
        this.a = rlx0Var;
        this.b = rlx0Var.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qb60) && u890.j(this.a, ((qb60) obj).a);
    }

    public final String getId() {
        return this.b;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
