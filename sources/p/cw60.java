package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cw60 implements dw60 {
    public final ew60 a;
    public final ew60 b;
    public final int c;
    public final int d;
    public final boolean e;

    public cw60(ew60 ew60Var, ew60 ew60Var2, int i, int i2, boolean z) {
        this.a = ew60Var;
        this.b = ew60Var2;
        this.c = i;
        this.d = i2;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cw60)) {
            return false;
        }
        cw60 cw60Var = (cw60) obj;
        return this.a.equals(cw60Var.a) && this.b.equals(cw60Var.b) && this.c == cw60Var.c && this.d == cw60Var.d && this.e == cw60Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ab80.k(this.d, kaa0.f(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31), 31);
    }
}
