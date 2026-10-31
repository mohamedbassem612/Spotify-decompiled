package p;

import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/z7e1;", "Lp/uim0;", "Lp/a8e1;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class z7e1 extends uim0 {
    public final aae1 a;
    public final ggg1 b;
    public final lee1 c;
    public final boolean d;
    public final vu30 e;
    public final kua0 f;

    public z7e1(aae1 aae1Var, ggg1 ggg1Var, lee1 lee1Var, boolean z, vu30 vu30Var, kua0 kua0Var) {
        this.a = aae1Var;
        this.b = ggg1Var;
        this.c = lee1Var;
        this.d = z;
        this.e = vu30Var;
        this.f = kua0Var;
    }

    public final pim0 a() {
        return new a8e1(this.a, this.b, this.c, this.d, this.e, this.f);
    }

    public final void b(pim0 pim0Var) {
        a8e1 a8e1Var = (a8e1) pim0Var;
        aae1 aae1Var = a8e1Var.Q0;
        aae1 aae1Var2 = this.a;
        a8e1Var.Q0 = aae1Var2;
        aae1Var2.b = this.e;
        boolean z = this.d;
        a8e1Var.R0 = z;
        aae1Var2.a.a.setValue(new z5e1(this.b, this.c, z, !z, this.f.c == 4));
        if (u890.j(aae1Var, aae1Var2)) {
            return;
        }
        k5c k5cVar = a8e1Var.S0;
        j5c j5cVar = aae1Var2.h;
        j5c j5cVar2 = k5cVar.O0;
        if (j5cVar2 != null) {
            j5cVar2.a.k(k5cVar);
        }
        j5cVar.a.b(k5cVar);
        k5cVar.O0 = j5cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z7e1)) {
            return false;
        }
        z7e1 z7e1Var = (z7e1) obj;
        return this.d == z7e1Var.d && u890.j(this.a, z7e1Var.a) && u890.j(this.b, z7e1Var.b) && u890.j(this.c, z7e1Var.c) && this.e == z7e1Var.e && this.f.equals(z7e1Var.f);
    }

    public final int hashCode() {
        int iH = p3d1.h(this.c, (this.b.hashCode() + ((this.a.hashCode() + (Boolean.hashCode(this.d) * 31)) * 31)) * 31, 31);
        vu30 vu30Var = this.e;
        return this.f.hashCode() + ((iH + (vu30Var != null ? vu30Var.hashCode() : 0)) * 31);
    }
}
