package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class oi21 implements ri21 {
    public final Exception a;

    public oi21(Exception exc) {
        this.a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oi21) && this.a.equals(((oi21) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
