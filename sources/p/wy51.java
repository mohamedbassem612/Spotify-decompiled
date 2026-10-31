package p;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class wy51 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wy51(op80 op80Var, pxk0 pxk0Var, aje1 aje1Var, wr21 wr21Var, String str, Function0 function0, vu30 vu30Var, ven0 ven0Var) {
        super(2);
        this.a = (byte) 10;
        this.b = op80Var;
        this.c = pxk0Var;
        this.e = aje1Var;
        this.f = wr21Var;
        this.g = str;
        this.d = function0;
        this.h = vu30Var;
        this.i = ven0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        float f;
        byte b = this.a;
        h2c h2cVar = h2c.a;
        n4k n4kVar = hmb0.t1;
        qim0 qim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.i;
        Object obj4 = this.c;
        Object obj5 = this.h;
        Object obj6 = this.g;
        Object obj7 = this.f;
        Object obj8 = this.e;
        Object obj9 = this.b;
        Object obj10 = this.d;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    yy51.c((id01) obj9, (iu30) obj4, (Function0) obj10, (Function0) obj8, (Function0) obj7, (Function0) obj6, ((drr0) obj5).s(), ((Boolean) ((ven0) obj3).getValue()).booleanValue(), x340Var2, 0);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                f7p1.d((nb81) obj9, (kls0) obj4, (et90) obj10, (u961) obj8, (s24) obj7, (j7a1) obj6, (kb81) obj5, (qim0) obj3, (b0k) obj, czo1.p(2396737));
                return rih1Var;
            case 2:
                ((Number) obj2).intValue();
                h7p1.p((zb81) obj9, (kb81) obj4, (kls0) obj10, (et90) obj8, (u961) obj7, (s24) obj6, (j7a1) obj5, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 3:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    mod.b(oi7.a.a((gw70) obj9), apo.r(1401400372, new ydi0((qim0) obj10, (iu30) obj4, obj8, obj7, (idd1) obj6, (idd1) obj5, (idd1) obj3, (byte) 16), x340Var4), x340Var4, 56);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 4:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    b6p1.c(54, 0, apo.r(876074862, new a9a1((hw2) obj9, (String) obj4, (lik1) obj10, (x8a1) obj8, (cm0) obj7, (vzq0) obj6, (u7h) obj5, (w6a1) obj3), x340Var6), x340Var6, anm1.N("song_dna_list_root", qim0Var));
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 5:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                zba1 zba1Var = (zba1) obj6;
                m4c m4cVar = fkj0.X;
                wat watVar = (wat) obj10;
                erl1 erl1Var = (erl1) obj4;
                pda1 pda1Var = (pda1) obj9;
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    int iS = pda1Var.p.s();
                    boolean zI = x340Var8.i(erl1Var) | x340Var8.i(watVar);
                    Object objT = x340Var8.T();
                    if (zI || objT == m4cVar) {
                        objT = new yv10(erl1Var, watVar, (byte) 3);
                        x340Var8.s0(objT);
                    }
                    Function0 function0 = (Function0) objT;
                    xtb0 xtb0Var = (xtb0) obj8;
                    h3h1 h3h1Var = (h3h1) obj7;
                    j2i j2iVar = yjj.a;
                    j2i j2iVarR = apo.r(786069559, new qm71((e1m0) obj5, pda1Var, (qba1) obj3, (byte) 19), x340Var8);
                    boolean zI2 = x340Var8.i(zba1Var);
                    Object objT2 = x340Var8.T();
                    if (zI2 || objT2 == m4cVar) {
                        objT2 = new dr91(zba1Var, (byte) 17);
                        x340Var8.s0(objT2);
                    }
                    lmt0.n(iS, (qim0) null, function0, xtb0Var, h3h1Var, j2iVar, j2iVarR, (iu30) objT2, x340Var8, 1769472);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 6:
                ((Number) obj2).intValue();
                r4o1.E((c380) obj9, (n511) obj8, (n511) obj7, (bv30) obj6, (Function0) obj10, (vu30) obj5, (iu30) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 7:
                ((Number) obj2).intValue();
                rqo1.c((q7r0) obj9, (msc1) obj4, (jsq) obj10, (ksq) obj8, (uep) obj7, (k740) obj6, (stt0) obj5, (d0r) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 8:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                m4c m4cVar2 = fkj0.X;
                String str = (String) obj8;
                x340 x340Var10 = x340Var9;
                boolean zY = x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2);
                j06 j06Var = x340Var10.a;
                if (!zY) {
                    x340Var10.b0();
                    return rih1Var;
                }
                qim0 qim0VarQ = i1p1.q((qim0) obj9, (cr31) obj4);
                long j = o8h0.a;
                qim0 qim0VarF = dug.f(qim0VarQ, j, d4o1.a);
                boolean zG = x340Var10.g(str);
                Object objT3 = x340Var10.T();
                if (zG || objT3 == m4cVar2) {
                    objT3 = new hqa1(str, (byte) 16);
                    x340Var10.s0(objT3);
                }
                qim0 qim0VarB = s161.b(qim0VarF, true, (iu30) objT3);
                String str2 = (String) obj7;
                Function0 function1 = (Function0) obj10;
                String str3 = (String) obj6;
                al80 al80Var = (al80) obj5;
                af5 af5Var = (af5) obj3;
                gfh0 gfh0VarC = t1c.c(een.d, false);
                int iHashCode = Long.hashCode(x340Var10.T);
                xos0 xos0VarM = x340Var10.m();
                qim0 qim0VarE = zr7.E(x340Var10, qim0VarB);
                hzj.A.getClass();
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var10.m0();
                if (x340Var10.S) {
                    x340Var10.l(n4kVar);
                } else {
                    x340Var10.v0();
                }
                llj lljVar = y580.O0;
                nko1.H(gfh0VarC, x340Var10, lljVar);
                llj lljVar2 = y580.N0;
                nko1.H(xos0VarM, x340Var10, lljVar2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                llj lljVar3 = y580.R0;
                nko1.H(numValueOf, x340Var10, lljVar3);
                nko1.F(x340Var10);
                llj lljVar4 = y580.Y;
                nko1.H(qim0VarE, x340Var10, lljVar4);
                long j2 = o8h0.c;
                long j3 = o8h0.d;
                nim0 nim0Var = nim0.a;
                n8h0.a(j, j2, j3, str2, h2cVar.b(nim0Var), x340Var10, 438);
                qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
                Object objT4 = x340Var10.T();
                if (objT4 == m4cVar2) {
                    objT4 = pod1.P0;
                    x340Var10.s0(objT4);
                }
                qim0 qim0VarA = s161.a(qim0VarF2, (iu30) objT4);
                o8h0.c(x340Var10);
                o8h0.c(x340Var10);
                o8h0.c(x340Var10);
                o8h0.c(x340Var10);
                uwr uwrVar = cbx.a;
                mta mtaVar = cbx.b(x340Var10).d;
                qim0 qim0VarA2 = uyn1.A(qim0VarA, 8.0f, 8.0f, 8.0f, 56.0f);
                mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var10, 0);
                int iHashCode2 = Long.hashCode(x340Var10.T);
                xos0 xos0VarM2 = x340Var10.m();
                qim0 qim0VarE2 = zr7.E(x340Var10, qim0VarA2);
                x340Var10.m0();
                if (x340Var10.S) {
                    x340Var10.l(n4kVar);
                } else {
                    x340Var10.v0();
                }
                nko1.H(mbhVarA, x340Var10, lljVar);
                nko1.H(xos0VarM2, x340Var10, lljVar2);
                x0d.q(iHashCode2, x340Var10, lljVar3, x340Var10);
                nko1.H(qim0VarE2, x340Var10, lljVar4);
                o8h0.b(str3, x340Var10, 0);
                ArrayList arrayList = al80Var.c;
                int i = al80Var.e;
                qim0 qim0VarF3 = u291.f(nim0Var, 1.0f);
                float f2 = o8h0.e;
                l8h0.b(arrayList, uyn1.B(qim0VarF3, f2, o8h0.f, f2, 0.0f, 8), x340Var10, 48);
                h1p1.e(str2, x340Var10, 0);
                if (i != 1) {
                    x340Var10.i0(379018538);
                    h1p1.d(x340Var10, 0);
                    x340Var10.r(false);
                } else {
                    x340Var10.i0(379051212);
                    x340Var10.r(false);
                }
                if (i == 1) {
                    x340Var10.i0(-403407720);
                    x340Var10.r(false);
                    f = 0.0f;
                } else {
                    x340Var10.i0(-403406938);
                    o8h0.c(x340Var10);
                    x340Var10.r(false);
                    f = 8.0f;
                }
                o8h0.a(af5Var, uyn1.B(nim0Var, 0.0f, f, 0.0f, 0.0f, 13), x340Var10, 0);
                x340Var10.r(true);
                o8h0.c(x340Var10);
                s8p1.b(function1, o8h0.b, h2cVar.a(nim0Var, een.Y), x340Var10, 384);
                x340Var10.r(true);
                return rih1Var;
            case 9:
                x340 x340Var11 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                c380 c380Var = (c380) obj9;
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    int size = c380Var.size() + (((Function0) obj10) != null ? 1 : 0);
                    if (((String) obj4) != null || size > 1) {
                        x340Var12.i0(1011336365);
                        u1p1.q((Integer) obj8, (String) obj7, (vu30) obj6, (String) obj4, (vu30) obj3, (c380) obj9, (Function0) obj10, (m5a) obj5, null, x340Var12, 0);
                        x340Var12.r(false);
                    } else {
                        x340Var12.i0(1011091589);
                        u1p1.p((Integer) obj8, (String) obj7, (vu30) obj6, (txd1) o7h.s0(c380Var), (Function0) obj10, (m5a) obj5, null, x340Var12, 0);
                        x340Var12.r(false);
                    }
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 10:
                x340 x340Var13 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                m4c m4cVar3 = fkj0.X;
                op80 op80Var = (op80) obj9;
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    View view = (View) x340Var14.k(AndroidCompositionLocals_androidKt.f);
                    boolean zG2 = x340Var14.g(op80Var) | x340Var14.g(view);
                    Object objT5 = x340Var14.T();
                    if (zG2 || objT5 == m4cVar3) {
                        op80 jp80Var = new jp80(view.getRootView());
                        op80Var.getClass();
                        op80 wchVar = q6x.b;
                        if (op80Var.equals(wchVar) && jp80Var.equals(wchVar)) {
                            op80Var = wchVar;
                        } else if (op80Var.equals(wchVar)) {
                            op80Var = jp80Var;
                        } else if (!jp80Var.equals(wchVar)) {
                            wchVar = new wch(op80Var, jp80Var);
                            op80Var = wchVar;
                        }
                        x340Var14.s0(op80Var);
                        objT5 = op80Var;
                    }
                    op80 op80Var2 = (op80) objT5;
                    kiv kivVar = gfe0.a;
                    boolean zI3 = x340Var14.i(op80Var2);
                    Object objT6 = x340Var14.T();
                    if (zI3 || objT6 == m4cVar3) {
                        objT6 = new gt1(op80Var2, (byte) 2);
                        x340Var14.s0(objT6);
                    }
                    mod.b(gfe0.d((Function0) objT6, x340Var14), apo.r(245790818, new ydi0((pxk0) obj4, (aje1) obj8, (wr21) obj7, (String) obj6, (Function0) obj10, (vu30) obj5, (ven0) obj3), x340Var14), x340Var14, 56);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            default:
                x340 x340Var15 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                v9l1 v9l1Var = (v9l1) obj9;
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    okc1 okc1Var = v9l1Var.g;
                    h290 h290Var = okc1Var != null ? okc1Var.a.a : null;
                    uwr uwrVar2 = cbx.a;
                    h290 h290Var2 = h290Var;
                    qim0 qim0VarD = u291.d(dug.f((qim0) obj10, cbx.a(x340Var16).a.c, er31.b(24.0f)).then(h290Var2 != null ? exd0.r(qim0Var, new s6(h290Var2, (byte) 11)) : qim0Var), 1.0f);
                    gra graVar = een.h;
                    cce cceVar = (cce) obj8;
                    o0i o0iVar = (o0i) obj7;
                    kly0 kly0Var = (kly0) obj6;
                    hcl1 hcl1Var = (hcl1) obj5;
                    iu30 iu30Var = (iu30) obj4;
                    iu30 iu30Var2 = (iu30) obj3;
                    gfh0 gfh0VarC2 = t1c.c(graVar, false);
                    int iHashCode3 = Long.hashCode(x340Var16.T);
                    xos0 xos0VarM3 = x340Var16.m();
                    qim0 qim0VarE3 = zr7.E(x340Var16, qim0VarD);
                    hzj.A.getClass();
                    if (x340Var16.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var16.m0();
                    if (x340Var16.S) {
                        x340Var16.l(n4kVar);
                    } else {
                        x340Var16.v0();
                    }
                    nko1.H(gfh0VarC2, x340Var16, y580.O0);
                    nko1.H(xos0VarM3, x340Var16, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode3), x340Var16, y580.R0);
                    nko1.F(x340Var16);
                    nko1.H(qim0VarE3, x340Var16, y580.Y);
                    vpl vplVar = v9l1Var.e;
                    if (vplVar == null) {
                        x340Var16.i0(495039884);
                        x340Var16.r(false);
                    } else {
                        x340Var16.i0(495039885);
                        cceVar.a(8, o0iVar, vplVar, x340Var16, i1p1.q(u291.d(qim0Var, 1.0f), er31.b(24.0f)));
                        x340Var16.r(false);
                    }
                    uwo1.h(apo.r(-873845145, new fak1(v9l1Var, (byte) 9), x340Var16), apo.r(-1461236888, new wyy0(v9l1Var, kly0Var, hcl1Var, o0iVar, iu30Var, iu30Var2, (byte) 22), x340Var16), h2cVar.a(u291.B(uyn1.z(16.0f, 0.0f, 2, qim0Var), (gra) null, 3), graVar), x340Var16, 54);
                    z0i z0iVar = v9l1Var.f;
                    if (z0iVar == null) {
                        x340Var16.i0(496061396);
                        x340Var16.r(false);
                    } else {
                        x340Var16.i0(496061397);
                        cceVar.a(8, o0iVar, z0iVar, x340Var16, uyn1.B(h2cVar.a(u291.B(qim0Var, (gra) null, 3), een.X), 16.0f, 0.0f, 16.0f, 24.0f, 2));
                        x340Var16.r(false);
                    }
                    x340Var16.r(true);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wy51(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, byte b, boolean z) {
        super(2);
        this.a = b;
        this.b = obj;
        this.d = obj2;
        this.c = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
        this.h = obj7;
        this.i = obj8;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wy51(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, int i, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
        this.h = obj7;
        this.i = obj8;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wy51(c380 c380Var, n511 n511Var, n511 n511Var2, bv30 bv30Var, Function0 function0, vu30 vu30Var, iu30 iu30Var, qim0 qim0Var, int i) {
        super(2);
        this.a = (byte) 6;
        this.b = c380Var;
        this.e = n511Var;
        this.f = n511Var2;
        this.g = bv30Var;
        this.d = function0;
        this.h = vu30Var;
        this.c = iu30Var;
        this.i = qim0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wy51(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
        this.h = obj7;
        this.i = obj8;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wy51(qim0 qim0Var, cr31 cr31Var, String str, String str2, Function0 function0, String str3, al80 al80Var, af5 af5Var) {
        super(2);
        this.a = (byte) 8;
        this.b = qim0Var;
        this.c = cr31Var;
        this.e = str;
        this.f = str2;
        this.d = function0;
        this.g = str3;
        this.h = al80Var;
        this.i = af5Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wy51(v9l1 v9l1Var, qim0 qim0Var, cce cceVar, o0i o0iVar, kly0 kly0Var, hcl1 hcl1Var, iu30 iu30Var, iu30 iu30Var2) {
        super(2);
        this.a = (byte) 11;
        this.b = v9l1Var;
        this.d = qim0Var;
        this.e = cceVar;
        this.f = o0iVar;
        this.g = kly0Var;
        this.h = hcl1Var;
        this.c = iu30Var;
        this.i = iu30Var2;
    }
}
