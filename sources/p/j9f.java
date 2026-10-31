package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class j9f implements k9f {
    public final boolean a;

    public j9f(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j9f) && this.a == ((j9f) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
