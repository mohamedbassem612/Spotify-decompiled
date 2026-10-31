package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class l6t0 {
    public final boolean a;

    public l6t0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l6t0) && this.a == ((l6t0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
