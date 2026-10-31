package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gxb implements hxb {
    public final int a;

    public gxb(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gxb) && this.a == ((gxb) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }
}
