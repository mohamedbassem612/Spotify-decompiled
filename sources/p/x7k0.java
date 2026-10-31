package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class x7k0 implements z7k0 {
    public final tv80 a;

    public x7k0(tv80 tv80Var) {
        this.a = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x7k0) && this.a.equals(((x7k0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
