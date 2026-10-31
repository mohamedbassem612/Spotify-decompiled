package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class kxb implements mxb {
    public final int a;

    public kxb(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kxb) && this.a == ((kxb) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
