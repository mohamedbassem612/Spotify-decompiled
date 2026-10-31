package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class k601 {
    public final boolean a;

    public k601(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k601) && this.a == ((k601) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
