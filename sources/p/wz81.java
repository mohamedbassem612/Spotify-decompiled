package p;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class wz81 implements yz81 {
    public final ioj0 a;
    public final d0r b;
    public final List c;
    public final int d;
    public final int e;
    public final List f;
    public final tr80 g;
    public final List h;
    public final List i;
    public final Map j;
    public final Map k;
    public final boolean l;
    public final s280 m;

    public wz81(ioj0 ioj0Var, d0r d0rVar, List list, int i, int i2, List list2, tr80 tr80Var, List list3, List list4, Map map, Map map2, boolean z, s280 s280Var) {
        this.a = ioj0Var;
        this.b = d0rVar;
        this.c = list;
        this.d = i;
        this.e = i2;
        this.f = list2;
        this.g = tr80Var;
        this.h = list3;
        this.i = list4;
        this.j = map;
        this.k = map2;
        this.l = z;
        this.m = s280Var;
    }

    public static wz81 a(wz81 wz81Var, ioj0 ioj0Var, d0r d0rVar, List list, int i, int i2, List list2, tr80 tr80Var, List list3, List list4, Map map, LinkedHashMap linkedHashMap, s280 s280Var, int i3) {
        if ((i3 & 1) != 0) {
            ioj0Var = wz81Var.a;
        }
        return new wz81(ioj0Var, (i3 & 2) != 0 ? wz81Var.b : d0rVar, (i3 & 4) != 0 ? wz81Var.c : list, (i3 & 8) != 0 ? wz81Var.d : i, (i3 & 16) != 0 ? wz81Var.e : i2, (i3 & 32) != 0 ? wz81Var.f : list2, (i3 & 64) != 0 ? wz81Var.g : tr80Var, (i3 & 128) != 0 ? wz81Var.h : list3, (i3 & 256) != 0 ? wz81Var.i : list4, (i3 & 512) != 0 ? wz81Var.j : map, (i3 & 1024) != 0 ? wz81Var.k : linkedHashMap, (i3 & 2048) != 0 ? wz81Var.l : true, (i3 & 4096) != 0 ? wz81Var.m : s280Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wz81)) {
            return false;
        }
        wz81 wz81Var = (wz81) obj;
        return u890.j(this.a, wz81Var.a) && u890.j(this.b, wz81Var.b) && u890.j(this.c, wz81Var.c) && this.d == wz81Var.d && this.e == wz81Var.e && this.f.equals(wz81Var.f) && u890.j(this.g, wz81Var.g) && u890.j(this.h, wz81Var.h) && u890.j(this.i, wz81Var.i) && this.j.equals(wz81Var.j) && this.k.equals(wz81Var.k) && this.l == wz81Var.l && u890.j(this.m, wz81Var.m);
    }

    public final int hashCode() {
        int iG = xcg1.g(cy30.e(cy30.e(f4i1.b(f4i1.b(lf51.e(f4i1.b(kaa0.f(this.e, kaa0.f(this.d, f4i1.b((this.b.hashCode() + (this.a.a.hashCode() * 31)) * 31, 31, this.c), 31), 31), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l);
        s280 s280Var = this.m;
        return iG + (s280Var == null ? 0 : s280Var.hashCode());
    }
}
