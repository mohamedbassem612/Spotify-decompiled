package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class f1r0 {
    public final iu30 a;
    public final ozp0 b;

    public f1r0(iu30 iu30Var, ozp0 ozp0Var) {
        this.a = iu30Var;
        this.b = ozp0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f1r0) {
            f1r0 f1r0Var = (f1r0) obj;
            return this.a.equals(f1r0Var.a) && this.b == f1r0Var.b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
