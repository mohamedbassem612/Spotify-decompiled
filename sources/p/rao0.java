package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rao0 {
    public final int a;

    public rao0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rao0) && this.a == ((rao0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
