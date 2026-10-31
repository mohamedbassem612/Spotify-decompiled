package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class gij1 implements vpl {
    public final kxt0 X;
    public final String a;
    public final clj1 b;
    public final dq70 c;
    public final boolean d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final z0i h;
    public final String i;
    public final String t;

    public gij1(String str, clj1 clj1Var, dq70 dq70Var, boolean z, String str2, boolean z2, boolean z3, idg1 idg1Var, String str3, String str4, kxt0 kxt0Var) {
        this.a = str;
        this.b = clj1Var;
        this.c = dq70Var;
        this.d = z;
        this.e = str2;
        this.f = z2;
        this.g = z3;
        this.h = idg1Var;
        this.i = str3;
        this.t = str4;
        this.X = kxt0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gij1)) {
            return false;
        }
        gij1 gij1Var = (gij1) obj;
        return this.a.equals(gij1Var.a) && this.b.equals(gij1Var.b) && this.c.equals(gij1Var.c) && this.d == gij1Var.d && this.e.equals(gij1Var.e) && this.f == gij1Var.f && this.g == gij1Var.g && u890.j(this.h, gij1Var.h) && this.i.equals(gij1Var.i) && this.t.equals(gij1Var.t) && u890.j(this.X, gij1Var.X);
    }

    @Override // p.vpl
    public final kxt0 g() {
        return this.X;
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g(cy30.d(xcg1.g((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        z0i z0iVar = this.h;
        int iD = cy30.d(cy30.d((iG + (z0iVar == null ? 0 : z0iVar.hashCode())) * 31, 31, this.i), 31, this.t);
        kxt0 kxt0Var = this.X;
        return iD + (kxt0Var != null ? kxt0Var.hashCode() : 0);
    }

    @Override // p.vpl
    public final String j() {
        return this.t;
    }

    @Override // p.vpl
    public final boolean k() {
        return true;
    }

    @Override // p.vpl
    public final List l() {
        return Collections.singletonList(m87.x(this.b));
    }
}
