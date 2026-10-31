package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gtg0 {
    public final int a;
    public final tr80 b;
    public final mbh0 c;

    public gtg0(int i, tr80 tr80Var, mbh0 mbh0Var) {
        this.a = i;
        this.b = tr80Var;
        this.c = mbh0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof gtg0) {
            gtg0 gtg0Var = (gtg0) obj;
            return this.a == gtg0Var.a && u890.j(this.b, gtg0Var.b) && this.c == gtg0Var.c;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + lf51.e(l1d.C(this.a) * 31, 31, this.b);
    }
}
