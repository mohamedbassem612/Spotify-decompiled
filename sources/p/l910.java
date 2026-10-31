package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class l910 {
    public final boolean a;

    public l910(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l910) && this.a == ((l910) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
