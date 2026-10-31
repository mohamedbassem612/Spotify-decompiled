package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class zig1 {
    public final int a;
    public final e6w0 b;
    public final e6w0 c;

    public zig1(int i, e6w0 e6w0Var, e6w0 e6w0Var2) {
        this.a = i;
        this.b = e6w0Var;
        this.c = e6w0Var2;
    }

    public final e6w0 a() {
        return this.b;
    }

    public final e6w0 b() {
        return this.c;
    }

    public final int c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zig1)) {
            return false;
        }
        zig1 zig1Var = (zig1) obj;
        return this.a == zig1Var.a && u890.j(this.b, zig1Var.b) && u890.j(this.c, zig1Var.c);
    }

    public final int hashCode() {
        int iC = l1d.C(this.a) * 31;
        e6w0 e6w0Var = this.b;
        int iHashCode = (iC + (e6w0Var == null ? 0 : e6w0Var.hashCode())) * 31;
        e6w0 e6w0Var2 = this.c;
        return iHashCode + (e6w0Var2 != null ? e6w0Var2.hashCode() : 0);
    }
}
