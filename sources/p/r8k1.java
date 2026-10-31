package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class r8k1 implements t9k1 {
    public final int a;
    public final tv80 b;

    public r8k1(int i, tv80 tv80Var) {
        this.a = i;
        this.b = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8k1)) {
            return false;
        }
        r8k1 r8k1Var = (r8k1) obj;
        return this.a == r8k1Var.a && u890.j(this.b, r8k1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
