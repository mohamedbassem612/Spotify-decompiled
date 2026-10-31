package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class wru0 implements yru0 {
    public final boolean a;

    public wru0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wru0) && this.a == ((wru0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
