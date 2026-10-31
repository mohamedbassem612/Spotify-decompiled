package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class dok0 {
    public final cok0 a;
    public final uia b;
    public final uia c;
    public final Long d;
    public final Long e;
    public final Map f;
    public final Map g;
    public final Map h;
    public final Map i;
    public final Map j;
    public final Map k;
    public final uaa0 l;
    public final l7f0 m;
    public final hok0 n;
    public final hok0 o;

    public dok0(cok0 cok0Var, uia uiaVar, uia uiaVar2, Long l, Long l2, Map map, Map map2, Map map3, Map map4, Map map5, Map map6, uaa0 uaa0Var, l7f0 l7f0Var, hok0 hok0Var, hok0 hok0Var2) {
        this.a = cok0Var;
        this.b = uiaVar;
        this.c = uiaVar2;
        this.d = l;
        this.e = l2;
        this.f = map;
        this.g = map2;
        this.h = map3;
        this.i = map4;
        this.j = map5;
        this.k = map6;
        this.l = uaa0Var;
        this.m = l7f0Var;
        this.n = hok0Var;
        this.o = hok0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dok0)) {
            return false;
        }
        dok0 dok0Var = (dok0) obj;
        return this.a.equals(dok0Var.a) && u890.j(this.b, dok0Var.b) && u890.j(this.c, dok0Var.c) && u890.j(this.d, dok0Var.d) && u890.j(this.e, dok0Var.e) && u890.j(this.f, dok0Var.f) && u890.j(this.g, dok0Var.g) && u890.j(this.h, dok0Var.h) && u890.j(this.i, dok0Var.i) && u890.j(this.j, dok0Var.j) && u890.j(this.k, dok0Var.k) && u890.j(this.l, dok0Var.l) && u890.j(this.m, dok0Var.m) && this.n.equals(dok0Var.n) && this.o.equals(dok0Var.o);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        uia uiaVar = this.b;
        int iHashCode2 = (iHashCode + (uiaVar == null ? 0 : uiaVar.hashCode())) * 31;
        uia uiaVar2 = this.c;
        int iHashCode3 = (iHashCode2 + (uiaVar2 == null ? 0 : uiaVar2.hashCode())) * 31;
        Long l = this.d;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.e;
        int iHashCode5 = (iHashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Map map = this.f;
        int iHashCode6 = (iHashCode5 + (map == null ? 0 : map.hashCode())) * 31;
        Map map2 = this.g;
        int iHashCode7 = (iHashCode6 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map map3 = this.h;
        int iHashCode8 = (iHashCode7 + (map3 == null ? 0 : map3.hashCode())) * 31;
        Map map4 = this.i;
        int iHashCode9 = (iHashCode8 + (map4 == null ? 0 : map4.hashCode())) * 31;
        Map map5 = this.j;
        int iHashCode10 = (iHashCode9 + (map5 == null ? 0 : map5.hashCode())) * 31;
        Map map6 = this.k;
        int iHashCode11 = (iHashCode10 + (map6 == null ? 0 : map6.hashCode())) * 31;
        uaa0 uaa0Var = this.l;
        int iHashCode12 = (iHashCode11 + (uaa0Var == null ? 0 : uaa0Var.hashCode())) * 31;
        l7f0 l7f0Var = this.m;
        return this.o.hashCode() + ((this.n.hashCode() + ((iHashCode12 + (l7f0Var != null ? l7f0Var.hashCode() : 0)) * 31)) * 31);
    }
}
