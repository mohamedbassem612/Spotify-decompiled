package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ei40 implements gi40 {
    public final long a;
    public final boolean b;

    public ei40(long j, boolean z) {
        this.a = j;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ei40)) {
            return false;
        }
        ei40 ei40Var = (ei40) obj;
        return this.a == ei40Var.a && this.b == ei40Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }
}
