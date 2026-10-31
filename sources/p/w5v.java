package p;

import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/w5v;", "Lp/uim0;", "Lp/x5v;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class w5v extends uim0 {
    public static final u1c d = new u1c((byte) 21);
    public final vvr a;
    public final iu30 b;
    public final iu30 c;

    public w5v(vvr vvrVar, iu30 iu30Var, iu30 iu30Var2) {
        this.a = vvrVar;
        this.b = iu30Var;
        this.c = iu30Var2;
    }

    public final pim0 a() {
        x5v x5vVar = new x5v(d, true, null, null);
        x5vVar.j1 = this.a;
        x5vVar.k1 = this.b;
        x5vVar.l1 = this.c;
        return x5vVar;
    }

    public final void b(pim0 pim0Var) {
        boolean z;
        x5v x5vVar = (x5v) pim0Var;
        vvr vvrVar = x5vVar.j1;
        vvr vvrVar2 = this.a;
        if (u890.j(vvrVar, vvrVar2)) {
            z = false;
        } else {
            x5vVar.j1 = vvrVar2;
            z = true;
        }
        boolean z2 = z;
        x5vVar.k1 = this.b;
        x5vVar.l1 = this.c;
        x5vVar.b2(d, true, (idn0) null, (qqq0) null, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w5v.class != obj.getClass()) {
            return false;
        }
        w5v w5vVar = (w5v) obj;
        return u890.j(this.a, w5vVar.a) && this.b == w5vVar.b && this.c == w5vVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + ktd.g(this.c, ktd.g(this.b, xcg1.g(xcg1.g(this.a.hashCode() * 31, 961, true), 31, false), 31), 31);
    }
}
