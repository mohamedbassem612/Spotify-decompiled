package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class mx4 {
    public final boolean a;

    public mx4(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mx4) && this.a == ((mx4) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
