package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class mrk1 implements rrk1 {
    public final String a;
    public final xl61 b;

    public mrk1(String str, xl61 xl61Var) {
        this.a = str;
        this.b = xl61Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mrk1)) {
            return false;
        }
        mrk1 mrk1Var = (mrk1) obj;
        return u890.j(this.a, mrk1Var.a) && this.b.equals(mrk1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
