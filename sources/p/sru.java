package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class sru {
    public final p1v a;
    public final String b;
    public final String c;
    public final String d;

    public sru(p1v p1vVar, String str, String str2, String str3, int i) {
        str = (i & 2) != 0 ? String.valueOf(p1vVar.hashCode()) : str;
        str2 = (i & 4) != 0 ? null : str2;
        str3 = (i & 8) != 0 ? null : str3;
        this.a = p1vVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sru)) {
            return false;
        }
        sru sruVar = (sru) obj;
        return this.a.equals(sruVar.a) && this.b.equals(sruVar.b) && u890.j(this.c, sruVar.c) && u890.j(this.d, sruVar.d);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
