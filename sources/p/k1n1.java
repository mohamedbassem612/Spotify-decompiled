package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class k1n1 extends q1n1 {
    public final int a;
    public final tv80 b;
    public final kjo0 c;

    public k1n1(int i, tv80 tv80Var, kjo0 kjo0Var) {
        this.a = i;
        this.b = tv80Var;
        this.c = kjo0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k1n1)) {
            return false;
        }
        k1n1 k1n1Var = (k1n1) obj;
        return this.a == k1n1Var.a && this.b.equals(k1n1Var.b) && u890.j(this.c, k1n1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31);
    }
}
