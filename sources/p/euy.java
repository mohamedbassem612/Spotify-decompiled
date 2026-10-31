package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class euy {
    public final boolean a;

    public euy(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof euy) && this.a == ((euy) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
