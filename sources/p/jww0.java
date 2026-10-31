package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jww0 implements ufp0 {
    public final i3i0 a;
    public final xcu0 b;
    public final n900 c;
    public final kww0 d;

    public jww0(i3i0 i3i0Var, xcu0 xcu0Var, n900 n900Var, kww0 kww0Var) {
        this.a = i3i0Var;
        this.b = xcu0Var;
        this.c = n900Var;
        this.d = kww0Var;
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

    public final kww0 d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jww0)) {
            return false;
        }
        jww0 jww0Var = (jww0) obj;
        return this.a.equals(jww0Var.a) && this.b.equals(jww0Var.b) && this.c.equals(jww0Var.c) && this.d.equals(jww0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }
}
