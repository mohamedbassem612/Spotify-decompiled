package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class t7w0 {
    public final e9w0 a;
    public final d9w0 b;
    public final boolean c;

    public t7w0(e9w0 e9w0Var, d9w0 d9w0Var, boolean z) {
        this.a = e9w0Var;
        this.b = d9w0Var;
        this.c = z;
    }

    public static t7w0 a(t7w0 t7w0Var, d9w0 d9w0Var, boolean z, int i) {
        e9w0 e9w0Var = t7w0Var.a;
        if ((i & 2) != 0) {
            d9w0Var = t7w0Var.b;
        }
        t7w0Var.getClass();
        return new t7w0(e9w0Var, d9w0Var, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t7w0)) {
            return false;
        }
        t7w0 t7w0Var = (t7w0) obj;
        return u890.j(this.a, t7w0Var.a) && u890.j(this.b, t7w0Var.b) && this.c == t7w0Var.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        d9w0 d9w0Var = this.b;
        return Boolean.hashCode(this.c) + ((iHashCode + (d9w0Var == null ? 0 : d9w0Var.hashCode())) * 31);
    }
}
