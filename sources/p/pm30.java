package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pm30 {
    public final boolean a;

    public pm30(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pm30) && this.a == ((pm30) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
