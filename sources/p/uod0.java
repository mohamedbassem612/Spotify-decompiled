package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class uod0 extends xod0 {
    public final rod0 a;
    public final String b;
    public final dsa0 c;
    public final jj40 d;
    public final i5r e;
    public final List f;
    public final boolean g;
    public final String h;
    public final boolean i;
    public final Long j;

    public /* synthetic */ uod0(rod0 rod0Var, String str, jj40 jj40Var, i5r i5rVar, List list, Long l, int i) {
        this(rod0Var, (i & 2) != 0 ? null : str, myb.c, jj40Var, i5rVar, list, true, null, false, (i & 512) != 0 ? null : l);
    }

    public static uod0 a(uod0 uod0Var, rod0 rod0Var, String str, dsa0 dsa0Var, jj40 jj40Var, i5r i5rVar, List list, boolean z, String str2, boolean z2, Long l, int i) {
        if ((i & 1) != 0) {
            rod0Var = uod0Var.a;
        }
        rod0 rod0Var2 = rod0Var;
        if ((i & 2) != 0) {
            str = uod0Var.b;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            dsa0Var = uod0Var.c;
        }
        dsa0 dsa0Var2 = dsa0Var;
        if ((i & 8) != 0) {
            jj40Var = uod0Var.d;
        }
        return new uod0(rod0Var2, str3, dsa0Var2, jj40Var, (i & 16) != 0 ? uod0Var.e : i5rVar, (i & 32) != 0 ? uod0Var.f : list, (i & 64) != 0 ? uod0Var.g : z, (i & 128) != 0 ? uod0Var.h : str2, (i & 256) != 0 ? uod0Var.i : z2, (i & 512) != 0 ? uod0Var.j : l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uod0)) {
            return false;
        }
        uod0 uod0Var = (uod0) obj;
        return u890.j(this.a, uod0Var.a) && u890.j(this.b, uod0Var.b) && u890.j(this.c, uod0Var.c) && u890.j(this.d, uod0Var.d) && u890.j(this.e, uod0Var.e) && u890.j(this.f, uod0Var.f) && this.g == uod0Var.g && u890.j(this.h, uod0Var.h) && this.i == uod0Var.i && u890.j(this.j, uod0Var.j);
    }

    public final int hashCode() {
        rod0 rod0Var = this.a;
        int iHashCode = (rod0Var == null ? 0 : rod0Var.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        jj40 jj40Var = this.d;
        int iHashCode3 = (iHashCode2 + (jj40Var == null ? 0 : jj40Var.hashCode())) * 31;
        i5r i5rVar = this.e;
        int iG = xcg1.g(f4i1.b((iHashCode3 + (i5rVar == null ? 0 : i5rVar.hashCode())) * 31, 31, this.f), 31, this.g);
        String str2 = this.h;
        int iG2 = xcg1.g((iG + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.i);
        Long l = this.j;
        return iG2 + (l != null ? l.hashCode() : 0);
    }

    public uod0(rod0 rod0Var, String str, dsa0 dsa0Var, jj40 jj40Var, i5r i5rVar, List list, boolean z, String str2, boolean z2, Long l) {
        this.a = rod0Var;
        this.b = str;
        this.c = dsa0Var;
        this.d = jj40Var;
        this.e = i5rVar;
        this.f = list;
        this.g = z;
        this.h = str2;
        this.i = z2;
        this.j = l;
    }
}
