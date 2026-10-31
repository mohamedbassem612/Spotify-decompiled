package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class t240 implements x240 {
    public final long a;
    public final tv80 b;

    public t240(long j, tv80 tv80Var) {
        this.a = j;
        this.b = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t240)) {
            return false;
        }
        t240 t240Var = (t240) obj;
        return this.a == t240Var.a && u890.j(this.b, t240Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }
}
