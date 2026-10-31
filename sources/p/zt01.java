package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class zt01 extends au01 {
    public final oey0 a;

    public zt01(oey0 oey0Var) {
        this.a = oey0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zt01) && this.a.equals(((zt01) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
