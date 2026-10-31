package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pj70 {
    public final hj70 a;

    public pj70(hj70 hj70Var) {
        this.a = hj70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pj70) && this.a.equals(((pj70) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
