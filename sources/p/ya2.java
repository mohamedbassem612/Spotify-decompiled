package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ya2 extends za2 {
    public final int a;

    public ya2(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ya2) && this.a == ((ya2) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
