package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jgb1 implements sq61 {
    public final String a;
    public final v560 b;
    public final Integer c;
    public final String d;
    public final Integer e;
    public final Integer f;
    public final b2i g;
    public final Integer h;
    public final a2i i;
    public final mr20 j;
    public final c0g k;
    public final mr20 l;
    public final igb1 m;
    public final Map n;

    public jgb1(String str, Integer num, String str2, Integer num2, sp00 sp00Var, Integer num3, a2i a2iVar, mr20 mr20Var, c0g c0gVar, mr20 mr20Var2, igb1 igb1Var, Map map, int i) {
        v560 v560Var = (i & 2) != 0 ? null : v560.Y0;
        String str3 = (i & 8) != 0 ? null : str2;
        Integer num4 = (i & 16) != 0 ? null : 2131961812;
        Integer num5 = (i & 64) != 0 ? null : num2;
        sp00 sp00Var2 = (i & 256) != 0 ? null : sp00Var;
        Integer num6 = (i & 512) != 0 ? null : num3;
        a2i a2iVar2 = (i & 2048) != 0 ? null : a2iVar;
        mr20 mr20Var3 = (i & 4096) != 0 ? wbx0.X : mr20Var;
        mr20 huzVar = (i & 16384) != 0 ? new huz(iax.a, (byte) 10) : mr20Var2;
        Map map2 = (i & 65536) != 0 ? b7x.a : map;
        this.a = str;
        this.b = v560Var;
        this.c = num;
        this.d = str3;
        this.e = num4;
        this.f = num5;
        this.g = sp00Var2;
        this.h = num6;
        this.i = a2iVar2;
        this.j = mr20Var3;
        this.k = c0gVar;
        this.l = huzVar;
        this.m = igb1Var;
        this.n = map2;
        if (str.length() <= 0) {
            hhg1.n("A non-empty ID must be provided.");
            throw null;
        }
        ero1.s(new Object[]{num, str3}, l4b1.i);
        ero1.r(new Object[]{num4, null}, l4b1.t);
        ero1.r(new Object[]{num5, null, sp00Var2}, l4b1.X);
        ero1.r(new Object[]{null, num6, a2iVar2}, l4b1.Y);
    }

    public final c0g a() {
        return this.k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jgb1)) {
            return false;
        }
        jgb1 jgb1Var = (jgb1) obj;
        return this.a.equals(jgb1Var.a) && u890.j(this.b, jgb1Var.b) && u890.j(this.c, jgb1Var.c) && u890.j(this.d, jgb1Var.d) && u890.j(this.e, jgb1Var.e) && u890.j(this.f, jgb1Var.f) && u890.j(this.g, jgb1Var.g) && u890.j(this.h, jgb1Var.h) && u890.j(this.i, jgb1Var.i) && this.j.equals(jgb1Var.j) && this.k.equals(jgb1Var.k) && this.l.equals(jgb1Var.l) && this.m.equals(jgb1Var.m) && this.n.equals(jgb1Var.n);
    }

    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        v560 v560Var = this.b;
        int iHashCode2 = (iHashCode + (v560Var == null ? 0 : v560Var.hashCode())) * 31;
        Integer num = this.c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.d;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.e;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 961;
        Integer num3 = this.f;
        int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 961;
        b2i b2iVar = this.g;
        int iHashCode7 = (iHashCode6 + (b2iVar == null ? 0 : b2iVar.hashCode())) * 31;
        Integer num4 = this.h;
        int iHashCode8 = (iHashCode7 + (num4 == null ? 0 : num4.hashCode())) * 961;
        a2i a2iVar = this.i;
        return this.n.hashCode() + ((this.m.hashCode() + ((this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((iHashCode8 + (a2iVar != null ? a2iVar.hashCode() : 0)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final mr20 isVisible() {
        return this.j;
    }
}
