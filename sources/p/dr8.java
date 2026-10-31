package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dr8 implements fr8 {
    public final nhz a;
    public final String b;
    public final String c;

    public dr8(nhz nhzVar, String str, String str2) {
        this.a = nhzVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dr8)) {
            return false;
        }
        dr8 dr8Var = (dr8) obj;
        return this.a == dr8Var.a && u890.j(this.b, dr8Var.b) && u890.j(this.c, dr8Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
