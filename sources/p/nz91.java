package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class nz91 implements yz91 {
    public final String a;

    public nz91(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nz91) && this.a.equals(((nz91) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
