package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class q910 {
    public final boolean a;

    public q910(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q910) && this.a == ((q910) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
