package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class efv implements ez00 {
    public final boolean a;

    public efv(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof efv) && this.a == ((efv) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
