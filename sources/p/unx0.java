package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class unx0 implements l9c {
    public final String a;
    public final k3h1 b;
    public final xnx0 c;

    public unx0(String str, k3h1 k3h1Var, xnx0 xnx0Var) {
        this.a = str;
        this.b = k3h1Var;
        this.c = xnx0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof unx0)) {
            return false;
        }
        unx0 unx0Var = (unx0) obj;
        return this.a.equals(unx0Var.a) && this.b.equals(unx0Var.b) && this.c.equals(unx0Var.c);
    }

    @Override // p.l9c
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + kaa0.f(this.b.b, this.a.hashCode() * 31, 31);
    }
}
