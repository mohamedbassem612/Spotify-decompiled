package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class wh60 implements zh60 {
    public final Exception a;

    public wh60(Exception exc) {
        this.a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wh60) && this.a.equals(((wh60) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
