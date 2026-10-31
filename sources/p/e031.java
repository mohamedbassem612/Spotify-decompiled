package p;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class e031 {
    public final Map a;
    public final List b;
    public final w4i1 c;
    public final boolean d;
    public final String e;
    public final String f;

    public e031(Map map, List list, w4i1 w4i1Var, boolean z, String str, String str2) {
        this.a = map;
        this.b = list;
        this.c = w4i1Var;
        this.d = z;
        this.e = str;
        this.f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e031)) {
            return false;
        }
        e031 e031Var = (e031) obj;
        return u890.j(this.a, e031Var.a) && u890.j(this.b, e031Var.b) && u890.j(this.c, e031Var.c) && this.d == e031Var.d && u890.j(this.e, e031Var.e) && u890.j(this.f, e031Var.f);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        List list = this.b;
        int iG = xcg1.g(ydh.d(this.c, (iHashCode + (list == null ? 0 : list.hashCode())) * 31, 31), 31, this.d);
        String str = this.e;
        int iHashCode2 = (iG + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
