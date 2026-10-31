package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class b0r0 implements erl1 {
    public final vzq0 a;

    public b0r0(vzq0 vzq0Var) {
        this.a = vzq0Var;
    }

    public final int a(wat watVar, flb0 flb0Var) {
        return watVar.i0(this.a.c(flb0Var));
    }

    public final int b(wat watVar, flb0 flb0Var) {
        return watVar.i0(this.a.b(flb0Var));
    }

    public final int c(wat watVar) {
        return watVar.i0(this.a.d());
    }

    public final int d(wat watVar) {
        return watVar.i0(this.a.a());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b0r0) {
            return u890.j(((b0r0) obj).a, this.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        vzq0 vzq0Var = this.a;
        flb0 flb0Var = flb0.a;
        float fB = vzq0Var.b(flb0Var);
        float fD = vzq0Var.d();
        float fC = vzq0Var.c(flb0Var);
        float fA = vzq0Var.a();
        String strD = p3v.d(fB);
        String strD2 = p3v.d(fD);
        return rjx.o(gvg.n("PaddingValues(", strD, ", ", strD2, ", "), p3v.d(fC), ", ", p3v.d(fA), ")");
    }
}
