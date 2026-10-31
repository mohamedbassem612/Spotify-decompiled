package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gs {
    public final int a;

    public gs(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gs) && this.a == ((gs) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
