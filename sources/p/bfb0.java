package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bfb0 {
    public final boolean a;

    public bfb0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bfb0) && this.a == ((bfb0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
