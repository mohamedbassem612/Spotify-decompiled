package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class l0w0 extends cxm {
    public final boolean d;

    public l0w0(boolean z) {
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l0w0) && this.d == ((l0w0) obj).d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d);
    }
}
