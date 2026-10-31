package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xjd {
    public final String a;
    public final boolean b;

    public xjd(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xjd)) {
            return false;
        }
        xjd xjdVar = (xjd) obj;
        return this.a.equals(xjdVar.a) && this.b == xjdVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
