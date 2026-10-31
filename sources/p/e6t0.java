package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class e6t0 {
    public final boolean a;

    public e6t0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e6t0) && this.a == ((e6t0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
