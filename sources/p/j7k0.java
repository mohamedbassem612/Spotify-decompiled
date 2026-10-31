package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class j7k0 {
    public final d0k0 a;
    public final ilk0 b;
    public final lyj0 c;
    public final boolean d;

    public j7k0(d0k0 d0k0Var, ilk0 ilk0Var, lyj0 lyj0Var, boolean z) {
        this.a = d0k0Var;
        this.b = ilk0Var;
        this.c = lyj0Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j7k0)) {
            return false;
        }
        j7k0 j7k0Var = (j7k0) obj;
        return this.a.equals(j7k0Var.a) && this.b.equals(j7k0Var.b) && this.c.equals(j7k0Var.c) && this.d == j7k0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }
}
