package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class p3j0 implements q3j0 {
    public final vgq0 a;
    public final i2i1 b;
    public final a0m c;

    public p3j0(vgq0 vgq0Var, i2i1 i2i1Var, a0m a0mVar) {
        this.a = vgq0Var;
        this.b = i2i1Var;
        this.c = a0mVar;
    }

    public final i2i1 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p3j0)) {
            return false;
        }
        p3j0 p3j0Var = (p3j0) obj;
        return this.a == p3j0Var.a && this.b == p3j0Var.b && this.c == p3j0Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
