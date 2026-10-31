package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class s3c0 extends y3c0 {
    public final boolean a;

    public s3c0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s3c0) && this.a == ((s3c0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
