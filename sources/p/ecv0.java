package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ecv0 extends gcv0 {
    public final Exception a;

    public ecv0(Exception exc) {
        this.a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ecv0) && this.a.equals(((ecv0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
