package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class bfr0 implements qfr0, sfr0 {
    public final String a;
    public final tfr0 b;

    public bfr0(String str, tfr0 tfr0Var) {
        this.a = str;
        this.b = tfr0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bfr0)) {
            return false;
        }
        bfr0 bfr0Var = (bfr0) obj;
        return u890.j(this.a, bfr0Var.a) && this.b.equals(bfr0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
