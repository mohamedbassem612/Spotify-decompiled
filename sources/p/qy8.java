package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class qy8 {
    public final jbh0 a;
    public final o860 b;

    public qy8(jbh0 jbh0Var, o860 o860Var) {
        if (jbh0Var == null) {
            bhn0.i("Null matcher");
            throw null;
        }
        this.a = jbh0Var;
        this.b = o860Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qy8) {
            qy8 qy8Var = (qy8) obj;
            return this.a.equals(qy8Var.a) && this.b == qy8Var.b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return cy30.p("CommandRoute{matcher=", String.valueOf(this.a), ", factory=", String.valueOf(this.b), "}");
    }
}
