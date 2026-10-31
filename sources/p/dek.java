package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public abstract class dek {
    public static final long a = z4p1.g(4294950328L);

    public static final void a(bek bekVar, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(464271217);
        int i2 = i | (b0kVar3.g(bekVar) ? 4 : 2) | (b0kVar3.i(function0) ? 256 : 128) | 3072;
        if (b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            cvx cvxVar3 = cbx.b(b0kVar3).b;
            zzq0 zzq0Var = new zzq0(16.0f, 8.0f, 0.0f, 8.0f);
            tvx tvxVarB = gto1.B(1, b0kVar3, 3);
            cvx cvxVar4 = cbx.b(b0kVar3).b;
            uvx uvxVar = new uvx(0, (pgx) null, 2, zzq0Var, (zzq0) null, tvx.a(tvxVarB, 2.0f, 6), (hw61) null, 1, new p3v(48.0f), 83);
            boolean z = (i2 & 896) == 256;
            Object objT = b0kVar3.T();
            if (z || objT == fkj0.X) {
                objT = new ugj(function0, (byte) 2);
                b0kVar3.s0(objT);
            }
            Function0 function1 = (Function0) objT;
            if (ihc1.y0("Navigate to concert campaign")) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            } else {
                b0kVar2 = b0kVar3;
                jto1.b(qim0VarF, uvxVar, (max) null, false, (idn0) null, (ga80) null, new gbx(new y50("Navigate to concert campaign"), function1), (gbx) null, (xu30) null, apo.r(-494516390, new cek(bekVar, (byte) 0), b0kVar3), (xu30) null, apo.r(-1988850375, new cek(bekVar, (byte) 1), b0kVar3), apo.r(-2123433064, new ac8(bekVar, (byte) 5), b0kVar3), (xu30) null, (xu30) null, apo.r(1767786165, new cek(bekVar, (byte) 2), b0kVar3), b0kVar2, 805306432, 197040, 26044);
                qim0Var2 = qim0Var3;
            }
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new mzj(bekVar, function0, qim0Var2, i, (byte) 7);
        }
    }
}
