package p;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class qsw {
    public static final ien0 a = new ien0(q6x.b);

    public static final void a(j2i j2iVar, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        View view = (View) x340Var.k(AndroidCompositionLocals_androidKt.f);
        boolean zG = x340Var.g(view);
        Object objT = x340Var.T();
        if (zG || objT == fkj0.X) {
            objT = jap1.r(view);
            x340Var.s0(objT);
        }
        u601 u601VarD = d(view, x340Var);
        mod.b(i7g1.a().a((o7g1) objT), apo.r(2053407981, new msw(u601VarD, j2iVar, (byte) 0), x340Var), x340Var, 56);
    }

    public static final void b(u601 u601Var, j2i j2iVar, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-940161880);
        int i2 = (x340Var.i(u601Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= x340Var.i(j2iVar) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            mod.b(gfe0.e(u601Var), j2iVar, x340Var, (i2 & 112) | 8);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new g8(u601Var, j2iVar, i, (byte) 6);
        }
    }

    public static final void c(obk1 obk1Var, j2i j2iVar, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1481657747);
        int i2 = (x340Var.g(obk1Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            boolean zG = x340Var.g(obk1Var.a());
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                objT = jap1.r(obk1Var.a());
                x340Var.s0(objT);
            }
            mod.b(i7g1.a().a((o7g1) objT), apo.r(-1011042899, new msw(d(obk1Var.a(), x340Var), j2iVar, (byte) 1), x340Var), x340Var, 56);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new o1t(obk1Var, j2iVar, i, (byte) 27);
        }
    }

    public static final u601 d(View view, b0k b0kVar) {
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        boolean zG = x340Var.g(view);
        Object objT = x340Var.T();
        if (zG || objT == m4cVar) {
            j0d1 j0d1VarB = guo1.B();
            fns fnsVar = igu.a;
            objT = smo1.e(ha71.A(j0d1VarB, pyf0.a.f));
            x340Var.s0(objT);
        }
        c9n c9nVar = (c9n) objT;
        boolean zI = x340Var.i(c9nVar);
        Object objT2 = x340Var.T();
        if (zI || objT2 == m4cVar) {
            objT2 = new i5w(c9nVar, (byte) 3);
            x340Var.s0(objT2);
        }
        qxd0.i(c9nVar, (iu30) objT2, x340Var);
        boolean zG2 = x340Var.g(view) | x340Var.g(c9nVar);
        Object objT3 = x340Var.T();
        if (zG2 || objT3 == m4cVar) {
            ien0 ien0Var = xhk1.a;
            objT3 = xhk1.b(c9nVar, view);
            x340Var.s0(objT3);
        }
        return (u601) objT3;
    }
}
