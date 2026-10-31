package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ph20 {
    public final String a;
    public final atq0 b;
    public final boolean c;
    public final Map d;
    public final boolean e;

    public ph20(String str, atq0 atq0Var, boolean z, Map map, boolean z2) {
        this.a = str;
        this.b = atq0Var;
        this.c = z;
        this.d = map;
        this.e = z2;
    }

    public static ph20 a(ph20 ph20Var, String str, atq0 atq0Var, Map map, int i) {
        if ((i & 1) != 0) {
            str = ph20Var.a;
        }
        String str2 = str;
        if ((i & 2) != 0) {
            atq0Var = ph20Var.b;
        }
        atq0 atq0Var2 = atq0Var;
        boolean z = (i & 4) != 0 ? ph20Var.c : false;
        if ((i & 8) != 0) {
            map = ph20Var.d;
        }
        return new ph20(str2, atq0Var2, z, map, ph20Var.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ph20)) {
            return false;
        }
        ph20 ph20Var = (ph20) obj;
        return u890.j(this.a, ph20Var.a) && u890.j(this.b, ph20Var.b) && this.c == ph20Var.c && u890.j(this.d, ph20Var.d) && this.e == ph20Var.e;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        atq0 atq0Var = this.b;
        return Boolean.hashCode(this.e) + cy30.e(xcg1.g((iHashCode + (atq0Var != null ? atq0Var.hashCode() : 0)) * 31, 31, this.c), 31, this.d);
    }
}
