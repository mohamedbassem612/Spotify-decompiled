package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ys01 extends ct01 {
    public final int a;
    public final m9m b;

    public ys01(int i, m9m m9mVar) {
        this.a = i;
        this.b = m9mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ys01)) {
            return false;
        }
        ys01 ys01Var = (ys01) obj;
        return this.a == ys01Var.a && this.b == ys01Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
