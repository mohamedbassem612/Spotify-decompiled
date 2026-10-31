package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class h1f implements q3f {
    public final boolean a;

    public h1f(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h1f) && this.a == ((h1f) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
