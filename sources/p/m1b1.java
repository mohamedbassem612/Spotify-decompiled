package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class m1b1 implements ez00 {
    public final l1b1 a;

    public m1b1(l1b1 l1b1Var) {
        this.a = l1b1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m1b1) && u890.j(this.a, ((m1b1) obj).a);
    }

    public final int hashCode() {
        l1b1 l1b1Var = this.a;
        if (l1b1Var == null) {
            return 0;
        }
        return l1b1Var.hashCode();
    }
}
