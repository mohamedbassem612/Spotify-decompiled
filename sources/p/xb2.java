package p;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.apprater.appraterdialog.AppRaterActivity;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.mobius.rx3.RxEventSources;
import com.spotify.wrapped.v1.proto.SceneTemplate;
import io.reactivex.rxjava3.core.ObservableSource;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class xb2 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xb2(Object obj, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
    }

    public final Object invoke(Object obj, Object obj2) {
        goj0 goj0VarA;
        goj0 goj0VarA2;
        iq6 iq6Var;
        rwm rwmVar;
        int i;
        goj0 goj0VarA3;
        byte b = this.a;
        nim0 nim0Var = nim0.a;
        byte b2 = 28;
        op6 op6Var = null;
        byte b3 = 3;
        boolean z = false;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                yb2 yb2Var = (yb2) obj3;
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    maa maaVar = (maa) yb2Var.c.get();
                    ac2 ac2Var = yb2Var.b;
                    otw.c(maaVar, new kb2(ac2Var.a, ac2Var.b), (qim0) null, (ipb1) null, x340Var2, 0, 12);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                zd2 zd2Var = (zd2) obj3;
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    Context context = (Context) x340Var4.k(AndroidCompositionLocals_androidKt.b);
                    zxo zxoVar = zd2Var.b;
                    pd2 pd2Var = zd2Var.c;
                    boolean zI = x340Var4.i(zd2Var) | x340Var4.i(context);
                    Object objT = x340Var4.T();
                    if (zI || objT == fkj0.X) {
                        objT = new yd2(zd2Var, context);
                        x340Var4.s0(objT);
                    }
                    WeakHashMap weakHashMap = osl1.x;
                    c8o.b(zxoVar, pd2Var, (vu30) objT, td6.o(lhc.g(x340Var4).g, 32, nim0Var), x340Var4, 0);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 2:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ma2 ma2Var = (ma2) x340Var6.k(oce0.a);
                    qim0 qim0VarH = l6o1.H(u291.d(nim0Var, 1.0f), l6o1.C(0, 0, 1, x340Var6), false, 14);
                    WeakHashMap weakHashMap2 = osl1.x;
                    qim0 qim0VarY = too1.y(qim0VarH, lhc.g(x340Var6).g);
                    af2 af2Var = (af2) obj3;
                    mbh mbhVarA = jbh.a(h36.e, een.Q0, x340Var6, 0);
                    int iHashCode = Long.hashCode(x340Var6.T);
                    xos0 xos0VarM = x340Var6.m();
                    qim0 qim0VarE = zr7.E(x340Var6, qim0VarY);
                    hzj.A.getClass();
                    if (x340Var6.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var6.m0();
                    if (x340Var6.S) {
                        x340Var6.l(hmb0.t1);
                    } else {
                        x340Var6.v0();
                    }
                    nko1.H(mbhVarA, x340Var6, y580.O0);
                    nko1.H(xos0VarM, x340Var6, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var6, y580.R0);
                    nko1.F(x340Var6);
                    nko1.H(qim0VarE, x340Var6, y580.Y);
                    maa maaVar2 = (maa) af2Var.b.get();
                    if2 if2Var = af2Var.c;
                    otw.c(maaVar2, new gf2(if2Var.a, if2Var.b), (qim0) null, (ipb1) null, x340Var6, 0, 12);
                    boolean zI2 = x340Var6.i(af2Var) | x340Var6.i(ma2Var);
                    Object objT2 = x340Var6.T();
                    if (zI2 || objT2 == fkj0.X) {
                        objT2 = new q4(af2Var, ma2Var, (lnm) null, (byte) 28);
                        x340Var6.s0(objT2);
                    }
                    qxd0.t(rih1Var, x340Var6, (vu30) objT2);
                    x340Var6.r(true);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 3:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                boolean zY = x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2);
                rih1 rih1Var2 = rih1.a;
                if (zY) {
                    hh2 hh2Var = (hh2) obj3;
                    otw.c(hh2Var, rih1Var2, (qim0) null, wpb1.C("ageEntryElementState", hh2Var, rih1Var2, x340Var8, 390, 8), x340Var8, 48, 4);
                } else {
                    x340Var8.b0();
                }
                return rih1Var2;
            case 4:
                mh2 mh2Var = (mh2) obj3;
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                m4c m4cVar = fkj0.X;
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    View view = (View) x340Var10.k(AndroidCompositionLocals_androidKt.f);
                    boolean zI3 = x340Var10.i(mh2Var);
                    Object objT3 = x340Var10.T();
                    if (zI3 || objT3 == m4cVar) {
                        objT3 = new lh2(3, mh2Var, mh2.class, "submitAge", "submitAge(III)V", 0, (byte) 0);
                        x340Var10.s0(objT3);
                    }
                    xu30 xu30Var = (xu30) objT3;
                    boolean zI4 = x340Var10.i(mh2Var);
                    Object objT4 = x340Var10.T();
                    if (zI4 || objT4 == m4cVar) {
                        objT4 = new q01(0, mh2Var, mh2.class, "confirmAge", "confirmAge()V", 0, (byte) 9);
                        x340Var10.s0(objT4);
                    }
                    Function0 function0 = (Function0) objT4;
                    boolean zI5 = x340Var10.i(mh2Var);
                    Object objT5 = x340Var10.T();
                    if (zI5 || objT5 == m4cVar) {
                        objT5 = new q01(0, mh2Var, mh2.class, "editAge", "editAge()V", 0, (byte) 10);
                        x340Var10.s0(objT5);
                    }
                    hh2 hh2Var2 = new hh2(xu30Var, function0, (Function0) objT5, mh2Var.b, mh2Var.c, mh2Var.e, RxEventSources.a(new ObservableSource[]{mh2Var.f}));
                    op80 jp80Var = new jp80(view);
                    op80 eq80Var = new eq80(bco0.a);
                    op80 wchVar = q6x.b;
                    if (jp80Var.equals(wchVar) && eq80Var.equals(wchVar)) {
                        jp80Var = wchVar;
                    } else if (jp80Var.equals(wchVar)) {
                        jp80Var = eq80Var;
                    } else if (!eq80Var.equals(wchVar)) {
                        wchVar = new wch(jp80Var, eq80Var);
                        jp80Var = wchVar;
                    }
                    xhk1.c(view, jp80Var);
                    qsw.c(new obk1(view), apo.r(-266780207, new xb2(hh2Var2, b3), x340Var10), x340Var10, 48);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 5:
                x340 x340Var11 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    Activity activity = (Activity) x340Var12.k(mce0.a);
                    Object objT6 = x340Var12.T();
                    m4c m4cVar2 = fkj0.X;
                    if (objT6 == m4cVar2) {
                        objT6 = qxd0.M(o6x.a, x340Var12);
                        x340Var12.s0(objT6);
                    }
                    c9n c9nVar = (c9n) objT6;
                    boolean zI6 = x340Var12.i(activity);
                    Object objT7 = x340Var12.T();
                    if (zI6 || objT7 == m4cVar2) {
                        objT7 = new q30(activity, (byte) 1);
                        x340Var12.s0(objT7);
                    }
                    q3p1.b(6, 0, (Function0) objT7, x340Var12, true);
                    nyx.a(2, (wux) null, apo.r(1323880485, new q1((ii2) obj3, activity, c9nVar, b2), x340Var12), x340Var12, 3078, 6);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 6:
                ((Number) obj2).intValue();
                nln.e((eic1) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 7:
                x340 x340Var13 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                nz2 nz2Var = (nz2) obj3;
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    qsw.a(apo.r(1822668412, new kz2(nz2Var, f4p1.j(nz2Var.X0, (Object) null, (iac0) null, x340Var14, 48, 14), (byte) 1), x340Var14), x340Var14);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case 8:
                ((Number) obj2).intValue();
                xto.e((View) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 9:
                x340 x340Var15 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                o03 o03Var = (o03) obj3;
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    Object[] objArr = new Object[0];
                    Object objT8 = x340Var16.T();
                    m4c m4cVar3 = fkj0.X;
                    if (objT8 == m4cVar3) {
                        objT8 = ou1.P0;
                        x340Var16.s0(objT8);
                    }
                    ven0 ven0Var = (ven0) k5p1.s(objArr, (Function0) objT8, x340Var16, 48);
                    Object[] objArr2 = new Object[0];
                    Object objT9 = x340Var16.T();
                    if (objT9 == m4cVar3) {
                        objT9 = ou1.O0;
                        x340Var16.s0(objT9);
                    }
                    ven0 ven0Var2 = (ven0) k5p1.s(objArr2, (Function0) objT9, x340Var16, 48);
                    boolean zI7 = x340Var16.i(ven0Var2) | x340Var16.i(o03Var) | x340Var16.i(ven0Var);
                    Object objT10 = x340Var16.T();
                    if (zI7 || objT10 == m4cVar3) {
                        objT10 = new t6(o03Var, ven0Var2, ven0Var, (byte) 11);
                        x340Var16.s0(objT10);
                    }
                    qxd0.i(rih1Var, (iu30) objT10, x340Var16);
                    k03 k03Var = o03Var.j;
                    String str = k03Var.a;
                    ArrayList arrayList = k03Var.b;
                    String str2 = k03Var.c;
                    boolean zI8 = x340Var16.i(ven0Var) | x340Var16.i(o03Var) | x340Var16.i(ven0Var2);
                    Object objT11 = x340Var16.T();
                    if (zI8 || objT11 == m4cVar3) {
                        objT11 = new hh(o03Var, ven0Var, ven0Var2, (byte) 10);
                        x340Var16.s0(objT11);
                    }
                    Function0 function1 = (Function0) objT11;
                    boolean zI9 = x340Var16.i(o03Var);
                    Object objT12 = x340Var16.T();
                    if (zI9 || objT12 == m4cVar3) {
                        objT12 = new n03(o03Var, (byte) 0);
                        x340Var16.s0(objT12);
                    }
                    iu30 iu30Var = (iu30) objT12;
                    boolean zI10 = x340Var16.i(o03Var);
                    Object objT13 = x340Var16.T();
                    if (zI10 || objT13 == m4cVar3) {
                        objT13 = new n03(o03Var, (byte) 1);
                        x340Var16.s0(objT13);
                    }
                    d1u.a(str, arrayList, str2, function1, iu30Var, (qim0) null, (iu30) objT13, x340Var16, 0);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            case 10:
                x340 x340Var17 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                x340 x340Var18 = x340Var17;
                if (x340Var18.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    String str3 = ((i73) obj3).d;
                    uwr uwrVar = cbx.a;
                    uwo1.e(str3, null, cbx.d(x340Var18).k, 0L, null, null, 0, false, null, 0, null, x340Var18, 0, 0, 2042);
                } else {
                    x340Var18.b0();
                }
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                return t5p1.j(new c1v0(((opv0) ((ycc1) obj3).c).b((String) obj, (ymd0) obj2), (byte) 7), 3);
            case grn1.d /* 12 */:
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-album-entity-unlock-card-section";
                x6h1VarI.f = "2.0.0";
                x6h1VarI.g = "22.0.0";
                y6h1 y6h1VarA = x6h1VarI.a();
                List listSingletonList = Collections.singletonList("album");
                x6h1 x6h1VarC = y6h1VarA.c();
                x6h1VarC.i.add(new a7h1("unlock_card", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = true;
                y6h1 y6h1VarA2 = x6h1VarC.a();
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1VarA2;
                ((xjn) k7h1Var).b = (r6h1) obj3;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                k7h1Var.e = listSingletonList;
                return k7h1Var.a();
            case 13:
                ((ft3) obj3).e.invoke(new u051(((Number) obj).intValue(), (h951) obj2));
                return rih1Var;
            case 14:
                return new hx3(((jw3) obj3).b.a, (c2b0) obj, false);
            case 15:
                b8k1.a((ViewGroup) obj3, (String) obj, new q04((Function0) obj2));
                return rih1Var;
            case 16:
                y24 y24Var = (y24) obj;
                z24 z24Var = (z24) obj2;
                int i2 = ((e34) obj3).f;
                x360 x360Var = y24Var.b;
                String str4 = y24Var.a;
                ioj0 ioj0Var = z24Var.a;
                if (ioj0Var == null) {
                    return new b34(str4, x360Var);
                }
                ArrayList arrayList2 = y24Var.c;
                ArrayList<x24> arrayList3 = new ArrayList();
                Iterator it = arrayList2.iterator();
                while (true) {
                    Class<z081> cls = z081.class;
                    if (!it.hasNext()) {
                        if (arrayList3.isEmpty()) {
                            return new b34(str4, x360Var);
                        }
                        ArrayList arrayList4 = new ArrayList(q7h.U(arrayList3, 10));
                        for (x24 x24Var : arrayList3) {
                            String str5 = x24Var.a;
                            hoj0 hoj0VarC = ioj0Var.c(cls, str5);
                            ez00 ez00Var = (hoj0VarC == null || (goj0VarA = hoj0VarC.a()) == null) ? null : (ez00) goj0VarA.a;
                            if (ez00Var == null) {
                                hhg1.f(f4i1.f(cls.getSimpleName(), " not found for uri: ", str5));
                                return null;
                            }
                            z081 z081Var = (z081) ez00Var;
                            arrayList4.add(new e04(i2, z081Var.c, z081Var.a, x24Var.b, z081Var.b, z081Var.d));
                            cls = cls;
                        }
                        ArrayList arrayList5 = new ArrayList();
                        for (Object obj4 : arrayList4) {
                            if (!o7h.i0(z24Var.b, ((e04) obj4).e)) {
                                arrayList5.add(obj4);
                            }
                        }
                        ArrayList arrayList6 = new ArrayList(arrayList5);
                        if (y24Var.d) {
                            arrayList6.add(d04.a);
                        }
                        return new a34(o7h.d1(arrayList6, 8), str4, x360Var);
                    }
                    Object next = it.next();
                    hoj0 hoj0VarC2 = ioj0Var.c(cls, ((x24) next).a);
                    if (hoj0VarC2 != null ? hoj0VarC2 instanceof goj0 : false) {
                        arrayList3.add(next);
                    }
                }
                break;
            case 17:
                pay payVar = (pay) obj;
                pay payVar2 = (pay) obj2;
                pay payVar3 = pay.c;
                if (payVar == payVar3 && payVar2 == payVar3 && !((ln00) obj3).a.e) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 18:
                return f6o1.A(new kpg0(new br0((t2j0) ((md5) obj3).b), k74.T0), null, null, 3);
            case 19:
                x340 x340Var19 = (b0k) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                AppRaterActivity appRaterActivity = (AppRaterActivity) obj3;
                x340 x340Var20 = x340Var19;
                if (x340Var20.Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    jdx jdxVar = jdx.c;
                    boolean zI11 = x340Var20.i(appRaterActivity);
                    Object objT14 = x340Var20.T();
                    if (zI11 || objT14 == fkj0.X) {
                        objT14 = new lv5(appRaterActivity, (byte) 1);
                        x340Var20.s0(objT14);
                    }
                    Function0 function2 = (Function0) objT14;
                    if (ihc1.y0("rate_app_no_thanks")) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        return null;
                    }
                    foo1.c(new gbx(new y50("rate_app_no_thanks"), function2), jdxVar, null, null, null, null, null, null, null, null, m6i.d, x340Var20, 0, 48, 2044);
                } else {
                    x340Var20.b0();
                }
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                gy5 gy5Var = (gy5) obj3;
                return new sma1(new jpg0(zu70.a(gy5Var.b, new epb1((zob1) obj), gy5Var.e, gy5Var.c, gy5Var.d, tbo0.b, 4032), k74.X0), new rma1((Integer) null, 2131167033, (Integer) null, 13));
            case 21:
                ((Number) obj2).intValue();
                b3o1.c((fz5) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 22:
                String str6 = ((xc6) obj).a;
                hoj0 hoj0VarC3 = ((ioj0) obj2).c(iq6.class, str6);
                op6 op6Var2 = (hoj0VarC3 == null || (goj0VarA2 = hoj0VarC3.a()) == null || (iq6Var = (iq6) goj0VarA2.a) == null) ? null : (op6) o7h.s0(iq6Var.a);
                if (op6Var2 != null) {
                    Set set = s4b1.f;
                    if (uic.g(op6Var2.a, blc0.X4)) {
                        op6Var = op6Var2;
                    }
                }
                if (op6Var == null || !((xrk) ((cd6) obj3).i).b()) {
                    return (op6Var == null && op6Var2 != null) ? new yc6(str6) : ad6.a;
                }
                return new zc6(op6Var.a);
            case 23:
                ((Number) obj2).intValue();
                ((dd6) obj3).a((b0k) obj, czo1.p(1));
                return rih1Var;
            case 24:
                ((Number) obj2).intValue();
                ((ed6) obj3).a((b0k) obj, czo1.p(1));
                return rih1Var;
            case 25:
                ((Number) obj2).intValue();
                x340 x340Var21 = (b0k) obj;
                x340Var21.i0(1239553405);
                vnr0 vnr0VarA = shy0.a(((SceneTemplate.ArtistCardsContent.Card3) obj3).x(), x340Var21);
                x340Var21.r(false);
                return vnr0VarA;
            case 26:
                ayg aygVar = (ayg) obj;
                tv80 tv80Var = (tv80) obj2;
                mjm mjmVar = (mjm) ((hw2) obj3).f;
                String str7 = aygVar.c;
                ulg0 ulg0Var = aygVar.d;
                if (ulg0Var instanceof tlg0) {
                    rwmVar = rwm.a;
                } else if (ulg0Var instanceof qlg0) {
                    rwmVar = rwm.d;
                } else if (ulg0Var instanceof rlg0) {
                    rwmVar = rwm.b;
                } else {
                    if (!(ulg0Var instanceof slg0)) {
                        eg.o();
                        return null;
                    }
                    rwmVar = rwm.c;
                }
                rwm rwmVar2 = rwmVar;
                int count = ulg0Var.getCount();
                i1o1.y(mjmVar, str7, tv80Var, null, rwmVar2, count > 0 ? Integer.valueOf(count) : null, aygVar.e, 4);
                return rih1Var;
            case 27:
                x340 x340Var22 = (b0k) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                x340 x340Var23 = x340Var22;
                if (x340Var23.Y(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    uwo1.e(((vn6) obj3).a, null, null, 0L, null, null, 0, false, null, 0, null, x340Var23, 0, 0, 2046);
                } else {
                    x340Var23.b0();
                }
                return rih1Var;
            case 28:
                hoj0 hoj0VarC4 = ((ioj0) obj2).c(mr6.class, ((nr6) obj).a);
                mr6 mr6Var = (mr6) ((hoj0VarC4 == null || (goj0VarA3 = hoj0VarC4.a()) == null) ? null : (ez00) goj0VarA3.a);
                if (mr6Var == null) {
                    return or6.a;
                }
                String str8 = mr6Var.a;
                String str9 = mr6Var.c;
                String str10 = mr6Var.b;
                boolean z2 = mr6Var.d;
                boolean z3 = mr6Var.f;
                int iC = l1d.C(mr6Var.e);
                if (iC == 0) {
                    i = 1;
                } else if (iC == 1) {
                    i = 2;
                } else {
                    if (iC != 2) {
                        eg.o();
                        return null;
                    }
                    i = 3;
                }
                return new pr6(new ljd0(str8, i, str10, Instant.ofEpochSecond(mr6Var.h, mr6Var.g).atZone(ZoneId.of(((sr6) obj3).a.g().getID())).format(DateTimeFormatter.ISO_INSTANT), str9, z2, z3, true));
            default:
                c0p c0pVar = (c0p) ((jly0) ((tr6) ((ur6) obj3).b).a.c).get();
                c0pVar.getClass();
                oql oqlVar = (oql) c0pVar.a.b;
                yqg yqgVar = (yqg) ((g23) oqlVar.b).b;
                c8o.l(yqgVar);
                g23 g23Var = (g23) oqlVar.b;
                gw70 gw70Var = (gw70) g23Var.c;
                c8o.l(gw70Var);
                kyo kyoVar = (kyo) g23Var.d;
                c8o.l(kyoVar);
                return new jpg0(f6o1.A(new sr6(yqgVar, gw70Var, kyoVar, (zob1) obj), null, null, 3), gn6.Z0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xb2(Object obj, int i, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
    }
}
