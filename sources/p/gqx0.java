package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gqx0 extends frx0 {
    public final cwi0 a;
    public final boolean b;
    public final boolean c;

    public gqx0(cwi0 cwi0Var, boolean z, boolean z2) {
        this.a = cwi0Var;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gqx0)) {
            return false;
        }
        gqx0 gqx0Var = (gqx0) obj;
        return this.a.equals(gqx0Var.a) && this.b == gqx0Var.b && this.c == gqx0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }
}
