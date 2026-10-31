package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class tn5 {
    public final do5 a;
    public final int b;

    public tn5(do5 do5Var, int i) {
        this.a = do5Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tn5)) {
            return false;
        }
        tn5 tn5Var = (tn5) obj;
        return this.a.equals(tn5Var.a) && this.b == tn5Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + kaa0.f(2131952358, this.a.hashCode() * 31, 31);
    }
}
