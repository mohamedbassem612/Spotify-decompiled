package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class yq8 {
    public final boolean a;

    public yq8(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yq8) && this.a == ((yq8) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
