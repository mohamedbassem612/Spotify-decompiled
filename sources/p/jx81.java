package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jx81 extends rxd1 {
    public final ujo0 a;
    public final iu30 b;
    public final iu30 c;
    public final cvy0 d;
    public final List e;
    public final atk f;
    public final int g;

    public /* synthetic */ jx81(ujo0 ujo0Var, iu30 iu30Var, iu30 iu30Var2, cvy0 cvy0Var, List list, int i) {
        this(ujo0Var, iu30Var, iu30Var2, cvy0Var, list, null, (i & 64) != 0 ? 0 : 1);
    }

    public final cvy0 a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jx81)) {
            return false;
        }
        jx81 jx81Var = (jx81) obj;
        return u890.j(this.a, jx81Var.a) && u890.j(this.b, jx81Var.b) && u890.j(this.c, jx81Var.c) && u890.j(this.d, jx81Var.d) && u890.j(this.e, jx81Var.e) && u890.j(this.f, jx81Var.f) && this.g == jx81Var.g;
    }

    public final int hashCode() {
        int iB = f4i1.b((this.d.hashCode() + ktd.g(this.c, ktd.g(this.b, this.a.hashCode() * 31, 31), 31)) * 31, 31, this.e);
        atk atkVar = this.f;
        int iHashCode = (iB + (atkVar == null ? 0 : atkVar.hashCode())) * 31;
        int i = this.g;
        return iHashCode + (i != 0 ? l1d.C(i) : 0);
    }

    public jx81(ujo0 ujo0Var, iu30 iu30Var, iu30 iu30Var2, cvy0 cvy0Var, List list, atk atkVar, int i) {
        this.a = ujo0Var;
        this.b = iu30Var;
        this.c = iu30Var2;
        this.d = cvy0Var;
        this.e = list;
        this.f = atkVar;
        this.g = i;
    }
}
