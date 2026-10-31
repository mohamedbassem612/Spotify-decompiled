package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class aqw {
    public final iu30 a;
    public final Object b;

    public aqw(iu30 iu30Var, Object obj) {
        this.a = iu30Var;
        this.b = obj;
    }

    public final void a(paj0 paj0Var, qe41 qe41Var, b0k b0kVar, int i, int i2) {
        qe41 qe41Var2;
        int i3;
        qe41 qe41Var3;
        Object obj;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(542592085);
        int i4 = i | (x340Var.g(paj0Var) ? 4 : 2);
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 = i4 | 48;
            qe41Var2 = qe41Var;
        } else {
            qe41Var2 = qe41Var;
            i3 = i4 | (x340Var.i(qe41Var2) ? 32 : 16);
        }
        int i6 = i3 | (x340Var.g(this) ? 256 : 128);
        if (x340Var.Y(i6 & 1, (i6 & 147) != 146)) {
            ipb1 rccVar = null;
            qe41 qe41Var4 = i5 != 0 ? null : qe41Var2;
            boolean z = (i6 & 14) == 4;
            Object obj2 = this.b;
            boolean zG = x340Var.g(obj2) | z;
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                objT = (xpw) this.a.invoke(paj0Var);
                x340Var.s0(objT);
            }
            xpw xpwVar = (xpw) objT;
            if (qe41Var4 != null) {
                obj = obj2;
                rccVar = new rcc(l1d.m("MessagingElementStateHolder_", xpwVar.b()), qe41Var4, xpwVar.getBehavior().c(), xpwVar.c().b(), xpwVar.getBehavior().b((Object) null, (dts) null, (String) null), obj);
            } else {
                obj = obj2;
            }
            otw.c(xpwVar, obj, (qim0) null, rccVar, x340Var, 0, 4);
            qe41Var3 = qe41Var4;
        } else {
            x340Var.b0();
            qe41Var3 = qe41Var2;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new r27(this, paj0Var, qe41Var3, i, i2, (byte) 9);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aqw)) {
            return false;
        }
        aqw aqwVar = (aqw) obj;
        return u890.j(this.a, aqwVar.a) && this.b.equals(aqwVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
