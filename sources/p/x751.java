package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class x751 {
    public final lw41 a;
    public final int b;
    public final boolean c;
    public final Map d;

    public x751(lw41 lw41Var, int i, boolean z, Map map) {
        this.a = lw41Var;
        this.b = i;
        this.c = z;
        this.d = map;
    }

    public static x751 a(x751 x751Var, Map map, int i) {
        lw41 lw41Var = x751Var.a;
        int i2 = x751Var.b;
        boolean z = (i & 4) != 0 ? x751Var.c : false;
        x751Var.getClass();
        return new x751(lw41Var, i2, z, map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x751)) {
            return false;
        }
        x751 x751Var = (x751) obj;
        return u890.j(this.a, x751Var.a) && this.b == x751Var.b && this.c == x751Var.c && u890.j(this.d, x751Var.d);
    }

    public final int hashCode() {
        int iG = xcg1.g(kaa0.f(this.b, this.a.hashCode() * 31, 31), 31, this.c);
        Map map = this.d;
        return iG + (map == null ? 0 : map.hashCode());
    }
}
