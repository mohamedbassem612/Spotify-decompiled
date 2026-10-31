package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ezh extends uzh {
    public final h02 a;

    public ezh(h02 h02Var) {
        this.a = h02Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ezh) && this.a.equals(((ezh) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
