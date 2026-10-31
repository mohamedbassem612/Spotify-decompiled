package p;

import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class w3q0 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ghm0 b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3q0(ghm0 ghm0Var, iu30 iu30Var, byte b) {
        super(3);
        this.a = b;
        switch (b) {
            case 1:
                this.b = ghm0Var;
                this.c = iu30Var;
                super(3);
                break;
            default:
                this.b = ghm0Var;
                this.c = iu30Var;
                break;
        }
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        n4k n4kVar = hmb0.t1;
        f36 f36Var = h36.c;
        iu30 iu30Var = this.c;
        ghm0 ghm0Var = this.b;
        nim0 nim0Var = nim0.a;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj2;
                ((Number) obj3).intValue();
                mbh mbhVarA = jbh.a(f36Var, een.P0, x340Var, 0);
                x340 x340Var2 = x340Var;
                int iHashCode = Long.hashCode(x340Var2.T);
                xos0 xos0VarM = x340Var2.m();
                qim0 qim0VarE = zr7.E(x340Var, nim0Var);
                hzj.A.getClass();
                x340 x340Var3 = x340Var;
                if (x340Var3.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var3.m0();
                if (x340Var3.S) {
                    x340Var3.l(n4kVar);
                } else {
                    x340Var3.v0();
                }
                nko1.H(mbhVarA, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, nim0Var);
                String strO0 = cwl1.o0(x340Var, 2131963393);
                uwr uwrVar = cbx.a;
                uwo1.e(strO0, qim0VarZ, cbx.d(x340Var).e, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2040);
                op71.g(x340Var, u291.r(nim0Var, 8.0f));
                rqo1.g(0, 0, x340Var, uyn1.z(0.0f, 8.0f, 1, u291.f(nim0Var, 1.0f)));
                x340Var3.i0(1242172981);
                Iterator it = ghm0Var.b.iterator();
                while (it.hasNext()) {
                    dug.a(0, cwl1.o0(x340Var, ((de60) it.next()).a), x340Var, (qim0) null);
                }
                x340Var3.r(false);
                op71.g(x340Var, u291.r(nim0Var, 16.0f));
                qim0 qim0VarZ2 = uyn1.z(16.0f, 0.0f, 2, nim0Var);
                String strO1 = cwl1.o0(x340Var, 2131963388);
                uwr uwrVar2 = cbx.a;
                uwo1.e(strO1, qim0VarZ2, cbx.d(x340Var).j, cbx.a(x340Var).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2032);
                op71.g(x340Var, u291.r(nim0Var, 24.0f));
                qim0 qim0VarZ3 = uyn1.z(24.0f, 0.0f, 2, nim0Var);
                String strO2 = cwl1.o0(x340Var, 2131963392);
                boolean zG = x340Var3.g(iu30Var);
                Object objT = x340Var3.T();
                if (zG || objT == fkj0.X) {
                    objT = new tro0(iu30Var, (byte) 23);
                    x340Var3.s0(objT);
                }
                Function0 function0 = (Function0) objT;
                if (ihc1.y0(strO2)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return null;
                }
                foo1.c(new gbx(new y50(strO2), function0), jdx.c, qim0VarZ3, (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(714761, new afm0((byte) 25, 2, false), x340Var), x340Var, 0, 48, 2040);
                x340Var3.r(true);
                return rih1Var;
            default:
                x340 x340Var4 = (b0k) obj2;
                ((Number) obj3).intValue();
                qim0 qim0VarZ4 = uyn1.z(16.0f, 0.0f, 2, uyn1.w(l6o1.H(u291.d(nim0Var, 1.0f), l6o1.C(0, 0, 1, x340Var4), false, 14), (vzq0) obj));
                mbh mbhVarA2 = jbh.a(f36Var, een.Q0, x340Var4, 0);
                x340 x340Var5 = x340Var4;
                int iHashCode2 = Long.hashCode(x340Var5.T);
                xos0 xos0VarM2 = x340Var5.m();
                qim0 qim0VarE2 = zr7.E(x340Var4, qim0VarZ4);
                hzj.A.getClass();
                x340 x340Var6 = x340Var4;
                if (x340Var6.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var6.m0();
                if (x340Var6.S) {
                    x340Var6.l(n4kVar);
                } else {
                    x340Var6.v0();
                }
                nko1.H(mbhVarA2, x340Var4, y580.O0);
                nko1.H(xos0VarM2, x340Var4, y580.N0);
                nko1.H(Integer.valueOf(iHashCode2), x340Var4, y580.R0);
                nko1.F(x340Var4);
                nko1.H(qim0VarE2, x340Var4, y580.Y);
                op71.g(x340Var4, u291.r(nim0Var, 16.0f));
                uwr uwrVar3 = cbx.a;
                long jA = cbx.a(x340Var4).a.a.a();
                cua cuaVar = cbx.b(x340Var4).f;
                ioo1.c(uyn1.z(0.0f, 16.0f, 1, u291.f(dug.f(nim0Var, jA, er31.b(8.0f)), 1.0f)), (pgx) null, ydx.a(loo1.v(x340Var4), 0.0f, 0.0f, new zzq0(0.0f, 0.0f, 0.0f, 0.0f), 23), (hw61) null, (max) null, (idn0) null, (ga80) null, (gbx) null, (gbx) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, apo.r(-160044323, new qsn0(ghm0Var, (byte) 16), x340Var4), x340Var4, 512, 1572864, 65530);
                op71.g(x340Var4, u291.r(nim0Var, 16.0f));
                long jA2 = cbx.a(x340Var4).a.a.a();
                cua cuaVar2 = cbx.b(x340Var4).f;
                ioo1.c(uyn1.z(0.0f, 16.0f, 1, u291.f(dug.f(nim0Var, jA2, er31.b(8.0f)), 1.0f)), (pgx) null, ydx.a(loo1.v(x340Var4), 0.0f, 0.0f, new zzq0(0.0f, 0.0f, 0.0f, 0.0f), 23), (hw61) null, (max) null, (idn0) null, (ga80) null, (gbx) null, (gbx) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, apo.r(-1568678572, new w3q0(ghm0Var, iu30Var, (byte) 0), x340Var4), x340Var4, 512, 1572864, 65530);
                op71.g(x340Var4, u291.r(nim0Var, 16.0f));
                x340Var6.r(true);
                return rih1Var;
        }
    }
}
