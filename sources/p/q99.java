package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class q99 implements r99 {
    public final boolean a;
    public final boolean b;

    /* JADX WARN: Multi-variable type inference failed */
    public q99(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q99)) {
            return false;
        }
        q99 q99Var = (q99) obj;
        return this.a == q99Var.a && this.b == q99Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.a ? 1 : 0) * 31);
    }
}
