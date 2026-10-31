package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class cdf implements bef {
    public final boolean a;

    public cdf(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cdf) && this.a == ((cdf) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
