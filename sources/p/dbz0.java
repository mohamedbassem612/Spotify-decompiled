package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class dbz0 extends eko1 {
    public final int g;

    public dbz0(int i) {
        this.g = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dbz0) && this.g == ((dbz0) obj).g;
    }

    public final int hashCode() {
        return l1d.C(this.g);
    }
}
