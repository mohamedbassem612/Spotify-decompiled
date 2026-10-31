package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class hgm extends vzn1 {
    public final String c;
    public final String d;

    public hgm(String str, String str2) {
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hgm)) {
            return false;
        }
        hgm hgmVar = (hgm) obj;
        return u890.j(this.c, hgmVar.c) && u890.j(this.d, hgmVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.c.hashCode() * 31;
        String str = this.d;
        return (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
    }
}
