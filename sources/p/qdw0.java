package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class qdw0 implements kew0 {
    public final boolean a;

    public qdw0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qdw0) && this.a == ((qdw0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
