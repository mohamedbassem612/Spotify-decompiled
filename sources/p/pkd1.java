package p;

import java.util.AbstractSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class pkd1 {
    public final String a;
    public final Map b;
    public final Set c;
    public final Set d;

    public pkd1(String str, Map map, AbstractSet abstractSet, AbstractSet abstractSet2) {
        this.a = str;
        this.b = map;
        this.c = abstractSet;
        this.d = abstractSet2;
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pkd1)) {
            return false;
        }
        pkd1 pkd1Var = (pkd1) obj;
        if (!this.a.equals(pkd1Var.a) || !this.b.equals(pkd1Var.b) || !this.c.equals(pkd1Var.c)) {
            return false;
        }
        Set set2 = this.d;
        if (set2 == null || (set = pkd1Var.d) == null) {
            return true;
        }
        return set2.equals(set);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |TableInfo {\n            |    name = '");
        sb.append(this.a);
        sb.append("',\n            |    columns = {");
        sb.append(tyo1.j(o7h.a1(this.b.values(), new be21((byte) 20))));
        sb.append("\n            |    foreignKeys = {");
        sb.append(tyo1.j(this.c));
        sb.append("\n            |    indices = {");
        Set set = this.d;
        sb.append(tyo1.j(set != null ? o7h.a1(set, new be21((byte) 21)) : z6x.a));
        sb.append("\n            |}\n        ");
        return jhc1.K(sb.toString());
    }
}
