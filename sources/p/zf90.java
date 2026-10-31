package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zf90 {
    public final boolean a;

    public zf90(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zf90) && this.a == ((zf90) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
