package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class o2t {
    public final ki0 a;
    public final Long b;
    public final String c;
    public final String d;

    public o2t(ki0 ki0Var, Long l, String str, String str2) {
        this.a = ki0Var;
        this.b = l;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o2t)) {
            return false;
        }
        o2t o2tVar = (o2t) obj;
        return u890.j(this.a, o2tVar.a) && u890.j(this.b, o2tVar.b) && u890.j(this.c, o2tVar.c) && u890.j(this.d, o2tVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Long l = this.b;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return (iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
    }
}
