package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class tr80 extends rr80 implements lsg {
    public static final tr80 d = new tr80(1, 0, 1);

    public final boolean c(int i) {
        return this.a <= i && i <= this.b;
    }

    @Override // p.rr80
    public final boolean equals(Object obj) {
        if (!(obj instanceof tr80)) {
            return false;
        }
        if (isEmpty() && ((tr80) obj).isEmpty()) {
            return true;
        }
        tr80 tr80Var = (tr80) obj;
        return this.a == tr80Var.a && this.b == tr80Var.b;
    }

    @Override // p.rr80
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.a * 31) + this.b;
    }

    @Override // p.rr80, p.lsg
    public final boolean isEmpty() {
        return this.a > this.b;
    }

    @Override // p.lsg
    public final Comparable m() {
        return Integer.valueOf(this.a);
    }

    @Override // p.lsg
    public final Comparable n() {
        return Integer.valueOf(this.b);
    }

    @Override // p.rr80
    public final String toString() {
        return this.a + ".." + this.b;
    }
}
