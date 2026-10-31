package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class omv {
    public final String a;
    public final ova b;

    public omv(String str, ova ovaVar) {
        this.a = str;
        this.b = ovaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof omv)) {
            return false;
        }
        omv omvVar = (omv) obj;
        return u890.j(this.a, omvVar.a) && this.b == omvVar.b;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        ova ovaVar = this.b;
        return iHashCode + (ovaVar != null ? ovaVar.hashCode() : 0);
    }
}
