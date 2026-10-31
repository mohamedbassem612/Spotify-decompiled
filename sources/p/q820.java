package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class q820 implements r820 {
    public final r620 a;
    public final int b;

    public q820(r620 r620Var, int i) {
        this.a = r620Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q820)) {
            return false;
        }
        q820 q820Var = (q820) obj;
        return this.a == q820Var.a && this.b == q820Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
