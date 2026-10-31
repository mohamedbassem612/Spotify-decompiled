package p;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class rxb1 {
    public final Map a;
    public final List b;
    public final String c;
    public final String d;
    public final int e;
    public final String f;
    public final List g;
    public final boolean h;

    public rxb1(Map map, List list, String str, String str2, int i, String str3, List list2, boolean z) {
        this.a = map;
        this.b = list;
        this.c = str;
        this.d = str2;
        this.e = i;
        this.f = str3;
        this.g = list2;
        this.h = z;
    }

    public static rxb1 a(rxb1 rxb1Var, LinkedHashMap linkedHashMap, List list, String str, String str2, int i, String str3, List list2, boolean z, int i2) {
        Map map = linkedHashMap;
        if ((i2 & 1) != 0) {
            map = rxb1Var.a;
        }
        Map map2 = map;
        if ((i2 & 2) != 0) {
            list = rxb1Var.b;
        }
        List list3 = list;
        if ((i2 & 4) != 0) {
            str = rxb1Var.c;
        }
        String str4 = str;
        if ((i2 & 8) != 0) {
            str2 = rxb1Var.d;
        }
        String str5 = str2;
        if ((i2 & 16) != 0) {
            i = rxb1Var.e;
        }
        int i3 = i;
        if ((i2 & 32) != 0) {
            str3 = rxb1Var.f;
        }
        String str6 = str3;
        List list4 = (i2 & 64) != 0 ? rxb1Var.g : list2;
        boolean z2 = (i2 & 128) != 0 ? rxb1Var.h : z;
        rxb1Var.getClass();
        return new rxb1(map2, list3, str4, str5, i3, str6, list4, z2);
    }

    public final List b() {
        return this.g;
    }

    public final int c() {
        return this.e;
    }

    public final String d() {
        return this.f;
    }

    public final String e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rxb1)) {
            return false;
        }
        rxb1 rxb1Var = (rxb1) obj;
        return u890.j(this.a, rxb1Var.a) && u890.j(this.b, rxb1Var.b) && u890.j(this.c, rxb1Var.c) && u890.j(this.d, rxb1Var.d) && this.e == rxb1Var.e && u890.j(this.f, rxb1Var.f) && u890.j(this.g, rxb1Var.g) && this.h == rxb1Var.h;
    }

    public final String f() {
        return this.c;
    }

    public final boolean g() {
        return this.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + f4i1.b(cy30.d(kaa0.f(this.e, cy30.d(cy30.d(f4i1.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31, this.f), 31, this.g);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ rxb1() {
        b7x b7xVar = b7x.a;
        z6x z6xVar = z6x.a;
        this(b7xVar, z6xVar, "", "", 0, "", z6xVar, false);
    }
}
