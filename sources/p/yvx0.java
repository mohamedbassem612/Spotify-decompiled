package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class yvx0 implements zvx0 {
    public final String a;
    public final cwx0 b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public yvx0(String str, cwx0 cwx0Var, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = cwx0Var;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yvx0)) {
            return false;
        }
        yvx0 yvx0Var = (yvx0) obj;
        return u890.j(this.a, yvx0Var.a) && this.b.equals(yvx0Var.b) && this.c == yvx0Var.c && this.d == yvx0Var.d && this.e == yvx0Var.e;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.e) + xcg1.g(xcg1.g((this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31, 31, this.c), 31, this.d);
    }
}
