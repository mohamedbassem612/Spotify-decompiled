package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xke extends bno1 {
    public final wke c;
    public final String d;

    public xke(wke wkeVar, String str) {
        this.c = wkeVar;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xke)) {
            return false;
        }
        xke xkeVar = (xke) obj;
        return u890.j(this.c, xkeVar.c) && u890.j(this.d, xkeVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.c.hashCode() * 31;
        String str = this.d;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
