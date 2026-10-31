package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wfd {
    public final String a;
    public final boolean b;

    public wfd(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wfd)) {
            return false;
        }
        wfd wfdVar = (wfd) obj;
        return u890.j(this.a, wfdVar.a) && this.b == wfdVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
