package p;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class iyj implements tyq {
    public final d0r a;
    public final aeg1 b;
    public final e7q c;
    public final l451 d;
    public final hl11 e;
    public final o3r f = w3p1.o(new l4r(pwc0.w, 1, cjj.V0, new j4r(cjj.T0), cjj.W0), cjj.U0);
    public final js20 g = x3p1.n(new hyj(this, 0), cjj.S0, trj.a1, (o8n) null, new hyj(this, 1), 8);
    public final eih1 h = new eih1();
    public final psw i;

    public iyj(d0r d0rVar, aeg1 aeg1Var, e7q e7qVar, l451 l451Var, hl11 hl11Var) {
        this.a = d0rVar;
        this.b = aeg1Var;
        this.c = e7qVar;
        this.d = l451Var;
        this.e = hl11Var;
        j2i j2iVar = new j2i(771621969, new rxg(this, (byte) 13), true);
        ien0 ien0Var = qsw.a;
        this.i = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.h;
    }

    public final jsw c() {
        return this.i;
    }

    public final d0r e() {
        return this.a;
    }

    public final void f(int i, long j, Function0 function0, b0k b0kVar, boolean z) {
        x340 x340Var;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-445056472);
        int i2 = i | (x340Var2.f(j) ? 4 : 2) | (x340Var2.h(z) ? 32 : 16) | (x340Var2.i(function0) ? 256 : 128);
        if (x340Var2.Y(i2 & 1, (i2 & 147) != 146)) {
            Context context = (Context) x340Var2.k(AndroidCompositionLocals_androidKt.b);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = dug.f(u291.f(nim0Var, 1.0f), j, d4o1.a);
            uwr uwrVar = cbx.a;
            qim0 qim0VarN = anm1.N("compose-selection-page-bottom-bar", uyn1.B(qim0VarF, 0.0f, 0.0f, 0.0f, cbx.b(x340Var2).b.c, 7));
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarN);
            hzj.A.getClass();
            if (x340Var2.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(hmb0.t1);
            } else {
                x340Var2.v0();
            }
            nko1.H(gfh0VarC, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            boolean z2 = (i2 & 896) == 256;
            Object objT = x340Var2.T();
            if (z2 || objT == fkj0.X) {
                objT = new ugj(function0, (byte) 1);
                x340Var2.s0(objT);
            }
            foo1.c(new gbx(z50.c, (Function0) objT), new idx(), anm1.N("compose-selection-page-continue-button", nim0Var), z ? jax.a : new hax(context.getString(2131959128)), (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(-1868178877, new yd2(context, (byte) 3), x340Var2), x340Var2, 0, 48, 2024);
            x340Var = x340Var2;
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mx9(this, j, z, function0, i);
        }
    }

    public final mqw getBehavior() {
        return this.g;
    }

    public final f4r getData() {
        return this.f;
    }
}
