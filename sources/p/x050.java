package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class x050 implements z050 {
    public final boolean a;

    public x050(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x050) && this.a == ((x050) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
