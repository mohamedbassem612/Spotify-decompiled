package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class k450 implements m450 {
    public final Exception a;

    public k450(Exception exc) {
        this.a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k450) && this.a.equals(((k450) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
