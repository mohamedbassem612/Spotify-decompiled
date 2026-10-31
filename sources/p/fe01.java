package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class fe01 {
    public final boolean a;

    public fe01(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fe01) && this.a == ((fe01) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
