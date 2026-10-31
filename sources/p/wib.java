package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wib implements zib {
    public final int a;

    public wib(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wib) && this.a == ((wib) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
