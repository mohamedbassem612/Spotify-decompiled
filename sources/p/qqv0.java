package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class qqv0 implements sqv0 {
    public final v5g a;

    public qqv0(v5g v5gVar) {
        this.a = v5gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qqv0) && this.a.equals(((qqv0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
