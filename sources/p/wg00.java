package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wg00 extends mh00 {
    public final Exception a;

    public wg00(Exception exc) {
        this.a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wg00) && this.a.equals(((wg00) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
