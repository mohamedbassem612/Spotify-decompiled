package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class dp70 {
    public final boolean a;

    public dp70(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dp70) && this.a == ((dp70) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
