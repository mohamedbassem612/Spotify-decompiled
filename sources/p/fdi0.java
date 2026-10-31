package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class fdi0 implements qq60 {
    public final String a;
    public final op80 b;
    public final ndi0 c;

    public fdi0(String str, op80 op80Var, ndi0 ndi0Var) {
        this.a = str;
        this.b = op80Var;
        this.c = ndi0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fdi0)) {
            return false;
        }
        fdi0 fdi0Var = (fdi0) obj;
        return this.a.equals(fdi0Var.a) && this.b.equals(fdi0Var.b) && this.c.equals(fdi0Var.c);
    }

    @Override // p.qq60
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + x0d.i(this.b, this.a.hashCode() * 31, 31);
    }
}
