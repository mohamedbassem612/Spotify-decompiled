package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mf3 extends hr80 {
    public final boolean e;

    public mf3(boolean z) {
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mf3) && this.e == ((mf3) obj).e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e);
    }
}
