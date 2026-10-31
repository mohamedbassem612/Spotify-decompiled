package p;

import app.p000rive.semantics.SemanticState;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class w3d1 {
    public static final kiv a = new kiv(new mf41((byte) 4), (byte) 0);

    public static final void a(qim0 qim0Var, hw61 hw61Var, long j, long j2, float f, float f2, qqb qqbVar, j2i j2iVar, b0k b0kVar, int i, int i2) {
        if ((i2 & 1) != 0) {
            qim0Var = nim0.a;
        }
        if ((i2 & 2) != 0) {
            hw61Var = d4o1.a;
        }
        if ((i2 & 4) != 0) {
            j = ((dah) ((x340) b0kVar).k(eah.a)).p;
        }
        if ((i2 & 8) != 0) {
            j2 = eah.b(j, b0kVar);
        }
        if ((i2 & 16) != 0) {
            f = 0.0f;
        }
        if ((i2 & 32) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 64) != 0) {
            qqbVar = null;
        }
        x340 x340Var = (x340) b0kVar;
        kiv kivVar = a;
        float f3 = f + ((p3v) x340Var.k(kivVar)).a;
        mod.c(new ely0[]{p3d1.o(j2, wrl.a), kivVar.a(new p3v(f3))}, apo.r(421772006, new u3d1(qim0Var, hw61Var, j, f3, qqbVar, f2, j2iVar), x340Var), x340Var, 56);
    }

    public static final void b(Function0 function0, qim0 qim0Var, boolean z, hw61 hw61Var, long j, long j2, float f, float f2, idn0 idn0Var, j2i j2iVar, b0k b0kVar, int i, int i2) {
        idn0 idn0Var2;
        boolean z2 = (i2 & 4) != 0 ? true : z;
        long jB = (i2 & 32) != 0 ? eah.b(j, b0kVar) : j2;
        float f3 = (i2 & 64) != 0 ? 0.0f : f;
        float f4 = (i2 & SemanticState.Focused) != 0 ? 0.0f : f2;
        idn0 idn0Var3 = (i2 & 512) != 0 ? null : idn0Var;
        if (idn0Var3 == null) {
            x340 x340Var = (x340) b0kVar;
            x340Var.i0(-1701037204);
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = ktd.n(x340Var);
            }
            x340Var.r(false);
            idn0Var2 = (idn0) objT;
        } else {
            x340 x340Var2 = (x340) b0kVar;
            x340Var2.i0(2023337163);
            x340Var2.r(false);
            idn0Var2 = idn0Var3;
        }
        x340 x340Var3 = (x340) b0kVar;
        kiv kivVar = a;
        float f5 = ((p3v) x340Var3.k(kivVar)).a + f3;
        mod.c(new ely0[]{p3d1.o(jB, wrl.a), kivVar.a(new p3v(f5))}, apo.r(849208527, new v3d1(qim0Var, hw61Var, j, f5, null, idn0Var2, z2, function0, f4, j2iVar), x340Var3), x340Var3, 56);
    }

    public static final qim0 c(qim0 qim0Var, hw61 hw61Var, long j, qqb qqbVar, float f) {
        hw61 hw61Var2;
        qim0 qim0VarE;
        qim0 qim0VarF = nim0.a;
        if (f > 0.0f) {
            hw61Var2 = hw61Var;
            qim0VarE = i541.E(qim0VarF, 0.0f, 0.0f, 0.0f, f, hw61Var2, 124895);
        } else {
            hw61Var2 = hw61Var;
            qim0VarE = qim0VarF;
        }
        qim0 qim0VarThen = qim0Var.then(qim0VarE);
        if (qqbVar != null) {
            qim0VarF = d1u.F(qim0VarF, qqbVar.a, qqbVar.b, hw61Var2);
        }
        return i1p1.q(dug.f(qim0VarThen.then(qim0VarF), j, hw61Var2), hw61Var2);
    }

    public static final long d(long j, float f, x340 x340Var) {
        dah dahVar = (dah) x340Var.k(eah.a);
        boolean zBooleanValue = ((Boolean) x340Var.k(eah.b)).booleanValue();
        long j2 = dahVar.p;
        int i = u7h.l;
        if (!z4h1.b(j, j2) || !zBooleanValue) {
            return j;
        }
        if (p3v.c(f, 0.0f)) {
            return j2;
        }
        return z4p1.t(u7h.b(dahVar.t, ((((float) Math.log(f + 1.0f)) * 4.5f) + 2.0f) / 100.0f, 0.0f, 0.0f, 0.0f, 14), j2);
    }
}
