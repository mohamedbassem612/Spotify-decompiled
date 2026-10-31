package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class h9z extends i9z {
    public final i1z a;

    public h9z(i1z i1zVar) {
        this.a = i1zVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h9z) && this.a.equals(((h9z) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
