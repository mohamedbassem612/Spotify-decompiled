package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ljf implements mjf {
    public final boolean a;

    public ljf(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ljf) && this.a == ((ljf) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
