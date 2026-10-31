package p;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.spotify.base.java.logging.Logger;
import com.spotify.connectivity.auth.esperanto.proto.EsSession;
import com.spotify.messages.UbiExpr1Heartbeat;
import com.spotify.messaging.messagingplatformimpl.slate.SlateMessageHostActivity;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDistinctUntilChanged;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableFilter;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableObserveOn;
import io.reactivex.rxjava3.subjects.CompletableSubject;
import io.reactivex.rxjava3.subjects.Subject;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class z0u0 implements Consumer {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public /* synthetic */ z0u0(byte b, Object obj, String str) {
        this.a = b;
        this.c = str;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:124:0x03c2  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void accept(Object obj) {
        long j;
        long j2;
        i2i1 i2i1Var;
        String uri;
        vpl vplVarA;
        String strJ;
        String uri2;
        vpl vplVarA2;
        String strJ2;
        byte b = 13;
        String str = "";
        hp80 hp80Var = null;
        switch (this.a) {
            case 0:
                vu21 vu21Var = (wu21) obj;
                g1u0 g1u0Var = (g1u0) this.b;
                if (vu21Var instanceof vu21) {
                    up70 up70VarA = vu21Var.a.a(vp70.c);
                    hp80Var = up70VarA != null ? up70VarA.a.a : null;
                    if (hp80Var == null || hp80Var.length() == 0) {
                        return;
                    }
                    g1u0Var.b(hp80Var).j(new r0s0(g1u0Var, (String) this.c, new y0u0(g1u0Var, null == true ? 1 : 0)));
                    return;
                }
                return;
            case 1:
                iru0 iru0Var = (iru0) obj;
                udx0 udx0Var = (udx0) this.b;
                boolean zU = r4o1.U(udx0Var);
                boolean z = udx0Var.e;
                d0v0 d0v0Var = (d0v0) this.c;
                Context context = d0v0Var.d;
                int i = iru0Var.b;
                Object[] objArr = i == 0 ? 1 : 0;
                smc0 smc0VarN = k4p1.n();
                if (objArr != 0 && zU && iru0Var.a) {
                    smc0VarN.add(new pcx0(context.getString(2131960566)));
                    smc0VarN.add(new lcx0(context.getString(2131960564), !z ? context.getString(2131960563) : context.getString(2131960562), 1, !z ? context.getString(2131960561) : null));
                } else if (objArr == 0) {
                    if (!zU || z) {
                        smc0VarN.add(new pcx0(context.getString(2131960566)));
                    } else {
                        smc0VarN.add(new qcx0(context.getString(2131960566), context.getString(2131960560)));
                    }
                    List<mcx0> listD1 = o7h.d1(iru0Var.c, 3);
                    ArrayList arrayList = new ArrayList(q7h.U(listD1, 10));
                    for (mcx0 mcx0Var : listD1) {
                        Resources resources = context.getResources();
                        int i2 = mcx0Var.b;
                        arrayList.add(new mcx0(mcx0Var.a, mcx0Var.b, mcx0Var.c, mcx0Var.d, true, resources.getQuantityString(2131820866, i2, Integer.valueOf(i2))));
                    }
                    smc0VarN.addAll(arrayList);
                    if (i > 3) {
                        smc0VarN.add(new ocx0(context.getResources().getString(2131960565)));
                    }
                }
                smc0 smc0VarK = k4p1.k(smc0VarN);
                zqh zqhVar = d0v0Var.j;
                if (zqhVar == null) {
                    u890.C("commonAdapter");
                    throw null;
                }
                zqhVar.A(smc0VarK);
                d0v0Var.h.onComplete();
                return;
            case 2:
                Logger.e((Throwable) obj, "Loading web token failed - using original uri", new Object[0]);
                ((a6v0) this.b).a.startActivity(new Intent("android.intent.action.VIEW", (Uri) this.c));
                return;
            case 3:
                jbv0 jbv0Var = (jbv0) obj;
                String str2 = jbv0Var.a;
                String str3 = jbv0Var.b;
                bgm bgmVar = bgm.c;
                String str4 = jbv0Var.c;
                boolean z2 = str2.length() == 0;
                List listSingletonList = Collections.singletonList(wz80.a);
                xz80 xz80Var = new xz80(str4, str2, z2, str3, listSingletonList);
                st60 st60Var = (st60) this.b;
                lik1 lik1Var = (lik1) this.c;
                jl00 jl00Var = (jl00) st60Var.c;
                igm igmVar = z2 ? new igm(str2, (rzn1) null, (String) null, 6) : new igm(str2, new wfm(Uri.parse(str3), bgmVar), (String) null, 4);
                ArrayList<wz80> arrayList2 = new ArrayList();
                for (Object obj2 : listSingletonList) {
                    if (obj2 instanceof wz80) {
                        arrayList2.add(obj2);
                    }
                }
                ArrayList arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
                for (wz80 wz80Var : arrayList2) {
                    arrayList3.add(jl21.b((jl21) jl00Var.b, xz80Var.a, lik1Var));
                }
                ((dg30) st60Var.d).runOnUiThread(new hw9(st60Var, lik1Var, new kjm(igmVar, arrayList3, 4), xz80Var, (byte) 8));
                return;
            case 4:
                ypv0 ypv0Var = (ypv0) this.b;
                dg30 dg30VarF0 = ypv0Var.f0();
                if (dg30VarF0 != null) {
                    dg30VarF0.runOnUiThread(new aih0(ypv0Var, (Uri) this.c, null == true ? 1 : 0, b));
                    return;
                }
                return;
            case 5:
                evw0 evw0Var = (gvw0) obj;
                if (evw0Var instanceof evw0) {
                    CompositeDisposable compositeDisposable = ((cvw0) this.b).d;
                    nl51 nl51Var = ((ph61) this.c).h;
                    LinkedHashMap linkedHashMapB = evw0Var.a.b();
                    be beVar = (be) nl51Var.b;
                    jrz jrzVarO = EsSession.ProductStateMap.o();
                    jrzVarO.n(linkedHashMapB);
                    compositeDisposable.b(beVar.callSingle("spotify.connectivity.auth.esperanto.proto.Session", "writeProductStateToLegacyStorage", jrzVarO.build()).map(b4x0.t).map(u3x0.X).subscribe(xfs0.U0, xfs0.V0));
                    return;
                }
                if (!(evw0Var instanceof fvw0)) {
                    eg.o();
                    return;
                }
                n57.e("Received error from ProductStateProvider: " + ((fvw0) evw0Var).a);
                return;
            case 6:
                wbk1 wbk1Var = ((z6x0) obj).Y;
                wbk1 wbk1Var2 = wbk1.c;
                e7x0 e7x0Var = (e7x0) this.b;
                kt91 kt91Var = e7x0Var.d;
                if (wbk1Var == wbk1Var2) {
                    String string = e7x0Var.f.getString(2131960415);
                    n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                    kt91Var.k(new er91((fs91) null, string, (Integer) null, (String) null, 2131960416, new f1b((com.spotify.mobius.functions.Consumer) this.c, (byte) 13), (cvr) null, (xq91) null, false));
                    return;
                } else {
                    m6w0 m6w0Var = (m6w0) kt91Var.i.a.getValue();
                    if (m6w0Var == null || !m6w0Var.a().h()) {
                        return;
                    }
                    kt91Var.b();
                    return;
                }
            case 7:
                xhm xhmVar = (xhm) ((l901) this.b).e.get();
                pim pimVar = (pim) this.c;
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                xhmVar.a(pimVar, yon1.D4());
                return;
            case 8:
                mo01 mo01Var = (mo01) obj;
                boolean zU2 = r4o1.U((udx0) this.b);
                no01 no01Var = (no01) this.c;
                Context context2 = no01Var.d;
                ArrayList arrayList4 = mo01Var.b;
                boolean zIsEmpty = arrayList4.isEmpty();
                smc0 smc0VarN2 = k4p1.n();
                if (zIsEmpty && zU2 && mo01Var.a) {
                    smc0VarN2.add(new pcx0(context2.getString(2131960572)));
                    smc0VarN2.add(new lcx0(context2.getString(2131960570), context2.getString(2131960569), 2, (String) null));
                } else if (!zIsEmpty) {
                    smc0VarN2.add(new pcx0(context2.getString(2131960572)));
                    List<ncx0> listD2 = o7h.d1(arrayList4, 3);
                    ArrayList arrayList5 = new ArrayList(q7h.U(listD2, 10));
                    for (ncx0 ncx0Var : listD2) {
                        Resources resources2 = context2.getResources();
                        int i3 = ncx0Var.b;
                        arrayList5.add(new ncx0(ncx0Var.b, ncx0Var.a, ncx0Var.c, ncx0Var.d, resources2.getQuantityString(2131820867, i3, Integer.valueOf(i3))));
                    }
                    smc0VarN2.addAll(arrayList5);
                    if (arrayList4.size() > 3) {
                        smc0VarN2.add(new ocx0(context2.getString(2131960571)));
                    }
                }
                smc0 smc0VarK2 = k4p1.k(smc0VarN2);
                zqh zqhVar2 = no01Var.j;
                if (zqhVar2 == null) {
                    u890.C("commonAdapter");
                    throw null;
                }
                zqhVar2.A(smc0VarK2);
                no01Var.h.onComplete();
                return;
            case 9:
                vr01 vr01Var = (vr01) this.b;
                StringBuilder sbN = gvg.n("Lens setting failed for uri: ", vr01Var.p, " with timezoneIdentifier: ", (String) this.c, ". Error: ");
                sbN.append((Throwable) obj);
                vr01Var.f(sbN.toString());
                return;
            case 10:
                i430 i430Var = (i430) obj;
                wdm wdmVar = (wdm) this.b;
                ((r630) wdmVar.g).a(i430Var);
                ca41 ca41Var = (ca41) this.c;
                String str5 = ca41Var.d;
                if (!i430Var.b) {
                    ((r630) wdmVar.g).k(str5, true);
                    ((l0x0) wdmVar.f).q(ca41Var.b, str5);
                }
                ((rb00) wdmVar.Y).a("SAVE_ENTITY", ca41Var.b, ca41Var.c, ca41Var.d, ca41Var.e);
                return;
            case 11:
                ju41 ju41Var = (ju41) obj;
                if ((ju41Var instanceof iu41) || (ju41Var instanceof hu41)) {
                    ((Function0) this.b).invoke();
                    return;
                } else if (ju41Var instanceof gu41) {
                    ((Function0) this.c).invoke();
                    return;
                } else {
                    eg.o();
                    return;
                }
            case 12:
                mq70 mq70Var = (mq70) obj;
                up70 up70VarA2 = mq70Var.a(vp70.b);
                hp80Var = up70VarA2 != null ? up70VarA2.a.a : null;
                hp80 hp80Var2 = hp80Var == null ? "" : hp80Var;
                pp70 pp70Var = mq70Var.b;
                if (pp70Var != null) {
                    j = pp70Var.c.a.c;
                } else {
                    uwr uwrVar = cbx.a;
                    j = ((yex) zex.a.d).c;
                }
                int iG = z4p1.G(j);
                if (pp70Var != null) {
                    j2 = pp70Var.b.a.c;
                } else {
                    uwr uwrVar2 = cbx.a;
                    j2 = ((vex) zex.a.b).c;
                }
                j9h j9hVar = new j9h(iG, z4p1.G(j2));
                tz51 tz51Var = (tz51) this.b;
                ((a061) this.c).c.o(new zx61(tz51Var.a, tz51Var.b, hp80Var2, tz51Var.c, tz51Var.d, j9hVar, tz51Var.e, tz51Var.f), tz51Var.g);
                return;
            case 13:
                d0w0 d0w0Var = (d0w0) obj;
                xh71.b((xh71) this.c, new wa71(d0w0Var.d, (String) null, (cqs0) null, (dqi1) null, ((Context) this.b).getString(2131962305, d0w0Var.g), (String) null, (Bundle) null, 110), (Bundle) null, tm71.b, d0w0Var.h, (List) null, 18);
                return;
            case 14:
                lik1 lik1Var2 = (lik1) this.b;
                cfw cfwVar = (cfw) obj;
                ssf1 ssf1Var = (ssf1) this.c;
                tv80 tv80Var = cfwVar.b;
                if (tv80Var != null) {
                    ssf1Var.b(new dmf1(cfwVar.a, lik1Var2, lik1Var2.a, new vsf1((String) null, (String) null, false, (String) null, false, false, true, false, false, true, (String) null, false, false, false, true, false, (ugo0) null, (ok51) null, false, (g371) null, false, false, false, false, false, false, false, false, (p860) null, (String) null, false, false, -50369, 63), (Map) null), tv80Var);
                    return;
                } else {
                    n57.e("ShowContextMenu effect received without InteractionLoggingResult");
                    ssf1Var.a(new dmf1(cfwVar.a, lik1Var2, lik1Var2.a, new vsf1((String) null, (String) null, false, (String) null, false, false, true, false, false, true, (String) null, false, false, false, true, false, (ugo0) null, (ok51) null, false, (g371) null, false, false, false, false, false, false, false, false, (p860) null, (String) null, false, false, -50369, 63), (Map) null));
                    return;
                }
            case 15:
                if (u890.j((String) this.c, (String) obj)) {
                    ((SlateMessageHostActivity) this.b).finish();
                    return;
                }
                return;
            case 16:
                if (((AtomicBoolean) this.b).getAndSet(true)) {
                    return;
                }
                ((Subject) ((il91) this.c).h.b).onNext(Boolean.TRUE);
                return;
            case 17:
                ip91 ip91Var = (ip91) this.b;
                int i4 = ip91Var.j.b(((jdu0) this.c).a) ? 2131959107 : 2131959106;
                kt91 kt91Var2 = ip91Var.k;
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{Integer.valueOf(i4)});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                kt91Var2.k(new er91((fs91) null, "", Integer.valueOf(i4), (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                return;
            case 18:
                if (((sy21) obj).a.Q0) {
                    ((j0a1) this.b).a.a(new nz91((String) this.c));
                    return;
                }
                return;
            case 19:
                String strConcat = "social listening impl: ".concat((String) this.c);
                Object[] objArr2 = (Object[]) this.b;
                Logger.e((Throwable) obj, strConcat, Arrays.copyOf(objArr2, objArr2.length));
                return;
            case 20:
                n5b1 n5b1Var = (n5b1) this.b;
                String str6 = (String) this.c;
                Logger.b("MBS: onExternalIntegrationPlatformConnected", new Object[0]);
                uhh0 uhh0VarC = n5b1Var.c();
                zih0 zih0Var = uhh0VarC.a;
                zih0Var.getClass();
                zih0Var.k = new WeakReference((x610) obj);
                zih0Var.l = uhh0VarC;
                LinkedHashMap linkedHashMap = zih0Var.h;
                LinkedHashMap linkedHashMap2 = zih0Var.f;
                if (zih0Var.f() != null) {
                    for (Map.Entry entry : linkedHashMap2.entrySet()) {
                        zih0Var.b((String) entry.getKey(), (tn31) entry.getValue());
                    }
                    for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                        zih0Var.a(new vsr0((String) entry2.getKey()), (thh0) entry2.getValue());
                    }
                    zih0Var.d();
                }
                linkedHashMap2.clear();
                linkedHashMap.clear();
                uhh0VarC.d.c = uhh0VarC.e;
                n5b1Var.D.g();
                i4m i4mVar = (i4m) n5b1Var.E.getValue();
                i4mVar.e = l4p1.u(i4mVar.d, new fu20(i4mVar.a.a, new hzb(i4mVar, hp80Var, (byte) 22), (byte) 1));
                n5b1Var.D.b(((od61) n5b1Var.z.getValue()).c.subscribe());
                y490 y490VarA = ((d6b1) n5b1Var.t.getValue()).a();
                ((d6b1) n5b1Var.B.getValue()).i = true;
                n5b1Var.f.e(y490VarA.a());
                if (y490VarA.isActive()) {
                    Logger.b("MBS: Session is already active and will not be activated again.", new Object[0]);
                } else {
                    y490VarA.j();
                }
                y490 y490VarA2 = ((d6b1) n5b1Var.t.getValue()).a();
                ajh0 ajh0Var = (ajh0) n5b1Var.u.getValue();
                Context context3 = n5b1Var.b;
                String str7 = nik1.z0.a;
                pbk1 pbk1Var = ajh0Var.a;
                Set set = s4b1.f;
                s4b1 s4b1VarX = uic.x(str7);
                blc0 blc0Var = s4b1VarX.c;
                if (blc0Var != blc0.Wc) {
                    str7.getClass();
                    if (!uic.u(str7)) {
                        pbk1Var.getClass();
                        Intent intent = new Intent("com.spotify.mobile.android.ui.action.player.SHOW");
                        intent.setFlags(805306368);
                        i2i1Var = new i2i1(context3, pbk1Var.a, intent);
                    } else if (blc0Var == blc0.vj) {
                        String strZ = s4b1VarX.z();
                        if (strZ == null) {
                            eg.m("Required value was null.");
                            return;
                        } else {
                            i2i1Var = pbk1Var.a(context3, strZ);
                            i2i1Var.c();
                        }
                    } else {
                        String strZ2 = s4b1VarX.z();
                        if (strZ2 == null) {
                            eg.m("Required value was null.");
                            return;
                        }
                        i2i1Var = pbk1Var.a(context3, strZ2);
                    }
                } else {
                    pbk1Var.getClass();
                    Intent intent2 = new Intent("com.spotify.mobile.android.ui.action.player.SHOW");
                    intent2.setFlags(805306368);
                    i2i1Var = new i2i1(context3, pbk1Var.a, intent2);
                }
                y490VarA2.setSessionActivity(PendingIntent.getActivity(context3, 9876, (Intent) i2i1Var.b, 201326592));
                n4e0 n4e0Var = (n4e0) ((xgb0) n5b1Var.y.getValue()).c.get(str6);
                if (n4e0Var != null) {
                    n4e0Var.b.g("eis_connection");
                    return;
                }
                return;
            case 21:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                c6b1 c6b1Var = (c6b1) this.b;
                CompositeDisposable compositeDisposable2 = c6b1Var.d;
                FlowableObserveOn flowableObserveOn = c6b1Var.e;
                if (!zBooleanValue) {
                    compositeDisposable2.g();
                    return;
                }
                FlowableFilter flowableFilterX = flowableObserveOn.s(new dr41(c6b1Var, (byte) 21)).x(new pvc(c6b1Var, (byte) 25));
                b6b1 b6b1Var = new b6b1(c6b1Var, (byte) 1);
                wx91 wx91Var = c6b1.g;
                Disposable disposableSubscribe = flowableFilterX.subscribe(b6b1Var, wx91Var);
                Disposable disposableSubscribe2 = flowableObserveOn.s(new mka(c6b1Var, (byte) 26)).x(new yla(c6b1Var, (byte) 26)).subscribe(new b6b1(c6b1Var, (byte) 2), wx91Var);
                Disposable disposableSubscribe3 = ((FlowableDistinctUntilChanged) this.c).x(new lqc(c6b1Var, (byte) 25)).subscribe(new b6b1(c6b1Var, (byte) 0), wx91Var);
                compositeDisposable2.b(disposableSubscribe);
                compositeDisposable2.b(disposableSubscribe2);
                compositeDisposable2.b(disposableSubscribe3);
                return;
            case 22:
                rb00 rb00Var = (rb00) ((bjx) this.b).d;
                xjb1 xjb1Var = (xjb1) this.c;
                rb00Var.a("PLAY", xjb1Var.b, xjb1Var.c, xjb1Var.d, xjb1Var.e);
                return;
            case 23:
                x610 x610Var = (x610) obj;
                y610 y610Var = x610Var.a;
                vqd1 vqd1Var = (vqd1) this.b;
                m210 m210Var = (m210) this.c;
                t45 t45Var = vqd1Var.j;
                if (t45Var != null) {
                    t45Var.g("connect");
                }
                vqd1Var.k = y610Var.a;
                x610Var.c();
                rl1 rl1VarP = y610Var.c.p(m210Var);
                t45 t45Var2 = vqd1Var.j;
                if (t45Var2 != null) {
                    t45.m(t45Var2, "start_external_integration_session", 4);
                }
                rl1VarP.J();
                t45 t45Var3 = vqd1Var.j;
                if (t45Var3 != null) {
                    t45Var3.g("start_external_integration_session");
                }
                vqd1Var.h = rl1VarP;
                CompletableSubject completableSubject = vqd1Var.g;
                completableSubject.getClass();
                completableSubject.onComplete();
                t45 t45Var4 = vqd1Var.j;
                if (t45Var4 != null) {
                    t45Var4.g("start_playback_session");
                }
                t45 t45Var5 = vqd1Var.j;
                if (t45Var5 != null) {
                    vqd1Var.d.b(t45Var5.e());
                }
                vqd1Var.j = null;
                return;
            case 24:
                t45.m((t45) this.b, (String) this.c, 4);
                return;
            case 25:
                n0v0 n0v0Var = (n0v0) ((hce1) this.b).e;
                icf1 icf1Var = (icf1) this.c;
                ((ydf0) n0v0Var.b).d(new w8f1(icf1Var.a, icf1Var.d, icf1Var.e, icf1Var.g, icf1Var.i), (z2g0) obj);
                return;
            case 26:
                ((a780) ((lvc1) this.b).c).a.put((String) this.c, (lwz0) obj);
                return;
            case 27:
                bcl1 bcl1Var = (bcl1) this.b;
                q9l1 q9l1Var = (q9l1) this.c;
                v5h1 v5h1Var = ((x8u) obj).a;
                if (v5h1Var instanceof u5h1) {
                    o0i o0iVar = (o0i) q9l1Var.c.getValue();
                    bcl1.f(bcl1Var, o0iVar != null ? o0iVar.e : null, "back_button", (String) null, (String) null, hzg1.d, 12);
                    return;
                }
                byte b2 = 19;
                if (v5h1Var instanceof v5h1) {
                    v5h1 v5h1Var2 = v5h1Var;
                    o0i o0iVar2 = (o0i) q9l1Var.c.getValue();
                    n2u0 n2u0Var = o0iVar2 != null ? o0iVar2.c.b : null;
                    int i5 = v5h1Var2.b;
                    hp80 hp80Var3 = v5h1Var2.c;
                    boolean z3 = hp80Var3 instanceof w8l1;
                    w8l1 w8l1Var = z3 ? (w8l1) hp80Var3 : null;
                    if (w8l1Var == null || (uri2 = w8l1Var.getUri()) == null) {
                        uri2 = "";
                    }
                    hp80Var = z3 ? (w8l1) hp80Var3 : null;
                    if (hp80Var != null && (vplVarA2 = hp80Var.a()) != null && (strJ2 = vplVarA2.j()) != null) {
                        str = strJ2;
                    }
                    e5l0 e5l0Var = new e5l0(new fp80(i5, uri2, str), b2);
                    bcl1Var.c(e5l0Var, new o6h1(e5l0Var, n2u0Var, (byte) 0));
                    return;
                }
                if (!(v5h1Var instanceof w5h1)) {
                    eg.o();
                    return;
                }
                w5h1 w5h1Var = (w5h1) v5h1Var;
                o0i o0iVar3 = (o0i) q9l1Var.c.getValue();
                n2u0 n2u0Var2 = o0iVar3 != null ? o0iVar3.c.b : null;
                int i6 = w5h1Var.b;
                hp80 hp80Var4 = w5h1Var.c;
                boolean z4 = hp80Var4 instanceof w8l1;
                w8l1 w8l1Var2 = z4 ? (w8l1) hp80Var4 : null;
                if (w8l1Var2 == null || (uri = w8l1Var2.getUri()) == null) {
                    uri = "";
                }
                hp80Var = z4 ? (w8l1) hp80Var4 : null;
                if (hp80Var != null && (vplVarA = hp80Var.a()) != null && (strJ = vplVarA.j()) != null) {
                    str = strJ;
                }
                e5l0 e5l0Var2 = new e5l0(new fp80(i6, uri, str), b2);
                bcl1Var.c(e5l0Var2, new o6h1(e5l0Var2, n2u0Var2, (byte) 1));
                return;
            case 28:
                s8h1 s8h1Var = (s8h1) this.b;
                UbiExpr1Heartbeat ubiExpr1Heartbeat = (UbiExpr1Heartbeat) this.c;
                s8h1Var.a.a(ubiExpr1Heartbeat);
                s8h1Var.g = Long.valueOf(s8h1Var.c.b());
                Objects.toString(ubiExpr1Heartbeat);
                return;
            default:
                kz50 kz50Var = (kz50) this.b;
                ((rm5) kz50Var.g).F((Throwable) obj, (x020) this.c, System.currentTimeMillis() - ((AtomicLong) kz50Var.f).get());
                return;
        }
    }

    public /* synthetic */ z0u0(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
