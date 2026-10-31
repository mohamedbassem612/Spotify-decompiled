package p;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class k2r0 {
    public static final kiv a = mod.t(v0r0.f);
    public static final kiv b = mod.t(v0r0.e);
    public static final kiv c = mod.t(v0r0.d);

    public static final void a(cir0 cir0Var, j2i j2iVar, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1421628095);
        int i2 = (x340Var.i(cir0Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            q7r0 q7r0VarG = cir0Var.g();
            kiv kivVar = szf0.a;
            kiv kivVar2 = AndroidCompositionLocals_androidKt.f;
            rzf0 rzf0VarB = szf0.b((View) x340Var.k(kivVar2));
            kiv kivVar3 = szf0.b;
            erl1 erl1Var = (erl1) szf0.a((View) x340Var.k(kivVar2), 2131429842);
            ely0 ely0VarA = a.a(cir0Var);
            ely0 ely0VarA2 = b.a(q7r0VarG.d.b().a());
            ely0 ely0VarA3 = jfe0.a.a(cir0Var.e());
            ely0 ely0VarA4 = lge0.a.a(cir0Var.d());
            kiv kivVar4 = nce0.a;
            ely0 ely0VarA5 = nce0.a(cir0Var.b());
            ely0 ely0VarA6 = kivVar.a(rzf0VarB);
            ely0VarA6.g = false;
            ely0 ely0VarA7 = kivVar3.a(erl1Var);
            ely0VarA7.g = false;
            mod.c(new ely0[]{ely0VarA, ely0VarA2, ely0VarA3, ely0VarA4, ely0VarA5, ely0VarA6, ely0VarA7}, apo.r(-814538239, new jyo0(q7r0VarG, j2iVar, (byte) 17), x340Var), x340Var, 56);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jyo0(cir0Var, j2iVar, i, (byte) 18);
        }
    }

    public static final void b(Function0 function0, j2i j2iVar, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1777378744);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(j2iVar) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new hii0(function0, (byte) 6);
                x340Var.s0(objT);
            }
            mod.b(c.c((iu30) objT), j2iVar, x340Var, (i2 & 112) | 8);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rx1(function0, j2iVar, i, (byte) 1);
        }
    }

    public static final void c(int i, j2i j2iVar, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1198797671);
        if (x340Var.Y(i & 1, (i & 3) != 2)) {
            View view = (View) x340Var.k(AndroidCompositionLocals_androidKt.f);
            boolean zI = x340Var.i(view);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new th(view, (byte) 5);
                x340Var.s0(objT);
            }
            b((Function0) objT, j2iVar, x340Var, 48);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new j2r0(j2iVar, i, (byte) 1);
        }
    }
}
