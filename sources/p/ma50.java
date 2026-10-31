package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ma50 implements oa50 {
    public final boolean a;

    public ma50(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ma50) && this.a == ((ma50) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
