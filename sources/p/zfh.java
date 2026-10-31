package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class zfh {
    public final Boolean a;
    public final String b;
    public final String c;

    public zfh(Boolean bool, String str, String str2) {
        this.a = bool;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zfh)) {
            return false;
        }
        zfh zfhVar = (zfh) obj;
        return u890.j(this.a, zfhVar.a) && u890.j(this.b, zfhVar.b) && u890.j(this.c, zfhVar.c);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
