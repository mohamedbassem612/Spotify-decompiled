package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class j921 implements k921 {
    public final boolean a;

    public j921(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j921) && this.a == ((j921) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
