package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ei9 {
    public final int a;
    public final di9 b;

    public ei9(int i, di9 di9Var) {
        this.a = i;
        this.b = di9Var;
    }

    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ei9)) {
            return false;
        }
        ei9 ei9Var = (ei9) obj;
        return this.a == ei9Var.a && this.b == ei9Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
