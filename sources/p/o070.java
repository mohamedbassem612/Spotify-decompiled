package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class o070 implements q070 {
    public final int a;

    public o070(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o070) && this.a == ((o070) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
