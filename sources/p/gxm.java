package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gxm {
    public final String a;
    public final int b;

    public gxm(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxm)) {
            return false;
        }
        gxm gxmVar = (gxm) obj;
        return u890.j(this.a, gxmVar.a) && this.b == gxmVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
