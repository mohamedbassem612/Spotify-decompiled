package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ly70 {
    public final t3z0 a;
    public final boolean b;
    public final jy70 c;
    public final u380 d;

    public ly70(t3z0 t3z0Var, boolean z, jy70 jy70Var, u380 u380Var) {
        this.a = t3z0Var;
        this.b = z;
        this.c = jy70Var;
        this.d = u380Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ly70)) {
            return false;
        }
        ly70 ly70Var = (ly70) obj;
        return u890.j(this.a, ly70Var.a) && this.b == ly70Var.b && u890.j(this.c, ly70Var.c) && u890.j(this.d, ly70Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + xcg1.g(this.a.hashCode() * 31, 31, this.b)) * 31);
    }
}
