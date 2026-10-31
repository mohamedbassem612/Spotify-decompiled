package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class bgc0 implements erl1 {
    public final erl1 a;
    public final int b;

    public bgc0(erl1 erl1Var, int i) {
        this.a = erl1Var;
        this.b = i;
    }

    @Override // p.erl1
    public final int a(wat watVar, flb0 flb0Var) {
        if (rqt0.z(this.b, flb0Var == flb0.a ? 4 : 1)) {
            return this.a.a(watVar, flb0Var);
        }
        return 0;
    }

    @Override // p.erl1
    public final int b(wat watVar, flb0 flb0Var) {
        if (rqt0.z(this.b, flb0Var == flb0.a ? 8 : 2)) {
            return this.a.b(watVar, flb0Var);
        }
        return 0;
    }

    @Override // p.erl1
    public final int c(wat watVar) {
        if (rqt0.z(this.b, 16)) {
            return this.a.c(watVar);
        }
        return 0;
    }

    @Override // p.erl1
    public final int d(wat watVar) {
        if (rqt0.z(this.b, 32)) {
            return this.a.d(watVar);
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bgc0)) {
            return false;
        }
        bgc0 bgc0Var = (bgc0) obj;
        return u890.j(this.a, bgc0Var.a) && rqt0.x(this.b, bgc0Var.b);
    }

    public final int hashCode() {
        return rqt0.B(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "(" + this.a + " only " + rqt0.I(this.b) + ")";
    }
}
