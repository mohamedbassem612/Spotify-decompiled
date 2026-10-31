package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class asw implements csw {
    public final String a;
    public final Integer b;
    public final Integer c;

    public asw(Integer num, String str, Integer num2) {
        this.a = str;
        this.b = num;
        this.c = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof asw)) {
            return false;
        }
        asw aswVar = (asw) obj;
        return u890.j(this.a, aswVar.a) && u890.j(this.b, aswVar.b) && u890.j(this.c, aswVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }
}
