package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class nft0 implements pft0 {
    public final int a;

    public nft0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nft0) && this.a == ((nft0) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
