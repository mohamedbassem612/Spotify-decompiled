package p;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.campaigns.paragraph.view.ParagraphView;
import com.spotify.player.model.PlayOrigin;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import defpackage.h;
import j$.time.LocalDate;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ssm extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ssm(el9 el9Var, y4w y4wVar, e5w e5wVar, iu30 iu30Var) {
        super(0);
        this.a = (byte) 22;
        this.b = y4wVar;
        this.c = e5wVar;
        this.d = iu30Var;
    }

    public final Object invoke() {
        w7h1 w7h1Var;
        tv80 tv80VarM;
        w7h1 w7h1Var2;
        Object value;
        byte b = this.a;
        b7x b7xVar = b7x.a;
        rih1 rih1Var = rih1.a;
        Object obj = this.c;
        Object obj2 = this.b;
        Object obj3 = this.d;
        switch (b) {
            case 0:
                r6h1 r6h1Var = r6h1.c;
                String str = ((kho0) obj2).a.a;
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-contribution-note-element";
                x6h1VarI.f = "1.1.0";
                x6h1VarI.g = "22.0.0";
                x6h1VarI.d = str;
                y6h1 y6h1VarA = x6h1VarI.a();
                vsm vsmVar = (vsm) obj;
                i8h1 i8h1Var = (i8h1) vsmVar.h.get();
                x6h1 x6h1VarC = y6h1VarA.c();
                x6h1VarC.i.add(new a7h1("author_button", (String) null, (Integer) null, (String) obj3, (String) null));
                x6h1VarC.j = true;
                String str2 = (String) obj3;
                vsmVar.g.f(new dwn0(str2, "", false, false, 0, 0, false, (a690) null, (Bundle) null, new bwn0(i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2 == null ? "" : str2)), x6h1VarC.a(), r6h1Var, System.currentTimeMillis()), (xj61) null))));
                return rih1Var;
            case 1:
                mtm mtmVar = (mtm) obj2;
                i8h1 i8h1Var2 = (i8h1) mtmVar.j.get();
                k3l0 k3l0Var = (k3l0) obj;
                k3l0Var.getClass();
                x6h1 x6h1VarC2 = k3l0Var.a.c();
                x6h1VarC2.i.add(new a7h1("cancel_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("discard_changes", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                fn31.T((c9n) obj3, (o8n) null, 0, new ltm(mtmVar, (lnm) null, (byte) 1), 3);
                return rih1Var;
            case 2:
                return new xzq(((v1p) obj2).a((d0r) obj), new zum((bvm) obj3, (byte) 2));
            case 3:
                a4n a4nVar = (a4n) obj2;
                String str3 = ((d4n) obj).c.a;
                i8h1 i8h1Var3 = (i8h1) a4nVar.c.getValue();
                x6h1 x6h1VarC3 = a4nVar.b.b.c();
                x6h1VarC3.i.add(new a7h1("accept_and_continue_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                ((iu30) obj3).invoke(new t3n(i8h1Var3.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str3)), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis()), (xj61) null)));
                return rih1Var;
            case 4:
                long jB = ((yqg) ((ldo) obj2).c).b();
                q811 q811Var = (q811) obj;
                Long l = (Long) q811Var.a;
                if (l == null || jB - l.longValue() > 1000) {
                    q811Var.a = Long.valueOf(jB);
                    ((iu30) obj3).invoke(smn.a);
                }
                return rih1Var;
            case 5:
                String strC1 = ihc1.c1(100, ihc1.e1(((y7e1) obj2).d().d.toString()).toString());
                ham hamVar = (ham) obj;
                dqn dqnVar = (dqn) hamVar.c;
                oql oqlVar = (oql) hamVar.b;
                ksk0 ksk0Var = (ksk0) oqlVar.c;
                i8h1 i8h1Var4 = (i8h1) oqlVar.b;
                aqn aqnVar = dqnVar.b.c;
                if (aqnVar instanceof vpn) {
                    boolean z = strC1.length() > 0;
                    r6h1 r6h1Var2 = ksk0Var.b;
                    y6h1 y6h1Var2 = ksk0Var.c;
                    if (z) {
                        x6h1 x6h1VarC4 = y6h1Var2.c();
                        x6h1VarC4.i.add(new a7h1("create_button_name_provided", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC4.j = false;
                        w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("create_folder", 2, b7xVar), x6h1VarC4.a(), r6h1Var2, System.currentTimeMillis());
                    } else {
                        x6h1 x6h1VarC5 = y6h1Var2.c();
                        x6h1VarC5.i.add(new a7h1("create_button_name_generated", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC5.j = false;
                        w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("create_folder", 2, b7xVar), x6h1VarC5.a(), r6h1Var2, System.currentTimeMillis());
                    }
                    tv80VarM = i8h1Var4.m(w7h1Var2, (xj61) null);
                } else {
                    if (!(aqnVar instanceof zpn)) {
                        eg.o();
                        return null;
                    }
                    boolean z2 = strC1.length() > 0;
                    r6h1 r6h1Var3 = ksk0Var.b;
                    y6h1 y6h1Var3 = ksk0Var.c;
                    if (z2) {
                        x6h1 x6h1VarC6 = y6h1Var3.c();
                        x6h1VarC6.i.add(new a7h1("create_button_name_provided", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC6.j = false;
                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("create_playlist", 1, b7xVar), x6h1VarC6.a(), r6h1Var3, System.currentTimeMillis());
                    } else {
                        x6h1 x6h1VarC7 = y6h1Var3.c();
                        x6h1VarC7.i.add(new a7h1("create_button_name_generated", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC7.j = false;
                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("create_playlist", 1, b7xVar), x6h1VarC7.a(), r6h1Var3, System.currentTimeMillis());
                    }
                    tv80VarM = i8h1Var4.m(w7h1Var, (xj61) null);
                }
                ((iu30) obj3).invoke(new pxz(strC1, tv80VarM));
                return rih1Var;
            case 6:
                kvn kvnVar = (kvn) obj3;
                return new dnc0((d0r) obj2, new gvn(kvnVar, (byte) 0), new gvn(kvnVar, (byte) 1), new cc9(20, 4, 4), ((fvn) obj).m, 6);
            case 7:
                return ((pp11) obj2).a(((iac0) obj).getLifecycle(), false, false, (PlayOrigin) ((ynb0) obj3).get());
            case 8:
                LocalDate localDate = (LocalDate) obj2;
                if (localDate == null) {
                    localDate = (LocalDate) obj;
                }
                ((DatePickerDialog) obj3).updateDate(localDate.getYear(), localDate.getMonthValue() - 1, localDate.getDayOfMonth());
                return rih1Var;
            case 9:
                y0o y0oVar = (y0o) obj;
                syq syqVar = (laa) ((Function0) obj2).invoke();
                if (syqVar instanceof wpw) {
                    return new jpg0(syqVar, y0oVar);
                }
                if (syqVar instanceof syq) {
                    return new wzq(syqVar, y0oVar);
                }
                k220.k("Unsupported element ", syqVar.getClass().getName(), " for ", ((Class) obj3).getName());
                return null;
            case 10:
                return ((ut71) obj2).b((Context) obj, ((mzr) obj3).b.b);
            case 11:
                iu30 iu30Var = (iu30) obj2;
                Activity activityA = ((p4s) obj).a.a();
                if (activityA == null || activityA.isDestroyed() || activityA.isFinishing()) {
                    activityA = null;
                }
                if (activityA == null) {
                    Activity activity = (Activity) obj3;
                    activityA = (activity.isDestroyed() || activity.isFinishing()) ? null : activity;
                }
                iu30Var.invoke(activityA);
                return rih1Var;
            case 12:
                ((ven0) obj).setValue(Boolean.FALSE);
                y0o y0oVar2 = (y0o) ((tjq) obj2).e;
                if (y0oVar2 != null) {
                    y0oVar2.invoke(new w7v0((String) obj3));
                    return rih1Var;
                }
                u890.C("eventHandler");
                throw null;
            case 13:
                uus uusVar = (uus) obj3;
                zus zusVar = (zus) obj2;
                View view = (View) obj;
                mma0[] mma0VarArr = zus.i;
                zusVar.getClass();
                WeakHashMap weakHashMap = b8k1.a;
                r7k1.c(view, (k1q0) null);
                x3f1 x3f1Var = zusVar.e;
                if (x3f1Var != null) {
                    view.getViewTreeObserver().removeOnGlobalLayoutListener(x3f1Var);
                }
                zusVar.e = null;
                zusVar.d = null;
                bpb1 bpb1Var = zusVar.f;
                do {
                    value = bpb1Var.getValue();
                } while (!bpb1Var.k(value, sqg0.K(uusVar.a.a, (Map) value)));
                Function0 function0 = uusVar.d;
                if (function0 != null) {
                    function0.invoke();
                }
                return rih1Var;
            case 14:
                r2t r2tVar = (r2t) obj2;
                z3t z3tVar = (z3t) ((kly0) obj3).get();
                return new x3t(new zm41((dn41) obj, new vas(r2tVar, z3tVar), (iu30) null, new o1t(r2tVar, z3tVar, (byte) 5), (Function0) null, (Function0) null, 116));
            case 15:
                t6t t6tVar = (t6t) obj2;
                fn31.T(cto1.q(t6tVar.c), t6tVar.i, 0, new hxn(obj, (Object) t6tVar, obj3, (lnm) null, (byte) 18), 2);
                return rih1Var;
            case 16:
                ((xrt) obj2).e(mst.a, (hur) obj, (cir0) obj3);
                return rih1Var;
            case 17:
                zeu zeuVar = (zeu) obj2;
                x6h1 x6h1VarC8 = ((rrk0) zeuVar.c).b.c();
                x6h1VarC8.i.add(new a7h1("submit_prompt_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC8.j = false;
                ((i8h1) zeuVar.b).m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC8.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                y7e1 y7e1Var = (y7e1) obj3;
                ((iu30) obj).invoke(new it81(y7e1Var.d().d.toString(), 1));
                c4p1.q(y7e1Var);
                return rih1Var;
            case 18:
                xru xruVar = (xru) obj2;
                if (xruVar.b.size() + xruVar.a.size() > 1) {
                    ((ven0) obj3).setValue(Boolean.TRUE);
                } else {
                    ((iu30) obj).invoke(tru.a);
                }
                return rih1Var;
            case 19:
                ven0 ven0Var = (ven0) obj3;
                ven0Var.setValue(Boolean.valueOf(!((Boolean) ven0Var.getValue()).booleanValue()));
                if (((Boolean) ven0Var.getValue()).booleanValue()) {
                    ((iu30) obj2).invoke(new aav(((q220) obj).b));
                }
                return rih1Var;
            case 20:
                cdv cdvVar = ((hdv) obj2).b;
                if ((cdvVar instanceof adv) && ((rdv) obj).b.isEmpty()) {
                    ((adv) cdvVar).a.invoke();
                } else {
                    ((iu30) ((ven0) obj3).getValue()).invoke(icv.a);
                }
                return rih1Var;
            case 21:
                fn31.T((c9n) obj2, (o8n) null, 0, new p1r((vpv) obj, (jwq) obj3, null, (byte) 12), 3);
                return rih1Var;
            case 22:
                iu30 iu30Var2 = (iu30) obj3;
                String str4 = ((e5w) obj).b;
                List list = ((y4w) obj2).a;
                if (list.size() == 1 && ((bxn) o7h.q0(list)).a.length() > 0) {
                    iu30Var2.invoke(new a5w(((bxn) o7h.q0(list)).a));
                } else if (list.size() > 1) {
                    iu30Var2.invoke(z4w.a);
                } else if (str4 != null && str4.length() != 0) {
                    iu30Var2.invoke(new a5w(str4));
                }
                return rih1Var;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                ((iu30) obj2).invoke(b6w.a);
                d6w d6wVar = (d6w) obj;
                String str5 = d6wVar.c;
                String str6 = d6wVar.d;
                String str7 = d6wVar.e;
                Bundle bundle = new Bundle();
                if (str7 != null) {
                    bundle.putString("contribution_notes_detail_contribution_id", str7);
                    bundle.putString("contribution_notes_detail_context_uri", str5);
                    bundle.putString("contribution_notes_detail_item_uri", str6);
                }
                ((lzn0) ((h6w) obj3).h).i(new dwn0(str5, "", false, false, 0, 0, false, (a690) null, (Bundle) null, (cwn0) null), bundle);
                return rih1Var;
            case 24:
                if (((List) obj2).size() > 1) {
                    ((Function0) obj).invoke();
                } else {
                    ((Function0) obj3).invoke();
                }
                return rih1Var;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                vy71 vy71Var = (vy71) obj;
                fn31.T((c9n) obj2, (o8n) null, 0, new g(vy71Var, (lnm) null, (byte) 10), 3).L(new h(vy71Var, (Function0) obj3, (byte) 2));
                return rih1Var;
            case 26:
                ((iu30) obj3).invoke(new j8w(((c8w) obj2).a(((s8w) obj).c)));
                return rih1Var;
            case 27:
                sqw sqwVar = (sqw) obj2;
                sqwVar.i = true;
                try {
                    return sqwVar.a.a().d(obj, obj3, sqwVar.b());
                } catch (Exception e) {
                    sqwVar.c.invoke(e);
                    throw null;
                }
            case 28:
                List listM = p7h.M(new ParagraphView[]{(ParagraphView) obj2, (ParagraphView) obj});
                oly olyVar = (oly) obj3;
                int iS = zno1.s(q7h.U(listM, 10));
                if (iS < 16) {
                    iS = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
                for (Object obj4 : listM) {
                    ParagraphView paragraphView = (ParagraphView) obj4;
                    ConstraintLayout constraintLayout = olyVar.f;
                    Float fValueOf = Float.valueOf((constraintLayout != null ? constraintLayout.getWidth() : 0.0f) - paragraphView.getX());
                    Float fValueOf2 = Float.valueOf(-(paragraphView.getX() + paragraphView.getWidth()));
                    if (paragraphView.getResources().getConfiguration().getLayoutDirection() != 1) {
                        fValueOf = fValueOf2;
                    }
                    linkedHashMap.put(obj4, Float.valueOf(fValueOf.floatValue()));
                }
                return (Float) o7h.p0(linkedHashMap.values());
            default:
                ogr ogrVar = (ogr) obj2;
                kvy kvyVar = (kvy) obj;
                lik1 lik1Var = new lik1(kvyVar.b);
                d0r d0rVar = (d0r) obj3;
                yzc0 yzc0Var = kvyVar.a;
                tu11 tu11Var = kvyVar.e;
                fc8 fc8Var = new fc8(kvyVar.f, tu11Var);
                pux0 pux0Var = new pux0(kvyVar.g, tu11Var, (byte) 27);
                t3x t3xVar = new t3x((Object) kvyVar, (Object) d0rVar, (byte) 8);
                pux0 pux0Var2 = kvyVar.c;
                kpg0 kpg0Var = ((i5y0) pux0Var2.c).f() ? new kpg0((d511) pux0Var2.b, ss11.c1) : null;
                eb8 eb8Var = kvyVar.d;
                qlb qlbVar = eb8Var.a.c ? new qlb(d0rVar, new xzq(eb8Var.b.a(d0rVar), ss11.a1), w3p1.n(new l4r(hvm.a, 2, ss11.W0, new j4r(new ak01(eb8Var, (byte) 26)), ss11.X0), new l4r(jd0.m, 2, ss11.Y0, new j4r(ss11.b1), ss11.Z0), new ps11(eb8Var, (byte) 3))) : null;
                uqs uqsVar = (uqs) ogrVar.b;
                zs11 zs11Var = (zs11) uqsVar.d;
                o3r o3rVar = e4r.a;
                jd11 jd11Var = rc11.a;
                wlu wluVar = new wlu(jd11Var.b(jo70.class));
                ppa0 ppa0Var = lo70.a;
                o3r o3rVarN = w3p1.n(new l4r(wluVar, 2, z3r.O0, new k4r(z3r.S0, ppa0Var), z3r.P0), new l4r(new xv00(jd11Var.b(mtl.class)), 2, z3r.Q0, new k4r(z3r.T0, ppa0Var), z3r.R0), ido.Q0);
                ya8 ya8Var = new ya8(kpg0Var, (byte) 4);
                qrk qrkVar = new qrk(1, (byte) 27);
                ya8 ya8Var2 = new ya8(qlbVar, (byte) 5);
                uny unyVar = (uny) uqsVar.e;
                fns fnsVar = igu.a;
                ds11 ds11Var = new ds11(new xzq(new hho(pyf0.a, d0rVar), auy.N0));
                ds11 ds11Var2 = new ds11(new xzq(((odp) unyVar.d).a(d0rVar), auy.P0));
                ds11 ds11Var3 = new ds11(unyVar.b(lik1Var, t3xVar));
                bnw0 bnw0Var = new bnw0(new xzq(((zwp) unyVar.b).a(d0rVar, new ult0(yzc0Var)), auy.O0), unyVar.b(lik1Var, t3xVar));
                o3r o3rVarO = w3p1.o(new l4r(pwc0.d, 2, z3r.V0, new j4r(z3r.X0), z3r.W0), z3r.Y0);
                o3r o3rVarA = e4r.a(uqsVar.b);
                yqg yqgVar = (yqg) uqsVar.c;
                smc0 smc0VarN = k4p1.n();
                smc0VarN.add(new l4r(new wlu(jd11Var.b(jo70.class)), 2, b4r.d1, new j4r(b4r.X), d4r.b));
                smc0VarN.add(new l4r(new xv00(jd11Var.b(mtl.class)), 2, d4r.c, new j4r(b4r.Y), d4r.d));
                smc0VarN.add(new l4r(new xv00(jd11Var.b(xkk1.class)), 2, d4r.e, new j4r(b4r.Z), d4r.f));
                xv00 xv00Var = new xv00(jd11Var.b(hzy.class));
                ppa0 ppa0Var2 = e4r.b;
                smc0VarN.add(new l4r(xv00Var, 2, d4r.g, new k4r(b4r.N0, ppa0Var2), d4r.h));
                smc0VarN.add(new l4r(new xv00(jd11Var.b(l1z.class)), 2, d4r.i, new k4r(b4r.O0, ppa0Var2), b4r.T0));
                smc0VarN.add(new l4r(new xv00(jd11Var.b(v740.class)), 2, b4r.U0, new k4r(b4r.P0, ppa0Var2), b4r.V0));
                smc0VarN.add(new l4r(new xv00(jd11Var.b(w281.class)), 2, b4r.W0, new k4r(b4r.Q0, e4r.c), b4r.X0));
                smc0VarN.add(new l4r(new xv00(jd11Var.b(zoy0.class)), 2, b4r.Y0, new j4r(b4r.R0), b4r.Z0));
                smc0VarN.add(new l4r(new xv00(jd11Var.b(hll.class)), 2, b4r.a1, new j4r(b4r.S0), b4r.b1));
                smc0VarN.add(new l4r(pwc0.r, 2, b4r.c1, new j4r(b4r.t), b4r.e1));
                return new wqw(new xzq(zs11Var.a(d0rVar, new ls11(ds11Var, ds11Var2, ds11Var3, (ds11) null, (iu30) null, (iu30) null, qrkVar, ya8Var, ya8Var2, fc8Var, pux0Var, 1, (o27) null, eye1.a, lpc1.a, qb2.a, (rru) null, false, o3rVarO, o3rVarA, (o3r) null, (o3r) null, new o3r(k4p1.k(smc0VarN), new vf3(yqgVar, (byte) 5), false), (o3r) null, (cv11) null, (y5z) null, bnw0Var, new bt11(false), 0, o3rVarN, -40136648, 434), (nu11) null), new nty(kvyVar, (byte) 3)));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ssm(Object obj, Object obj2, String str, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
        this.d = str;
        this.c = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ssm(Object obj, Object obj2, Object obj3, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
