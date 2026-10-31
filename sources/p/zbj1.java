package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zbj1 implements jn60, rfu {
    public final String a;
    public final String b;
    public final yz21 c;
    public final ucj1 d;

    public zbj1(String str, String str2, yz21 yz21Var, ucj1 ucj1Var) {
        this.a = str;
        this.b = str2;
        this.c = yz21Var;
        this.d = ucj1Var;
    }

    @Override // p.rfu
    public final String c() {
        return this.d.c.getId();
    }

    public final List d(op80 op80Var) {
        ucj1 ucj1Var = this.d;
        ji0 ji0Var = ucj1Var.b;
        return Collections.singletonList(new b7j1(this.a, op80Var, new y8j1(this.b, zgo1.u(ucj1Var.c), ji0Var, ji0Var.i, ji0Var.Z.getValue(), ji0Var.W0, ji0Var.Y0.a)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zbj1)) {
            return false;
        }
        zbj1 zbj1Var = (zbj1) obj;
        return this.a.equals(zbj1Var.a) && u890.j(this.b, zbj1Var.b) && u890.j(this.c, zbj1Var.c) && this.d.equals(zbj1Var.d);
    }

    public final yz21 f() {
        return this.c;
    }

    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.d.hashCode() + bb00.g(this.c, cy30.d(this.a.hashCode() * 31, 961, this.b), 31);
    }
}
