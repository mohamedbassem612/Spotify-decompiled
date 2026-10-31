package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class nfr0 implements qfr0 {
    public final String a;
    public final tfr0 b;

    public nfr0(String str, tfr0 tfr0Var) {
        this.a = str;
        this.b = tfr0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nfr0)) {
            return false;
        }
        nfr0 nfr0Var = (nfr0) obj;
        return u890.j(this.a, nfr0Var.a) && this.b.equals(nfr0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
