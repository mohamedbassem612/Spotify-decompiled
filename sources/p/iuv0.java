package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class iuv0 {
    public final cyq0 a;

    public iuv0(cyq0 cyq0Var) {
        this.a = cyq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iuv0) && this.a.equals(((iuv0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
