package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class kig1 {
    public final Map a;
    public final Map b;
    public final Map c;
    public final Map d;
    public final Map e;

    public kig1(Map map, Map map2, Map map3, Map map4, Map map5) {
        this.a = map;
        this.b = map2;
        this.c = map3;
        this.d = map4;
        this.e = map5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kig1)) {
            return false;
        }
        kig1 kig1Var = (kig1) obj;
        return u890.j(this.a, kig1Var.a) && u890.j(this.b, kig1Var.b) && u890.j(this.c, kig1Var.c) && u890.j(this.d, kig1Var.d) && u890.j(this.e, kig1Var.e);
    }

    public final int hashCode() {
        Map map = this.a;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        Map map2 = this.b;
        int iHashCode2 = (iHashCode + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map map3 = this.c;
        int iHashCode3 = (iHashCode2 + (map3 == null ? 0 : map3.hashCode())) * 31;
        Map map4 = this.d;
        int iHashCode4 = (iHashCode3 + (map4 == null ? 0 : map4.hashCode())) * 31;
        Map map5 = this.e;
        return iHashCode4 + (map5 != null ? map5.hashCode() : 0);
    }
}
