package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class u8k implements z8k {
    public final boolean a;

    public u8k(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u8k) && this.a == ((u8k) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
