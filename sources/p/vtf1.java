package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class vtf1 implements vpl {
    public final String a;
    public final ju7 b;
    public final dq70 c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final String h;
    public final kxt0 i;

    public vtf1(String str, ju7 ju7Var, dq70 dq70Var, String str2, boolean z, boolean z2, String str3, String str4, kxt0 kxt0Var) {
        this.a = str;
        this.b = ju7Var;
        this.c = dq70Var;
        this.d = str2;
        this.e = z;
        this.f = z2;
        this.g = str3;
        this.h = str4;
        this.i = kxt0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vtf1)) {
            return false;
        }
        vtf1 vtf1Var = (vtf1) obj;
        return this.a.equals(vtf1Var.a) && this.b.equals(vtf1Var.b) && this.c.equals(vtf1Var.c) && this.d.equals(vtf1Var.d) && this.e == vtf1Var.e && this.f == vtf1Var.f && this.g.equals(vtf1Var.g) && this.h.equals(vtf1Var.h) && u890.j(this.i, vtf1Var.i);
    }

    @Override // p.vpl
    public final kxt0 g() {
        return this.i;
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(xcg1.g(xcg1.g(cy30.d((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
        kxt0 kxt0Var = this.i;
        return iD + (kxt0Var == null ? 0 : kxt0Var.hashCode());
    }

    @Override // p.vpl
    public final String j() {
        return this.h;
    }

    @Override // p.vpl
    public final boolean k() {
        return true;
    }

    @Override // p.vpl
    public final List l() {
        return Collections.singletonList(m87.w(this.b));
    }
}
