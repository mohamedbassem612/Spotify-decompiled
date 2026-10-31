package p;

import android.content.Intent;
import android.os.Parcelable;
import com.spotify.mobius.First;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class a7e extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a7e(iu30 iu30Var, e5h e5hVar) {
        super(2);
        this.a = (byte) 23;
        this.c = iu30Var;
        this.b = e5hVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        n4k n4kVar = hmb0.t1;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                dio1.g((t6e) obj4, (iu30) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                zmo1.j((xtb0) obj4, (qim0) obj3, (b0k) obj, czo1.p(7));
                return rih1Var;
            case 2:
                ((Number) obj2).intValue();
                ((boe) obj4).e((aoe) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 3:
                ((Number) obj2).intValue();
                ((doe) obj4).f((coe) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 4:
                ((Number) obj2).intValue();
                ((foe) obj4).f((eoe) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 5:
                ((Number) obj2).intValue();
                ((ip31) obj4).d((Function0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 6:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                boolean zY = x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2);
                rih1 rih1Var2 = rih1.a;
                if (!zY) {
                    x340Var2.b0();
                } else if (((jre) obj4) instanceof gre) {
                    x340Var2.i0(1263273672);
                    x340Var2.r(false);
                } else {
                    x340Var2.i0(1263204480);
                    otw.c((orm0) obj3, rih1Var2, (qim0) null, (ipb1) null, x340Var2, 48, 12);
                    x340Var2.r(false);
                }
                return rih1Var2;
            case 7:
                ((Number) obj2).intValue();
                ((nwe) obj4).n1((xtj) obj3, (b0k) obj, czo1.p(7));
                return rih1Var;
            case 8:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    upo1.b((dtf) obj4, (iu30) obj3, (qim0) null, x340Var4, 0);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 9:
                ((Number) obj2).intValue();
                mqo1.a((w4i1) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 10:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                yaf yafVar = (yaf) obj3;
                m4c m4cVar = fkj0.X;
                xaf xafVar = (xaf) obj4;
                c380 c380Var = xafVar.b;
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    boolean zG = x340Var6.g(c380Var);
                    Object objT = x340Var6.T();
                    if (zG || objT == m4cVar) {
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj5 : c380Var) {
                            if (u890.j(((jwm) obj5).c, fwm.a)) {
                                arrayList.add(obj5);
                            } else {
                                arrayList2.add(obj5);
                            }
                        }
                        mmr0 mmr0Var = new mmr0(mqo1.A(arrayList), mqo1.A(arrayList2));
                        x340Var6.s0(mmr0Var);
                        objT = mmr0Var;
                    }
                    mmr0 mmr0Var2 = (mmr0) objT;
                    c380 c380Var2 = (c380) mmr0Var2.a;
                    c380 c380Var3 = (c380) mmr0Var2.b;
                    zks0 zks0Var = xafVar.a;
                    c380 c380Var4 = xafVar.c;
                    abf abfVar = yafVar.d;
                    xpi0 xpi0Var = yafVar.e;
                    veq veqVar = yafVar.h;
                    xeq xeqVar = yafVar.i;
                    pte pteVar = yafVar.g;
                    boolean zI = x340Var6.i(yafVar);
                    Object objT2 = x340Var6.T();
                    if (zI || objT2 == m4cVar) {
                        objT2 = new lwe(yafVar, (byte) 2);
                        x340Var6.s0(objT2);
                    }
                    pro1.c(zks0Var, c380Var3, c380Var2, c380Var4, abfVar, xpi0Var, veqVar, xeqVar, pteVar, (Function0) objT2, x340Var6, 0);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 11:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    otw.c((knf) obj4, new jnf(((tff) obj3).c.a()), (qim0) null, (ipb1) null, x340Var8, 0, 12);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 12:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    ohf ohfVar = (ohf) obj4;
                    phf phfVar = (phf) obj3;
                    qhf.a(ohfVar.a, ohfVar.b, ohfVar.c, phfVar.d, ohfVar.d, ohfVar.e, phfVar.f, phfVar.g, ohfVar.f, (qim0) null, x340Var10, 0);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 13:
                ((Number) obj2).intValue();
                kto1.c((jld0) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 14:
                x340 x340Var11 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    ((j2i) obj4).invoke((h5f) obj3, x340Var12, 0);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 15:
                ((Number) obj2).intValue();
                ((xqf) obj4).f(czo1.p(7), (j2i) obj3, (b0k) obj);
                return rih1Var;
            case 16:
                x340 x340Var13 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    nim0 nim0Var2 = nim0.a;
                    qim0 qim0VarN = anm1.N("chat-toolbar-test-tag", u291.f(nim0Var2, 1.0f));
                    w4i1 w4i1Var = (w4i1) obj4;
                    uu2 uu2Var = (uu2) obj3;
                    jw31 jw31VarA = ew31.a(h36.e, een.N0, x340Var14, 0);
                    int iHashCode = Long.hashCode(x340Var14.T);
                    xos0 xos0VarM = x340Var14.m();
                    qim0 qim0VarE = zr7.E(x340Var14, qim0VarN);
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
                    nko1.H(jw31VarA, x340Var14, y580.O0);
                    nko1.H(xos0VarM, x340Var14, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var14, y580.R0);
                    nko1.F(x340Var14);
                    nko1.H(qim0VarE, x340Var14, y580.Y);
                    c380 c380VarA = mqo1.A(Collections.singletonList(w4i1Var));
                    Parcelable.Creator creator = w4i1.CREATOR;
                    aqo1.f(6, 4, x340Var14, hcx.b, c380VarA, (qim0) null);
                    String str = w4i1Var.b;
                    uwr uwrVar = cbx.a;
                    uwo1.e(str, uyn1.B(nim0Var2, 8.0f, 0.0f, 0.0f, 0.0f, 14), cbx.d(x340Var14).h, 0L, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var14, 0, 0, 1720);
                    if (uu2Var instanceof tu2) {
                        x340Var14.i0(-517485892);
                        x340Var14.r(false);
                    } else {
                        x340Var14.i0(-517690585);
                        cvx cvxVar = cbx.b(x340Var14).b;
                        wwo1.d(0, x340Var14, uyn1.B(nim0Var2, 8.0f, 0.0f, 0.0f, 0.0f, 14), uu2Var instanceof su2);
                        x340Var14.r(false);
                    }
                    x340Var14.r(true);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case 17:
                ((Number) obj2).intValue();
                ((asf) obj4).e((ehd0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 18:
                x340 x340Var15 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    ((asf) obj4).e((ehd0) ((ven0) obj3).getValue(), x340Var16, 0);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            case 19:
                ((Number) obj2).intValue();
                hyo1.e((v1g) obj4, (iu30) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 20:
                ((Number) obj2).intValue();
                dzo1.a((gt40) obj4, (z9h) obj3, (b0k) obj, 1);
                return rih1Var;
            case 21:
                uog uogVar = (uog) obj;
                wog wogVarJ = v1p1.j(uogVar, ((drj0) obj4).h(uogVar.c), ((yqg) obj3).b());
                return First.c(wogVarJ, Collections.singleton(new iog(wogVarJ)));
            case 22:
                y1k1 y1k1Var = (y1k1) obj;
                uwj1 uwj1Var = (uwj1) obj2;
                String str2 = (String) obj3;
                ntg ntgVar = (ntg) obj4;
                if (!ntgVar.X && u890.j(str2, ntgVar.t)) {
                    LinkedHashMap linkedHashMap = ntgVar.f;
                    if (y1k1Var == null) {
                        linkedHashMap.remove(str2);
                    } else {
                        linkedHashMap.put(str2, new mtg(y1k1Var, uwj1Var));
                    }
                    Iterator it = ntgVar.i.iterator();
                    while (it.hasNext()) {
                        ntgVar.a((String) it.next());
                    }
                }
                return rih1Var;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                e5h e5hVar = (e5h) obj4;
                ((iu30) obj3).invoke(new a5h((String) obj, e5hVar.a, (String) obj2, e5hVar.h));
                return rih1Var;
            case 24:
                x340 x340Var17 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                x340 x340Var18 = x340Var17;
                if (x340Var18.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    otw.c((hho) obj4, new uho(ihc1.Z0(((i5h) obj3).a, "?"), (String) null, qho.a, lho.a, (String) null, (Function0) null, 242), (qim0) null, (ipb1) null, x340Var18, 8, 12);
                } else {
                    x340Var18.b0();
                }
                return rih1Var;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                x340 x340Var19 = (b0k) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                x340 x340Var20 = x340Var19;
                if (x340Var20.Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    und.a((xwa) obj4, (qim0) null, 0.0f, apo.r(-1386954010, new qff(obj3, (byte) 15), x340Var20), x340Var20, 3072, 6);
                } else {
                    x340Var20.b0();
                }
                return rih1Var;
            case 26:
                Intent intentF = ((is31) obj4).f((Intent) obj);
                if (intentF != null) {
                    ((bkl) ((ajq0) obj3).c).accept(intentF);
                }
                return rih1Var;
            case 27:
                ((Number) obj2).intValue();
                ((xid) obj4).f(czo1.p(7), (j2i) obj3, (b0k) obj);
                return rih1Var;
            case 28:
                x340 x340Var21 = (b0k) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                m4c m4cVar2 = fkj0.X;
                x340 x340Var22 = x340Var21;
                if (x340Var22.Y(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    jwh jwhVar = (jwh) obj4;
                    iu30 iu30Var = (iu30) obj3;
                    mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var22, 0);
                    int iHashCode2 = Long.hashCode(x340Var22.T);
                    xos0 xos0VarM2 = x340Var22.m();
                    qim0 qim0VarE2 = zr7.E(x340Var22, nim0Var);
                    hzj.A.getClass();
                    if (x340Var22.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var22.m0();
                    if (x340Var22.S) {
                        x340Var22.l(n4kVar);
                    } else {
                        x340Var22.v0();
                    }
                    nko1.H(mbhVarA, x340Var22, y580.O0);
                    nko1.H(xos0VarM2, x340Var22, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode2), x340Var22, y580.R0);
                    nko1.F(x340Var22);
                    nko1.H(qim0VarE2, x340Var22, y580.Y);
                    if (jwhVar.a.b) {
                        x340Var22.i0(609959322);
                        qim0 qim0VarN2 = anm1.N("carousel_title", uyn1.x(nim0Var, 16.0f));
                        uwr uwrVar2 = cbx.a;
                        uwo1.e(cwl1.o0(x340Var22, 2131953454), qim0VarN2, cbx.d(x340Var22).e, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var22, 48, 0, 2040);
                        x340Var22.r(false);
                    } else {
                        x340Var22.i0(610180724);
                        x340Var22.r(false);
                    }
                    List list = jwhVar.b;
                    ArrayList arrayList3 = new ArrayList(q7h.U(list, 10));
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(ton1.B((cvc0) it2.next()));
                    }
                    c9 c9VarF = mqo1.F(arrayList3);
                    int i = jwhVar.c;
                    boolean zG2 = x340Var22.g(iu30Var);
                    Object objT3 = x340Var22.T();
                    if (zG2 || objT3 == m4cVar2) {
                        objT3 = new wqf(iu30Var, (byte) 8);
                        x340Var22.s0(objT3);
                    }
                    iu30 iu30Var2 = (iu30) objT3;
                    boolean zG3 = x340Var22.g(iu30Var);
                    Object objT4 = x340Var22.T();
                    if (zG3 || objT4 == m4cVar2) {
                        objT4 = new wqf(iu30Var, (byte) 9);
                        x340Var22.s0(objT4);
                    }
                    d1e.b(c9VarF, i, iu30Var2, (iu30) objT4, (qim0) null, x340Var22, 0);
                    x340Var22.r(true);
                } else {
                    x340Var22.b0();
                }
                return rih1Var;
            default:
                x340 x340Var23 = (b0k) obj;
                int iIntValue12 = ((Number) obj2).intValue();
                twh twhVar = (twh) obj4;
                x340 x340Var24 = x340Var23;
                if (x340Var24.Y(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                    List list2 = twhVar.b;
                    ArrayList arrayList4 = new ArrayList(q7h.U(list2, 10));
                    Iterator it3 = list2.iterator();
                    while (it3.hasNext()) {
                        arrayList4.add(ton1.B((cvc0) it3.next()));
                    }
                    d1e.f(mqo1.F(arrayList4), qim0VarF, 16, apo.r(1371109387, new ip0((iu30) obj3, (byte) 11), x340Var24), x340Var24, 199680);
                } else {
                    x340Var24.b0();
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a7e(Object obj, Object obj2, int i, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a7e(Object obj, Object obj2, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
