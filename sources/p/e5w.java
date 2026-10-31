package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class e5w {
    public final String a;
    public final String b;
    public final y4w c;
    public final Integer d;

    public e5w(String str, String str2, y4w y4wVar, Integer num) {
        this.a = str;
        this.b = str2;
        this.c = y4wVar;
        this.d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e5w)) {
            return false;
        }
        e5w e5wVar = (e5w) obj;
        return u890.j(this.a, e5wVar.a) && u890.j(this.b, e5wVar.b) && u890.j(this.c, e5wVar.c) && u890.j(this.d, e5wVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        y4w y4wVar = this.c;
        int iHashCode3 = (iHashCode2 + (y4wVar == null ? 0 : y4wVar.hashCode())) * 31;
        Integer num = this.d;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }
}
