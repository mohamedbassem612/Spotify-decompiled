package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class wr50 implements yr50 {
    public final Exception a;

    public wr50(Exception exc) {
        this.a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wr50) && this.a.equals(((wr50) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
