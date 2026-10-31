package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class h2y implements n2y {
    public final boolean a;

    public h2y(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h2y) && this.a == ((h2y) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
