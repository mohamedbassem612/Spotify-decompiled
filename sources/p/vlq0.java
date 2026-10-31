package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class vlq0 implements xlq0 {
    public final Exception a;

    public vlq0(Exception exc) {
        this.a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vlq0) && this.a.equals(((vlq0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
