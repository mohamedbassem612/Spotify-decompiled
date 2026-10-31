package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class wvv implements awv {
    public final int a;

    public wvv(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wvv) && this.a == ((wvv) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
