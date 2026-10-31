package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class oc80 implements qc80 {
    public final int a;
    public final Integer b;

    public oc80(Integer num, int i) {
        this.a = i;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oc80)) {
            return false;
        }
        oc80 oc80Var = (oc80) obj;
        return this.a == oc80Var.a && this.b.equals(oc80Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (l1d.C(this.a) * 31);
    }
}
