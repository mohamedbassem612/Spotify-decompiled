package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class t6e {
    public final String a;
    public final r6e b;
    public final int c;
    public final int d;
    public final boolean e;
    public final Integer f;
    public final j6e g;
    public final List h;
    public final List i;

    public t6e(String str, r6e r6eVar, int i, int i2, boolean z, Integer num, j6e j6eVar, List list, List list2) {
        this.a = str;
        this.b = r6eVar;
        this.c = i;
        this.d = i2;
        this.e = z;
        this.f = num;
        this.g = j6eVar;
        this.h = list;
        this.i = list2;
    }

    public static t6e a(t6e t6eVar, String str, r6e r6eVar, int i, int i2, j6e j6eVar, ArrayList arrayList, List list, int i3) {
        if ((i3 & 1) != 0) {
            str = t6eVar.a;
        }
        return new t6e(str, (i3 & 2) != 0 ? t6eVar.b : r6eVar, (i3 & 4) != 0 ? t6eVar.c : i, (i3 & 8) != 0 ? t6eVar.d : i2, (i3 & 16) != 0 ? t6eVar.e : false, (i3 & 32) != 0 ? t6eVar.f : 3, (i3 & 64) != 0 ? t6eVar.g : j6eVar, (i3 & 128) != 0 ? t6eVar.h : arrayList, (i3 & 256) != 0 ? t6eVar.i : list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t6e)) {
            return false;
        }
        t6e t6eVar = (t6e) obj;
        return this.a.equals(t6eVar.a) && this.b.equals(t6eVar.b) && this.c == t6eVar.c && this.d == t6eVar.d && this.e == t6eVar.e && u890.j(this.f, t6eVar.f) && u890.j(this.g, t6eVar.g) && u890.j(this.h, t6eVar.h) && u890.j(this.i, t6eVar.i);
    }

    public final int hashCode() {
        int iG = xcg1.g(ab80.k(this.d, ab80.k(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31), 31), 31, this.e);
        Integer num = this.f;
        int iHashCode = (iG + (num == null ? 0 : num.hashCode())) * 31;
        j6e j6eVar = this.g;
        return this.i.hashCode() + f4i1.b((iHashCode + (j6eVar != null ? j6eVar.a.hashCode() : 0)) * 31, 31, this.h);
    }
}
