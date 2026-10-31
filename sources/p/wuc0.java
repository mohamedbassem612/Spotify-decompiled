package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class wuc0 implements cvc0 {
    public final int a;
    public final xuc0 b;

    public wuc0(int i, xuc0 xuc0Var) {
        this.a = i;
        this.b = xuc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wuc0)) {
            return false;
        }
        wuc0 wuc0Var = (wuc0) obj;
        return this.a == wuc0Var.a && this.b.equals(wuc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
