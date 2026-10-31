package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class pr81 {
    public final String a;
    public final String b;
    public final String c;
    public final Map d;

    public pr81(String str, String str2, String str3, Map map) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pr81)) {
            return false;
        }
        pr81 pr81Var = (pr81) obj;
        return this.a.equals(pr81Var.a) && u890.j(this.b, pr81Var.b) && u890.j(this.c, pr81Var.c) && u890.j(this.d, pr81Var.d);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        Map map = this.d;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }
}
