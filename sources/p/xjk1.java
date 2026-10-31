package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xjk1 {
    public final boolean a;
    public final Object b;

    public xjk1(Object obj, boolean z) {
        this.a = z;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xjk1)) {
            return false;
        }
        xjk1 xjk1Var = (xjk1) obj;
        return this.a == xjk1Var.a && this.b.equals(xjk1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }
}
