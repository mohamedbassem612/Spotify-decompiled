package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ker0 implements qfr0 {
    public final boolean a;
    public final String b;
    public final tfr0 c;

    public ker0(boolean z, String str, tfr0 tfr0Var) {
        this.a = z;
        this.b = str;
        this.c = tfr0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ker0)) {
            return false;
        }
        ker0 ker0Var = (ker0) obj;
        return this.a == ker0Var.a && u890.j(this.b, ker0Var.b) && this.c.equals(ker0Var.c);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
