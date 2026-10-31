package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class y541 extends x2s {
    public final r6h1 b;
    public final int c;

    public y541(int i, r6h1 r6h1Var) {
        super(e2x0.i);
        this.b = r6h1Var;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y541)) {
            return false;
        }
        y541 y541Var = (y541) obj;
        return this.b.equals(y541Var.b) && this.c == y541Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + (this.b.hashCode() * 31);
    }
}
