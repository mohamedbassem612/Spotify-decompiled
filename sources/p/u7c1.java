package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class u7c1 extends w7c1 {
    public final Exception a;

    public u7c1(Exception exc) {
        this.a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u7c1) && this.a.equals(((u7c1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
