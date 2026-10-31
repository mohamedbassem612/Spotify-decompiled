package p;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class lbz0 extends o6 implements qzh {
    public final lbz0 N0;
    public final hrr0 O0;

    public lbz0(Context context) {
        super(context, (AttributeSet) null, 0);
        this.N0 = this;
        this.O0 = v8r.q(new jbz0(""));
    }

    private final jbz0 getState() {
        return (jbz0) this.O0.getValue();
    }

    private final void setState(jbz0 jbz0Var) {
        this.O0.setValue(jbz0Var);
    }

    public final void a(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1023601093);
        int i2 = (x340Var.i(this) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            nyx.a(2, (wux) null, apo.r(-545650728, new kbz0(this), x340Var), x340Var, 3078, 6);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kbz0(this, i, (byte) 1);
        }
    }

    public final void f(Object obj) {
        setState((jbz0) obj);
    }

    public View getView() {
        return this.N0;
    }

    public final void y(b0k b0kVar, int i) {
        vu30 vu30Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1386059490);
        j06 j06Var = x340Var.a;
        int i2 = (x340Var.i(this) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            uwr uwrVar = cbx.a;
            long jA = cbx.a(x340Var).a.a.a();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE = dug.e(u291.f(nim0Var, 1.0f), v9c.t(new mmr0[]{new mmr0(Float.valueOf(0.0f), new u7h(jA)), new mmr0(Float.valueOf(0.9f), new u7h(jA)), new mmr0(Float.valueOf(1.0f), new u7h(u7h.j))}, 0.0f, 0.0f, 14), (hw61) null, 0.0f, 6);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarE);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            vu30 vu30Var2 = y580.Y;
            nko1.H(qim0VarE2, x340Var, vu30Var2);
            if (getState().c) {
                x340Var.i0(-1436266381);
                cvx cvxVar = cbx.b(x340Var).b;
                vu30Var = vu30Var2;
                hr80.d(uyn1.z(0.0f, 4.0f, 1, nim0Var), 1.0f, cbx.a(x340Var).a.b.a(), x340Var, 0, 0);
                x340Var.r(false);
            } else {
                vu30Var = vu30Var2;
                x340Var.i0(-1436055922);
                x340Var.r(false);
            }
            fra fraVar = een.N0;
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, nim0Var);
            cvx cvxVar3 = cbx.b(x340Var).b;
            jw31 jw31VarA = ew31.a(new d36(4.0f, true, new um5(false)), fraVar, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, qim0VarZ);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE3, x340Var, vu30Var);
            Integer num = getState().b;
            if (num == null) {
                x340Var.i0(-1300062084);
                x340Var.r(false);
            } else {
                x340Var.i0(-1300062083);
                int iIntValue = num.intValue();
                zov0 zov0Var = cbx.b(x340Var).g;
                pl70.a(i3o1.n(iIntValue, x340Var, 0), u291.r(nim0Var, 12.0f), cbx.a(x340Var).b.b, x340Var, 56, 0);
                x340Var.r(false);
            }
            cvx cvxVar4 = cbx.b(x340Var).b;
            uwo1.e(getState().a, uyn1.z(0.0f, 6.0f, 1, nim0Var), cbx.d(x340Var).j, cbx.a(x340Var).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2032);
            x340Var = x340Var;
            x340Var.r(true);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kbz0(this, i, (byte) 2);
        }
    }
}
