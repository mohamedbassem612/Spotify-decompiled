package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class sq0 implements tq0 {
    public final ji0 a;
    public final lt0 b;
    public final boolean c;
    public final xj0 d;

    public sq0(ji0 ji0Var, lt0 lt0Var, boolean z, xj0 xj0Var) {
        this.a = ji0Var;
        this.b = lt0Var;
        this.c = z;
        this.d = xj0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof sq0) {
            sq0 sq0Var = (sq0) obj;
            return this.a.equals(sq0Var.a) && this.b == sq0Var.b && this.c == sq0Var.c && this.d == sq0Var.d;
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + xcg1.g((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }
}
