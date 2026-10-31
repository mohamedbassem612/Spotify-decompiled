package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class wl00 implements erl1 {
    public final erl1 a;
    public final erl1 b;

    public wl00(erl1 erl1Var, erl1 erl1Var2) {
        this.a = erl1Var;
        this.b = erl1Var2;
    }

    public final int a(wat watVar, flb0 flb0Var) {
        int iA = this.a.a(watVar, flb0Var) - this.b.a(watVar, flb0Var);
        if (iA < 0) {
            return 0;
        }
        return iA;
    }

    public final int b(wat watVar, flb0 flb0Var) {
        int iB = this.a.b(watVar, flb0Var) - this.b.b(watVar, flb0Var);
        if (iB < 0) {
            return 0;
        }
        return iB;
    }

    public final int c(wat watVar) {
        int iC = this.a.c(watVar) - this.b.c(watVar);
        if (iC < 0) {
            return 0;
        }
        return iC;
    }

    public final int d(wat watVar) {
        int iD = this.a.d(watVar) - this.b.d(watVar);
        if (iD < 0) {
            return 0;
        }
        return iD;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wl00)) {
            return false;
        }
        wl00 wl00Var = (wl00) obj;
        return u890.j(wl00Var.a, this.a) && u890.j(wl00Var.b, this.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "(" + this.a + " - " + this.b + ")";
    }
}
