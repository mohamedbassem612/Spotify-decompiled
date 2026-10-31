package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class iok0 {
    public final uia a;
    public final uia b;
    public final long c;
    public final long d;
    public final Map e;
    public final Map f;
    public final Map g;
    public final Map h;
    public final Map i;
    public final Map j;
    public final cw21 k;

    public iok0(uia uiaVar, uia uiaVar2, long j, long j2, Map map, Map map2, Map map3, Map map4, Map map5, Map map6, cw21 cw21Var) {
        this.a = uiaVar;
        this.b = uiaVar2;
        this.c = j;
        this.d = j2;
        this.e = map;
        this.f = map2;
        this.g = map3;
        this.h = map4;
        this.i = map5;
        this.j = map6;
        this.k = cw21Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iok0)) {
            return false;
        }
        iok0 iok0Var = (iok0) obj;
        return u890.j(this.a, iok0Var.a) && u890.j(this.b, iok0Var.b) && this.c == iok0Var.c && this.d == iok0Var.d && u890.j(this.e, iok0Var.e) && u890.j(this.f, iok0Var.f) && u890.j(this.g, iok0Var.g) && u890.j(this.h, iok0Var.h) && u890.j(this.i, iok0Var.i) && u890.j(this.j, iok0Var.j) && u890.j(this.k, iok0Var.k);
    }

    public final int hashCode() {
        uia uiaVar = this.a;
        int iHashCode = (uiaVar == null ? 0 : uiaVar.hashCode()) * 31;
        uia uiaVar2 = this.b;
        int iF = cy30.f(cy30.f((iHashCode + (uiaVar2 == null ? 0 : uiaVar2.hashCode())) * 31, this.c, 31), this.d, 31);
        Map map = this.e;
        int iHashCode2 = (iF + (map == null ? 0 : map.hashCode())) * 31;
        Map map2 = this.f;
        int iHashCode3 = (iHashCode2 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map map3 = this.g;
        int iHashCode4 = (iHashCode3 + (map3 == null ? 0 : map3.hashCode())) * 31;
        Map map4 = this.h;
        int iHashCode5 = (iHashCode4 + (map4 == null ? 0 : map4.hashCode())) * 31;
        Map map5 = this.i;
        int iHashCode6 = (iHashCode5 + (map5 == null ? 0 : map5.hashCode())) * 31;
        Map map6 = this.j;
        int iHashCode7 = (iHashCode6 + (map6 == null ? 0 : map6.hashCode())) * 31;
        cw21 cw21Var = this.k;
        return iHashCode7 + (cw21Var != null ? cw21Var.hashCode() : 0);
    }
}
