package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class l601 {
    public final boolean a;

    public l601(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l601) && this.a == ((l601) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
