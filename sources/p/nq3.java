package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class nq3 extends hr3 {
    public final int a;

    public nq3(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nq3) && this.a == ((nq3) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
