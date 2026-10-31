package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pu8 implements ru8 {
    public final int a;
    public final ys90 b;

    public pu8(int i, ys90 ys90Var) {
        this.a = i;
        this.b = ys90Var;
    }

    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pu8)) {
            return false;
        }
        pu8 pu8Var = (pu8) obj;
        return this.a == pu8Var.a && this.b.equals(pu8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
