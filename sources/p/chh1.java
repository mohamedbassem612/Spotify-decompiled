package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class chh1 implements ehh1 {
    public final Exception a;

    public chh1(Exception exc) {
        this.a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof chh1) && this.a.equals(((chh1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
