package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xhw0 extends thw0 {
    public final int a;
    public final rn71 b;

    public xhw0(int i, rn71 rn71Var) {
        this.a = i;
        this.b = rn71Var;
    }

    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xhw0)) {
            return false;
        }
        xhw0 xhw0Var = (xhw0) obj;
        return this.a == xhw0Var.a && this.b.equals(xhw0Var.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
