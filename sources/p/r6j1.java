package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class r6j1 implements jn60, h030, rfu {
    public final String a;
    public final String b;
    public final z5j1 c;
    public final x360 d;
    public final yz21 e;

    public r6j1(String str, String str2, z5j1 z5j1Var, x360 x360Var, yz21 yz21Var) {
        this.a = str;
        this.b = str2;
        this.c = z5j1Var;
        this.d = x360Var;
        this.e = yz21Var;
    }

    @Override // p.rfu
    public final String c() {
        return this.c.a;
    }

    public final List d(op80 op80Var) {
        z5j1 z5j1Var = this.c;
        String str = z5j1Var.c;
        hvl1 hvl1VarC = this.d;
        if (hvl1VarC instanceof hvl1) {
            hvl1VarC = hvl1.c(hvl1VarC, 239);
        }
        String str2 = z5j1Var.a;
        String str3 = z5j1Var.b;
        n1x n1xVarU = zgo1.u(z5j1Var.d);
        String str4 = this.a;
        return Collections.singletonList(new q6j1(new n6j1(str4, this.b, str2, str, str3, hvl1VarC, n1xVarU, ""), str4, op80Var));
    }

    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r6j1)) {
            return false;
        }
        r6j1 r6j1Var = (r6j1) obj;
        return this.a.equals(r6j1Var.a) && this.b.equals(r6j1Var.b) && this.c.equals(r6j1Var.c) && u890.j(this.d, r6j1Var.d) && this.e.equals(r6j1Var.e);
    }

    public final yz21 f() {
        return this.e;
    }

    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31;
        x360 x360Var = this.d;
        return this.e.hashCode() + ((iHashCode + (x360Var == null ? 0 : x360Var.hashCode())) * 31);
    }
}
