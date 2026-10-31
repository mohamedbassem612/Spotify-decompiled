package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class l2l1 {
    public final String a;
    public final Map b;
    public final String c;

    public /* synthetic */ l2l1(String str, int i, Map map, String str2) {
        this((i & 1) != 0 ? null : str, str2, (i & 2) != 0 ? null : map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l2l1)) {
            return false;
        }
        l2l1 l2l1Var = (l2l1) obj;
        return u890.j(this.a, l2l1Var.a) && u890.j(this.b, l2l1Var.b) && u890.j(this.c, l2l1Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Map map = this.b;
        return this.c.hashCode() + ((iHashCode + (map != null ? map.hashCode() : 0)) * 31);
    }

    public l2l1(String str, String str2, Map map) {
        this.a = str;
        this.b = map;
        this.c = str2;
    }
}
