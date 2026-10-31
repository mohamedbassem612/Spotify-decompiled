package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class atg {
    public final ysg a;
    public final Double b;
    public final Integer c;
    public final Double d;
    public final Double e;

    public atg(ysg ysgVar, Double d, Integer num, Double d2, Double d3) {
        this.a = ysgVar;
        this.b = d;
        this.c = num;
        this.d = d2;
        this.e = d3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof atg)) {
            return false;
        }
        atg atgVar = (atg) obj;
        return this.a == atgVar.a && u890.j(this.b, atgVar.b) && u890.j(this.c, atgVar.c) && u890.j(this.d, atgVar.d) && u890.j(this.e, atgVar.e);
    }

    public final int hashCode() {
        ysg ysgVar = this.a;
        int iHashCode = (ysgVar == null ? 0 : ysgVar.hashCode()) * 31;
        Double d = this.b;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        Integer num = this.c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Double d2 = this.d;
        int iHashCode4 = (iHashCode3 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.e;
        return iHashCode4 + (d3 != null ? d3.hashCode() : 0);
    }
}
