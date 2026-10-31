package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jx01 {
    public final boolean a;

    public jx01(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jx01) && this.a == ((jx01) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
