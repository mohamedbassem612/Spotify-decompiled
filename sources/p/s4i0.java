package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class s4i0 implements v4i0 {
    public final long a;
    public final boolean b;

    public s4i0(long j, boolean z) {
        this.a = j;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s4i0)) {
            return false;
        }
        s4i0 s4i0Var = (s4i0) obj;
        return this.a == s4i0Var.a && this.b == s4i0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }
}
