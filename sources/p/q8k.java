package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class q8k implements z8k {
    public final boolean a;

    public q8k(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q8k) && this.a == ((q8k) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
