package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ter0 implements qfr0 {
    public final String a;
    public final tfr0 b;

    public ter0(String str, tfr0 tfr0Var) {
        this.a = str;
        this.b = tfr0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ter0)) {
            return false;
        }
        ter0 ter0Var = (ter0) obj;
        return u890.j(this.a, ter0Var.a) && this.b.equals(ter0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
