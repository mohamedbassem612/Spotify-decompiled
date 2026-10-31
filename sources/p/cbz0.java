package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class cbz0 extends eko1 {
    public final int g;

    public cbz0(int i) {
        this.g = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cbz0) && this.g == ((cbz0) obj).g;
    }

    public final int hashCode() {
        return l1d.C(this.g);
    }
}
