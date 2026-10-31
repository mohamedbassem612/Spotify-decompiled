package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class wr10 implements tj0 {
    public final xx10 a;

    public wr10(xx10 xx10Var) {
        this.a = xx10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wr10) && this.a.equals(((wr10) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
