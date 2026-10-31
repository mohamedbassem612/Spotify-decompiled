package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class y620 implements z620 {
    public final uha1 a;
    public final int b;

    public y620(uha1 uha1Var, int i) {
        this.a = uha1Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y620)) {
            return false;
        }
        y620 y620Var = (y620) obj;
        return this.a.equals(y620Var.a) && this.b == y620Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
