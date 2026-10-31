package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ya40 extends v8r {
    public final int e;

    public ya40(int i) {
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ya40) && this.e == ((ya40) obj).e;
    }

    public final int hashCode() {
        return l1d.C(this.e);
    }
}
