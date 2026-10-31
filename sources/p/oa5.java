package p;

import android.view.View;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class oa5 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Function0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oa5(Function0 function0) {
        super(3);
        this.a = (byte) 21;
        this.b = function0;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        n4k n4kVar = hmb0.t1;
        z50 z50Var = z50.c;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        Function0 function0 = this.b;
        switch (b) {
            case 0:
                qim0 qim0Var = (qim0) obj;
                ((Number) obj3).intValue();
                m4c m4cVar = fkj0.X;
                x340 x340Var = (b0k) obj2;
                x340Var.i0(1628834495);
                x340Var.i0(67991068);
                Object objT = x340Var.T();
                if (objT == m4cVar) {
                    objT = ktd.n(x340Var);
                }
                idn0 idn0Var = (idn0) objT;
                x340Var.r(false);
                boolean zD = x340Var.d(0.97f) | x340Var.d(0.8f);
                Object objT2 = x340Var.T();
                if (zD || objT2 == m4cVar) {
                    objT2 = new jtr((byte) 6);
                    x340Var.s0(objT2);
                }
                ga80 ga80Var = (ga80) objT2;
                boolean zG = x340Var.g(function0);
                Object objT3 = x340Var.T();
                if (zG || objT3 == m4cVar) {
                    objT3 = new lj2(function0, (byte) 4);
                    x340Var.s0(objT3);
                }
                qim0 qim0VarV = bin.v(qim0Var, idn0Var, ga80Var, false, (String) null, (pm31) null, (Function0) objT3, 28);
                x340Var.r(false);
                return qim0VarV;
            case 1:
                ye5 ye5Var = (ye5) obj;
                x340 x340Var2 = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= (iIntValue & 8) == 0 ? x340Var2.g(ye5Var) : x340Var2.i(ye5Var) ? 4 : 2;
                }
                x340 x340Var3 = x340Var2;
                if (x340Var3.Y(iIntValue & 1, (iIntValue & 19) != 18)) {
                    String strO0 = cwl1.o0(x340Var3, 2131961752);
                    boolean zG2 = x340Var3.g(function0);
                    Object objT4 = x340Var3.T();
                    if (zG2 || objT4 == fkj0.X) {
                        objT4 = new vj0(function0, (byte) 11);
                        x340Var3.s0(objT4);
                    }
                    vhg.b(ye5Var, strO0, "cache-limit-learn-more", (iu30) objT4);
                } else {
                    x340Var3.b0();
                }
                return rih1Var;
            case 2:
                x340 x340Var4 = (b0k) obj2;
                ((Number) obj3).intValue();
                qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var4).b;
                qim0 qim0VarX = uyn1.x(qim0VarF, 16.0f);
                gfh0 gfh0VarC = t1c.c(een.h, false);
                x340 x340Var5 = x340Var4;
                int iHashCode = Long.hashCode(x340Var5.T);
                xos0 xos0VarM = x340Var5.m();
                qim0 qim0VarE = zr7.E(x340Var4, qim0VarX);
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
                nko1.H(gfh0VarC, x340Var4, y580.O0);
                nko1.H(xos0VarM, x340Var4, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var4, y580.R0);
                nko1.F(x340Var4);
                nko1.H(qim0VarE, x340Var4, y580.Y);
                gdx gdxVarS = yla.s(x340Var4);
                ldx ldxVar = ldx.c;
                String strO1 = cwl1.o0(x340Var4, 2131954129);
                boolean zG3 = x340Var6.g(function0);
                Object objT5 = x340Var6.T();
                if (zG3 || objT5 == fkj0.X) {
                    objT5 = new ukf(function0, (byte) 25);
                    x340Var6.s0(objT5);
                }
                Function0 function1 = (Function0) objT5;
                if (ihc1.y0(strO1)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return null;
                }
                foo1.c(new gbx(new y50(strO1), function1), ldxVar, (qim0) null, (max) null, gdxVarS, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, rdi.c, x340Var4, 0, 48, 2012);
                x340Var6.r(true);
                return rih1Var;
            case 3:
                qim0 qim0Var2 = (qim0) obj;
                ((Number) obj3).intValue();
                Object obj4 = fkj0.X;
                x340 x340Var7 = (b0k) obj2;
                x340Var7.i0(94043935);
                View view = (View) x340Var7.k(AndroidCompositionLocals_androidKt.f);
                float fG = ((e8k1) x340Var7.k(t4k.t)).g();
                boolean zG4 = x340Var7.g(view);
                Object objT6 = x340Var7.T();
                if (zG4 || objT6 == obj4) {
                    objT6 = new xy2(view, (byte) 5);
                    x340Var7.s0(objT6);
                }
                iu30 iu30Var = (iu30) objT6;
                boolean zG5 = x340Var7.g(iu30Var) | x340Var7.d(fG) | x340Var7.g(function0);
                Object objT7 = x340Var7.T();
                if (zG5 || objT7 == obj4) {
                    objT7 = new oxl(iu30Var, fG, function0, (byte) 0);
                    x340Var7.s0(objT7);
                }
                qim0 qim0VarB = f8d1.b(qim0Var2, rih1Var, (PointerInputEventHandler) objT7);
                x340Var7.r(false);
                return qim0VarB;
            case 4:
                ((Number) obj3).intValue();
                x340 x340Var8 = (b0k) obj2;
                boolean zG6 = x340Var8.g(function0);
                Object objT8 = x340Var8.T();
                if (zG6 || objT8 == fkj0.X) {
                    objT8 = new j3n(function0, (byte) 29);
                    x340Var8.s0(objT8);
                }
                wro1.h(new gbx(z50Var, (Function0) objT8), ldx.c, (qim0) null, (max) null, (gdx) null, (vzq0) null, false, (idn0) null, (ga80) null, zii.c, x340Var8, 0, 6, 1020);
                return rih1Var;
            case 5:
                ((Number) obj3).intValue();
                x340 x340Var9 = (b0k) obj2;
                boolean zG7 = x340Var9.g(function0);
                Object objT9 = x340Var9.T();
                if (zG7 || objT9 == fkj0.X) {
                    objT9 = new xet(function0, (byte) 1);
                    x340Var9.s0(objT9);
                }
                af5 af5VarY = wmo1.y(2131958269, 2131958268, "privacy_policy", (zma1) null, (iu30) objT9, x340Var9, 8);
                uwr uwrVar2 = cbx.a;
                uwo1.d(af5VarY, cbx.a(x340Var9).b.b, uyn1.A(nim0Var, 24.0f, 24.0f, 24.0f, 48.0f), cbx.d(x340Var9).j, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, (cqs0) null, x340Var9, 0, 0, 4064);
                return rih1Var;
            case 6:
                ((Number) obj3).intValue();
                ey00.d(0, 2, function0, (b0k) obj2, (qim0) null);
                return rih1Var;
            case 7:
                ((Number) obj3).intValue();
                x340 x340Var10 = (b0k) obj2;
                boolean zG8 = x340Var10.g(function0);
                Object objT10 = x340Var10.T();
                if (zG8 || objT10 == fkj0.X) {
                    objT10 = new in00(function0, (byte) 5);
                    x340Var10.s0(objT10);
                }
                wro1.h(new gbx(z50Var, (Function0) objT10), ldx.c, (qim0) null, (max) null, (gdx) null, (vzq0) null, false, (idn0) null, (ga80) null, rni.b, x340Var10, 0, 6, 1020);
                return rih1Var;
            case 8:
                function0.invoke();
                return rih1Var;
            case 9:
                x340 x340Var11 = (b0k) obj2;
                ((Number) obj3).intValue();
                qim0 qim0VarW = uyn1.w(u291.d(nim0Var, 1.0f), (vzq0) obj);
                gfh0 gfh0VarC2 = t1c.c(een.h, false);
                x340 x340Var12 = x340Var11;
                int iHashCode2 = Long.hashCode(x340Var12.T);
                xos0 xos0VarM2 = x340Var12.m();
                qim0 qim0VarE2 = zr7.E(x340Var11, qim0VarW);
                hzj.A.getClass();
                x340 x340Var13 = x340Var11;
                if (x340Var13.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var13.m0();
                if (x340Var13.S) {
                    x340Var13.l(n4kVar);
                } else {
                    x340Var13.v0();
                }
                nko1.H(gfh0VarC2, x340Var11, y580.O0);
                nko1.H(xos0VarM2, x340Var11, y580.N0);
                nko1.H(Integer.valueOf(iHashCode2), x340Var11, y580.R0);
                nko1.F(x340Var11);
                nko1.H(qim0VarE2, x340Var11, y580.Y);
                foo1.c(new gbx(z50Var, function0), new idx(4), (qim0) null, (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, qxi.c, x340Var11, 0, 48, 2044);
                x340Var13.r(true);
                return rih1Var;
            case 10:
                x340 x340Var14 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                x340 x340Var15 = x340Var14;
                if (x340Var15.Y(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    ldx ldxVar2 = ldx.c;
                    gdx gdxVarS2 = yla.s(x340Var15);
                    String strO2 = cwl1.o0(x340Var15, 2131957297);
                    if (ihc1.y0(strO2)) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        return null;
                    }
                    wro1.h(new gbx(new y50(strO2), function0), ldxVar2, (qim0) null, (max) null, gdxVarS2, (vzq0) null, false, (idn0) null, (ga80) null, szi.a, x340Var15, 48, 6, 988);
                } else {
                    x340Var15.b0();
                }
                return rih1Var;
            case 11:
                x340 x340Var16 = (b0k) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                x340 x340Var17 = x340Var16;
                if (x340Var17.Y(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    hqn1.a(0, function0, x340Var17, (qim0) null);
                } else {
                    x340Var17.b0();
                }
                return rih1Var;
            case 12:
                x340 x340Var18 = (b0k) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                x340 x340Var19 = x340Var18;
                if (x340Var19.Y(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    hqn1.a(0, function0, x340Var19, (qim0) null);
                } else {
                    x340Var19.b0();
                }
                return rih1Var;
            case 13:
                ((Number) obj3).intValue();
                x340 x340Var20 = (b0k) obj2;
                boolean zG9 = x340Var20.g(function0);
                Object objT11 = x340Var20.T();
                if (zG9 || objT11 == fkj0.X) {
                    objT11 = new kek0(function0, (byte) 9);
                    x340Var20.s0(objT11);
                }
                ha71.k((Function0) objT11, x340Var20, 0);
                return rih1Var;
            case 14:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                foo1.c(new gbx(z50Var, function0), jdx.c, (qim0) null, (max) null, yla.s(b0kVar), (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, f5j.a, b0kVar, 0, 48, 2012);
                return rih1Var;
            case 15:
                ((Number) obj3).intValue();
                x340 x340Var21 = (b0k) obj2;
                boolean zG10 = x340Var21.g(function0);
                Object objT12 = x340Var21.T();
                if (zG10 || objT12 == fkj0.X) {
                    objT12 = new isr0(function0, (byte) 2);
                    x340Var21.s0(objT12);
                }
                wro1.h(new gbx(z50Var, (Function0) objT12), ldx.c, (qim0) null, (max) null, (gdx) null, (vzq0) null, false, (idn0) null, (ga80) null, w5j.b, x340Var21, 0, 6, 1020);
                return rih1Var;
            case 16:
                x340 x340Var22 = (b0k) obj2;
                ((Number) obj3).intValue();
                qim0 qim0VarN = anm1.N("people-bottom-sheet-context-menu", nim0Var);
                uwr uwrVar3 = cbx.a;
                cvx cvxVar2 = cbx.b(x340Var22).b;
                qim0 qim0VarD = eqr0.D(12.0f, 0.0f, 2, qim0VarN);
                String strO3 = cwl1.o0(x340Var22, 2131963600);
                x340 x340Var23 = x340Var22;
                boolean zG11 = x340Var23.g(function0);
                Object objT13 = x340Var23.T();
                if (zG11 || objT13 == fkj0.X) {
                    objT13 = new isr0(function0, (byte) 10);
                    x340Var23.s0(objT13);
                }
                Function0 function2 = (Function0) objT13;
                if (ihc1.y0(strO3)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return null;
                }
                wro1.h(new gbx(new y50(strO3), function2), ldx.c, qim0VarD, (max) null, (gdx) null, (vzq0) null, false, (idn0) null, (ga80) null, z6j.c, x340Var23, 0, 6, 1016);
                return rih1Var;
            case 17:
                x340 x340Var24 = (b0k) obj2;
                ((Number) obj3).intValue();
                qim0 qim0VarN2 = anm1.N("people-bottom-sheet-context-menu", nim0Var);
                uwr uwrVar4 = cbx.a;
                cvx cvxVar3 = cbx.b(x340Var24).b;
                qim0 qim0VarD2 = eqr0.D(12.0f, 0.0f, 2, qim0VarN2);
                String strO4 = cwl1.o0(x340Var24, 2131963625);
                x340 x340Var25 = x340Var24;
                boolean zG12 = x340Var25.g(function0);
                Object objT14 = x340Var25.T();
                if (zG12 || objT14 == fkj0.X) {
                    objT14 = new isr0(function0, (byte) 11);
                    x340Var25.s0(objT14);
                }
                Function0 function3 = (Function0) objT14;
                if (ihc1.y0(strO4)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return null;
                }
                wro1.h(new gbx(new y50(strO4), function3), ldx.c, qim0VarD2, (max) null, (gdx) null, (vzq0) null, false, (idn0) null, (ga80) null, z6j.d, x340Var25, 0, 6, 1016);
                return rih1Var;
            case 18:
                x340 x340Var26 = (b0k) obj2;
                ((Number) obj3).intValue();
                d36 d36Var = new d36(2.0f, true, new um5(false));
                era eraVar = een.P0;
                mbh mbhVarA = jbh.a(d36Var, eraVar, x340Var26, 0);
                x340 x340Var27 = x340Var26;
                int iHashCode3 = Long.hashCode(x340Var27.T);
                xos0 xos0VarM3 = x340Var27.m();
                qim0 qim0VarE3 = zr7.E(x340Var26, nim0Var);
                hzj.A.getClass();
                x340 x340Var28 = x340Var26;
                if (x340Var28.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var28.m0();
                if (x340Var28.S) {
                    x340Var28.l(n4kVar);
                } else {
                    x340Var28.v0();
                }
                llj lljVar = y580.O0;
                nko1.H(mbhVarA, x340Var26, lljVar);
                llj lljVar2 = y580.N0;
                nko1.H(xos0VarM3, x340Var26, lljVar2);
                Integer numValueOf = Integer.valueOf(iHashCode3);
                llj lljVar3 = y580.R0;
                nko1.H(numValueOf, x340Var26, lljVar3);
                nko1.F(x340Var26);
                llj lljVar4 = y580.Y;
                nko1.H(qim0VarE3, x340Var26, lljVar4);
                jw31 jw31VarA = ew31.a(new d36(4.0f, true, new g21(eraVar, (byte) 29)), een.N0, x340Var26, 0);
                int iHashCode4 = Long.hashCode(x340Var28.T);
                xos0 xos0VarM4 = x340Var28.m();
                qim0 qim0VarE4 = zr7.E(x340Var26, nim0Var);
                x340Var28.m0();
                if (x340Var28.S) {
                    x340Var28.l(n4kVar);
                } else {
                    x340Var28.v0();
                }
                nko1.H(jw31VarA, x340Var26, lljVar);
                nko1.H(xos0VarM4, x340Var26, lljVar2);
                i3a.l(iHashCode4, x340Var26, lljVar3, x340Var26);
                nko1.H(qim0VarE4, x340Var26, lljVar4);
                eox eoxVar = eox.c;
                uwr uwrVar5 = cbx.a;
                long j = cbx.a(x340Var26).b.a;
                zov0 zov0Var = cbx.b(x340Var26).g;
                w0h1.a(eoxVar, isl.a, u291.r(nim0Var, 12.0f), j, 0L, false, x340Var26, eox.d | 48, 48);
                uwo1.e(cwl1.o0(x340Var26, 2131959753), (qim0) null, cbx.d(x340Var26).j, cbx.a(x340Var26).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var26, 0, 0, 2034);
                x340Var28.r(true);
                String strO5 = cwl1.o0(x340Var26, 2131959755);
                lee1 lee1Var = cbx.d(x340Var26).k;
                long j2 = cbx.a(x340Var26).b.c;
                qim0 qim0VarN3 = anm1.N("pip_setting_element_navigate_to_os_pip_link", nim0Var);
                boolean zG13 = x340Var28.g(function0);
                Object objT15 = x340Var28.T();
                if (zG13 || objT15 == fkj0.X) {
                    objT15 = new isr0(function0, (byte) 16);
                    x340Var28.s0(objT15);
                }
                uwo1.e(strO5, bin.x(qim0VarN3, false, (String) null, (pm31) null, (idn0) null, (Function0) objT15, 15), lee1Var, j2, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var26, 0, 0, 2032);
                x340Var28.r(true);
                return rih1Var;
            case 19:
                lro1.a((g2c) obj, function0, (b0k) obj2, ((Number) obj3).intValue() & 14);
                return rih1Var;
            case 20:
                b0k b0kVar2 = (b0k) obj2;
                ((Number) obj3).intValue();
                uwr uwrVar6 = cbx.a;
                cvx cvxVar4 = cbx.b(b0kVar2).b;
                f2p1.l(0, function0, b0kVar2, anm1.N("reflection_submit_button", uyn1.B(nim0.a, 8.0f, 0.0f, 0.0f, 0.0f, 14)));
                return rih1Var;
            case 21:
                x340 x340Var29 = (b0k) obj2;
                ((Number) obj3).intValue();
                m4c m4cVar2 = fkj0.X;
                String strO6 = cwl1.o0(x340Var29, 2131963230);
                uwr uwrVar7 = cbx.a;
                long j3 = ((yex) zex.a.d).d;
                x340 x340Var30 = x340Var29;
                boolean zG14 = x340Var30.g(function0);
                Object objT16 = x340Var30.T();
                if (zG14 || objT16 == m4cVar2) {
                    objT16 = new us21(function0, (byte) 0);
                    x340Var30.s0(objT16);
                }
                Function0 function4 = (Function0) objT16;
                if (ihc1.y0(strO6)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return null;
                }
                gbx gbxVar = new gbx(new y50(strO6), function4);
                boolean zF = x340Var30.f(j3);
                Object objT17 = x340Var30.T();
                if (zF || objT17 == m4cVar2) {
                    objT17 = new q9j0((byte) 17, j3);
                    x340Var30.s0(objT17);
                }
                poo1.e(gbxVar, new oex(0, (vu30) null, (vu30) objT17, (vu30) null, 11), yoo1.z(x340Var30), anm1.N("reshuffle_button", u291.x(0.0f, dsa0.m(x340Var30, 2131165398), 1, nim0Var)), 0, (String) null, (max) null, (vu30) null, (vu30) null, (idn0) null, (ga80) null, false, yoo1.y(x340Var30).a, apo.r(1092469513, new p9y0(strO6, (byte) 27), x340Var30), x340Var30, 0, 3072, 4080);
                return rih1Var;
            case 22:
                x340 x340Var31 = (b0k) obj2;
                ((Number) obj3).intValue();
                uwr uwrVar8 = cbx.a;
                cvx cvxVar5 = cbx.b(x340Var31).b;
                cr31 cr31Var = er31.a;
                nim0 nim0Var2 = nim0.a;
                qim0 qim0VarO = sto1.o(nim0Var2, 12.0f, cr31Var, false, 0L, 0L, 24);
                gfh0 gfh0VarC3 = t1c.c(een.d, false);
                x340 x340Var32 = x340Var31;
                int iHashCode5 = Long.hashCode(x340Var32.T);
                xos0 xos0VarM5 = x340Var32.m();
                qim0 qim0VarE5 = zr7.E(x340Var31, qim0VarO);
                hzj.A.getClass();
                x340 x340Var33 = x340Var31;
                if (x340Var33.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var33.m0();
                if (x340Var33.S) {
                    x340Var33.l(n4kVar);
                } else {
                    x340Var33.v0();
                }
                nko1.H(gfh0VarC3, x340Var31, y580.O0);
                nko1.H(xos0VarM5, x340Var31, y580.N0);
                nko1.H(Integer.valueOf(iHashCode5), x340Var31, y580.R0);
                nko1.F(x340Var31);
                nko1.H(qim0VarE5, x340Var31, y580.Y);
                String strO7 = cwl1.o0(x340Var31, 2131958332);
                boolean zG15 = x340Var33.g(function0);
                Object objT18 = x340Var33.T();
                if (zG15 || objT18 == fkj0.X) {
                    objT18 = new us21(function0, (byte) 16);
                    x340Var33.s0(objT18);
                }
                Function0 function5 = (Function0) objT18;
                if (ihc1.y0(strO7)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return null;
                }
                wro1.h(new gbx(new y50(strO7), function5), new idx(6), anm1.N("martini-scroll-to-bottom-button", nim0Var2), (max) null, (gdx) null, (vzq0) null, false, (idn0) null, (ga80) null, nej.a, x340Var31, 0, 6, 1016);
                x340Var33.r(true);
                return rih1Var;
            default:
                ((Number) obj3).intValue();
                qim0 qim0VarD3 = u291.d(nim0Var, 1.0f);
                uwr uwrVar9 = cbx.a;
                qim0 qim0VarF2 = dug.f(qim0VarD3, ((vex) zex.a.e).f, d4o1.a);
                x340 x340Var34 = (b0k) obj2;
                boolean zG16 = x340Var34.g(function0);
                Object objT19 = x340Var34.T();
                if (zG16 || objT19 == fkj0.X) {
                    objT19 = new f110(function0, (byte) 2);
                    x340Var34.s0(objT19);
                }
                t1c.a(f8d1.b(qim0VarF2, rih1Var, (PointerInputEventHandler) objT19), x340Var34, 0);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oa5(Function0 function0, byte b) {
        super(3);
        this.a = b;
        this.b = function0;
    }
}
