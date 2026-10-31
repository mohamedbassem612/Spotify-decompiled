package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class oid implements vpl {
    public final String a;
    public final clj1 b;
    public final ju7 c;
    public final dq70 d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final kxt0 h;

    public oid(String str, clj1 clj1Var, ju7 ju7Var, dq70 dq70Var, boolean z, boolean z2, String str2, kxt0 kxt0Var) {
        this.a = str;
        this.b = clj1Var;
        this.c = ju7Var;
        this.d = dq70Var;
        this.e = z;
        this.f = z2;
        this.g = str2;
        this.h = kxt0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oid)) {
            return false;
        }
        oid oidVar = (oid) obj;
        return this.a.equals(oidVar.a) && this.b.equals(oidVar.b) && this.c.equals(oidVar.c) && this.d.equals(oidVar.d) && this.e == oidVar.e && this.f == oidVar.f && this.g.equals(oidVar.g) && u890.j(this.h, oidVar.h);
    }

    @Override // p.vpl
    public final kxt0 g() {
        return this.h;
    }

    public final int hashCode() {
        int iD = cy30.d(xcg1.g(xcg1.g((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31, 31, this.e), 31, this.f), 31, this.g);
        kxt0 kxt0Var = this.h;
        return iD + (kxt0Var == null ? 0 : kxt0Var.hashCode());
    }

    @Override // p.vpl
    public final String j() {
        return this.g;
    }

    @Override // p.vpl
    public final boolean k() {
        return true;
    }

    @Override // p.vpl
    public final List l() {
        return p7h.M(new li90[]{m87.w(this.c), m87.x(this.b)});
    }
}
