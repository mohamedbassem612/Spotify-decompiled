package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class z7n0 {
    public final boolean a;

    public z7n0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z7n0) && this.a == ((z7n0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
