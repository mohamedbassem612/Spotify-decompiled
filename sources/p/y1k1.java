package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class y1k1 implements Comparable {
    public final int a;
    public final int b;

    public y1k1(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final int a() {
        return this.b;
    }

    public final int b() {
        return this.a;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        y1k1 y1k1Var = (y1k1) obj;
        return u890.q(this.a * this.b, y1k1Var.a * y1k1Var.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y1k1)) {
            return false;
        }
        y1k1 y1k1Var = (y1k1) obj;
        return this.a == y1k1Var.a && this.b == y1k1Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }
}
