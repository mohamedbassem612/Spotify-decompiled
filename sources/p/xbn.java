package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class xbn implements acn {
    public final String a;
    public final int b;

    public xbn(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xbn)) {
            return false;
        }
        xbn xbnVar = (xbn) obj;
        return u890.j(this.a, xbnVar.a) && this.b == xbnVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
