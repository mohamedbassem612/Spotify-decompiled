package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class aw60 {
    public final ew60 a;
    public final ew60 b;
    public final int c;
    public final int d;
    public final boolean e;

    public aw60(ew60 ew60Var, ew60 ew60Var2, int i, int i2, boolean z) {
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
        if (!(obj instanceof aw60)) {
            return false;
        }
        aw60 aw60Var = (aw60) obj;
        return this.a.equals(aw60Var.a) && this.b.equals(aw60Var.b) && this.c == aw60Var.c && this.d == aw60Var.d && this.e == aw60Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ab80.k(this.d, kaa0.f(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31), 31);
    }
}
