package p;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class fy8 {
    public final String a;
    public final Map b;
    public final List c;
    public final xig d;

    public fy8(String str, Map map, List list, xig xigVar) {
        if (str == null) {
            bhn0.i("Null authid");
            throw null;
        }
        this.a = str;
        this.b = map;
        if (list == null) {
            bhn0.i("Null authMethods");
            throw null;
        }
        this.c = list;
        this.d = xigVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fy8) {
            fy8 fy8Var = (fy8) obj;
            if (this.a.equals(fy8Var.a)) {
                Map map = fy8Var.b;
                Map map2 = this.b;
                if (map2 != null ? map2.equals(map) : map == null) {
                    if (this.c.equals(fy8Var.c)) {
                        xig xigVar = fy8Var.d;
                        xig xigVar2 = this.d;
                        if (xigVar2 != null ? xigVar2.equals(xigVar) : xigVar == null) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        Map map = this.b;
        int iHashCode2 = (((iHashCode ^ (map == null ? 0 : map.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003;
        xig xigVar = this.d;
        return iHashCode2 ^ (xigVar != null ? xigVar.hashCode() : 0);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.b);
        return rjx.o(gvg.n("AuthDetails{authid=", this.a, ", extras=", strValueOf, ", authMethods="), String.valueOf(this.c), ", clientIdentity=", String.valueOf(this.d), "}");
    }
}
