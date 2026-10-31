package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class dtk1 implements etk1 {
    public final l0l a;

    public dtk1(l0l l0lVar) {
        this.a = l0lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dtk1) && this.a.equals(((dtk1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
