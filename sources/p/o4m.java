package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class o4m implements u4m {
    public final int a;

    public o4m(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o4m) && this.a == ((o4m) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
