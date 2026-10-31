package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class k451 {
    public final boolean a;

    public k451(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k451) && this.a == ((k451) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
