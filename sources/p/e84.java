package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class e84 {
    public final boolean a;

    public e84(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e84) && this.a == ((e84) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
