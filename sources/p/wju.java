package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class wju {
    public final String a;
    public final boolean b;

    public wju(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wju)) {
            return false;
        }
        wju wjuVar = (wju) obj;
        return u890.j(this.a, wjuVar.a) && this.b == wjuVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
