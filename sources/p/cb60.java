package p;

import android.content.Context;
import android.content.Intent;
import android.view.ViewGroup;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import java.util.ArrayList;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class cb60 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cb60(pl80 pl80Var, iu30 iu30Var, iu30 iu30Var2, kl80 kl80Var) {
        super(2);
        this.a = (byte) 10;
        this.c = pl80Var;
        this.b = iu30Var;
        this.d = iu30Var2;
        this.e = kl80Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        byte b = this.a;
        nim0 nim0Var = nim0.a;
        byte b2 = 4;
        byte b3 = 6;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        Object obj5 = this.d;
        Object obj6 = this.e;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    mod.b(oi7.a.a((gw70) ((tm) obj3).e), apo.r(-652606784, new bp50(obj5, (iu30) obj4, obj6, b3), x340Var2), x340Var2, 56);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                u890.a((id01) obj3, (iu30) obj4, (Function0) obj5, (Function0) obj6, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 2:
                ((Number) obj2).intValue();
                rno1.a((String) obj3, (String) obj5, (q960) obj6, (qim0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 3:
                ((Number) obj2).intValue();
                loo1.f((rd60) obj3, (iu30) obj4, (qim0) obj5, (yqg) obj6, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 4:
                ((Number) obj2).intValue();
                ((bm00) obj3).b((zzm) obj5, (iu30) obj4, (qim0) obj6, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 5:
                ((Number) obj2).intValue();
                u1p1.k((me60) obj3, (j2i) obj5, (iu30) obj4, (qim0) obj6, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 6:
                ((Number) obj2).intValue();
                ((t2b) obj3).c((tx70) obj5, (qim0) obj6, (iu30) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 7:
                Intent intent = (Intent) obj;
                th61 th61Var = (th61) obj2;
                ro30 ro30Var = (ro30) obj3;
                m021 m021VarA = ((vn41) ro30Var.c).a();
                if (m021VarA == null) {
                    Single singleJust = Single.just(deh.a);
                    singleJust.getClass();
                    return singleJust;
                }
                Single map = ((xi7) ((rr10) obj6).b).l(intent, th61Var).flatMap(new ouz((Scheduler) ro30Var.b, (byte) 14)).map(new st60(m021VarA, ro30Var, (fc3) obj4, intent, (String) obj5));
                map.getClass();
                return map;
            case 8:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                iu30 iu30Var = (iu30) obj4;
                zf80 zf80Var = (zf80) obj6;
                cm0 cm0Var = (cm0) obj5;
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    Object objT = x340Var4.T();
                    m4c m4cVar = fkj0.X;
                    if (objT == m4cVar) {
                        objT = new ffj1((i8p) cm0Var.f, (vtm0) cm0Var.g, new a9l1());
                        x340Var4.s0(objT);
                    }
                    ffj1 ffj1Var = (ffj1) objT;
                    Object objT2 = x340Var4.T();
                    if (objT2 == m4cVar) {
                        objT2 = ((abu0) cm0Var.i).e(UUID.randomUUID().toString(), false);
                        x340Var4.s0(objT2);
                    }
                    zau0 zau0Var = (zau0) objT2;
                    Object objT3 = x340Var4.T();
                    if (objT3 == m4cVar) {
                        objT3 = v8r.q(Boolean.FALSE);
                        x340Var4.s0(objT3);
                    }
                    ven0 ven0Var = (ven0) objT3;
                    ksw kswVar = (ksw) obj3;
                    tl7 tl7Var = (tl7) cm0Var.e;
                    String str = zf80Var.f;
                    boolean zI = x340Var4.i(ven0Var) | x340Var4.i(cm0Var) | x340Var4.i(zau0Var);
                    Object objT4 = x340Var4.T();
                    if (zI || objT4 == m4cVar) {
                        objT4 = new ag80(cm0Var, zau0Var, ven0Var, (byte) 0);
                        x340Var4.s0(objT4);
                    }
                    Function0 function0 = (Function0) objT4;
                    boolean zI2 = x340Var4.i(ven0Var) | x340Var4.i(cm0Var) | x340Var4.i(zau0Var);
                    Object objT5 = x340Var4.T();
                    if (zI2 || objT5 == m4cVar) {
                        objT5 = new ag80(cm0Var, zau0Var, ven0Var, (byte) 1);
                        x340Var4.s0(objT5);
                    }
                    i1o1.b(kswVar, tl7Var, str, function0, (Function0) objT5, x340Var4, 0, 0);
                    qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                    uwr uwrVar = cbx.a;
                    qim0 qim0VarF2 = dug.f(qim0VarF, cbx.a(x340Var4).a.c, d4o1.a);
                    boolean zI3 = x340Var4.i(zf80Var);
                    Object objT6 = x340Var4.T();
                    if (zI3 || objT6 == m4cVar) {
                        objT6 = new ux70(zf80Var, (byte) 8);
                        x340Var4.s0(objT6);
                    }
                    qim0 qim0VarB = s161.b(qim0VarF2, false, (iu30) objT6);
                    gra graVar = een.h;
                    zzq0 zzq0Var = new zzq0(0.0f, 0.0f, 0.0f, 0.0f);
                    boolean zG = x340Var4.g(iu30Var);
                    Object objT7 = x340Var4.T();
                    if (zG || objT7 == m4cVar) {
                        objT7 = new u460(iu30Var, (byte) 28);
                        x340Var4.s0(objT7);
                    }
                    cwl1.b(qim0VarB, graVar, (hw61) null, (pgx) null, zzq0Var, (max) null, false, (idn0) null, (ga80) null, new gbx(z50.c, (Function0) objT7), (gbx) null, apo.r(-1473769695, new mse(zf80Var, ffj1Var, cm0Var, iu30Var, zau0Var, ven0Var, (byte) 2), x340Var4), x340Var4, 0, 48, 1516);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 9:
                ((Number) obj2).intValue();
                x8p1.g((zl80) obj3, (ul80) obj5, (vu30) obj6, (qim0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 10:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    iu30 iu30Var2 = (iu30) obj4;
                    iu30 iu30Var3 = (iu30) obj5;
                    kl80 kl80Var = (kl80) obj6;
                    for (cl80 cl80Var : ((pl80) obj3).c) {
                        x340Var6.f0(804105883, cl80Var.getId());
                        im80.a(cl80Var, iu30Var2, iu30Var3, kl80Var, u291.f(nim0Var, 1.0f), x340Var6, 24576);
                        x340Var6.r(false);
                    }
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    qsw.c((obk1) obj3, apo.r(913059982, new mb90((vx40) obj5, (j2i) obj6, (ViewGroup) obj4, (byte) 3), x340Var8), x340Var8, 48);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case grn1.d /* 12 */:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    qsw.c((obk1) obj3, apo.r(1534031785, new mb90((ye90) obj5, (j2i) obj6, (ViewGroup) obj4, b2), x340Var10), x340Var10, 48);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 13:
                ((Number) obj2).intValue();
                iu90.c((c380) obj3, (x880) obj5, (iu30) obj4, (qim0) obj6, (b0k) obj, czo1.p(7));
                return rih1Var;
            case 14:
                ((Number) obj2).intValue();
                wpb1.f((c380) obj3, (Function0) obj5, (Function0) obj6, (Function0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 15:
                ((Number) obj2).intValue();
                ltn1.l((c380) obj3, (vu30) obj5, (hfp) obj6, (qim0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 16:
                pyl pylVar = (pyl) obj2;
                ((l811) obj3).a = true;
                if (pylVar instanceof kl90) {
                    ((ArrayList) obj5).add(pylVar);
                } else if (pylVar instanceof gd21) {
                    ((p811) obj6).a = krz0.t;
                } else {
                    ((l811) obj4).a = true;
                }
                return rih1Var;
            case 17:
                eyb0 eyb0Var = (eyb0) obj5;
                x340 x340Var11 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                m4c m4cVar2 = fkj0.X;
                iu30 iu30Var4 = (iu30) obj4;
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    int iC = l1d.C(((uxb0) ((yxb0) obj3).c).b);
                    if (iC == 0) {
                        x340Var12.i0(-1139365360);
                        Function0 function1 = (Function0) obj6;
                        boolean zG2 = x340Var12.g(iu30Var4);
                        Object objT8 = x340Var12.T();
                        if (zG2 || objT8 == m4cVar2) {
                            objT8 = new jwa0(iu30Var4, (byte) 4);
                            x340Var12.s0(objT8);
                        }
                        epo1.j(eyb0Var, function1, (iu30) objT8, null, x340Var12, 0);
                        x340Var12.r(false);
                    } else {
                        if (iC != 1) {
                            throw p3d1.k(x340Var12, -1139366672, false);
                        }
                        x340Var12.i0(-1139359116);
                        Function0 function2 = (Function0) obj6;
                        boolean zG3 = x340Var12.g(iu30Var4);
                        Object objT9 = x340Var12.T();
                        if (zG3 || objT9 == m4cVar2) {
                            objT9 = new jwa0(iu30Var4, (byte) 5);
                            x340Var12.s0(objT9);
                        }
                        ppo1.e(eyb0Var, function2, (iu30) objT9, null, x340Var12, 0);
                        x340Var12.r(false);
                    }
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 18:
                ((Number) obj2).intValue();
                ((rbc0) obj3).c((uvx) obj5, (jmb1) obj6, (iu30) obj4, (b0k) obj, czo1.p(9));
                return rih1Var;
            case 19:
                x340 x340Var13 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                jmb1 jmb1Var = (unb1) obj3;
                x340 x340Var14 = x340Var13;
                if (!x340Var14.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x340Var14.b0();
                } else if (jmb1Var instanceof jmb1) {
                    x340Var14.i0(-1639520053);
                    ((rbc0) obj5).c((uvx) obj6, jmb1Var, (iu30) obj4, x340Var14, 8);
                    x340Var14.r(false);
                } else {
                    if (!(jmb1Var instanceof inb1) && !(jmb1Var instanceof tlb1)) {
                        throw p3d1.k(x340Var14, -1639521180, false);
                    }
                    x340Var14.i0(-1639514058);
                    l4p1.m(null, x340Var14, 0);
                    x340Var14.r(false);
                }
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                ((Number) obj2).intValue();
                oec0.c((lec0) obj3, (iu30) obj4, (qim0) obj5, (zzq0) obj6, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 21:
                ((Number) obj2).intValue();
                myo1.h((r32) obj3, (iu30) obj4, (iu30) obj5, (qim0) obj6, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 22:
                ((Number) obj2).intValue();
                d0p1.g((trt0) obj3, (String) obj5, (String) obj6, (qim0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 23:
                ((Number) obj2).intValue();
                s1p1.p((dc81) obj3, (rv21) obj5, (qim0) obj6, (Function0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 24:
                ((Number) obj2).intValue();
                l3p1.m((Context) obj3, (Function0) obj5, (String) obj6, (qim0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 25:
                ((Number) obj2).intValue();
                l4p1.i((lik1) obj3, (zzz0) obj5, (idm) obj6, (iu30) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 26:
                x340 x340Var15 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                et9 et9Var = (et9) obj3;
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    oie0 oie0Var = (oie0) et9Var.e;
                    boolean zI4 = x340Var16.i(et9Var) | x340Var16.i((cir0) obj5) | x340Var16.g((String) obj6) | x340Var16.g((String) obj4);
                    cir0 cir0Var = (cir0) obj5;
                    String str2 = (String) obj6;
                    String str3 = (String) obj4;
                    Object objT10 = x340Var16.T();
                    if (zI4 || objT10 == fkj0.X) {
                        nhb nhbVar = new nhb(et9Var, cir0Var, str2, str3, (lnm) null, (byte) 4);
                        x340Var16.s0(nhbVar);
                        objT10 = nhbVar;
                    }
                    x8p1.h(oie0Var, (iu30) objT10, apo.r(-2042372727, new kmd0(et9Var, (byte) 6), x340Var16), x340Var16, 384);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            case 27:
                ((Number) obj2).intValue();
                z8p1.i((aoe0) obj3, (Function0) obj5, (Function0) obj6, (qim0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 28:
                x340 x340Var17 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                x340 x340Var18 = x340Var17;
                if (x340Var18.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    lye0 lye0Var = (lye0) obj3;
                    lcc.k(!lye0Var.f, (iye0) obj5, (k2t0) obj6, lye0Var.c instanceof yzy, (iu30) obj4, x340Var18, 0);
                } else {
                    x340Var18.b0();
                }
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                sqe.i((r0f0) obj3, (jqp) obj5, (w6e0) obj6, (qim0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cb60(int i, Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        super(2);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cb60(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        super(2);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cb60(Object obj, iu30 iu30Var, Object obj2, Object obj3, int i, byte b) {
        super(2);
        this.a = b;
        this.c = obj;
        this.b = iu30Var;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cb60(byte b, int i, Object obj, Object obj2, iu30 iu30Var, qim0 qim0Var) {
        super(2);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = iu30Var;
        this.e = qim0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cb60(l811 l811Var, ArrayList arrayList, p811 p811Var, p811 p811Var2, l811 l811Var2) {
        super(2);
        this.a = (byte) 16;
        this.c = l811Var;
        this.d = arrayList;
        this.e = p811Var;
        this.b = l811Var2;
    }
}
