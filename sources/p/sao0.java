package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class sao0 {
    public final int a;

    public sao0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sao0) && this.a == ((sao0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
