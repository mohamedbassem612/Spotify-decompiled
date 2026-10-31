package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class y9s0 implements ufp0 {
    public final i3i0 a;
    public final xcu0 b;
    public final n900 c;

    public y9s0(i3i0 i3i0Var, xcu0 xcu0Var, n900 n900Var) {
        this.a = i3i0Var;
        this.b = xcu0Var;
        this.c = n900Var;
    }

    public final n900 a() {
        return this.c;
    }

    public final i3i0 b() {
        return this.a;
    }

    public final xcu0 c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y9s0)) {
            return false;
        }
        y9s0 y9s0Var = (y9s0) obj;
        return this.a.equals(y9s0Var.a) && this.b.equals(y9s0Var.b) && this.c.equals(y9s0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
