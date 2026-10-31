package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class hlj0 implements ilj0 {
    public final byte a;
    public final boolean b;

    /* JADX WARN: Multi-variable type inference failed */
    public hlj0(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hlj0)) {
            return false;
        }
        hlj0 hlj0Var = (hlj0) obj;
        return this.a == hlj0Var.a && this.b == hlj0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }
}
