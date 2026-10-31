package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class utj0 implements xpw {
    public final buj0 a;
    public final k8d1 b;
    public final ia00 c = n3o1.q(this).a(eej0.P0, eej0.Q0);
    public final psw d;

    public utj0(buj0 buj0Var, o8n o8nVar) {
        this.a = buj0Var;
        this.b = new k8d1(o8nVar, new r20(this, (lnm) null, (byte) 27));
        j2i j2iVar = new j2i(2036480654, new y3i0(this, (byte) 17), true);
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.c;
    }

    public final jsw c() {
        return this.d;
    }

    public final void e(ttj0 ttj0Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(214431053);
        if ((i & 6) == 0) {
            i2 = i | (x340Var.g(ttj0Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 112) == 32;
            Object objT = x340Var.T();
            if (z || objT == m4cVar) {
                objT = new stj0(iu30Var, (byte) 0);
                x340Var.s0(objT);
            }
            gbx gbxVar = new gbx(z50.c, (Function0) objT);
            uwr uwrVar = cbx.a;
            long jA = cbx.a(x340Var).a.b.a();
            long jB = cbx.a(x340Var).a.b.b();
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = m2j0.X;
                x340Var.s0(objT2);
            }
            vu30 vu30Var = (vu30) objT2;
            boolean zF = x340Var.f(jA) | x340Var.f(jB);
            Object objT3 = x340Var.T();
            if (zF || objT3 == m4cVar) {
                kz0 kz0Var = new kz0((byte) 3, jA, jB);
                x340Var.s0(kz0Var);
                objT3 = kz0Var;
            }
            hdx hdxVar = new hdx(18, vu30Var, (vu30) objT3, (vu30) null, (hw61) null, 24);
            boolean zY0 = ihc1.y0(ttj0Var.b);
            nim0 nim0Var = nim0.a;
            if (zY0) {
                x340Var.i0(1500106560);
                wro1.h(gbxVar, hdxVar, anm1.N("mix_action_element_button", nim0Var), (max) null, yla.s(x340Var), (vzq0) null, false, (idn0) null, (ga80) null, l1j.a, x340Var, 0, 6, 984);
                x340Var.r(false);
            } else {
                x340Var.i0(1500496137);
                foo1.c(gbxVar, hdxVar, anm1.N("mix_action_element_button", nim0Var), (max) null, yla.s(x340Var), (vzq0) null, (idn0) null, (ga80) null, l1j.b, (vu30) null, apo.r(-960794550, new yih0(ttj0Var, (byte) 23), x340Var), x340Var, 805306368, 48, 1496);
                x340Var = x340Var;
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vqd0(this, ttj0Var, iu30Var, i, (byte) 25);
        }
    }

    public final mqw getBehavior() {
        return this.b;
    }
}
