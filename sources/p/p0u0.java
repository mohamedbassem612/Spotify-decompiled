package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class p0u0 implements ufp0 {
    public final i3i0 a;
    public final xcu0 b;
    public final n900 c;
    public final ix21 d;

    public p0u0(i3i0 i3i0Var, xcu0 xcu0Var, n900 n900Var, ix21 ix21Var) {
        this.a = i3i0Var;
        this.b = xcu0Var;
        this.c = n900Var;
        this.d = ix21Var;
    }

    public final n900 a() {
        return this.c;
    }

    public final ix21 b() {
        return this.d;
    }

    public final i3i0 c() {
        return this.a;
    }

    public final xcu0 d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0u0)) {
            return false;
        }
        p0u0 p0u0Var = (p0u0) obj;
        return this.a.equals(p0u0Var.a) && this.b.equals(p0u0Var.b) && this.c.equals(p0u0Var.c) && this.d == p0u0Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }
}
