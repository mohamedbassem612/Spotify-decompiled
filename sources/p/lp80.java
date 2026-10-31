package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lp80 {
    public final String a;
    public final Float b;
    public final t45 c;
    public final Map d;

    public lp80(String str, Float f, t45 t45Var, Map map) {
        this.a = str;
        this.b = f;
        this.c = t45Var;
        this.d = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof lp80) {
            lp80 lp80Var = (lp80) obj;
            if (this.a.equals(lp80Var.a) && u890.j(this.b, lp80Var.b) && this.c == lp80Var.c && this.d.equals(lp80Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Float f = this.b;
        return this.d.hashCode() + ((this.c.hashCode() + ((iHashCode + (f == null ? 0 : f.hashCode())) * 31)) * 31);
    }
}
