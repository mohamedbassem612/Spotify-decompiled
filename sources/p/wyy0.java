package p;

import android.os.ResultReceiver;
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.wrapped.v1.proto.StoryCard;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wyy0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wyy0(Function0 function0, scx scxVar, String str, String str2, lcx lcxVar, lcx lcxVar2, int i) {
        super(2);
        this.a = (byte) 10;
        this.f = function0;
        this.d = scxVar;
        this.b = str;
        this.c = str2;
        this.e = lcxVar;
        this.g = lcxVar2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:118:0x046f  */
    /* JADX WARN: Code duplicated, block: B:122:0x0489  */
    /* JADX WARN: Code duplicated, block: B:161:0x05c9 A[PHI: r7
      0x05c9: PHI (r7v41 int) = (r7v40 int), (r7v42 int) binds: [B:157:0x05c2, B:159:0x05c5] A[DONT_GENERATE, DONT_INLINE]] */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        qim0 qim0VarB;
        d7f1 d7f1Var;
        int i;
        rx7 rx7Var;
        xhm1 xhm1Var;
        String str;
        sju sjuVar;
        m4c m4cVar;
        boolean zG;
        Object objT;
        boolean zG2;
        Object objT2;
        ygr0 ygr0Var;
        byte b = this.a;
        f36 f36Var = h36.c;
        h2c h2cVar = h2c.a;
        n4k n4kVar = hmb0.t1;
        qim0 qim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.c;
        Object obj4 = this.e;
        Object obj5 = this.f;
        Object obj6 = this.g;
        Object obj7 = this.d;
        Object obj8 = this.b;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                vgo1.l((String) obj8, (c380) obj7, (String) obj3, (jtl1) obj4, (Function0) obj5, (qim0) obj6, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 1:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                fiz0 fiz0Var = (fiz0) obj3;
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    irn1.u((qim0) null, apo.r(-1153183147, new ffx0((xiz0) obj8, fiz0Var, (klz0) obj7, (byte) 7), x340Var2), (vu30) null, (erl1) null, apo.r(-1319864881, new c9y(fiz0Var, (amq) obj4, (iu30) obj5, (bmq) obj6, (byte) 25), x340Var2), x340Var2, 24624, 13);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 2:
                ((Number) obj2).intValue();
                tro1.j((dc8) obj3, (String) obj8, (List) obj7, (lgu0) obj4, (iu30) obj6, (Function0) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 3:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                eq01 eq01Var = (eq01) obj8;
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    float fU0 = ((wat) x340Var4.k(t4k.h)).U0();
                    if (fU0 < 1.0f) {
                        fU0 = 1.0f;
                    }
                    float fM = dsa0.m(x340Var4, 2131166902) * fU0;
                    j47 j47Var = (j47) o7h.s0(eq01Var.d);
                    if (j47Var != null) {
                        x47 x47Var = j47Var.b;
                    }
                    float f = fM * 1.0f;
                    Object objT3 = x340Var4.T();
                    m4c m4cVar2 = fkj0.X;
                    if (objT3 == m4cVar2) {
                        objT3 = ktd.n(x340Var4);
                    }
                    idn0 idn0Var = (idn0) objT3;
                    ven0 ven0VarM = k1u.m(idn0Var, x340Var4, 0);
                    zu91 zu91VarJ0 = ((Boolean) ven0VarM.getValue()).booleanValue() ? irn1.j0() : irn1.o0(200, 0, (dlv) null, 6);
                    tob1 tob1VarB = z95.b(((Boolean) ven0VarM.getValue()).booleanValue() ? 0.97f : 1.0f, zu91VarJ0, "press-scale", (iu30) null, x340Var4, 3072, 20);
                    tob1 tob1VarB2 = z95.b(((Boolean) ven0VarM.getValue()).booleanValue() ? 0.6f : 1.0f, zu91VarJ0, "press-alpha", (iu30) null, x340Var4, 3072, 20);
                    String str2 = eq01Var.e;
                    qim0 qim0VarV = u291.v(qim0Var, f);
                    boolean zI = x340Var4.i(tob1VarB);
                    Object objT4 = x340Var4.T();
                    if (zI || objT4 == m4cVar2) {
                        objT4 = new lws0(tob1VarB, (byte) 11);
                        x340Var4.s0(objT4);
                    }
                    qim0 qim0VarC = i541.C(qim0VarV, (iu30) objT4);
                    if (str2 != null) {
                        x340Var4.i0(-1142318252);
                        boolean zG3 = x340Var4.g(str2);
                        Object objT5 = x340Var4.T();
                        if (zG3 || objT5 == m4cVar2) {
                            objT5 = new q4z0(str2, (byte) 12);
                            x340Var4.s0(objT5);
                        }
                        qim0VarB = s161.b(qim0Var, false, (iu30) objT5);
                        x340Var4.r(false);
                    } else {
                        x340Var4.i0(-1142218866);
                        x340Var4.r(false);
                        qim0VarB = qim0Var;
                    }
                    qim0 qim0VarY = bin.y(qim0VarC.then(qim0VarB), idn0Var, (ga80) null, false, (String) null, (pm31) null, (String) null, (Function0) obj5, (Function0) obj3, 444);
                    eq01 eq01Var2 = (eq01) obj8;
                    gw70 gw70Var = (gw70) obj7;
                    iu30 iu30Var = (iu30) obj4;
                    znb0 znb0Var = (znb0) obj6;
                    mbh mbhVarA = jbh.a(f36Var, een.P0, x340Var4, 0);
                    int iHashCode = Long.hashCode(x340Var4.T);
                    xos0 xos0VarM = x340Var4.m();
                    qim0 qim0VarE = zr7.E(x340Var4, qim0VarY);
                    hzj.A.getClass();
                    if (x340Var4.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var4.m0();
                    if (x340Var4.S) {
                        x340Var4.l(n4kVar);
                    } else {
                        x340Var4.v0();
                    }
                    nko1.H(mbhVarA, x340Var4, y580.O0);
                    nko1.H(xos0VarM, x340Var4, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var4, y580.R0);
                    nko1.F(x340Var4);
                    nko1.H(qim0VarE, x340Var4, y580.Y);
                    qim0 qim0VarS = u291.s(qim0Var, f, fM);
                    boolean zI2 = x340Var4.i(tob1VarB2);
                    Object objT6 = x340Var4.T();
                    if (zI2 || objT6 == m4cVar2) {
                        objT6 = new lws0(tob1VarB2, (byte) 12);
                        x340Var4.s0(objT6);
                    }
                    wwo1.f(eq01Var2, gw70Var, iu30Var, fM, i541.C(qim0VarS, (iu30) objT6), x340Var4, 0);
                    boolean zI3 = x340Var4.i(tob1VarB2);
                    Object objT7 = x340Var4.T();
                    if (zI3 || objT7 == m4cVar2) {
                        objT7 = new bu2(tob1VarB2, (byte) 19);
                        x340Var4.s0(objT7);
                    }
                    wwo1.k(eq01Var2, znb0Var, (Function0) objT7, x340Var4, 0);
                    x340Var4.r(true);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 4:
                ((Number) obj2).intValue();
                ((bz11) obj8).a((lw41) obj3, (b851) obj7, (a851) obj4, (e7r0) obj5, (qim0) obj6, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 5:
                ((Number) obj2).intValue();
                ((u651) obj8).a((lw41) obj3, (b851) obj7, (a851) obj4, (e7r0) obj5, (qim0) obj6, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 6:
                ((Number) obj2).intValue();
                wgo1.o((up51) obj7, (String) obj8, (String) obj3, (Function0) obj5, (j2i) obj4, (j2i) obj6, (b0k) obj, czo1.p(221185));
                return rih1Var;
            case 7:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                iu30 iu30Var2 = (iu30) obj7;
                er71 er71Var = (er71) obj8;
                ArrayList arrayList = er71Var.a;
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    c380 c380VarA = mqo1.A(arrayList);
                    if (arrayList.isEmpty()) {
                        eg.m("User faces must not be empty");
                        return null;
                    }
                    qim0 qim0VarB2 = u291.B((qim0) obj6, (gra) null, 3);
                    String strO0 = cwl1.o0(x340Var6, 2131953430);
                    idn0 idn0Var2 = (idn0) obj3;
                    pm31 pm31Var = new pm31(0);
                    boolean zG4 = x340Var6.g(iu30Var2);
                    Object objT8 = x340Var6.T();
                    if (zG4 || objT8 == fkj0.X) {
                        objT8 = new m861(iu30Var2, (byte) 21);
                        x340Var6.s0(objT8);
                    }
                    l3p1.f((iu30) obj7, (cr71) obj4, apo.r(-544665884, new jt41((gw70) obj5, c380VarA, (byte) 27), x340Var6), apo.r(-905125595, new dj71(er71Var, (byte) 6), x340Var6), bin.u(qim0VarB2, idn0Var2, (ga80) null, true, strO0, pm31Var, (Function0) objT8), x340Var6, 3456);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 8:
                ((Number) obj2).intValue();
                j7p1.g((he81) obj8, (j2i) obj3, (j2i) obj7, (j2i) obj4, (qim0) obj6, (VideoSurfaceView) obj5, (b0k) obj, czo1.p(3505));
                return rih1Var;
            case 9:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    j82.s((Function0) obj5, nim0.a, (vu30) obj8, (vu30) obj3, (r891) obj7, (bke1) obj4, (j2i) obj6, x340Var8, 0, 0);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 10:
                ((Number) obj2).intValue();
                ila0.b((Function0) obj5, (scx) obj7, (String) obj8, (String) obj3, (lcx) obj4, (lcx) obj6, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 11:
                ((Number) obj2).intValue();
                i1k0.i((y7e1) obj8, (Function0) obj5, (qim0) obj6, (iu30) obj3, (iu30) obj7, (yt91) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 12:
                ((Number) obj2).intValue();
                ((g2z) obj8).r((qcb1) obj3, (iu30) obj7, (jha1) obj4, (iu30) obj5, (qim0) obj6, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 13:
                ((Number) obj2).intValue();
                lgo1.k((String) obj8, (Double) obj3, (Double) obj7, (Double) obj4, (Double) obj5, (qim0) obj6, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 14:
                ((Number) obj2).intValue();
                zqo1.k((String) obj8, (String) obj3, (ResultReceiver) obj7, (List) obj4, (vxe1) obj5, (kly0) obj6, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 15:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    sm51 sm51Var = (sm51) obj8;
                    nue1 nue1Var = (nue1) obj3;
                    zge1 zge1Var = (zge1) obj7;
                    ggv ggvVar = (ggv) obj4;
                    iu30 iu30Var3 = (iu30) obj5;
                    gfh0 gfh0VarC = t1c.c(een.h, false);
                    int iHashCode2 = Long.hashCode(x340Var10.T);
                    xos0 xos0VarM2 = x340Var10.m();
                    qim0 qim0VarE2 = zr7.E(x340Var10, (qim0) obj6);
                    hzj.A.getClass();
                    if (x340Var10.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var10.m0();
                    if (x340Var10.S) {
                        x340Var10.l(n4kVar);
                    } else {
                        x340Var10.v0();
                    }
                    nko1.H(gfh0VarC, x340Var10, y580.O0);
                    nko1.H(xos0VarM2, x340Var10, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode2), x340Var10, y580.R0);
                    nko1.F(x340Var10);
                    nko1.H(qim0VarE2, x340Var10, y580.Y);
                    if (sm51Var != null) {
                        x340Var10.i0(-886615286);
                        irn1.z(nue1Var, sm51Var, (qim0) null, x340Var10, 0);
                        x340Var10.r(false);
                    } else if (zge1Var != null) {
                        x340Var10.i0(-886492712);
                        nel1.a(nue1Var, zge1Var, (qim0) null, x340Var10, 0);
                        x340Var10.r(false);
                    } else {
                        x340Var10.i0(-886410376);
                        roe1.c(nue1Var, (qim0) null, x340Var10, 0);
                        x340Var10.r(false);
                    }
                    qim0 qim0VarV2 = u291.v(u291.c(qim0Var, 1.0f), 100.0f);
                    brl.a(nkb.b, h2cVar.a(qim0VarV2, een.g), x340Var10, 6);
                    brl.a(nkb.c, h2cVar.a(qim0VarV2, een.i), x340Var10, 6);
                    dro.v(nue1Var, ggvVar, iu30Var3, u291.d(qim0Var, 1.0f), x340Var10, 0);
                    x340Var10.r(true);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 16:
                k7f1 k7f1Var = (k7f1) obj;
                zqd1 zqd1Var = (zqd1) obj2;
                ven0 ven0Var = (ven0) obj7;
                rx7 rx7Var2 = k7f1Var.f;
                ce6 ce6Var = (ce6) obj8;
                l7f1 l7f1Var = (l7f1) ce6Var.c;
                String str3 = l7f1Var.a;
                Object obj9 = ((rk41) obj3).c;
                StoryCard storyCard = ((wgm1) ((xgm1) obj9).getState().getValue()).a;
                String id = storyCard != null ? storyCard.getId() : null;
                boolean z = l7f1Var.d;
                String str4 = (String) ven0Var.getValue();
                if (u890.j(id, str3) && rx7Var2 != null) {
                    d7f1Var = new d7f1(rx7Var2, z && !u890.j(rx7Var2.a, str4));
                } else {
                    d7f1Var = null;
                }
                if (d7f1Var != null) {
                    rx7 rx7Var3 = d7f1Var.a;
                    qam1 qam1Var = (qam1) obj4;
                    ven0 ven0Var2 = (ven0) obj5;
                    ven0 ven0Var3 = (ven0) obj6;
                    int iIndexOf = l7f1Var.c.indexOf(k7f1Var);
                    int i2 = iIndexOf + 1;
                    if (i2 == 1) {
                        i = 1;
                    } else if (i2 == 2) {
                        i = 2;
                    } else if (i2 != 3) {
                        int i3 = 4;
                        if (i2 != 4) {
                            i3 = 5;
                            if (i2 != 5) {
                                i = 0;
                            } else {
                                i = i3;
                            }
                        } else {
                            i = i3;
                        }
                    } else {
                        i = 3;
                    }
                    if (i == 0 || (xhm1Var = (xhm1) ven0Var2.getValue()) == null) {
                        rx7Var = rx7Var3;
                    } else {
                        ard1 ard1Var = (ard1) ce6Var.d;
                        if (rx7Var2 == null || (sjuVar = rx7Var2.c) == null) {
                            rx7Var = rx7Var3;
                            str = null;
                        } else {
                            str = sjuVar.c;
                            rx7Var = rx7Var3;
                        }
                        ard1Var.b(xhm1Var, zqd1Var, iIndexOf, str, i);
                    }
                    ven0Var.setValue(rx7Var.a);
                    ven0Var3.setValue(Integer.valueOf(iIndexOf));
                    ce6Var.f.invoke(Integer.valueOf(iIndexOf));
                    ((xgm1) obj9).a(new lgm1(rx7Var.a, rx7Var.b, rx7Var.c));
                    if (d7f1Var.b) {
                        sam1.b(qam1Var);
                    }
                }
                return rih1Var;
            case 17:
                ((Number) obj2).intValue();
                cpn1.i((zrg1) obj8, (msg1) obj3, (Function0) obj5, (Function0) obj7, (Function0) obj4, (qim0) obj6, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 18:
                ((Number) obj2).intValue();
                bpo1.m((String) obj8, (String) obj3, (String) obj7, (String) obj4, (hcx) obj5, (qim0) obj6, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 19:
                ((Number) obj2).intValue();
                qyo1.k((t8r0) obj8, (f6m) obj3, (xfx) obj7, (j2i) obj4, (iu30) obj5, (qim0) obj6, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 20:
                x340 x340Var11 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                iu30 iu30Var4 = (iu30) obj8;
                m4c m4cVar3 = fkj0.X;
                x340 x340Var12 = x340Var11;
                boolean zY = x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2);
                j06 j06Var = x340Var12.a;
                if (!zY) {
                    x340Var12.b0();
                    return rih1Var;
                }
                boolean zG5 = x340Var12.g(iu30Var4);
                Object objT9 = x340Var12.T();
                if (zG5 || objT9 == m4cVar3) {
                    objT9 = new ceg1(iu30Var4, (byte) 22);
                    x340Var12.s0(objT9);
                }
                qim0 qim0VarW = jzn1.w(qim0Var, (iu30) objT9, x340Var12);
                o6j1 o6j1Var = (o6j1) obj3;
                x360 x360Var = o6j1Var.b;
                iuj iujVar = (iuj) obj7;
                zau0 zau0Var = (zau0) obj4;
                ven0 ven0Var4 = (ven0) obj5;
                idm idmVar = (idm) obj6;
                gfh0 gfh0VarC2 = t1c.c(een.d, false);
                int iHashCode3 = Long.hashCode(x340Var12.T);
                xos0 xos0VarM3 = x340Var12.m();
                qim0 qim0VarE3 = zr7.E(x340Var12, qim0VarW);
                hzj.A.getClass();
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var12.m0();
                if (x340Var12.S) {
                    x340Var12.l(n4kVar);
                } else {
                    x340Var12.v0();
                }
                llj lljVar = y580.O0;
                nko1.H(gfh0VarC2, x340Var12, lljVar);
                llj lljVar2 = y580.N0;
                nko1.H(xos0VarM3, x340Var12, lljVar2);
                Integer numValueOf = Integer.valueOf(iHashCode3);
                llj lljVar3 = y580.R0;
                nko1.H(numValueOf, x340Var12, lljVar3);
                nko1.F(x340Var12);
                llj lljVar4 = y580.Y;
                nko1.H(qim0VarE3, x340Var12, lljVar4);
                mbh mbhVarA2 = jbh.a(f36Var, een.P0, x340Var12, 0);
                int iHashCode4 = Long.hashCode(x340Var12.T);
                xos0 xos0VarM4 = x340Var12.m();
                qim0 qim0VarE4 = zr7.E(x340Var12, qim0Var);
                x340Var12.m0();
                if (x340Var12.S) {
                    x340Var12.l(n4kVar);
                } else {
                    x340Var12.v0();
                }
                nko1.H(mbhVarA2, x340Var12, lljVar);
                nko1.H(xos0VarM4, x340Var12, lljVar2);
                x0d.q(iHashCode4, x340Var12, lljVar3, x340Var12);
                nko1.H(qim0VarE4, x340Var12, lljVar4);
                if (x360Var != null) {
                    x340Var12.i0(43644534);
                    iujVar.a(x360Var, x340Var12, 0);
                    x0d.s(qim0Var, 12.0f, x340Var12, false);
                } else {
                    x340Var12.i0(43754088);
                    x340Var12.r(false);
                }
                boolean z2 = o6j1Var.m;
                boolean zBooleanValue = ((Boolean) ven0Var4.getValue()).booleanValue();
                boolean zI4 = x340Var12.i(zau0Var);
                Object objT10 = x340Var12.T();
                if (!zI4) {
                    m4cVar = m4cVar3;
                    if (objT10 == m4cVar) {
                    }
                    Function0 function0 = (Function0) objT10;
                    zG = x340Var12.g(iu30Var4);
                    objT = x340Var12.T();
                    if (zG || objT == m4cVar) {
                        objT = new y0j1(iu30Var4, (byte) 12);
                        x340Var12.s0(objT);
                    }
                    Function0 function1 = (Function0) objT;
                    zG2 = x340Var12.g(iu30Var4);
                    objT2 = x340Var12.T();
                    if (zG2 || objT2 == m4cVar) {
                        objT2 = new y0j1(iu30Var4, (byte) 13);
                        x340Var12.s0(objT2);
                    }
                    k1p1.h(function0, o6j1Var, function1, (Function0) objT2, apo.r(1322266938, new wpg1(idmVar, o6j1Var, iu30Var4, (byte) 24), x340Var12), z2, zBooleanValue, (qim0) null, x340Var12, 24576);
                    x340Var12.r(true);
                    x340Var12.r(true);
                    return rih1Var;
                }
                m4cVar = m4cVar3;
                objT10 = new b6j1(zau0Var, (byte) 1);
                x340Var12.s0(objT10);
                Function0 function2 = (Function0) objT10;
                zG = x340Var12.g(iu30Var4);
                objT = x340Var12.T();
                if (zG) {
                    objT = new y0j1(iu30Var4, (byte) 12);
                    x340Var12.s0(objT);
                } else {
                    objT = new y0j1(iu30Var4, (byte) 12);
                    x340Var12.s0(objT);
                }
                Function0 function3 = (Function0) objT;
                zG2 = x340Var12.g(iu30Var4);
                objT2 = x340Var12.T();
                if (zG2) {
                    objT2 = new y0j1(iu30Var4, (byte) 13);
                    x340Var12.s0(objT2);
                } else {
                    objT2 = new y0j1(iu30Var4, (byte) 13);
                    x340Var12.s0(objT2);
                }
                k1p1.h(function2, o6j1Var, function3, (Function0) objT2, apo.r(1322266938, new wpg1(idmVar, o6j1Var, iu30Var4, (byte) 24), x340Var12), z2, zBooleanValue, (qim0) null, x340Var12, 24576);
                x340Var12.r(true);
                x340Var12.r(true);
                return rih1Var;
            case 21:
                x340 x340Var13 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                m4c m4cVar4 = fkj0.X;
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    qim0 qim0VarD = u291.d(qim0Var, 1.0f);
                    k7l1 k7l1Var = (k7l1) obj8;
                    Function0 function4 = (Function0) obj5;
                    ljj1 ljj1Var = (ljj1) obj3;
                    ven0 ven0Var5 = (ven0) obj7;
                    k0t k0tVar = (k0t) obj4;
                    ven0 ven0Var6 = (ven0) obj6;
                    gfh0 gfh0VarC3 = t1c.c(een.d, false);
                    int iHashCode5 = Long.hashCode(x340Var14.T);
                    xos0 xos0VarM5 = x340Var14.m();
                    qim0 qim0VarE5 = zr7.E(x340Var14, qim0VarD);
                    hzj.A.getClass();
                    if (x340Var14.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var14.m0();
                    if (x340Var14.S) {
                        x340Var14.l(n4kVar);
                    } else {
                        x340Var14.v0();
                    }
                    nko1.H(gfh0VarC3, x340Var14, y580.O0);
                    nko1.H(xos0VarM5, x340Var14, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode5), x340Var14, y580.R0);
                    nko1.F(x340Var14);
                    nko1.H(qim0VarE5, x340Var14, y580.Y);
                    String str5 = k7l1Var.f;
                    String str6 = k7l1Var.c;
                    String str7 = k7l1Var.g;
                    cr31 cr31VarB = er31.b(16.0f);
                    String str8 = k7l1Var.h;
                    String str9 = str8.length() == 0 ? null : str8;
                    Float f2 = k7l1Var.n;
                    boolean z3 = ((Boolean) ven0Var5.getValue()).booleanValue() && ljj1Var != null;
                    boolean zI5 = x340Var14.i(ven0Var5) | x340Var14.i(k0tVar);
                    Object objT11 = x340Var14.T();
                    if (zI5 || objT11 == m4cVar4) {
                        objT11 = new jgy(k0tVar, ven0Var5, (byte) 1);
                        x340Var14.s0(objT11);
                    }
                    iu30 iu30Var5 = (iu30) objT11;
                    boolean zI6 = x340Var14.i(ven0Var6);
                    Object objT12 = x340Var14.T();
                    if (zI6 || objT12 == m4cVar4) {
                        objT12 = new mek1(ven0Var6, (byte) 4);
                        x340Var14.s0(objT12);
                    }
                    xto.f(str5, str6, str7, function4, (qim0) null, cr31VarB, str9, f2, z3, (String) null, (String) null, iu30Var5, (Function0) objT12, x340Var14, 0, 1552);
                    inx inxVar = inx.c;
                    qim0 qim0VarR = u291.r(uyn1.B(h2cVar.a(qim0Var, een.f), 0.0f, 8.0f, 8.0f, 0.0f, 9), 32.0f);
                    uwr uwrVar = cbx.a;
                    w0h1.a(inxVar, isl.a, uyn1.x(dug.f(qim0VarR, ((vex) zex.a.e).f, er31.a), 8.0f), cbx.a(x340Var14).b.a, 0L, false, x340Var14, inx.d | 48, 48);
                    x340Var14.r(true);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case 22:
                x340 x340Var15 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    wwo1.e((kly0) obj3, (hcl1) obj7, mqo1.A(((v9l1) obj8).d), (o0i) obj4, (iu30) obj5, (iu30) obj6, (qim0) null, x340Var16, 4096);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            case 23:
                ((Number) obj2).intValue();
                v8r.i((yqg) obj8, (hdl1) obj3, (Function0) obj5, (iu30) obj7, (qim0) obj6, (Function0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 24:
                ((Number) obj2).intValue();
                t3k1.k((String) obj8, (mr10) obj3, (Function0) obj5, (Function0) obj7, (Function0) obj4, (qim0) obj6, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 25:
                x340 x340Var17 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                tob1 tob1Var = (tob1) ((uxy0) obj3).b;
                x340 x340Var18 = x340Var17;
                if (x340Var18.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    uwr uwrVar2 = cbx.a;
                    qgr0 qgr0Var = new qgr0(cbx.a(x340Var18).a.c);
                    if (((x811) obj8) == null) {
                        x340Var18.i0(-1430061142);
                        x340Var18.r(false);
                        ygr0Var = null;
                    } else {
                        x340Var18.i0(-1430018951);
                        boolean zG6 = x340Var18.g(tob1Var);
                        Object objT13 = x340Var18.T();
                        if (zG6 || objT13 == fkj0.X) {
                            objT13 = new ygr0(tob1Var, 4);
                            x340Var18.s0(objT13);
                        }
                        x340Var18.r(false);
                        ygr0Var = (ygr0) objT13;
                    }
                    bzn1.e((qim0) null, (vu30) null, false, apo.r(498036412, new tte1((x811) obj8, (es41) obj7, (dgq) obj4, (u911) obj5, (iu30) obj6), x340Var18), qgr0Var, (ngr0) null, ygr0Var, (Function0) null, x340Var18, 2100224, 167);
                } else {
                    x340Var18.b0();
                }
                return rih1Var;
            default:
                x340 x340Var19 = (b0k) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                g2n1 g2n1Var = (g2n1) obj6;
                iu30 iu30Var6 = (iu30) obj5;
                List list = (List) obj4;
                yrg0 yrg0Var = (yrg0) obj7;
                x340 x340Var20 = x340Var19;
                if (x340Var20.Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    qim0 qim0VarN = anm1.N("your_updates_notifications_list", u291.d(qim0Var, 1.0f));
                    uwr uwrVar3 = cbx.a;
                    cvx cvxVar = cbx.b(x340Var20).b;
                    hdh hdhVarN = lnn1.n(uyn1.h(1, 0.0f, 16.0f), (vzq0) obj8);
                    xtb0 xtb0Var = (xtb0) obj3;
                    boolean zI7 = x340Var20.i(yrg0Var) | x340Var20.i(list) | x340Var20.g(iu30Var6) | x340Var20.i(g2n1Var);
                    Object objT14 = x340Var20.T();
                    if (zI7 || objT14 == fkj0.X) {
                        objT14 = new m9i1(yrg0Var, list, iu30Var6, g2n1Var, (byte) 12);
                        x340Var20.s0(objT14);
                    }
                    s3o1.d(qim0VarN, xtb0Var, hdhVarN, (g36) null, (nl3) null, (iq20) null, false, (h3h1) null, (iu30) objT14, x340Var20, 0, 504);
                } else {
                    x340Var20.b0();
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wyy0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wyy0(Object obj, Object obj2, Function0 function0, Function0 function1, Function0 function2, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.f = function0;
        this.d = function1;
        this.e = function2;
        this.g = qim0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wyy0(String str, c380 c380Var, String str2, jtl1 jtl1Var, Function0 function0, qim0 qim0Var, int i) {
        super(2);
        this.a = (byte) 0;
        this.b = str;
        this.d = c380Var;
        this.c = str2;
        this.e = jtl1Var;
        this.f = function0;
        this.g = qim0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wyy0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wyy0(Function0 function0, vu30 vu30Var, vu30 vu30Var2, r891 r891Var, bke1 bke1Var, j2i j2iVar) {
        super(2);
        this.a = (byte) 9;
        this.f = function0;
        this.b = vu30Var;
        this.c = vu30Var2;
        this.d = r891Var;
        this.e = bke1Var;
        this.g = j2iVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wyy0(dc8 dc8Var, String str, List list, lgu0 lgu0Var, iu30 iu30Var, Function0 function0, int i) {
        super(2);
        this.a = (byte) 2;
        this.c = dc8Var;
        this.b = str;
        this.d = list;
        this.e = lgu0Var;
        this.g = iu30Var;
        this.f = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wyy0(yqg yqgVar, hdl1 hdl1Var, Function0 function0, iu30 iu30Var, qim0 qim0Var, Function0 function1, int i) {
        super(2);
        this.a = (byte) 23;
        this.b = yqgVar;
        this.c = hdl1Var;
        this.f = function0;
        this.d = iu30Var;
        this.g = qim0Var;
        this.e = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wyy0(qim0 qim0Var, sm51 sm51Var, nue1 nue1Var, zge1 zge1Var, ggv ggvVar, iu30 iu30Var) {
        super(2);
        this.a = (byte) 15;
        this.g = qim0Var;
        this.b = sm51Var;
        this.c = nue1Var;
        this.d = zge1Var;
        this.e = ggvVar;
        this.f = iu30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wyy0(eq01 eq01Var, Function0 function0, Function0 function1, gw70 gw70Var, iu30 iu30Var, znb0 znb0Var) {
        super(2);
        this.a = (byte) 3;
        this.b = eq01Var;
        this.f = function0;
        this.c = function1;
        this.d = gw70Var;
        this.e = iu30Var;
        this.g = znb0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wyy0(up51 up51Var, String str, String str2, Function0 function0, j2i j2iVar, j2i j2iVar2, int i) {
        super(2);
        this.a = (byte) 6;
        this.d = up51Var;
        this.b = str;
        this.c = str2;
        this.f = function0;
        this.e = j2iVar;
        this.g = j2iVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wyy0(er71 er71Var, qim0 qim0Var, idn0 idn0Var, iu30 iu30Var, cr71 cr71Var, gw70 gw70Var) {
        super(2);
        this.a = (byte) 7;
        this.b = er71Var;
        this.g = qim0Var;
        this.c = idn0Var;
        this.d = iu30Var;
        this.e = cr71Var;
        this.f = gw70Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wyy0(he81 he81Var, j2i j2iVar, j2i j2iVar2, j2i j2iVar3, qim0 qim0Var, VideoSurfaceView videoSurfaceView, int i) {
        super(2);
        this.a = (byte) 8;
        this.b = he81Var;
        this.c = j2iVar;
        this.d = j2iVar2;
        this.e = j2iVar3;
        this.g = qim0Var;
        this.f = videoSurfaceView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wyy0(y7e1 y7e1Var, Function0 function0, qim0 qim0Var, iu30 iu30Var, iu30 iu30Var2, yt91 yt91Var, int i) {
        super(2);
        this.a = (byte) 11;
        this.b = y7e1Var;
        this.f = function0;
        this.g = qim0Var;
        this.c = iu30Var;
        this.d = iu30Var2;
        this.e = yt91Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wyy0(k7l1 k7l1Var, Function0 function0, ljj1 ljj1Var, ven0 ven0Var, k0t k0tVar, ven0 ven0Var2) {
        super(2);
        this.a = (byte) 21;
        this.b = k7l1Var;
        this.f = function0;
        this.c = ljj1Var;
        this.d = ven0Var;
        this.e = k0tVar;
        this.g = ven0Var2;
    }
}
