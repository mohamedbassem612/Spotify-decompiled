package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class fp9 {
    public final boolean a;

    public fp9(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fp9) && this.a == ((fp9) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
