package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class xzo0 extends g0p0 {
    public final d7l a;

    public xzo0(d7l d7lVar) {
        this.a = d7lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xzo0) && this.a.equals(((xzo0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
