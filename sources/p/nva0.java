package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class nva0 extends pva0 {
    public final int a;

    public nva0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nva0) && this.a == ((nva0) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
