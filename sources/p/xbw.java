package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class xbw implements oiw {
    public final String a;
    public final String b;

    public xbw(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xbw)) {
            return false;
        }
        xbw xbwVar = (xbw) obj;
        return u890.j(this.a, xbwVar.a) && u890.j(this.b, xbwVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
