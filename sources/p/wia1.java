package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class wia1 {
    public final String a;
    public final boolean b;

    public wia1(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wia1)) {
            return false;
        }
        wia1 wia1Var = (wia1) obj;
        return this.a.equals(wia1Var.a) && this.b == wia1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
