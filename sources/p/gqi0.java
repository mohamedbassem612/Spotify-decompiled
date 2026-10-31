package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gqi0 extends sto1 {
    public final boolean b;

    public gqi0(boolean z) {
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gqi0) && this.b == ((gqi0) obj).b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b);
    }
}
