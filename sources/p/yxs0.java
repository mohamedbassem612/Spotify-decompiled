package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class yxs0 {
    public final boolean a;

    public yxs0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yxs0) && this.a == ((yxs0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
