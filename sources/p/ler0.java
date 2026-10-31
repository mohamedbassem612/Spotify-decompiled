package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ler0 implements qfr0 {
    public final String a;
    public final tfr0 b;

    public ler0(String str, tfr0 tfr0Var) {
        this.a = str;
        this.b = tfr0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ler0)) {
            return false;
        }
        ler0 ler0Var = (ler0) obj;
        return u890.j(this.a, ler0Var.a) && this.b.equals(ler0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
