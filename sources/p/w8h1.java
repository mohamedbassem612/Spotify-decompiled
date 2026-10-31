package p;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class w8h1 {
    public final rj41 a;
    public final hwn0 b;
    public hwn0 c;
    public final nsn0 d;
    public final List e;
    public final List f;
    public final Long g;
    public final Map h;
    public final String i;
    public final y5h1 j;

    public w8h1(rj41 rj41Var, hwn0 hwn0Var, hwn0 hwn0Var2, nsn0 nsn0Var, List list, List list2, Long l, LinkedHashMap linkedHashMap, String str, y5h1 y5h1Var) {
        this.a = rj41Var;
        this.b = hwn0Var;
        this.c = hwn0Var2;
        this.d = nsn0Var;
        this.e = list;
        this.f = list2;
        this.g = l;
        this.h = linkedHashMap;
        this.i = str;
        this.j = y5h1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w8h1)) {
            return false;
        }
        w8h1 w8h1Var = (w8h1) obj;
        return this.a == w8h1Var.a && u890.j(this.b, w8h1Var.b) && u890.j(this.c, w8h1Var.c) && u890.j(this.d, w8h1Var.d) && u890.j(this.e, w8h1Var.e) && u890.j(this.f, w8h1Var.f) && u890.j(this.g, w8h1Var.g) && u890.j(this.h, w8h1Var.h) && u890.j(this.i, w8h1Var.i) && this.j.equals(w8h1Var.j);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        hwn0 hwn0Var = this.c;
        int iB = f4i1.b(f4i1.b((this.d.hashCode() + ((iHashCode + (hwn0Var == null ? 0 : hwn0Var.hashCode())) * 31)) * 31, 31, this.e), 31, this.f);
        Long l = this.g;
        int iHashCode2 = (iB + (l == null ? 0 : l.hashCode())) * 31;
        Map map = this.h;
        int iHashCode3 = (iHashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.i;
        return this.j.hashCode() + ((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31);
    }
}
