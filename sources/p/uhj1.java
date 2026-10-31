package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class uhj1 {
    public final boolean a;

    public uhj1(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uhj1) && this.a == ((uhj1) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
