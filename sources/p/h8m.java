package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class h8m {
    public final boolean a;

    public h8m(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h8m) && this.a == ((h8m) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
