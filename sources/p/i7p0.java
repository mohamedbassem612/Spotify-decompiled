package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class i7p0 implements j7p0 {
    public final boolean a;

    public i7p0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i7p0) && this.a == ((i7p0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
