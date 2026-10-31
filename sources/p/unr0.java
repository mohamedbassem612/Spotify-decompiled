package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class unr0 {
    public final int a;
    public final int b;
    public final mor0 c;

    public unr0(int i, int i2, mor0 mor0Var) {
        this.a = i;
        this.b = i2;
        this.c = mor0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof unr0)) {
            return false;
        }
        unr0 unr0Var = (unr0) obj;
        return this.a == unr0Var.a && this.b == unr0Var.b && u890.j(this.c, unr0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31);
    }
}
