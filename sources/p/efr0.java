package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class efr0 implements qfr0 {
    public final ydv0 a;
    public final tfr0 b;

    public efr0(ydv0 ydv0Var, tfr0 tfr0Var) {
        this.a = ydv0Var;
        this.b = tfr0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof efr0)) {
            return false;
        }
        efr0 efr0Var = (efr0) obj;
        return this.a.equals(efr0Var.a) && this.b.equals(efr0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }
}
