package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class p6i1 {
    public final int a;
    public final Object b;

    public p6i1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p6i1)) {
            return false;
        }
        p6i1 p6i1Var = (p6i1) obj;
        return this.a == p6i1Var.a && u890.j(this.b, p6i1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
