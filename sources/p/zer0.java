package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class zer0 implements qfr0, sfr0 {
    public final String a;
    public final tfr0 b;

    public zer0(String str, tfr0 tfr0Var) {
        this.a = str;
        this.b = tfr0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zer0)) {
            return false;
        }
        zer0 zer0Var = (zer0) obj;
        return u890.j(this.a, zer0Var.a) && this.b.equals(zer0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
