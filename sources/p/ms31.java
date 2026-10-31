package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ms31 {
    public final ses0 a;
    public final int b;
    public final int c;

    public ms31(ses0 ses0Var, int i, int i2) {
        this.a = ses0Var;
        this.b = i;
        this.c = i2;
    }

    public final k3r a(int i) {
        int i2 = this.c;
        if (i < 0 || i >= i2) {
            hhg1.f(l1d.j(i, i2, "RouteResults index ", " out of range [0, ", ")"));
            return null;
        }
        k3r k3rVarO = this.a.o(this.b + i);
        return k3rVarO == null ? i3r.a : k3rVarO;
    }
}
