package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class x9t0 {
    public final String a;
    public final tv80 b;

    public x9t0(String str, tv80 tv80Var) {
        this.a = str;
        this.b = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x9t0)) {
            return false;
        }
        x9t0 x9t0Var = (x9t0) obj;
        return this.a.equals(x9t0Var.a) && this.b.equals(x9t0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
