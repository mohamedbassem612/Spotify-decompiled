package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class wt51 {
    public final boolean a;

    public wt51(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wt51) && this.a == ((wt51) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
