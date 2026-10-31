package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class t7k0 {
    public final ro7 a;
    public final hll b;

    public t7k0(ro7 ro7Var, hll hllVar) {
        this.a = ro7Var;
        this.b = hllVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t7k0)) {
            return false;
        }
        t7k0 t7k0Var = (t7k0) obj;
        return this.a.equals(t7k0Var.a) && this.b.equals(t7k0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
