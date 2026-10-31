package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xt01 extends au01 {
    public final et01 a;

    public xt01(et01 et01Var) {
        this.a = et01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xt01) && this.a.equals(((xt01) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }
}
