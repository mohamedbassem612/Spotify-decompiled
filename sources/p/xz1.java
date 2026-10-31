package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class xz1 implements erl1 {
    public final erl1 a;
    public final b0r0 b;

    public xz1(erl1 erl1Var, b0r0 b0r0Var) {
        this.a = erl1Var;
        this.b = b0r0Var;
    }

    public final int a(wat watVar, flb0 flb0Var) {
        return this.b.a(watVar, flb0Var) + this.a.a(watVar, flb0Var);
    }

    public final int b(wat watVar, flb0 flb0Var) {
        return this.b.b(watVar, flb0Var) + this.a.b(watVar, flb0Var);
    }

    public final int c(wat watVar) {
        return this.b.c(watVar) + this.a.c(watVar);
    }

    public final int d(wat watVar) {
        return this.b.d(watVar) + this.a.d(watVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xz1)) {
            return false;
        }
        xz1 xz1Var = (xz1) obj;
        return u890.j(xz1Var.a, this.a) && xz1Var.b.equals(this.b);
    }

    public final int hashCode() {
        return (this.b.a.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "(" + this.a + " + " + this.b + ")";
    }
}
