package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class hej0 {
    public final boolean a;

    public hej0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hej0) && this.a == ((hej0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
