package p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.protobuf.h;
import com.spotify.messages.UbiProd1PageVisitChange;
import com.spotify.messages.UbiProd1PageVisitChangeNonAuth;
import com.spotify.wrapped.v1.proto.StoryCard;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Optional;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class dbp0 extends hab0 implements Function0 {
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
    public /* synthetic */ dbp0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, byte b) {
        super(0);
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

    public final Object invoke() {
        xhm1 xhm1Var;
        sju sjuVar;
        byte b = this.a;
        Object obj = this.i;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.b;
        Object obj5 = this.c;
        Object obj6 = this.g;
        Object obj7 = this.d;
        Object obj8 = this.h;
        switch (b) {
            case 0:
                Context context = (Context) ((tap0) obj4).invoke();
                yqg yqgVar = (yqg) ((tap0) obj5).invoke();
                Scheduler scheduler = (Scheduler) ((tap0) obj7).invoke();
                mc00 mc00VarP = ((wap0) obj3).b.p();
                lw21 lw21Var = (lw21) ((tap0) obj2).invoke();
                pz11 pz11Var = (pz11) ((tap0) obj6).invoke();
                vhg0 vhg0Var = (vhg0) ((xap0) obj8).invoke();
                xav0 xav0Var = (xav0) ((tap0) obj).invoke();
                c8o.l(context);
                LinkedHashMap linkedHashMap = kvw0.b;
                kvw0 kvw0VarX = cev0.x(context);
                c8o.l(scheduler);
                bvw0 bvw0Var = new bvw0(kvw0VarX, scheduler);
                c8o.l(vhg0Var);
                opb opbVar = (opb) vhg0Var.f.createWebgateService(opb.class, "android-remote-config-bootstrap-quasar-service");
                c8o.l(pz11Var);
                c8o.l(lw21Var);
                c8o.l(yqgVar);
                c8o.l(mc00VarP);
                vob0 vob0Var = mc00VarP.a.H;
                c8o.m(vob0Var);
                lo9 lo9Var = new lo9(vob0Var, (byte) 5);
                c8o.l(xav0Var);
                return new zpb(bvw0Var, new fqb(opbVar, pz11Var, lw21Var, xav0Var, yqgVar, lo9Var), scheduler);
            case 1:
                return new k6y(((obp0) obj4).b.t2, ((obp0) obj5).b.r2, (r0z0) ((sbp0) obj7).invoke(), (kly0) ((sap0) obj3).invoke(), ((obp0) obj2).b.v2, (w6y) ((sbp0) obj6).invoke(), (q8n) ((sbp0) obj8).invoke(), (t6y) ((sbp0) obj).invoke());
            case 2:
                return new kmn0((ajg) ((tap0) obj4).invoke(), (tg8) ((xap0) obj5).invoke(), ((vap0) obj7).b.b(), ((vap0) obj3).b.u(), (xz11) ((yap0) obj2).invoke(), (yqg) ((tap0) obj6).invoke(), ((vap0) obj8).b.a(), ((vap0) obj).b.d());
            case 3:
                lmy0 lmy0Var = (lmy0) ((idp0) obj4).invoke();
                kly0 kly0Var = (kly0) ((hdp0) obj5).invoke();
                Scheduler scheduler2 = (Scheduler) ((idp0) obj7).invoke();
                sz11 sz11Var = (sz11) ((idp0) obj3).invoke();
                Context context2 = (Context) ((idp0) obj2).invoke();
                vte0 vte0VarH = ((wap0) obj6).b.h();
                ((hdp0) obj8).invoke();
                ph61 ph61VarE = ((bdp0) obj).b.e();
                wtp wtpVar = new wtp(new aru0(lmy0Var, kly0Var, scheduler2, sz11Var, context2, vte0VarH, ph61VarE));
                return new cvw0(lmy0Var, scheduler2, sz11Var, vte0VarH, ph61VarE, (jxp) wtpVar.b, (jxp) wtpVar.c);
            case 4:
                Context context3 = (Context) ((bbp0) obj4).invoke();
                Scheduler scheduler3 = (Scheduler) ((bbp0) obj5).invoke();
                thg0 thg0Var = (thg0) ((xap0) obj7).invoke();
                mc00 mc00Var = (mc00) ((xap0) obj3).invoke();
                pz11 pz11Var2 = (pz11) ((bbp0) obj2).invoke();
                xav0 xav0Var2 = (xav0) ((bbp0) obj6).invoke();
                sz11 sz11Var2 = (sz11) ((bbp0) obj8).invoke();
                Optional optional = (Optional) ((bbp0) obj).invoke();
                mfm0 mfm0Var = mfm0.a;
                hm61 hm61Var = new hm61(mfm0Var, pz11Var2, xav0Var2);
                ne neVar = new ne(context3.getApplicationContext(), new hm61(mfm0Var, pz11Var2, xav0Var2), sz11Var2);
                lc00 lc00Var = mc00Var.a;
                kz50 kz50Var = new kz50(neVar, thg0Var.b.c(), new lmw(lc00Var.H, (byte) 8), hm61Var);
                avw0 avw0Var = new avw0((byte) 18);
                lmw lmwVar = new lmw(lc00Var.H, (byte) 8);
                hm61 hm61Var2 = new hm61(mfm0Var, pz11Var2, xav0Var2);
                return new vz11(scheduler3, kz50Var, avw0Var, new aq80(lmwVar, hm61Var2.b, hm61Var2.c, (byte) 1), optional);
            case 5:
                var0 var0Var = (var0) obj;
                String str = (String) obj8;
                Long l = (Long) obj6;
                String str2 = (String) obj2;
                String str3 = (String) obj3;
                Integer num = (Integer) obj7;
                String str4 = (String) obj5;
                bjr0 bjr0Var = (bjr0) obj4;
                xe01 xe01Var = bjr0Var.c;
                j9a j9aVar = bjr0Var.b.a;
                Object value = xe01Var.a.getValue();
                value.getClass();
                if (((Boolean) value).booleanValue()) {
                    k9h1 k9h1VarT = UbiProd1PageVisitChange.t();
                    if (str4 != null) {
                        k9h1VarT.B(str4);
                    }
                    k9h1VarT.C(num.intValue());
                    if (str3 != null && str3.length() != 0) {
                        k9h1VarT.y(str3);
                    }
                    String strC = e8h1.c(str2);
                    if (strC != null && strC.length() != 0) {
                        k9h1VarT.z(strC);
                    }
                    k9h1VarT.v(l.longValue());
                    if (str != null) {
                        k9h1VarT.w(str);
                    }
                    k9h1VarT.D((String) j9aVar.a);
                    if (var0Var != null) {
                        k9h1VarT.A(var0Var.a.a);
                        for (y6h1 y6h1Var : var0Var.b.a) {
                            int i = 0;
                            for (Object obj9 : y6h1Var.d) {
                                int i2 = i + 1;
                                if (i < 0) {
                                    p7h.T();
                                    throw null;
                                }
                                a7h1 a7h1Var = (a7h1) obj9;
                                k9h1VarT.q(a7h1Var.a);
                                k9h1VarT.n(bjr0.a(a7h1Var.b));
                                k9h1VarT.u(bjr0.a(a7h1Var.c));
                                k9h1VarT.s(bjr0.a(a7h1Var.e));
                                k9h1VarT.r(bjr0.a(a7h1Var.d));
                                if (i == 0) {
                                    k9h1VarT.t(y6h1Var.a);
                                } else {
                                    k9h1VarT.t("");
                                }
                                i = i2;
                            }
                        }
                        nsn0 nsn0Var = var0Var.c;
                        if (nsn0Var != null) {
                            k9h1VarT.x(nsn0Var.b());
                        }
                    }
                    h hVarBuild = k9h1VarT.build();
                    hVarBuild.getClass();
                    return hVarBuild;
                }
                m9h1 m9h1VarT = UbiProd1PageVisitChangeNonAuth.t();
                if (str4 != null) {
                    m9h1VarT.B(str4);
                }
                m9h1VarT.C(num.intValue());
                if (str3 != null && str3.length() != 0) {
                    m9h1VarT.y(str3);
                }
                String strC2 = e8h1.c(str2);
                if (strC2 != null && strC2.length() != 0) {
                    m9h1VarT.z(strC2);
                }
                m9h1VarT.v(l.longValue());
                if (str != null) {
                    m9h1VarT.w(str);
                }
                m9h1VarT.D((String) j9aVar.a);
                if (var0Var != null) {
                    m9h1VarT.A(var0Var.a.a);
                    for (y6h1 y6h1Var2 : var0Var.b.a) {
                        int i3 = 0;
                        for (Object obj10 : y6h1Var2.d) {
                            int i4 = i3 + 1;
                            if (i3 < 0) {
                                p7h.T();
                                throw null;
                            }
                            a7h1 a7h1Var2 = (a7h1) obj10;
                            m9h1VarT.q(a7h1Var2.a);
                            m9h1VarT.n(bjr0.a(a7h1Var2.b));
                            m9h1VarT.u(bjr0.a(a7h1Var2.c));
                            m9h1VarT.s(bjr0.a(a7h1Var2.e));
                            m9h1VarT.r(bjr0.a(a7h1Var2.d));
                            if (i3 == 0) {
                                m9h1VarT.t(y6h1Var2.a);
                            } else {
                                m9h1VarT.t("");
                            }
                            i3 = i4;
                        }
                    }
                    nsn0 nsn0Var2 = var0Var.c;
                    if (nsn0Var2 != null) {
                        m9h1VarT.x(nsn0Var2.b());
                    }
                }
                h hVarBuild2 = m9h1VarT.build();
                hVarBuild2.getClass();
                return hVarBuild2;
            case 6:
                return new qy20(((Number) ((tob1) obj4).getValue()).floatValue(), ((Number) ((tob1) obj5).getValue()).floatValue(), ((Number) ((ven0) obj7).getValue()).floatValue(), ((Number) ((ven0) obj3).getValue()).floatValue(), ((Boolean) ((ven0) obj2).getValue()).booleanValue(), ((Boolean) ((ven0) obj6).getValue()).booleanValue(), ((yr80) ((ven0) obj8).getValue()).a, ((yr80) ((ven0) obj).getValue()).a);
            case 7:
                byp bypVar = (byp) obj4;
                cir0 cir0Var = (cir0) obj5;
                ((h431) bypVar.g).a = cir0Var.h();
                kpp kppVar = (kpp) bypVar.e;
                y131 y131Var = (k331) obj7;
                qzu0 qzu0Var = (qzu0) obj3;
                o860 o860Var = qzu0Var.F0;
                rzq rzqVar = o860Var != null ? (rzq) o860Var.d : null;
                if (rzqVar == null) {
                    hhg1.n("Trying to access DataPool too early. Its only available after createComponents().");
                    return null;
                }
                dzp0 dzp0Var = qzu0Var.u0;
                ArrayList arrayListC = qzu0Var.c();
                jzu0 jzu0Var = qzu0Var.J0;
                LayoutInflater layoutInflater = (LayoutInflater) obj8;
                uap uapVar = (uap) kppVar.a.c;
                l5d0 l5d0Var = (l5d0) uapVar.a.get();
                v9c v9cVar = new v9c((byte) 13);
                tf90 tf90Var = (tf90) uapVar.f0.get();
                lpp lppVar = (lpp) uapVar.g0.get();
                q8n q8nVarC = ((zyc0) uapVar.I).c();
                c8o.l(q8nVarC);
                b9e0 b9e0Var = new b9e0(l5d0Var, v9cVar, tf90Var, lppVar, q8nVarC, (ViewGroup) obj2, dzp0Var, rzqVar, (Bundle) obj6, layoutInflater, arrayListC, cir0Var, y131Var, jzu0Var);
                gs71 gs71VarA = ((hs71) bypVar.h).a(new lmw((cbr0) obj, (byte) 10));
                return gs71VarA != null ? new l59(gs71VarA, (f4h1) b9e0Var, new tr71(fr71.a)) : b9e0Var;
            default:
                err0 err0Var = (hdn0) obj8;
                c380 c380Var = (c380) obj7;
                err0 err0Var2 = (hdn0) obj6;
                c7f1 c7f1Var = (c7f1) obj5;
                Object obj11 = ((rk41) obj4).c;
                StoryCard storyCard = ((wgm1) ((xgm1) obj11).getState().getValue()).a;
                String id = storyCard != null ? storyCard.getId() : null;
                t6f1 t6f1Var = c7f1Var.a;
                String str5 = t6f1Var.a;
                if (u890.j(id, t6f1Var.a)) {
                    Boolean bool = Boolean.TRUE;
                    ((ven0) obj3).setValue(bool);
                    if (!c7f1Var.b) {
                        ((ven0) obj2).setValue(bool);
                    }
                    err0 err0Var3 = err0Var2;
                    int iS = (err0Var3.s() + 1) % c380Var.size();
                    r6f1 r6f1Var = (r6f1) c380Var.get(iS);
                    if (iS == 0) {
                        ydh.m(err0Var, 1);
                    }
                    err0Var3.t(iS);
                    xgm1 xgm1Var = (xgm1) obj11;
                    cxm.B(str5, xgm1Var, iS, r6f1Var.g);
                    int i5 = r6f1Var.i;
                    if (i5 != 0 && (xhm1Var = (xhm1) ((ven0) obj).getValue()) != null) {
                        ard1 ard1Var = c7f1Var.d;
                        int iS2 = err0Var3.s();
                        rx7 rx7Var = r6f1Var.f;
                        String str6 = (rx7Var == null || (sjuVar = rx7Var.c) == null) ? null : sjuVar.c;
                        i8h1 i8h1Var = ard1Var.c;
                        c4m0 c4m0VarA = ard1Var.a(xhm1Var);
                        int iZ = l0p1.z(zqd1.d);
                        int iY = l0p1.y(i5);
                        Integer numValueOf = Integer.valueOf(iS2);
                        x6h1 x6h1VarC = c4m0VarA.c.c();
                        x6h1VarC.i.add(new a7h1("tappable_entity", z3m0.f(iZ), numValueOf, str6, z3m0.g(iY)));
                        x6h1VarC.j = true;
                        i8h1Var.m(new w7h1("", "", new z7h1("swipe", 1, b7x.a), new x7h1("play_preview", 1, Collections.singletonMap("item_to_be_previewed", str6 != null ? str6 : "")), x6h1VarC.a(), c4m0VarA.b, System.currentTimeMillis()), (xj61) null);
                    }
                    cxm.x((r6f1) c380Var.get(err0Var3.s()), err0Var3.s(), str5, xgm1Var, c7f1Var.f);
                }
                return rih1.a;
        }
    }
}
