package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class xt1 implements eu1 {
    public final du1 a;

    public xt1(du1 du1Var) {
        this.a = du1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xt1) && this.a.equals(((xt1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
