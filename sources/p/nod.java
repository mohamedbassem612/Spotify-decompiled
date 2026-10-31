package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class nod {
    public final String a;
    public final String b;
    public final Long c;
    public final Long d;

    public nod(String str, String str2, Long l, Long l2) {
        this.a = str;
        this.b = str2;
        this.c = l;
        this.d = l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nod)) {
            return false;
        }
        nod nodVar = (nod) obj;
        return u890.j(this.a, nodVar.a) && u890.j(this.b, nodVar.b) && u890.j(this.c, nodVar.c) && u890.j(this.d, nodVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.c;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.d;
        return iHashCode3 + (l2 != null ? l2.hashCode() : 0);
    }
}
