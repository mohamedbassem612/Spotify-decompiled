package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class pxd implements sxd {
    public final String a;
    public final int b;

    public pxd(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pxd)) {
            return false;
        }
        pxd pxdVar = (pxd) obj;
        return this.a.equals(pxdVar.a) && this.b == pxdVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
