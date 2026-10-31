package p;

import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class mr01 {
    public final Map a;
    public final Map b;
    public final String c;
    public final Set d;
    public final Map e;

    public mr01(Map map, Map map2, String str, Set set, Map map3) {
        this.a = map;
        this.b = map2;
        this.c = str;
        this.d = set;
        this.e = map3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mr01)) {
            return false;
        }
        mr01 mr01Var = (mr01) obj;
        return u890.j(this.a, mr01Var.a) && u890.j(this.b, mr01Var.b) && u890.j(this.c, mr01Var.c) && u890.j(this.d, mr01Var.d) && u890.j(this.e, mr01Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Map map = this.b;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Set set = this.d;
        return this.e.hashCode() + ((iHashCode3 + (set != null ? set.hashCode() : 0)) * 31);
    }
}
