package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class yre1 extends ese1 {
    public final Throwable a;
    public final int b;

    public yre1(int i, Throwable th) {
        this.a = th;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yre1)) {
            return false;
        }
        yre1 yre1Var = (yre1) obj;
        return this.a.equals(yre1Var.a) && this.b == yre1Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
