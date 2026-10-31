package p;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class oec0 {
    public static final bby a = xay.e(2, irn1.o0(1000, 0, (dlv) null, 6));
    public static final f7c0 b = f7c0.f;
    public static final f7c0 c = f7c0.g;
    public static final f7c0 d = f7c0.h;

    public static final void a(gbx gbxVar, qim0 qim0Var, boolean z, idn0 idn0Var, b0k b0kVar, int i) {
        boolean z2;
        idn0 idn0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-829320973);
        int i2 = (x340Var.g(gbxVar) ? 4 : 2) | i | 3456;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = ktd.n(x340Var);
            }
            idn0 idn0Var3 = (idn0) objT;
            gfx.g(1, apo.r(169369574, new fix(gbxVar, qim0Var, idn0Var3), x340Var), x340Var, 54);
            idn0Var2 = idn0Var3;
            z2 = true;
        } else {
            x340Var.b0();
            z2 = z;
            idn0Var2 = idn0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qy90(gbxVar, qim0Var, z2, idn0Var2, i, (byte) 9);
        }
    }

    public static final void b(String str, gbx gbxVar, qim0 qim0Var, boolean z, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(279231257);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(gbxVar) ? 32 : 16) | (x340Var.g(qim0Var) ? 256 : 128) | (x340Var.g((Object) null) ? 2048 : 1024) | (x340Var.h(z) ? 16384 : 8192) | 196608;
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            int i3 = z ? 4 : 1;
            uwr uwrVar = cbx.a;
            avw0 avw0Var = cbx.b(x340Var).c;
            gfx.b(i3, apo.r(1215049732, new ey(qim0Var, z, d1u.E(1.0f, cbx.a(x340Var).a.c, nim0.a, er31.a), gbxVar, str), x340Var), x340Var, 48);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mec0(str, gbxVar, qim0Var, z, i, (byte) 0);
        }
    }

    public static final void c(lec0 lec0Var, iu30 iu30Var, qim0 qim0Var, zzq0 zzq0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1548412515);
        byte b2 = 2;
        int i2 = i | (b0kVar3.g(lec0Var) ? 4 : 2) | (b0kVar3.i(iu30Var) ? 32 : 16) | 384 | (b0kVar3.g(zzq0Var) ? 2048 : 1024);
        if (b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            xtb0 xtb0VarA = aub0.a(0, b0kVar3, 3);
            Context context = (Context) b0kVar3.k(AndroidCompositionLocals_androidKt.b);
            Object objT = b0kVar3.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(Boolean.FALSE);
                b0kVar3.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            gec0 gec0Var = lec0Var.c;
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object objT2 = b0kVar3.T();
            if (z || objT2 == m4cVar) {
                objT2 = new e9c0(lec0Var, ven0Var, null, b2);
                b0kVar3.s0(objT2);
            }
            qxd0.t(gec0Var, b0kVar3, (vu30) objT2);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarJ = u291.j(48.0f, 0.0f, 2, u291.f(qim0Var3, 1.0f));
            boolean zI = (i3 == 4) | ((i2 & 112) == 32) | b0kVar3.i(context);
            Object objT3 = b0kVar3.T();
            if (zI || objT3 == m4cVar) {
                lhx lhxVar = new lhx(lec0Var, iu30Var, ven0Var, context, (byte) 28);
                b0kVar3.s0(lhxVar);
                objT3 = lhxVar;
            }
            b0kVar2 = b0kVar3;
            too1.b(qim0VarJ, xtb0VarA, zzq0Var, (iu30) objT3, b0kVar2, (i2 >> 3) & 896, 0);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new cb60(lec0Var, iu30Var, qim0Var2, zzq0Var, i, (byte) 20);
        }
    }
}
