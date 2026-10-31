package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class twt extends brl {
    public final anv0 d;

    public twt(anv0 anv0Var) {
        this.d = anv0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof twt) && this.d.equals(((twt) obj).d);
    }

    public final int hashCode() {
        return this.d.d.hashCode();
    }
}
