package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qhi0 {
    public final boolean a;

    public qhi0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qhi0) && this.a == ((qhi0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + xcg1.g(Boolean.hashCode(this.a) * 31, 31, false);
    }
}
