package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class npq0 {
    public final int a;

    public npq0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof npq0) && this.a == ((npq0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
