package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class v6v0 implements ez00 {
    public final u6v0 a;
    public final boolean b;
    public final t6v0 c;

    public v6v0(u6v0 u6v0Var, boolean z, t6v0 t6v0Var) {
        this.a = u6v0Var;
        this.b = z;
        this.c = t6v0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v6v0)) {
            return false;
        }
        v6v0 v6v0Var = (v6v0) obj;
        return this.a.equals(v6v0Var.a) && this.b == v6v0Var.b && this.c.equals(v6v0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }
}
