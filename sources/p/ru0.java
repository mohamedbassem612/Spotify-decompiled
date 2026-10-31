package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ru0 {
    public final boolean a;

    public ru0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ru0) && this.a == ((ru0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (Boolean.hashCode(this.a) * 31);
    }
}
