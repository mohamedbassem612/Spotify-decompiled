package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ryw extends qgo1 {
    public final String c;
    public final String d;

    public ryw(String str, String str2) {
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ryw)) {
            return false;
        }
        ryw rywVar = (ryw) obj;
        return u890.j(this.c, rywVar.c) && u890.j(this.d, rywVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.c.hashCode() * 31;
        String str = this.d;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
