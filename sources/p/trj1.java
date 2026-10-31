package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class trj1 {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final Map d;
    public final h290 e;

    public trj1(String str, boolean z, boolean z2, Map map, h290 h290Var) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = map;
        this.e = h290Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof trj1)) {
            return false;
        }
        trj1 trj1Var = (trj1) obj;
        return u890.j(this.a, trj1Var.a) && this.b == trj1Var.b && this.c == trj1Var.c && this.d.equals(trj1Var.d) && this.e.equals(trj1Var.e);
    }

    public final int hashCode() {
        String str = this.a;
        return this.e.hashCode() + cy30.e(xcg1.g(xcg1.g((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
