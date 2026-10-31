package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fec {
    public final String a;
    public final Integer b;
    public final Integer c;

    public fec(Integer num, String str, Integer num2) {
        this.a = str;
        this.b = num;
        this.c = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fec)) {
            return false;
        }
        fec fecVar = (fec) obj;
        return this.a.equals(fecVar.a) && u890.j(this.b, fecVar.b) && u890.j(this.c, fecVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }
}
