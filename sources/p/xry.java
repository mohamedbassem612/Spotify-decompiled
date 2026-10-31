package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xry implements zry {
    public final int a;

    public xry(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xry) && this.a == ((xry) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
