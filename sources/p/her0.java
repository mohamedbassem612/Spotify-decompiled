package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class her0 implements qfr0 {
    public final String a;
    public final tfr0 b;

    public her0(String str, tfr0 tfr0Var) {
        this.a = str;
        this.b = tfr0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof her0)) {
            return false;
        }
        her0 her0Var = (her0) obj;
        return u890.j(this.a, her0Var.a) && this.b.equals(her0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
