package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class q6i0 {
    public final boolean a;

    public q6i0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q6i0) && this.a == ((q6i0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
