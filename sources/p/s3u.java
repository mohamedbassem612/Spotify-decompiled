package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class s3u extends v3u {
    public final int a;

    public s3u(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s3u) && this.a == ((s3u) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
