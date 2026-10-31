package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class n2n1 {
    public final int a;
    public final kjo0 b;
    public final iu30 c;

    public n2n1(int i, kjo0 kjo0Var, iu30 iu30Var) {
        this.a = i;
        this.b = kjo0Var;
        this.c = iu30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n2n1)) {
            return false;
        }
        n2n1 n2n1Var = (n2n1) obj;
        return this.a == n2n1Var.a && u890.j(this.b, n2n1Var.b) && this.c.equals(n2n1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31);
    }
}
