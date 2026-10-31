package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class xy30 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Function0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xy30(Function0 function0, boolean z, byte b) {
        super(3);
        this.a = b;
        this.c = function0;
        this.b = z;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        Function0 function0 = this.c;
        boolean z = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                idx idxVar = new idx(4);
                jax haxVar = z ? jax.a : new hax("Try again unavailable");
                if (ihc1.y0("Try again")) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return null;
                }
                foo1.c(new gbx(new y50("Try again"), function0), idxVar, null, haxVar, null, null, null, null, null, null, aqi.a, b0kVar, 0, 48, 2028);
                return rih1Var;
            case 1:
                ((Number) obj3).intValue();
                x340 x340Var = (b0k) obj2;
                x340Var.i0(179187331);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                cvx cvxVar2 = cbx.b(x340Var).b;
                qim0 qim0VarN = anm1.N("jam-toggle-element-row", ((qim0) obj).then(uyn1.A(nim0Var, cbx.b(x340Var).b.a, 12.0f, cbx.b(x340Var).b.a, 4.0f)));
                boolean zH = x340Var.h(z) | x340Var.g(function0);
                Object objT = x340Var.T();
                if (zH || objT == fkj0.X) {
                    objT = new zt2(z, function0, (byte) 5);
                    x340Var.s0(objT);
                }
                qim0 qim0VarB = s161.b(qim0VarN, true, (iu30) objT);
                x340Var.r(false);
                return qim0VarB;
            case 2:
                x340 x340Var2 = (b0k) obj2;
                ((Number) obj3).intValue();
                if (z) {
                    x340 x340Var3 = x340Var2;
                    x340Var3.i0(-1960198668);
                    String strO0 = cwl1.o0(x340Var3, 2131963259);
                    boolean zG = x340Var3.g(function0);
                    Object objT2 = x340Var3.T();
                    if (zG || objT2 == fkj0.X) {
                        objT2 = new aba0(function0, (byte) 27);
                        x340Var3.s0(objT2);
                    }
                    Function0 function1 = (Function0) objT2;
                    if (ihc1.y0(strO0)) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        return null;
                    }
                    wro1.h(new gbx(new y50(strO0), function1), ldx.c, null, null, null, null, false, null, null, mxi.h, x340Var3, 0, 6, 1020);
                    x340Var3.r(false);
                } else {
                    x340 x340Var4 = x340Var2;
                    x340Var4.i0(-1959715285);
                    x340Var4.r(false);
                }
                return rih1Var;
            case 3:
                ifh0 ifh0Var = (ifh0) obj;
                afh0 afh0Var = (afh0) obj2;
                long j = ((hjl) obj3).a;
                int iI0 = ifh0Var.i0(((p3v) function0.invoke()).a);
                int i = z ? iI0 : 0;
                int i2 = iI0 + i;
                q5t0 q5t0VarH = afh0Var.H(jjl.j(j, 0, -i2, 1));
                return ifh0Var.S(jjl.g(q5t0VarH.a, j), jjl.f(q5t0VarH.b + i2, j), b7x.a, new wb5(q5t0VarH, i, (byte) 15));
            case 4:
                ((Number) obj3).intValue();
                qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                x340 x340Var5 = (b0k) obj2;
                boolean zG2 = x340Var5.g(function0);
                Object objT3 = x340Var5.T();
                if (zG2 || objT3 == fkj0.X) {
                    objT3 = new sah1(function0, (byte) 25);
                    x340Var5.s0(objT3);
                }
                bbp1.a(bin.x(qim0VarF, this.b, null, null, null, (Function0) objT3, 14), x340Var5, 0);
                return rih1Var;
            default:
                x340 x340Var6 = (b0k) obj2;
                ((Number) obj3).intValue();
                qim0 qim0VarX = bin.x(dug.f(i1p1.q(u291.r(nim0Var, 28.0f), er31.a), u7h.f, d4o1.a), false, null, null, null, this.c, 15);
                gfh0 gfh0VarC = t1c.c(een.h, false);
                x340 x340Var7 = x340Var6;
                int iHashCode = Long.hashCode(x340Var7.T);
                xos0 xos0VarM = x340Var7.m();
                qim0 qim0VarE = zr7.E(x340Var6, qim0VarX);
                hzj.A.getClass();
                x340 x340Var8 = x340Var6;
                if (x340Var8.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var8.m0();
                if (x340Var8.S) {
                    x340Var8.l(hmb0.t1);
                } else {
                    x340Var8.v0();
                }
                nko1.H(gfh0VarC, x340Var6, y580.O0);
                nko1.H(xos0VarM, x340Var6, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var6, y580.R0);
                nko1.F(x340Var6);
                nko1.H(qim0VarE, x340Var6, y580.Y);
                spx spxVar = z ? spx.c : xpx.c;
                long j2 = u7h.b;
                uwr uwrVar2 = cbx.a;
                zov0 zov0Var = cbx.b(x340Var6).g;
                w0h1.a(spxVar, isl.a, u291.r(nim0Var, 16.0f), j2, 0L, false, x340Var6, 56, 48);
                x340Var8.r(true);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xy30(boolean z, Function0 function0, byte b) {
        super(3);
        this.a = b;
        this.b = z;
        this.c = function0;
    }
}
