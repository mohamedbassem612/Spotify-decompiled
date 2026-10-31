package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class a0r0 implements erl1 {
    public final vzq0 a;

    public a0r0(vzq0 vzq0Var) {
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
        return (obj instanceof a0r0) && this.a.equals(((a0r0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
