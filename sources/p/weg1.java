package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class weg1 implements xeg1 {
    public final Exception a;

    public weg1(Exception exc) {
        this.a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof weg1) && this.a.equals(((weg1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
