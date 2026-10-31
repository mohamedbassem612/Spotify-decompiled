package p;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class p8e1 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p8e1(Object obj, Object obj2, Object obj3, byte b) {
        super(3);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [boolean, int] */
    public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
        mjh mjhVar;
        mjh mjhVar2;
        llj lljVar;
        ?? r7;
        boolean z;
        iu30 iu30Var;
        g2n1 g2n1Var;
        xtb0 xtb0Var;
        byte b = this.a;
        n4k n4kVar = hmb0.t1;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.b;
        Object obj5 = this.c;
        Object obj6 = this.d;
        switch (b) {
            case 0:
                b0k b0kVar = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                k8e1 k8e1Var = (k8e1) obj4;
                b0k b0kVar2 = (x340) b0kVar;
                if (b0kVar2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    qim0 qim0Var = nim0.a;
                    qim0 qim0VarD = u291.D(qim0Var, (era) null, 3);
                    String str = k8e1Var.d;
                    String str2 = k8e1Var.c;
                    String str3 = k8e1Var.b;
                    String str4 = k8e1Var.a;
                    qim0 qim0VarThen = qim0VarD.then(str.length() > 0 ? u291.b(0.0f, 40.0f, 1, qim0Var) : qim0Var);
                    mjh mjhVar3 = (mjh) obj5;
                    tob1 tob1Var = (tob1) obj6;
                    mbh mbhVarA = jbh.a(h36.e, een.Q0, b0kVar2, 54);
                    int iHashCode = Long.hashCode(((x340) b0kVar2).T);
                    xos0 xos0VarM = b0kVar2.m();
                    qim0 qim0VarE = zr7.E(b0kVar2, qim0VarThen);
                    hzj.A.getClass();
                    if (((x340) b0kVar2).a == null) {
                        tgp1.p();
                        throw null;
                    }
                    b0kVar2.m0();
                    if (((x340) b0kVar2).S) {
                        b0kVar2.l(n4kVar);
                    } else {
                        b0kVar2.v0();
                    }
                    nko1.H(mbhVarA, b0kVar2, y580.O0);
                    nko1.H(xos0VarM, b0kVar2, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), b0kVar2, y580.R0);
                    nko1.F(b0kVar2);
                    nko1.H(qim0VarE, b0kVar2, y580.Y);
                    if (ihc1.y0(str4)) {
                        mjhVar = mjhVar3;
                        b0kVar2.i0(-461216139);
                        b0kVar2.r(false);
                    } else {
                        b0kVar2.i0(-461455428);
                        uwr uwrVar = cbx.a;
                        lee1 lee1Var = cbx.d(b0kVar2).m;
                        long j = ((u7h) tob1Var.getValue()).a;
                        cvx cvxVar = cbx.b(b0kVar2).b;
                        mjhVar3.g(str4, lee1Var, j, uyn1.B(qim0Var, 0.0f, 0.0f, 0.0f, 2.0f, 7), b0kVar2, 0, 0);
                        mjhVar = mjhVar3;
                        b0kVar2.r(false);
                    }
                    if (ihc1.y0(str3)) {
                        mjhVar2 = mjhVar;
                        b0kVar2.i0(-460925483);
                        b0kVar2.r(false);
                    } else {
                        b0kVar2.i0(-461167655);
                        uwr uwrVar2 = cbx.a;
                        lee1 lee1Var2 = cbx.d(b0kVar2).h;
                        long j2 = ((u7h) tob1Var.getValue()).a;
                        cvx cvxVar2 = cbx.b(b0kVar2).b;
                        mjhVar2 = mjhVar;
                        mjhVar2.g(str3, lee1Var2, j2, uyn1.B(qim0Var, 0.0f, 0.0f, 0.0f, 2.0f, 7), b0kVar2, 0, 0);
                        b0kVar2.r(false);
                    }
                    if (ihc1.y0(str2)) {
                        b0kVar2.i0(-460768747);
                        b0kVar2.r(false);
                    } else {
                        b0kVar2.i0(-460878301);
                        uwr uwrVar3 = cbx.a;
                        mjhVar2.g(str2, cbx.d(b0kVar2).m, ((u7h) tob1Var.getValue()).a, null, b0kVar2, 0, 8);
                        b0kVar2.r(false);
                    }
                    b0kVar2.r(true);
                } else {
                    b0kVar2.b0();
                }
                return rih1Var;
            case 1:
                x340 x340Var = (b0k) obj2;
                ((Number) obj3).intValue();
                m4c m4cVar = fkj0.X;
                uwr uwrVar4 = cbx.a;
                cvx cvxVar3 = cbx.b(x340Var).b;
                d36 d36Var = new d36(8.0f, true, new um5(false));
                c380 c380Var = (c380) obj4;
                c380<zz1> c380Var2 = (c380) obj5;
                String str5 = (String) obj6;
                era eraVar = een.P0;
                mbh mbhVarA2 = jbh.a(d36Var, eraVar, x340Var, 0);
                x340 x340Var2 = x340Var;
                int iHashCode2 = Long.hashCode(x340Var2.T);
                xos0 xos0VarM2 = x340Var2.m();
                qim0 qim0VarE2 = zr7.E(x340Var, nim0Var);
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
                llj lljVar2 = y580.O0;
                nko1.H(mbhVarA2, x340Var, lljVar2);
                llj lljVar3 = y580.N0;
                nko1.H(xos0VarM2, x340Var, lljVar3);
                Integer numValueOf = Integer.valueOf(iHashCode2);
                llj lljVar4 = y580.R0;
                nko1.H(numValueOf, x340Var, lljVar4);
                nko1.F(x340Var);
                llj lljVar5 = y580.Y;
                nko1.H(qim0VarE2, x340Var, lljVar5);
                if (c380Var.isEmpty()) {
                    lljVar = lljVar4;
                    r7 = 0;
                    x340Var3.i0(-1937566795);
                    x340Var3.r(false);
                } else {
                    x340Var3.i0(-1938186640);
                    Object objT = x340Var3.T();
                    if (objT == m4cVar) {
                        objT = udf1.V0;
                        x340Var3.s0(objT);
                    }
                    qim0 qim0VarB = s161.b(nim0Var, true, (iu30) objT);
                    cvx cvxVar4 = cbx.b(x340Var).b;
                    lljVar = lljVar4;
                    mbh mbhVarA3 = jbh.a(new d36(8.0f, true, new um5(false)), eraVar, x340Var, 0);
                    int iHashCode3 = Long.hashCode(x340Var3.T);
                    xos0 xos0VarM3 = x340Var3.m();
                    qim0 qim0VarE3 = zr7.E(x340Var, qim0VarB);
                    x340Var3.m0();
                    if (x340Var3.S) {
                        x340Var3.l(n4kVar);
                    } else {
                        x340Var3.v0();
                    }
                    nko1.H(mbhVarA3, x340Var, lljVar2);
                    nko1.H(xos0VarM3, x340Var, lljVar3);
                    i3a.l(iHashCode3, x340Var, lljVar, x340Var);
                    nko1.H(qim0VarE3, x340Var, lljVar5);
                    uwo1.e(cwl1.o0(x340Var, 2131963333), (qim0) null, cbx.d(x340Var).k, cbx.a(x340Var).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2034);
                    uwo1.e(no80.A(c380Var, x340Var), (qim0) null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2034);
                    x340Var3.r(true);
                    r7 = 0;
                    x340Var3.r(false);
                }
                if (c380Var.isEmpty() || c380Var2.isEmpty()) {
                    x340Var3.i0(-1937362443);
                    x340Var3.r((boolean) r7);
                } else {
                    x340Var3.i0(-1937430674);
                    rqo1.g(6, (int) r7, x340Var, u291.f(nim0Var, 1.0f));
                    x340Var3.r((boolean) r7);
                }
                if (c380Var2.isEmpty()) {
                    z = true;
                    x340Var3.i0(-1935597675);
                    x340Var3.r(false);
                } else {
                    x340Var3.i0(-1937234258);
                    Object objT2 = x340Var3.T();
                    if (objT2 == m4cVar) {
                        objT2 = udf1.W0;
                        x340Var3.s0(objT2);
                    }
                    qim0 qim0VarB2 = s161.b(nim0Var, true, (iu30) objT2);
                    cvx cvxVar5 = cbx.b(x340Var).b;
                    mbh mbhVarA4 = jbh.a(new d36(8.0f, true, new um5(false)), eraVar, x340Var, 0);
                    int iHashCode4 = Long.hashCode(x340Var3.T);
                    xos0 xos0VarM4 = x340Var3.m();
                    qim0 qim0VarE4 = zr7.E(x340Var, qim0VarB2);
                    x340Var3.m0();
                    if (x340Var3.S) {
                        x340Var3.l(n4kVar);
                    } else {
                        x340Var3.v0();
                    }
                    nko1.H(mbhVarA4, x340Var, lljVar2);
                    nko1.H(xos0VarM4, x340Var, lljVar3);
                    i3a.l(iHashCode4, x340Var, lljVar, x340Var);
                    nko1.H(qim0VarE4, x340Var, lljVar5);
                    uwo1.e(cwl1.o0(x340Var, 2131963324), (qim0) null, cbx.d(x340Var).k, cbx.a(x340Var).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2034);
                    cvx cvxVar6 = cbx.b(x340Var).b;
                    mbh mbhVarA5 = jbh.a(new d36(12.0f, true, new um5(false)), eraVar, x340Var, 0);
                    int iHashCode5 = Long.hashCode(x340Var3.T);
                    xos0 xos0VarM5 = x340Var3.m();
                    qim0 qim0VarE5 = zr7.E(x340Var, nim0Var);
                    x340Var3.m0();
                    if (x340Var3.S) {
                        x340Var3.l(n4kVar);
                    } else {
                        x340Var3.v0();
                    }
                    nko1.H(mbhVarA5, x340Var, lljVar2);
                    nko1.H(xos0VarM5, x340Var, lljVar3);
                    i3a.l(iHashCode5, x340Var, lljVar, x340Var);
                    nko1.H(qim0VarE5, x340Var, lljVar5);
                    x340Var3.i0(-133813969);
                    for (zz1 zz1Var : c380Var2) {
                        c380<gm6> c380Var3 = zz1Var.b;
                        String strO0 = cwl1.o0(x340Var, 2131963325);
                        x340Var3.i0(-717931797);
                        ArrayList arrayList = new ArrayList(q7h.U(c380Var3, 10));
                        for (gm6 gm6Var : c380Var3) {
                            arrayList.add(String.format(strO0, Arrays.copyOf(new Object[]{gm6Var.a, no80.A(gm6Var.b, x340Var3)}, 2)));
                        }
                        x340Var3.r(false);
                        String strA = no80.A(mqo1.A(arrayList), x340Var3);
                        x340Var3.i0(-133808696);
                        ye5 ye5Var = new ye5();
                        uwr uwrVar5 = cbx.a;
                        int iO = ye5Var.o(lee1.a(cbx.d(x340Var).j, cbx.a(x340Var).b.a, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777214).a);
                        try {
                            ye5Var.g(zz1Var.a + ": ");
                            ye5Var.k(iO);
                            int iO2 = ye5Var.o(lee1.a(cbx.d(x340Var).j, cbx.a(x340Var).b.b, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777214).a);
                            try {
                                ye5Var.g(strA);
                                ye5Var.k(iO2);
                                af5 af5VarP = ye5Var.p();
                                x340Var3.r(false);
                                uwo1.f(af5VarP, (qim0) null, cbx.d(x340Var).j, (x9h) null, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, (cqs0) null, x340Var, 0, 0, 4090);
                            } catch (Throwable th) {
                                ye5Var.k(iO2);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            ye5Var.k(iO);
                            throw th2;
                        }
                    }
                    x340Var3.r(false);
                    x340Var3.r(true);
                    uwr uwrVar6 = cbx.a;
                    uwo1.e(str5, (qim0) null, cbx.d(x340Var).m, cbx.a(x340Var).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2034);
                    z = true;
                    x340Var3.r(true);
                    x340Var3.r(false);
                }
                x340Var3.r(z);
                return rih1Var;
            case 2:
                ((Number) obj3).intValue();
                csf1 csf1Var = (csf1) obj4;
                String str6 = csf1Var.a;
                boolean z2 = csf1Var.b;
                iu30 iu30Var2 = (iu30) obj5;
                x340 x340Var4 = (b0k) obj2;
                boolean zG = x340Var4.g(iu30Var2);
                Object objT3 = x340Var4.T();
                if (zG || objT3 == fkj0.X) {
                    objT3 = new b1c1(iu30Var2, (byte) 26);
                    x340Var4.s0(objT3);
                }
                bwp0.d(str6, z2, (iu30) objT3, (esf1) obj6, x340Var4, 0);
                return rih1Var;
            case 3:
                ((Number) obj3).intValue();
                leh1 leh1Var = (leh1) obj5;
                x340 x340Var5 = (b0k) obj2;
                int iB = p3v.b(s3v.b(((s3v) x340Var5.k(p4k.a)).a), 240.0f);
                et40 et40Var = et40.a;
                if (iB < 0) {
                    x340Var5.i0(1364281997);
                    fc11.g(ow31.a(et40Var), x340Var5, 0);
                    x340Var5.r(false);
                } else {
                    x340Var5.i0(1364378376);
                    o4p1.g(((Context) obj4).getString(2131959286), ow31.a(et40Var), kee1.a(nee1.c, leh1Var != null ? leh1Var.c : new hn20(abh.h), (TextUnit) null, (ka30) null, (zzd1) null, 126), 2, x340Var5, 3072, 0);
                    x340Var5.r(false);
                }
                lmt0.i(leh1Var != null ? leh1Var.e : new tw21(2131104087), 2131231053, (whb1) obj6, leh1Var != null ? leh1Var.d : null, x340Var5, 3072, 0);
                return rih1Var;
            case 4:
                x340 x340Var6 = (b0k) obj2;
                ((Number) obj3).intValue();
                qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                uwr uwrVar7 = cbx.a;
                cvx cvxVar7 = cbx.b(x340Var6).b;
                cvx cvxVar8 = cbx.b(x340Var6).b;
                qim0 qim0VarY = uyn1.y(qim0VarF, 16.0f, 8.0f);
                WeakHashMap weakHashMap = osl1.x;
                qim0 qim0VarY2 = too1.y(qim0VarY, lhc.g(x340Var6).e);
                ven0 ven0Var = (ven0) obj4;
                Function0 function0 = (Function0) obj5;
                Context context = (Context) obj6;
                mbh mbhVarA6 = jbh.a(h36.c, een.Q0, x340Var6, 0);
                x340 x340Var7 = x340Var6;
                int iHashCode6 = Long.hashCode(x340Var7.T);
                xos0 xos0VarM6 = x340Var7.m();
                qim0 qim0VarE6 = zr7.E(x340Var6, qim0VarY2);
                hzj.A.getClass();
                x340 x340Var8 = x340Var6;
                if (x340Var8.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var8.m0();
                if (x340Var8.S) {
                    x340Var8.l(n4kVar);
                } else {
                    x340Var8.v0();
                }
                nko1.H(mbhVarA6, x340Var6, y580.O0);
                nko1.H(xos0VarM6, x340Var6, y580.N0);
                nko1.H(Integer.valueOf(iHashCode6), x340Var6, y580.R0);
                nko1.F(x340Var6);
                nko1.H(qim0VarE6, x340Var6, y580.Y);
                boolean zI = x340Var8.i(ven0Var) | x340Var8.g(function0) | x340Var8.i(context);
                Object objT4 = x340Var8.T();
                if (zI || objT4 == fkj0.X) {
                    objT4 = new o8e1(function0, context, ven0Var, (byte) 15);
                    x340Var8.s0(objT4);
                }
                boo1.s((Function0) objT4, x340Var6, 0);
                x340Var8.r(true);
                return rih1Var;
            case 5:
                dlg1 dlg1Var = (dlg1) obj6;
                vzq0 vzq0Var = (vzq0) obj;
                x340 x340Var9 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                whi1 whi1Var = (whi1) obj4;
                if ((whi1Var instanceof uhi1) || (whi1Var instanceof thi1)) {
                    x340 x340Var10 = x340Var9;
                    x340Var10.i0(321371394);
                    x340Var10.r(false);
                } else {
                    if (!(whi1Var instanceof vhi1)) {
                        throw p3d1.k(x340Var9, 980196080, false);
                    }
                    x340 x340Var11 = x340Var9;
                    x340Var11.i0(321507949);
                    ven0 ven0VarS = v8r.s((iu30) obj5, x340Var11);
                    List<dtb1> list = ((vhi1) whi1Var).a;
                    boolean zG2 = x340Var11.g(list);
                    Object objT5 = x340Var11.T();
                    if (zG2 || objT5 == fkj0.X) {
                        q3e q3eVar = (q3e) dlg1Var.a;
                        i2g1 i2g1Var = new i2g1(ven0VarS, (byte) 5);
                        ArrayList arrayList2 = new ArrayList();
                        for (dtb1 dtb1Var : list) {
                            phi1 phi1Var = (phi1) q3eVar.a.get(dtb1Var.getClass());
                            qhi1 qhi1VarA = phi1Var == null ? null : phi1Var.a(dtb1Var, i2g1Var);
                            if (qhi1VarA != null) {
                                arrayList2.add(qhi1VarA);
                            }
                        }
                        objT5 = mqo1.A(arrayList2);
                        x340Var11.s0(objT5);
                    }
                    uwr uwrVar8 = cbx.a;
                    cvx cvxVar9 = cbx.b(x340Var11).b;
                    dlg1Var.c((c380) objT5, vzq0Var, uyn1.z(8.0f, 0.0f, 2, nim0Var), x340Var11, (iIntValue2 << 3) & 112);
                    x340Var11.r(false);
                }
                return rih1Var;
            case 6:
                ((Number) obj3).intValue();
                m4c m4cVar2 = fkj0.X;
                me90 me90Var = ((yc90) obj4).b;
                iu30 iu30Var3 = (iu30) obj5;
                x340 x340Var12 = (b0k) obj2;
                b5i1 b5i1Var = (b5i1) obj6;
                boolean zG3 = x340Var12.g(iu30Var3) | x340Var12.i(b5i1Var);
                Object objT6 = x340Var12.T();
                if (zG3 || objT6 == m4cVar2) {
                    objT6 = new kni1(iu30Var3, b5i1Var, (byte) 1);
                    x340Var12.s0(objT6);
                }
                Function0 function1 = (Function0) objT6;
                Object objT7 = x340Var12.T();
                if (objT7 == m4cVar2) {
                    objT7 = kei1.Y0;
                    x340Var12.s0(objT7);
                }
                wro1.q(me90Var, function1, s161.a(nim0Var, (iu30) objT7), x340Var12, 0);
                return rih1Var;
            case 7:
                vzq0 vzq0Var2 = (vzq0) obj;
                ((Number) obj3).intValue();
                a0j1 a0j1Var = (a0j1) obj4;
                x340 x340Var13 = (b0k) obj2;
                Object objT8 = x340Var13.T();
                m4c m4cVar3 = fkj0.X;
                if (objT8 == m4cVar3) {
                    objT8 = a0j1Var.d.b();
                    x340Var13.s0(objT8);
                }
                r6h1 r6h1Var = (r6h1) objT8;
                boolean zI2 = x340Var13.i(r6h1Var);
                Object objT9 = x340Var13.T();
                if (zI2 || objT9 == m4cVar3) {
                    objT9 = new yzi1(r6h1Var, (byte) 0);
                    x340Var13.s0(objT9);
                }
                dgo1.c("verification_onboarding", (iu30) objT9, apo.r(-514972886, new bvd1((xzi1) obj5, vzq0Var2, a0j1Var, (iu30) obj6, (byte) 25), x340Var13), x340Var13, 390);
                return rih1Var;
            case 8:
                vzq0 vzq0Var3 = (vzq0) obj;
                ((Number) obj3).intValue();
                a1j1 a1j1Var = (a1j1) obj4;
                x340 x340Var14 = (b0k) obj2;
                Object objT10 = x340Var14.T();
                m4c m4cVar4 = fkj0.X;
                if (objT10 == m4cVar4) {
                    objT10 = a1j1Var.e.b();
                    x340Var14.s0(objT10);
                }
                r6h1 r6h1Var2 = (r6h1) objT10;
                boolean zI3 = x340Var14.i(r6h1Var2);
                Object objT11 = x340Var14.T();
                if (zI3 || objT11 == m4cVar4) {
                    objT11 = new yzi1(r6h1Var2, (byte) 2);
                    x340Var14.s0(objT11);
                }
                dgo1.c("verification_start", (iu30) objT11, apo.r(-565252306, new bvd1((x0j1) obj5, (iu30) obj6, a1j1Var, vzq0Var3, (byte) 27), x340Var14), x340Var14, 390);
                return rih1Var;
            case 9:
                vzq0 vzq0Var4 = (vzq0) obj;
                ((Number) obj3).intValue();
                z1j1 z1j1Var = (z1j1) obj4;
                x340 x340Var15 = (b0k) obj2;
                Object objT12 = x340Var15.T();
                m4c m4cVar5 = fkj0.X;
                if (objT12 == m4cVar5) {
                    objT12 = z1j1Var.f.b();
                    x340Var15.s0(objT12);
                }
                r6h1 r6h1Var3 = (r6h1) objT12;
                boolean zI4 = x340Var15.i(r6h1Var3);
                Object objT13 = x340Var15.T();
                if (zI4 || objT13 == m4cVar5) {
                    objT13 = new yzi1(r6h1Var3, (byte) 4);
                    x340Var15.s0(objT13);
                }
                dgo1.c("verification_verify", (iu30) objT13, apo.r(-534241878, new bvd1((x1j1) obj5, (iu30) obj6, z1j1Var, vzq0Var4, (byte) 29), x340Var15), x340Var15, 390);
                return rih1Var;
            case 10:
                x340 x340Var16 = (b0k) obj2;
                ((Number) obj3).intValue();
                qim0 qim0VarB3 = u291.B(nim0Var, (gra) null, 3);
                uwr uwrVar9 = cbx.a;
                qim0 qim0VarZ = uyn1.z(0.0f, cbx.b(x340Var16).e.b, 1, qim0VarB3);
                era eraVar2 = een.Q0;
                cvx cvxVar10 = cbx.b(x340Var16).b;
                j2i j2iVar = (j2i) obj4;
                j2i j2iVar2 = (j2i) obj5;
                j2i j2iVar3 = (j2i) obj6;
                mbh mbhVarA7 = jbh.a(new d36(12.0f, true, new um5(false)), eraVar2, x340Var16, 0);
                x340 x340Var17 = x340Var16;
                int iHashCode7 = Long.hashCode(x340Var17.T);
                xos0 xos0VarM7 = x340Var17.m();
                qim0 qim0VarE7 = zr7.E(x340Var16, qim0VarZ);
                hzj.A.getClass();
                x340 x340Var18 = x340Var16;
                if (x340Var18.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var18.m0();
                if (x340Var18.S) {
                    x340Var18.l(n4kVar);
                } else {
                    x340Var18.v0();
                }
                llj lljVar6 = y580.O0;
                nko1.H(mbhVarA7, x340Var16, lljVar6);
                llj lljVar7 = y580.N0;
                nko1.H(xos0VarM7, x340Var16, lljVar7);
                Integer numValueOf2 = Integer.valueOf(iHashCode7);
                llj lljVar8 = y580.R0;
                nko1.H(numValueOf2, x340Var16, lljVar8);
                nko1.F(x340Var16);
                llj lljVar9 = y580.Y;
                nko1.H(qim0VarE7, x340Var16, lljVar9);
                j2iVar.invoke(x340Var16, 0);
                qim0 qim0VarB4 = uyn1.B(u291.z(u291.f(nim0Var, 1.0f), (fra) null, 3), 0.0f, 0.0f, cbx.b(x340Var16).e.b, 0.0f, 11);
                jw31 jw31VarA = ew31.a(h36.g, een.Z, x340Var16, 0);
                int iHashCode8 = Long.hashCode(x340Var18.T);
                xos0 xos0VarM8 = x340Var18.m();
                qim0 qim0VarE8 = zr7.E(x340Var16, qim0VarB4);
                x340Var18.m0();
                if (x340Var18.S) {
                    x340Var18.l(n4kVar);
                } else {
                    x340Var18.v0();
                }
                nko1.H(jw31VarA, x340Var16, lljVar6);
                nko1.H(xos0VarM8, x340Var16, lljVar7);
                i3a.l(iHashCode8, x340Var16, lljVar8, x340Var16);
                nko1.H(qim0VarE8, x340Var16, lljVar9);
                j2iVar2.invoke(x340Var16, 0);
                j2iVar3.invoke(x340Var16, 0);
                x340Var18.r(true);
                x340Var18.r(true);
                return rih1Var;
            case 11:
                m87.k((fwk1) obj4, (iu30) obj5, (ng20) obj6, (qim0) null, (vzq0) obj, (b0k) obj2, (((Number) obj3).intValue() << 12) & 57344);
                return rih1Var;
            case 12:
                x340 x340Var19 = (b0k) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                m4c m4cVar6 = fkj0.X;
                o0i o0iVar = (o0i) obj6;
                sd5 sd5Var = (sd5) obj5;
                lbl1 lbl1Var = (lbl1) obj4;
                x340 x340Var20 = x340Var19;
                if (x340Var20.Y(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    if (lbl1Var.d == null) {
                        x340Var20.i0(-604494100);
                        x340Var20.r(false);
                    } else {
                        x340Var20.i0(-604494099);
                        ((cce) sd5Var.d).a(392, (o0i) obj6, lbl1Var.d, x340Var20, u291.d(nim0Var, 1.0f));
                        x340Var20.r(false);
                    }
                    String str7 = lbl1Var.f;
                    ibl1 ibl1Var = lbl1Var.e;
                    c9 c9Var = lbl1Var.g;
                    l7d1 l7d1Var = (l7d1) sd5Var.b;
                    String str8 = lbl1Var.a;
                    LinkedHashMap linkedHashMap = l7d1Var.a;
                    Object objQ = linkedHashMap.get(str8);
                    if (objQ == null) {
                        objQ = v8r.q((Object) null);
                        linkedHashMap.put(str8, objQ);
                    }
                    tob1 tob1Var2 = (tob1) objQ;
                    boolean zI5 = x340Var20.i(sd5Var) | x340Var20.g(lbl1Var) | x340Var20.i(o0iVar);
                    Object objT14 = x340Var20.T();
                    if (zI5 || objT14 == m4cVar6) {
                        objT14 = new jyi1(sd5Var, lbl1Var, o0iVar, (byte) 11);
                        x340Var20.s0(objT14);
                    }
                    iu30 iu30Var4 = (iu30) objT14;
                    kbl1 kbl1Var = lbl1Var.h;
                    boolean zI6 = x340Var20.i(sd5Var) | x340Var20.i(o0iVar) | x340Var20.g(lbl1Var);
                    Object objT15 = x340Var20.T();
                    if (zI6 || objT15 == m4cVar6) {
                        objT15 = new o8e1(sd5Var, o0iVar, lbl1Var, (byte) 28);
                        x340Var20.s0(objT15);
                    }
                    vpb1.d(str7, ibl1Var, c9Var, tob1Var2, iu30Var4, null, kbl1Var, (Function0) objT15, x340Var20, 0);
                } else {
                    x340Var20.b0();
                }
                return rih1Var;
            case 13:
                i2c i2cVar = (i2c) obj;
                x340 x340Var21 = (b0k) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                Configuration configuration = (Configuration) obj5;
                Context context2 = (Context) obj4;
                Object obj7 = fkj0.X;
                long j3 = i2cVar.b;
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= x340Var21.g(i2cVar) ? 4 : 2;
                }
                x340 x340Var22 = x340Var21;
                if (x340Var22.Y(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    wat watVar = (wat) x340Var22.k(t4k.h);
                    boolean zE = x340Var22.e(hjl.i(j3)) | x340Var22.g(watVar);
                    Object objT16 = x340Var22.T();
                    if (zE || objT16 == obj7) {
                        objT16 = Integer.valueOf((((int) watVar.M0(hjl.i(j3))) / 50) * 50);
                        x340Var22.s0(objT16);
                    }
                    int iIntValue5 = ((Number) objT16).intValue();
                    boolean zE2 = x340Var22.e(iIntValue5) | x340Var22.g(context2) | x340Var22.g(configuration);
                    Object objT17 = x340Var22.T();
                    Object obj8 = objT17;
                    if (zE2 || objT17 == obj7) {
                        Configuration configuration2 = new Configuration(configuration);
                        configuration2.smallestScreenWidthDp = iIntValue5;
                        configuration2.screenWidthDp = iIntValue5;
                        configuration2.orientation = 1;
                        Context contextCreateConfigurationContext = context2.createConfigurationContext(configuration2);
                        contextCreateConfigurationContext.setTheme(2132018149);
                        x340Var22.s0(contextCreateConfigurationContext);
                        obj8 = contextCreateConfigurationContext;
                    }
                    Context context3 = (Context) obj8;
                    context3.getClass();
                    ((j2i) obj6).invoke(context3, x340Var22, 0);
                } else {
                    x340Var22.b0();
                }
                return rih1Var;
            case 14:
                ((Number) obj3).intValue();
                d5m1 d5m1Var = (d5m1) obj4;
                mue1.r(d5m1Var.c, d5m1Var.b, (quc0) obj5, (Function0) obj6, (qim0) null, (b0k) obj2, 0);
                return rih1Var;
            default:
                vzq0 vzq0Var5 = (vzq0) obj;
                ((Number) obj3).intValue();
                iu30 iu30Var5 = (iu30) obj5;
                Object obj9 = fkj0.X;
                g2n1 g2n1Var2 = (g2n1) obj4;
                List list2 = g2n1Var2.d;
                x340 x340Var23 = (b0k) obj2;
                boolean zG4 = x340Var23.g(list2);
                Object objT18 = x340Var23.T();
                Object obj10 = objT18;
                if (zG4 || objT18 == obj9) {
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        r7h.W(((wro0) it.next()).a, arrayList3);
                    }
                    x340Var23.s0(arrayList3);
                    obj10 = arrayList3;
                }
                List list3 = (List) obj10;
                if (list3.isEmpty()) {
                    x340Var23.i0(1874171336);
                    qim0 qim0VarW = uyn1.w(u291.d(nim0Var, 1.0f), vzq0Var5);
                    gfh0 gfh0VarC = t1c.c(een.d, false);
                    int iHashCode9 = Long.hashCode(x340Var23.T);
                    xos0 xos0VarM9 = x340Var23.m();
                    qim0 qim0VarE9 = zr7.E(x340Var23, qim0VarW);
                    hzj.A.getClass();
                    if (x340Var23.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var23.m0();
                    if (x340Var23.S) {
                        x340Var23.l(n4kVar);
                    } else {
                        x340Var23.v0();
                    }
                    nko1.H(gfh0VarC, x340Var23, y580.O0);
                    nko1.H(xos0VarM9, x340Var23, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode9), x340Var23, y580.R0);
                    nko1.F(x340Var23);
                    nko1.H(qim0VarE9, x340Var23, y580.Y);
                    Object objT19 = x340Var23.T();
                    if (objT19 == obj9) {
                        objT19 = new x0n1();
                        x340Var23.s0(objT19);
                    }
                    otw.c((x0n1) objT19, new w0n1(iu30Var5), (qim0) null, (ipb1) null, x340Var23, 8, 12);
                    x340Var23.r(true);
                    x340Var23.r(false);
                } else {
                    x340Var23.i0(1874575266);
                    xtb0 xtb0VarA = aub0.a(0, x340Var23, 3);
                    boolean zI7 = x340Var23.i(xtb0VarA) | x340Var23.i(g2n1Var2) | x340Var23.g(iu30Var5);
                    Object objT20 = x340Var23.T();
                    if (zI7 || objT20 == obj9) {
                        iu30Var = iu30Var5;
                        g2n1Var = g2n1Var2;
                        objT20 = new q4m1(xtb0VarA, g2n1Var, iu30Var, (lnm) null, (byte) 11);
                        xtb0Var = xtb0VarA;
                        x340Var23.s0(objT20);
                    } else {
                        iu30Var = iu30Var5;
                        g2n1Var = g2n1Var2;
                        xtb0Var = xtb0VarA;
                    }
                    qxd0.t(xtb0Var, x340Var23, (vu30) objT20);
                    kiv kivVar = vvx.a;
                    uwr uwrVar10 = cbx.a;
                    cvx cvxVar11 = cbx.b(x340Var23).b;
                    mod.b(kivVar.a(new uvx(0, (pgx) null, 0, (vzq0) null, uyn1.h(2, 4.0f, 0.0f), (tvx) null, (hw61) null, 0, (p3v) null, 495)), apo.r(-1287766376, new wyy0(vzq0Var5, xtb0Var, (yrg0) obj6, list3, iu30Var, g2n1Var, (byte) 26), x340Var23), x340Var23, 56);
                    x340Var23.r(false);
                }
                return rih1Var;
        }
    }
}
