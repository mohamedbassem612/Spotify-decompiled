package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class uaf0 extends xaf0 {
    public final boolean a;

    public uaf0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uaf0) && this.a == ((uaf0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
