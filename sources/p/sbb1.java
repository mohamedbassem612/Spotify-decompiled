package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class sbb1 {
    public final String a;
    public final boolean b;
    public final Boolean c;
    public final boolean d;
    public final Map e;

    public sbb1(String str, boolean z, Boolean bool, boolean z2, Map map) {
        this.a = str;
        this.b = z;
        this.c = bool;
        this.d = z2;
        this.e = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sbb1)) {
            return false;
        }
        sbb1 sbb1Var = (sbb1) obj;
        return u890.j(this.a, sbb1Var.a) && this.b == sbb1Var.b && u890.j(this.c, sbb1Var.c) && this.d == sbb1Var.d && this.e.equals(sbb1Var.e);
    }

    public final int hashCode() {
        int iG = xcg1.g(this.a.hashCode() * 31, 31, this.b);
        Boolean bool = this.c;
        return this.e.hashCode() + xcg1.g((iG + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.d);
    }
}
