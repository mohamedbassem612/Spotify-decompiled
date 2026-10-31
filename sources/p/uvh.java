package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class uvh implements yvh {
    public final t9b1 a;

    public uvh(t9b1 t9b1Var) {
        this.a = t9b1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uvh) && this.a.equals(((uvh) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }
}
