package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class vp20 implements Comparable {
    public int a;
    public int b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        vp20 vp20Var = (vp20) obj;
        int i = this.b;
        int i2 = vp20Var.b;
        return i != i2 ? i - i2 : this.a - vp20Var.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Order{order=");
        sb.append(this.b);
        sb.append(", index=");
        return l1d.o(sb, this.a, '}');
    }
}
