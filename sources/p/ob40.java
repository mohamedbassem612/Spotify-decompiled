package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ob40 extends rb40 {
    public final Exception a;

    public ob40(Exception exc) {
        this.a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ob40) && this.a.equals(((ob40) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
