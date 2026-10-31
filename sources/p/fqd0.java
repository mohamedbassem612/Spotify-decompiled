package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class fqd0 extends gqd0 {
    public final qbn a;
    public final sqd0 b;
    public final u7l c;
    public final s1p0 d;
    public final boolean e;

    public fqd0(qbn qbnVar, sqd0 sqd0Var, u7l u7lVar, s1p0 s1p0Var, boolean z) {
        this.a = qbnVar;
        this.b = sqd0Var;
        this.c = u7lVar;
        this.d = s1p0Var;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fqd0)) {
            return false;
        }
        fqd0 fqd0Var = (fqd0) obj;
        return this.a.equals(fqd0Var.a) && this.b.equals(fqd0Var.b) && this.c.equals(fqd0Var.c) && this.d.equals(fqd0Var.d) && this.e == fqd0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
    }
}
