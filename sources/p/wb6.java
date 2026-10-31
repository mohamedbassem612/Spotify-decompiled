package p;

import android.content.Context;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.base.java.logging.Logger;
import com.spotify.browse.clientnative.mobius.BrowseState;
import com.spotify.player.model.PlayOrigin;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class wb6 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wb6(ac6 ac6Var, kko kkoVar, rzo rzoVar, iu30 iu30Var) {
        super(2);
        this.a = (byte) 0;
        this.d = ac6Var;
        this.b = kkoVar;
        this.c = rzoVar;
        this.e = iu30Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        byte b = this.a;
        b7x b7xVar = b7x.a;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.c;
        Object obj4 = this.e;
        Object obj5 = this.b;
        Object obj6 = this.d;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                iu30 iu30Var = (iu30) obj4;
                rzo rzoVar = (rzo) obj3;
                kko kkoVar = (kko) obj5;
                ac6 ac6Var = (ac6) obj6;
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                    WeakHashMap weakHashMap = osl1.x;
                    vk80 vk80VarC = hqq0.C(lhc.g(x340Var2).g, x340Var2);
                    boolean zI = x340Var2.i(ac6Var) | x340Var2.i(kkoVar) | x340Var2.i(rzoVar) | x340Var2.g(iu30Var);
                    Object objT = x340Var2.T();
                    if (zI || objT == fkj0.X) {
                        db dbVar = new db(ac6Var, kkoVar, rzoVar, iu30Var, (byte) 14);
                        x340Var2.s0(dbVar);
                        objT = dbVar;
                    }
                    ujo1.d(qim0VarF, null, vk80VarC, false, null, null, null, false, null, (iu30) objT, x340Var2, 0, 506);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                l6o1.f((String) obj6, (kko) obj5, (rzo) obj3, (qim0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 2:
                hav0 hav0Var = (hav0) obj;
                long j = ((Offset) obj2).a;
                hav0Var.a();
                drr0 drr0Var = (drr0) obj5;
                int i = (int) (j >> 32);
                drr0Var.t(Float.intBitsToFloat(i) + drr0Var.s());
                drr0 drr0Var2 = (drr0) obj3;
                int i2 = (int) (j & 4294967295L);
                drr0Var2.t(Float.intBitsToFloat(i2) + drr0Var2.s());
                drr0 drr0Var3 = (drr0) obj4;
                drr0Var3.t(drr0Var3.s() + (Float.intBitsToFloat(i) - Float.intBitsToFloat(i2)));
                ((tui1) obj6).a(hav0Var.b, (((long) Float.floatToRawIntBits(drr0Var2.s())) & 4294967295L) | (((long) Float.floatToRawIntBits(drr0Var.s())) << 32));
                return rih1Var;
            case 3:
                ((Number) obj2).intValue();
                sio1.m((gj6) obj6, (aj6) obj5, (yux) obj3, (y3g1) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 4:
                ((Number) obj2).intValue();
                dko1.b((l5m) obj6, (iu30) obj4, (em3) obj5, (gw70) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 5:
                ((Number) obj2).intValue();
                dko1.l((w5m) obj6, (iu30) obj4, (em3) obj5, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 6:
                ((Number) obj2).intValue();
                ilo1.a((String) obj6, (List) obj5, (iu30) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 7:
                fn31.T((c9n) obj6, (o8n) null, 0, new g((vy71) obj5, (lnm) null, (byte) 4), 3).L(new fu((vu30) obj3, (String) obj, ((Number) obj2).intValue(), (ven0) obj4, (byte) 2));
                return rih1Var;
            case 8:
                ((Number) obj2).intValue();
                mmo1.h((String) obj6, (ArrayList) obj5, (vu30) obj3, (qim0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 9:
                b9e b9eVar = (b9e) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                wrk0 wrk0Var = (wrk0) obj5;
                String str = b9eVar.a;
                Integer numValueOf = Integer.valueOf(iIntValue2);
                wrk0Var.getClass();
                x6h1 x6h1VarC = wrk0Var.a.c();
                x6h1VarC.i.add(new a7h1("category_option", str, numValueOf, (String) null, (String) null));
                x6h1VarC.j = false;
                ((i8h1) obj6).m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("filter", 1, b7xVar), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                tbr0 tbr0Var = (tbr0) obj4;
                y231 y231Var = new y231(new qu6(b9eVar.a));
                if (((AtomicBoolean) obj3).compareAndSet(false, true)) {
                    tbr0Var.a(y231Var);
                }
                return rih1Var;
            case 10:
                ((Number) obj2).intValue();
                smo1.d((String) obj6, (List) obj5, (vu30) obj3, (Function0) obj4, (b0k) obj, czo1.p(65));
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                cb20 cb20Var = (cb20) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                zrk0 zrk0Var = (zrk0) obj5;
                String str2 = cb20Var.a;
                Integer numValueOf2 = Integer.valueOf(iIntValue3);
                zrk0Var.getClass();
                x6h1 x6h1VarC2 = zrk0Var.a.c();
                x6h1VarC2.i.add(new a7h1("filter_option", str2, numValueOf2, (String) null, (String) null));
                x6h1VarC2.j = false;
                ((i8h1) obj6).m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("filter", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                wmo1.b((ven0) obj3, (tbr0) obj4, new y231(new kv6(cb20Var.b)));
                return rih1Var;
            case grn1.d /* 12 */:
                ((Number) obj2).intValue();
                wmo1.c((Integer) obj6, (List) obj5, (vu30) obj3, (Function0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 13:
                x340 x340Var3 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                yv6 yv6Var = (yv6) obj6;
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    iac0 iac0Var = yv6Var.f;
                    lik1 lik1Var = yv6Var.a;
                    PlayOrigin playOrigin = (PlayOrigin) obj3;
                    playOrigin.getClass();
                    zmo1.b((su6) ((tob1) obj4).getValue(), yv6Var.d, yv6Var.c.b, cwl1.C(yv6Var.e), (vv6) obj5, iac0Var, lik1Var, playOrigin, yv6Var.i, yv6Var.j, yv6Var.k, yv6Var.o, yv6Var.p, yv6Var.m, yv6Var.n, yv6Var.l, yv6Var.s, null, x340Var4, 0);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 14:
                ((Number) obj2).intValue();
                ((i87) obj6).e((String) obj5, (xtb0) obj3, (c380) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 15:
                ((Number) obj2).intValue();
                ((q87) obj6).b((c380) obj5, (qim0) obj3, (xu30) obj4, (b0k) obj, czo1.p(385));
                return rih1Var;
            case 16:
                ((Number) obj2).intValue();
                ((ec8) obj6).o((Float) obj5, (String) obj3, (String) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 17:
                ((Number) obj2).intValue();
                ryo1.c((qn8) obj6, (iu30) obj4, (qim0) obj5, (yqg) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 18:
                ((Number) obj2).intValue();
                zzo1.a((u39) obj6, (Function0) obj5, (Function0) obj3, (qim0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 19:
                ((Number) obj2).intValue();
                ((h72) obj6).f((ds9) obj5, (String) obj3, (duk0) obj4, (b0k) obj, czo1.p(9));
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                ((Number) obj2).intValue();
                ((h72) obj6).i(czo1.p(1), (Function0) obj3, (b0k) obj, (iu30) obj4, (qim0) obj5);
                return rih1Var;
            case 21:
                x340 x340Var5 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    yxb0 yxb0Var = ((hn9) obj6).f;
                    ao9 ao9Var = (ao9) obj5;
                    String str3 = ao9Var.a;
                    String str4 = ao9Var.c;
                    String str5 = ao9Var.b;
                    fn9 fn9Var = (fn9) obj3;
                    String str6 = fn9Var.a;
                    String str7 = fn9Var.b;
                    ao9 ao9Var2 = (ao9) o7h.s0(fn9Var.c);
                    String str8 = ao9Var2 != null ? ao9Var2.a : null;
                    if (str8 == null) {
                        eg.m("Required value was null.");
                        return null;
                    }
                    otw.c(yxb0Var, new kn9(str3, str4, str5, str6, str7, str8), (qim0) obj4, (ipb1) null, x340Var6, 0, 8);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 22:
                ((Number) obj2).intValue();
                ((g7a) obj6).c(czo1.p(7), (String) obj4, (j2i) obj5, (b0k) obj, (qim0) obj3);
                return rih1Var;
            case 23:
                ((Number) obj2).intValue();
                w2b.e((y7e1) obj6, (lz20) obj5, (Function0) obj3, (qim0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 24:
                x340 x340Var7 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                Function0 function0 = (Function0) obj4;
                yb20 yb20Var = (yb20) obj3;
                ic9 ic9Var = (ic9) obj5;
                ea61 ea61Var = (ea61) obj6;
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    String str9 = ea61Var.c;
                    boolean zI2 = x340Var8.i(ic9Var) | x340Var8.i(ea61Var) | x340Var8.i(yb20Var) | x340Var8.g(function0);
                    Object objT2 = x340Var8.T();
                    if (zI2 || objT2 == fkj0.X) {
                        objT2 = new f80(ic9Var, ea61Var, yb20Var, function0, (byte) 13);
                        x340Var8.s0(objT2);
                    }
                    m3b.a(0, str9, (Function0) objT2, x340Var8, (qim0) null);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 25:
                ((Number) obj2).intValue();
                bin.h((hr20) obj6, (hr20) obj5, (qim0) obj3, (j2i) obj4, (b0k) obj, czo1.p(385));
                return rih1Var;
            case 26:
                x340 x340Var9 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    ((q3b1) ((q59) obj6).c).b(70, apo.r(898582697, new zt6((ymd0) obj5, (j2i) obj3, (Function0) obj4), x340Var10), x340Var10);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 27:
                x340 x340Var11 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                Function0 function1 = (Function0) obj4;
                cp31 cp31Var = (cp31) obj3;
                o5e0 o5e0Var = (o5e0) obj5;
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    Logger.b("BrowsePageComposer: Unsupported state: " + ((BrowseState) obj6), new Object[0]);
                    Context context = (Context) x340Var12.k(AndroidCompositionLocals_androidKt.b);
                    m7c m7cVarC = t3p1.C(o5e0Var, x340Var12);
                    qim0 qim0VarN = anm1.N("browse_clientnative_error", nim0Var);
                    boolean zI3 = x340Var12.i(cp31Var) | x340Var12.i(context) | x340Var12.i(o5e0Var) | x340Var12.g(function1);
                    Object objT3 = x340Var12.T();
                    if (zI3 || objT3 == fkj0.X) {
                        objT3 = new k8c(cp31Var, context, o5e0Var, function1, (byte) 0);
                        x340Var12.s0(objT3);
                    }
                    hqq0.d(m7cVarC, qim0VarN, (Function0) objT3, x340Var12, 0);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 28:
                x340 x340Var13 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                Function0 function2 = (Function0) obj4;
                Context context2 = (Context) obj3;
                cp31 cp31Var2 = (cp31) obj5;
                o5e0 o5e0Var2 = (o5e0) obj6;
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    m7c m7cVarC2 = t3p1.C(o5e0Var2, x340Var14);
                    qim0 qim0VarN2 = anm1.N("browse_clientnative_error", nim0Var);
                    boolean zI4 = x340Var14.i(cp31Var2) | x340Var14.i(context2) | x340Var14.i(o5e0Var2) | x340Var14.g(function2);
                    Object objT4 = x340Var14.T();
                    if (zI4 || objT4 == fkj0.X) {
                        objT4 = new k8c(cp31Var2, context2, o5e0Var2, function2, (byte) 1);
                        x340Var14.s0(objT4);
                    }
                    hqq0.d(m7cVarC2, qim0VarN2, (Function0) objT4, x340Var14, 0);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                zpn1.a((List) obj6, (m0d) obj5, (iu30) obj4, (Function0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wb6(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        super(2);
        this.a = b;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
        this.e = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wb6(Object obj, Object obj2, iu30 iu30Var, Object obj3, int i, byte b) {
        super(2);
        this.a = b;
        this.d = obj;
        this.b = obj2;
        this.e = iu30Var;
        this.c = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wb6(Object obj, iu30 iu30Var, Object obj2, Object obj3, int i, byte b) {
        super(2);
        this.a = b;
        this.d = obj;
        this.e = iu30Var;
        this.b = obj2;
        this.c = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wb6(int i, Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        super(2);
        this.a = b;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
        this.e = obj4;
    }
}
