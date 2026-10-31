package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ow10 implements rw10 {
    public final String a;
    public final ct10 b;

    public ow10(String str, ct10 ct10Var) {
        this.a = str;
        this.b = ct10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ow10)) {
            return false;
        }
        ow10 ow10Var = (ow10) obj;
        return u890.j(this.a, ow10Var.a) && this.b.equals(ow10Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
