package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class lg80 implements og80 {
    public final at80 a;
    public final md80 b;
    public final int c;
    public final eg80 d;

    public lg80(at80 at80Var, md80 md80Var, int i, eg80 eg80Var) {
        this.a = at80Var;
        this.b = md80Var;
        this.c = i;
        this.d = eg80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lg80)) {
            return false;
        }
        lg80 lg80Var = (lg80) obj;
        return this.a == lg80Var.a && this.b == lg80Var.b && this.c == lg80Var.c && this.d == lg80Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ab80.k(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
    }
}
