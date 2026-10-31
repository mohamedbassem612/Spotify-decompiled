package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class stn0 {
    public final c380 a;
    public final vzq0 b;
    public final hcs c;
    public final iu30 d;

    public stn0(c380 c380Var, vzq0 vzq0Var, hcs hcsVar, iu30 iu30Var) {
        this.a = c380Var;
        this.b = vzq0Var;
        this.c = hcsVar;
        this.d = iu30Var;
    }

    public final void a(int i, j2i j2iVar, b0k b0kVar) {
        boolean z;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-161578559);
        int i2 = i | (x340Var.g(this) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            c380 c380Var = this.a;
            int i3 = 0;
            for (Object obj : c380Var) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    p7h.T();
                    throw null;
                }
                btn0 btn0Var = (btn0) obj;
                lik1 lik1Var = btn0Var.c;
                x340Var.f0(916750310, lik1Var);
                x340Var.i0(916751046);
                int size = c380Var.size();
                hux huxVar = btn0Var.a;
                int i5 = btn0Var.b;
                boolean z2 = btn0Var.e;
                atn0 atn0Var = btn0Var.f;
                if (atn0Var instanceof zsn0) {
                    z = false;
                } else {
                    if (!(atn0Var instanceof ysn0) && !(atn0Var instanceof xsn0)) {
                        eg.o();
                        return;
                    }
                    z = true;
                }
                boolean zG = ((i2 & 112) == 32) | x340Var.g(btn0Var);
                Object objT = x340Var.T();
                if (zG || objT == m4cVar) {
                    objT = new s2n0(this, btn0Var, (byte) 13);
                    x340Var.s0(objT);
                }
                otn0 otn0Var = new otn0(this.b, i3, size, huxVar, i5, z2, z, smo1.C((Function0) objT));
                boolean zG2 = x340Var.g(lik1Var);
                Object objT2 = x340Var.T();
                if (zG2 || objT2 == m4cVar) {
                    objT2 = lik1Var.equals(nik1.S4) ? (rtn0) this.c.a.get() : qtn0.a;
                    x340Var.s0(objT2);
                }
                j2iVar.c1(otn0Var, btn0Var, (rtn0) objT2, x340Var, 3072);
                x340Var.r(false);
                x340Var.r(false);
                i3 = i4;
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new loi0(this, j2iVar, i, (byte) 25);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof stn0) {
            stn0 stn0Var = (stn0) obj;
            if (u890.j(this.a, stn0Var.a) && this.b.equals(stn0Var.b) && this.c == stn0Var.c && u890.j(this.d, stn0Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }
}
