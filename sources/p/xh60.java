package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class xh60 implements zh60 {
    public final c380 a;
    public final u380 b;

    public xh60(c380 c380Var, u380 u380Var) {
        this.a = c380Var;
        this.b = u380Var;
    }

    public static xh60 a(xh60 xh60Var, c380 c380Var, u380 u380Var, int i) {
        if ((i & 1) != 0) {
            c380Var = xh60Var.a;
        }
        if ((i & 2) != 0) {
            u380Var = xh60Var.b;
        }
        return new xh60(c380Var, u380Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xh60)) {
            return false;
        }
        xh60 xh60Var = (xh60) obj;
        return u890.j(this.a, xh60Var.a) && u890.j(this.b, xh60Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
