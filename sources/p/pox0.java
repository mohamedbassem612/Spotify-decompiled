package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pox0 {
    public final oox0 a;

    public pox0(oox0 oox0Var) {
        this.a = oox0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pox0) && this.a.equals(((pox0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
