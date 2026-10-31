package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class i871 {
    public final g771 a;
    public final String b;
    public final Map c;

    public i871(g771 g771Var, String str, Map map) {
        this.a = g771Var;
        this.b = str;
        this.c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i871)) {
            return false;
        }
        i871 i871Var = (i871) obj;
        return this.a.equals(i871Var.a) && u890.j(this.b, i871Var.b) && u890.j(this.c, i871Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
