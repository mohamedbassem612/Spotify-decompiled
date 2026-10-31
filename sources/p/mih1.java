package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class mih1 implements erl1 {
    public final erl1 a;
    public final erl1 b;

    public mih1(erl1 erl1Var, erl1 erl1Var2) {
        this.a = erl1Var;
        this.b = erl1Var2;
    }

    @Override // p.erl1
    public final int a(wat watVar, flb0 flb0Var) {
        return Math.max(this.a.a(watVar, flb0Var), this.b.a(watVar, flb0Var));
    }

    @Override // p.erl1
    public final int b(wat watVar, flb0 flb0Var) {
        return Math.max(this.a.b(watVar, flb0Var), this.b.b(watVar, flb0Var));
    }

    @Override // p.erl1
    public final int c(wat watVar) {
        return Math.max(this.a.c(watVar), this.b.c(watVar));
    }

    @Override // p.erl1
    public final int d(wat watVar) {
        return Math.max(this.a.d(watVar), this.b.d(watVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mih1)) {
            return false;
        }
        mih1 mih1Var = (mih1) obj;
        return u890.j(mih1Var.a, this.a) && u890.j(mih1Var.b, this.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "(" + this.a + " ∪ " + this.b + ")";
    }
}
