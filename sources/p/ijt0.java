package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ijt0 implements mjt0 {
    public final int a;
    public final Throwable b;

    public ijt0(int i, Throwable th) {
        this.a = i;
        this.b = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ijt0)) {
            return false;
        }
        ijt0 ijt0Var = (ijt0) obj;
        return this.a == ijt0Var.a && this.b.equals(ijt0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
