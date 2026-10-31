package p;

import android.os.Build;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class epe0 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ epe0(byte b, boolean z) {
        super(3);
        this.a = b;
        this.b = z;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j;
        n8b1 n8b1VarK;
        n8b1 n8b1VarK2;
        byte b = this.a;
        qim0 qim0VarA = nim0.a;
        rih1 rih1Var = rih1.a;
        boolean z = this.b;
        switch (b) {
            case 0:
                qim0 qim0VarC = (qim0) obj;
                ((Number) obj3).intValue();
                x340 x340Var = (b0k) obj2;
                x340Var.i0(1180299338);
                tob1 tob1VarB = z95.b((!z || Build.VERSION.SDK_INT < 31) ? 0.0f : 12.0f, irn1.o0(200, 0, (dlv) null, 6), "blurRadius", (iu30) null, x340Var, 3072, 20);
                if (((Number) tob1VarB.getValue()).floatValue() <= 0.0f || Build.VERSION.SDK_INT < 31) {
                    x340Var.i0(-599079350);
                    x340Var.r(false);
                } else {
                    x340Var.i0(-599322142);
                    boolean zI = x340Var.i(tob1VarB);
                    Object objT = x340Var.T();
                    if (zI || objT == fkj0.X) {
                        objT = new dpe0(tob1VarB);
                        x340Var.s0(objT);
                    }
                    qim0VarC = i541.C(qim0VarC, (iu30) objT);
                    x340Var.r(false);
                }
                x340Var.r(false);
                return qim0VarC;
            case 1:
                x340 x340Var2 = (b0k) obj2;
                ((Number) obj3).intValue();
                uwr uwrVar = cbx.a;
                zov0 zov0Var = cbx.b(x340Var2).g;
                if (z) {
                    x340 x340Var3 = x340Var2;
                    x340Var3.i0(-99356176);
                    w0h1.a(ilx.c, isl.a, u291.r(qim0VarA, 24.0f), cbx.a(x340Var3).b.c, 0L, false, x340Var3, ilx.d | 48, 48);
                    x340Var3.r(false);
                } else {
                    x340 x340Var4 = x340Var2;
                    x340Var4.i0(-99134898);
                    op71.g(x340Var4, u291.r(qim0VarA, 24.0f));
                    x340Var4.r(false);
                }
                return rih1Var;
            case 2:
                x340 x340Var5 = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    mlx mlxVar = mlx.c;
                    jsl jslVar = new jsl(cwl1.o0(x340Var6, z ? 2131957268 : 2131957284));
                    uwr uwrVar2 = cbx.a;
                    long j2 = cbx.a(x340Var6).b.b;
                    zov0 zov0Var2 = cbx.b(x340Var6).g;
                    w0h1.a(mlxVar, jslVar, k1u.u(u291.r(qim0VarA, 16.0f), z ? 180.0f : 0.0f), j2, 0L, false, x340Var6, mlx.d, 48);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 3:
                x340 x340Var7 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    klx klxVar = z ? klx.c : irx.c;
                    if (z) {
                        x340Var8.i0(-366695425);
                        uwr uwrVar3 = cbx.a;
                        j = cbx.a(x340Var8).b.f;
                    } else {
                        x340Var8.i0(-366694309);
                        uwr uwrVar4 = cbx.a;
                        j = cbx.a(x340Var8).b.a;
                    }
                    x340Var8.r(false);
                    w0h1.a(klxVar, isl.a, (qim0) null, j, 0L, false, x340Var8, 56, 52);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 4:
                qim0 qim0Var = (qim0) obj;
                ((Number) obj3).intValue();
                x340 x340Var9 = (b0k) obj2;
                x340Var9.i0(-358649921);
                float f = z ? 1.0f : 0.0f;
                if (z) {
                    x340Var9.i0(-1065185137);
                    uwr uwrVar5 = cbx.a;
                    xpv0 xpv0Var = cbx.c(x340Var9).c;
                    n8b1VarK = irn1.l0(pto1.q(1200, 2, 160.0f), 1200.0f, (Object) null, 4);
                    x340Var9.r(false);
                } else {
                    x340Var9.i0(-1065183472);
                    uwr uwrVar6 = cbx.a;
                    xpv0 xpv0Var2 = cbx.c(x340Var9).c;
                    n8b1VarK = xpv0.k();
                    x340Var9.r(false);
                }
                qim0 qim0VarK = d9y0.k(qim0Var, ((Number) z95.b(f, n8b1VarK, "alpha", (iu30) null, x340Var9, 3072, 20).getValue()).floatValue());
                x340Var9.r(false);
                return qim0VarK;
            case 5:
                qim0 qim0Var2 = (qim0) obj;
                ((Number) obj3).intValue();
                x340 x340Var10 = (b0k) obj2;
                x340Var10.i0(-424709162);
                float f2 = z ? 96.0f : 0.0f;
                if (z) {
                    x340Var10.i0(-123606202);
                    uwr uwrVar7 = cbx.a;
                    xpv0 xpv0Var3 = cbx.c(x340Var10).c;
                    n8b1VarK2 = irn1.l0(pto1.q(1200, 2, 160.0f), 1200.0f, (Object) null, 4);
                    x340Var10.r(false);
                } else {
                    x340Var10.i0(-123604537);
                    uwr uwrVar8 = cbx.a;
                    xpv0 xpv0Var4 = cbx.c(x340Var10).c;
                    n8b1VarK2 = xpv0.k();
                    x340Var10.r(false);
                }
                qim0 qim0VarH = u291.h(qim0Var2, ((p3v) z95.a(f2, n8b1VarK2, "height", x340Var10, 384, 8).getValue()).a);
                x340Var10.r(false);
                return qim0VarH;
            case 6:
                x340 x340Var11 = (b0k) obj2;
                ((Number) obj3).intValue();
                if (z) {
                    x340 x340Var12 = x340Var11;
                    x340Var12.i0(1993014339);
                    upn1.a(qkm1.b, (qim0) null, (String) null, x340Var12, 0, 6);
                    x340Var12.r(false);
                } else {
                    x340 x340Var13 = x340Var11;
                    x340Var13.i0(1993068868);
                    upn1.a(qkm1.a, (qim0) null, (String) null, x340Var13, 0, 6);
                    x340Var13.r(false);
                }
                return rih1Var;
            case 7:
                ((Number) obj3).intValue();
                m4c m4cVar = fkj0.X;
                x340 x340Var14 = (b0k) obj2;
                x340Var14.i0(-457845937);
                ven0 ven0VarS = v8r.s(Boolean.valueOf(z), x340Var14);
                if (z) {
                    x340Var14.i0(1127930160);
                    Object objT2 = x340Var14.T();
                    if (objT2 == m4cVar) {
                        objT2 = mmp0.U0;
                        x340Var14.s0(objT2);
                    }
                    qim0VarA = s161.a(qim0VarA, (iu30) objT2);
                    x340Var14.r(false);
                } else {
                    x340Var14.i0(1128031933);
                    x340Var14.r(false);
                }
                boolean zI2 = x340Var14.i(ven0VarS);
                Object objT3 = x340Var14.T();
                if (zI2 || objT3 == m4cVar) {
                    objT3 = new p6b(ven0VarS, (byte) 6);
                    x340Var14.s0(objT3);
                }
                qim0 qim0VarB = f8d1.b(qim0VarA, rih1Var, (PointerInputEventHandler) objT3);
                x340Var14.r(false);
                return qim0VarB;
            case 8:
                x340 x340Var15 = (b0k) obj2;
                ((Number) obj3).intValue();
                if (z) {
                    x340 x340Var16 = x340Var15;
                    x340Var16.i0(1035888272);
                    ilx ilxVar = ilx.c;
                    uwr uwrVar9 = cbx.a;
                    w0h1.a(ilxVar, isl.a, anm1.N("selected_check", qim0VarA), 0L, cbx.a(x340Var16).b.c, true, x340Var16, ilx.d | 196656, 8);
                    x340Var16.r(false);
                } else {
                    x340 x340Var17 = x340Var15;
                    x340Var17.i0(1036134536);
                    x340Var17.r(false);
                }
                return rih1Var;
            case 9:
                x340 x340Var18 = (b0k) obj2;
                ((Number) obj3).intValue();
                if (z) {
                    x340 x340Var19 = x340Var18;
                    x340Var19.i0(-1737101966);
                    ilx ilxVar2 = ilx.c;
                    uwr uwrVar10 = cbx.a;
                    w0h1.a(ilxVar2, isl.a, anm1.N("selected_check", qim0VarA), 0L, cbx.a(x340Var19).b.c, true, x340Var19, ilx.d | 196656, 8);
                    x340Var19.r(false);
                } else {
                    x340 x340Var20 = x340Var18;
                    x340Var20.i0(-1736855702);
                    x340Var20.r(false);
                }
                return rih1Var;
            case 10:
                x340 x340Var21 = (b0k) obj2;
                ((Number) obj3).intValue();
                if (z) {
                    x340 x340Var22 = x340Var21;
                    x340Var22.i0(495909377);
                    ilx ilxVar3 = ilx.c;
                    uwr uwrVar11 = cbx.a;
                    w0h1.a(ilxVar3, isl.a, anm1.N("selected_check", qim0VarA), 0L, cbx.a(x340Var22).b.c, true, x340Var22, ilx.d | 196656, 8);
                    x340Var22.r(false);
                } else {
                    x340 x340Var23 = x340Var21;
                    x340Var23.i0(496175822);
                    x340Var23.r(false);
                }
                return rih1Var;
            case 11:
                x340 x340Var24 = (b0k) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                x340 x340Var25 = x340Var24;
                if (x340Var25.Y(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    ilx ilxVar4 = ilx.c;
                    uwr uwrVar12 = cbx.a;
                    w0h1.a(ilxVar4, isl.a, d9y0.k(qim0VarA, z ? 1.0f : 0.0f), cbx.a(x340Var25).b.c, 0L, false, x340Var25, ilx.d | 48, 48);
                } else {
                    x340Var25.b0();
                }
                return rih1Var;
            case 12:
                x340 x340Var26 = (b0k) obj2;
                ((Number) obj3).intValue();
                qim0 qim0VarA2 = ((g2c) obj).a(qim0VarA, een.i);
                gfh0 gfh0VarC = t1c.c(een.d, false);
                x340 x340Var27 = x340Var26;
                int iHashCode = Long.hashCode(x340Var27.T);
                xos0 xos0VarM = x340Var27.m();
                qim0 qim0VarE = zr7.E(x340Var26, qim0VarA2);
                hzj.A.getClass();
                x340 x340Var28 = x340Var26;
                if (x340Var28.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var28.m0();
                if (x340Var28.S) {
                    x340Var28.l(hmb0.t1);
                } else {
                    x340Var28.v0();
                }
                nko1.H(gfh0VarC, x340Var26, y580.O0);
                nko1.H(xos0VarM, x340Var26, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var26, y580.R0);
                nko1.F(x340Var26);
                nko1.H(qim0VarE, x340Var26, y580.Y);
                nyx.a(2, (wux) null, apo.r(167964135, new k750((byte) 22, z), x340Var26), x340Var26, 3078, 6);
                x340Var28.r(true);
                return rih1Var;
            case 13:
                x340 x340Var29 = (b0k) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                x340 x340Var30 = x340Var29;
                if (x340Var30.Y(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    cev0.j(z, x340Var30, 0);
                } else {
                    x340Var30.b0();
                }
                return rih1Var;
            case 14:
                wro1.D((nbh) obj, z, (b0k) obj2, ((Number) obj3).intValue() & 14);
                return rih1Var;
            default:
                qim0 qim0Var3 = (qim0) obj;
                ((Number) obj3).intValue();
                x340 x340Var31 = (b0k) obj2;
                x340Var31.i0(-1718039959);
                Object objT4 = x340Var31.T();
                Object obj4 = fkj0.X;
                if (objT4 == obj4) {
                    objT4 = new ceo(0.0f, 0.0f, 0.0f, 1.0f);
                    x340Var31.s0(objT4);
                }
                ceo ceoVar = (ceo) objT4;
                wat watVar = (wat) x340Var31.k(t4k.h);
                boolean zG = x340Var31.g(watVar);
                Object objT5 = x340Var31.T();
                if (zG || objT5 == obj4) {
                    objT5 = Float.valueOf(watVar.X0(50.0f));
                    x340Var31.s0(objT5);
                }
                tob1 tob1VarB2 = z95.b(z ? 0.0f : ((Number) objT5).floatValue(), new pxg1(666, 83, ceoVar), "wrappedTitleTranslationYAnimation", (iu30) null, x340Var31, 3120, 20);
                tob1 tob1VarB3 = z95.b(z ? 1.0f : 0.0f, irn1.o0(0, 83, (dlv) null, 4), "wrappedTitleAlphaAnimation", (iu30) null, x340Var31, 3120, 20);
                boolean zG2 = x340Var31.g(tob1VarB2) | x340Var31.g(tob1VarB3);
                Object objT6 = x340Var31.T();
                if (zG2 || objT6 == obj4) {
                    objT6 = new dy(tob1VarB2, tob1VarB3, (byte) 14);
                    x340Var31.s0(objT6);
                }
                qim0 qim0VarC2 = i541.C(qim0Var3, (iu30) objT6);
                x340Var31.r(false);
                return qim0VarC2;
        }
    }
}
