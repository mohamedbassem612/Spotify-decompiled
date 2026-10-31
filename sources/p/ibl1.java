package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ibl1 {
    public final dq70 a;
    public final clj1 b;
    public final int c;

    public ibl1(dq70 dq70Var, clj1 clj1Var, int i) {
        this.a = dq70Var;
        this.b = clj1Var;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ibl1)) {
            return false;
        }
        ibl1 ibl1Var = (ibl1) obj;
        return this.a.equals(ibl1Var.a) && this.b.equals(ibl1Var.b) && this.c == ibl1Var.c;
    }

    public final int hashCode() {
        return l1d.C(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
