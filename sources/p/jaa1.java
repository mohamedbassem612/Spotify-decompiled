package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jaa1 {
    public final int a;
    public final qdn b;

    public jaa1(int i, qdn qdnVar) {
        this.a = i;
        this.b = qdnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jaa1)) {
            return false;
        }
        jaa1 jaa1Var = (jaa1) obj;
        return this.a == jaa1Var.a && this.b == jaa1Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
