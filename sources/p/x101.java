package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class x101 implements z101 {
    public final k101 a;
    public final Throwable b;

    public x101(k101 k101Var, Throwable th) {
        this.a = k101Var;
        this.b = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x101)) {
            return false;
        }
        x101 x101Var = (x101) obj;
        return this.a.equals(x101Var.a) && this.b.equals(x101Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
