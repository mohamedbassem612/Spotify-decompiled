package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class stm0 implements dbr0 {
    public final byte a;
    public final boolean b;

    /* JADX WARN: Multi-variable type inference failed */
    public stm0(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof stm0)) {
            return false;
        }
        stm0 stm0Var = (stm0) obj;
        return this.a == stm0Var.a && this.b == stm0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public /* synthetic */ stm0() {
        this(1, false);
    }
}
