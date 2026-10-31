package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class p440 implements x440 {
    public final boolean a;

    public p440(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p440) && this.a == ((p440) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
