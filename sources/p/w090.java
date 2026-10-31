package p;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.base.java.logging.Logger;
import com.spotify.carmobile.jumpstart.events.proto.JumpstartTrigger;
import com.spotify.libs.connect.events.proto.LogoutEverywhereNonAuth;
import com.spotify.libs.sociallistening.events.proto.JamSocialRadarJoinTokenReceived;
import com.spotify.libs.sociallistening.events.proto.SocialConnectInviteNotificationReceivedV1;
import com.spotify.pending_events.esperanto.proto.AddPendingEventResponse;
import com.spotify.pending_events.esperanto.proto.CommitPendingEventRequest;
import com.spotify.pending_events.esperanto.proto.ReplacePendingEventResponse;
import com.spotify.tap.playback.TapLoggedOutException;
import com.spotify.tap.playback.TapNothingToPlayException;
import com.spotify.tap.playback.TapPlaybackException;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import io.reactivex.rxjava3.core.Notification;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.subjects.CompletableSubject;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class w090 implements Consumer {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public /* synthetic */ w090(Object obj, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    public final void accept(Object obj) {
        Object value;
        LinkedHashMap linkedHashMap;
        String str;
        dtd0 dtd0Var;
        m350 m350Var;
        iw4 iw4Var;
        iw4 iw4Var2;
        m4p0 m4p0Var;
        String str2;
        switch (this.a) {
            case 0:
                ((hla) this.c).invoke();
                ((u090) this.b).invoke();
                return;
            case 1:
                ((hla) this.c).invoke();
                ((u090) this.b).invoke();
                return;
            case 2:
                g2z g2zVar = (g2z) ((g2z) this.c).f;
                String str3 = (String) this.b;
                cpr cprVar = (cpr) g2zVar.e;
                ay91 ay91VarN = SocialConnectInviteNotificationReceivedV1.n();
                ay91VarN.n(str3);
                SocialConnectInviteNotificationReceivedV1 socialConnectInviteNotificationReceivedV1Build = ay91VarN.build();
                t2j0 t2j0Var = cprVar.a;
                socialConnectInviteNotificationReceivedV1Build.getClass();
                t2j0Var.a(socialConnectInviteNotificationReceivedV1Build);
                return;
            case 3:
                b3a0 b3a0Var = (b3a0) obj;
                u2a0 u2a0Var = (u2a0) this.c;
                String str4 = b3a0Var.a;
                ee9 ee9Var = b3a0Var.b;
                u2a0Var.getClass();
                h6c h6cVar = new h6c(str4, ee9Var.getUuid());
                HashSet hashSet = u2a0Var.b;
                if (!hashSet.contains(h6cVar)) {
                    hashSet.add(h6cVar);
                    t2j0 t2j0Var2 = u2a0Var.a;
                    v2a0 v2a0VarN = JamSocialRadarJoinTokenReceived.n();
                    v2a0VarN.q(str4);
                    v2a0VarN.n(ee9Var.getUuid().toString());
                    t2j0Var2.a(v2a0VarN.build());
                }
                xl01 xl01Var = (xl01) this.b;
                int i = b3a0Var.c;
                bpb1 bpb1Var = xl01Var.d;
                do {
                    value = bpb1Var.getValue();
                    linkedHashMap = new LinkedHashMap((Map) value);
                    linkedHashMap.put(str4, new ul01(xl01Var.a.b(), i));
                } while (!bpb1Var.k(value, linkedHashMap));
                return;
            case 4:
                ogz0 ogz0Var = (ogz0) obj;
                aia0 aia0Var = (aia0) this.c;
                if (ogz0Var.equals(mgz0.a)) {
                    aia0Var.a("No suitable content found");
                    return;
                }
                if (!ogz0Var.equals(ngz0.a)) {
                    eg.o();
                    return;
                }
                ou80 ou80Var = (ou80) this.b;
                ConcurrentHashMap concurrentHashMap = ((bba) aia0Var).d;
                Collection collectionValues = concurrentHashMap.values();
                ArrayList<wqd> arrayList = new ArrayList(q7h.U(collectionValues, 10));
                Iterator it = collectionValues.iterator();
                while (it.hasNext()) {
                    arrayList.add(((aba) it.next()).a);
                }
                for (wqd wqdVar : arrayList) {
                    wqd wqdVar2 = wqdVar != null ? wqdVar : null;
                    if (wqdVar2 != null) {
                        str = wqdVar2.a;
                        if (str == null) {
                            u890.C("source");
                            throw null;
                        }
                    } else {
                        str = null;
                    }
                    x390 x390Var = ((bba) aia0Var).b;
                    wqdVar.getClass();
                    String str5 = ou80Var.a;
                    cia0 cia0VarO = JumpstartTrigger.o();
                    cia0VarO.r();
                    cia0VarO.s();
                    if (str5 != null) {
                        cia0VarO.q(str5);
                    }
                    cia0VarO.n(str);
                    JumpstartTrigger jumpstartTriggerBuild = cia0VarO.build();
                    t2j0 t2j0Var3 = (t2j0) x390Var.c;
                    jumpstartTriggerBuild.getClass();
                    t2j0Var3.a(jumpstartTriggerBuild);
                }
                concurrentHashMap.clear();
                aia0Var.N0.c();
                return;
            case 5:
                p0b0 p0b0Var = (p0b0) ((spq0) obj).h();
                if (p0b0Var == null || p0b0Var.equals((p0b0) this.c)) {
                    return;
                }
                ((wza0) this.b).f(p0b0Var);
                return;
            case 6:
                xnh1 xnh1Var = (f6r0) obj;
                kdn0 kdn0Var = ((u0c0) this.c).b;
                xnh1 xnh1Var2 = xnh1Var instanceof xnh1 ? xnh1Var : null;
                kdn0Var.m(xnh1Var2 != null ? new bn70(xnh1Var2.a(), new lik1((String) this.b), (nar0) null) : null);
                return;
            case 7:
                dr90 dr90Var = (dr90) obj;
                gtd0 gtd0Var = gtd0.a;
                ptd0 ptd0Var = ptd0.a;
                t8r0 t8r0Var = ((xqd0) this.b).t;
                com.spotify.mobius.functions.Consumer consumer = (com.spotify.mobius.functions.Consumer) this.c;
                Logger.b("[LiveSharing] Handling Jam event: " + dr90Var + ".", new Object[0]);
                if (dr90Var instanceof yq90) {
                    Logger.b("[LiveSharing] Failed to join Jam: " + dr90Var + ".", new Object[0]);
                    yq90 yq90Var = (yq90) dr90Var;
                    if (yq90Var instanceof xq90) {
                        dtd0Var = dtd0.a;
                    } else {
                        if (!(yq90Var instanceof wq90)) {
                            eg.o();
                            return;
                        }
                        dtd0Var = ctd0.a;
                    }
                    consumer.accept(dtd0Var);
                    return;
                }
                if (dr90Var instanceof zq90) {
                    String str6 = ((lx91) t8r0Var.a).k.e().g;
                    String str7 = str6.length() == 0 ? null : str6;
                    if (str7 != null) {
                        consumer.accept(new ysd0(new jsd0(str7), ((lx91) t8r0Var.a).k.e().b));
                        return;
                    }
                    return;
                }
                if (dr90Var instanceof uq90) {
                    Logger.b("[LiveSharing] Jam ended.", new Object[0]);
                    consumer.accept(ptd0Var);
                    return;
                }
                if (dr90Var instanceof br90) {
                    Logger.b("[LiveSharing] Left Jam.", new Object[0]);
                    consumer.accept(gtd0Var);
                    return;
                }
                if (dr90Var instanceof vq90) {
                    String str8 = ((vq90) dr90Var).a;
                    Logger.b(l1d.m("[LiveSharing] Failed to end Jam ", str8), new Object[0]);
                    k5a1 k5a1VarE = ((lx91) t8r0Var.a).k.e();
                    if (u890.j(k5a1VarE.h, str8) && u890.j(k5a1VarE.s, new wg61())) {
                        return;
                    }
                    consumer.accept(ptd0Var);
                    return;
                }
                if (dr90Var instanceof cr90) {
                    return;
                }
                if (!(dr90Var instanceof ar90)) {
                    eg.o();
                    return;
                } else {
                    Logger.b("[LiveSharing] User kicked by host.", new Object[0]);
                    consumer.accept(gtd0Var);
                    return;
                }
            case 8:
                grd0 grd0Var = (grd0) obj;
                mrd0 mrd0Var = (mrd0) this.c;
                grd0Var.getClass();
                yqd0 yqd0Var = (yqd0) this.b;
                if (grd0Var.equals(erd0.a)) {
                    d350 d350VarF = mrd0Var.f();
                    hrd0 hrd0Var = new hrd0(mrd0Var, (byte) 19);
                    lrd0 lrd0Var = new lrd0(mrd0Var, yqd0Var, (byte) 3);
                    ur00 ur00Var = d350VarF.c;
                    Context context = d350VarF.a;
                    ur00Var.d = context.getString(2131956317);
                    ur00Var.e = context.getString(2131956316);
                    ur00Var.f = context.getString(2131956314);
                    ur00Var.b = lrd0Var;
                    ur00Var.c = hrd0Var;
                    tqd0 tqd0VarE = ur00Var.e();
                    tqd0VarE.X(new nzx(d350VarF.g, (byte) 2));
                    mrd0Var.j(tqd0VarE, true);
                    return;
                }
                if (grd0Var.equals(brd0.a)) {
                    d350 d350VarF2 = mrd0Var.f();
                    hrd0 hrd0Var2 = new hrd0(mrd0Var, (byte) 17);
                    lrd0 lrd0Var2 = new lrd0(mrd0Var, yqd0Var, (byte) 1);
                    ur00 ur00Var2 = d350VarF2.c;
                    Context context2 = d350VarF2.a;
                    ur00Var2.d = context2.getString(2131956300);
                    ur00Var2.e = context2.getString(2131956299);
                    ur00Var2.f = context2.getString(2131956298);
                    ur00Var2.b = lrd0Var2;
                    ur00Var2.c = hrd0Var2;
                    tqd0 tqd0VarE2 = ur00Var2.e();
                    tqd0VarE2.X(new nzx(d350VarF2.g, (byte) 1));
                    mrd0Var.j(tqd0VarE2, true);
                    return;
                }
                if (grd0Var.equals(frd0.a)) {
                    d350 d350VarF3 = mrd0Var.f();
                    hrd0 hrd0Var3 = new hrd0(mrd0Var, (byte) 20);
                    hrd0 hrd0Var4 = new hrd0(mrd0Var, (byte) 21);
                    bjx bjxVar = d350VarF3.b;
                    Context context3 = d350VarF3.a;
                    bjxVar.d = context3.getString(2131956325);
                    bjxVar.e = context3.getString(2131956323);
                    bjxVar.f = context3.getString(2131956321);
                    bjxVar.g = context3.getString(2131956320);
                    bjxVar.b = hrd0Var4;
                    bjxVar.c = hrd0Var3;
                    String str9 = (String) bjxVar.d;
                    if (str9 == null || ihc1.y0(str9)) {
                        hhg1.n("Live sharing dialog requires a non-null and non-blank title");
                    } else {
                        String str10 = (String) bjxVar.e;
                        if (str10 == null || ihc1.y0(str10)) {
                            hhg1.n("Live sharing dialog requires a non-null and non-blank subtitle");
                        } else {
                            String str11 = (String) bjxVar.f;
                            if (str11 != null && !ihc1.y0(str11)) {
                                String str12 = (String) bjxVar.g;
                                if (str12 == null || ihc1.y0(str12)) {
                                    hhg1.n("Live sharing dialog requires a negative buttonText");
                                } else {
                                    m350 m350Var2 = new m350();
                                    Bundle bundleF = pzm.f("title", str9, "subtitle", str10);
                                    bundleF.putString("positive_button_text", str11);
                                    bundleF.putString("negative_button_text", str12);
                                    m350Var2.T0(bundleF);
                                    m350Var2.W1 = (Function0) bjxVar.b;
                                    m350Var2.X1 = (Function0) bjxVar.c;
                                    m350Var = m350Var2;
                                }
                                m350Var.X(new nzx(d350VarF3.g, (byte) 3));
                                mrd0Var.j(m350Var, true);
                                return;
                            }
                            hhg1.n("Live sharing dialog requires a positive button text");
                        }
                    }
                    m350Var = null;
                    m350Var.X(new nzx(d350VarF3.g, (byte) 3));
                    mrd0Var.j(m350Var, true);
                    return;
                }
                if (grd0Var.equals(zqd0.a)) {
                    d350 d350VarF4 = mrd0Var.f();
                    hrd0 hrd0Var5 = new hrd0(mrd0Var, (byte) 14);
                    lrd0 lrd0Var3 = new lrd0(mrd0Var, yqd0Var, (byte) 0);
                    ne neVar = d350VarF4.d;
                    Context context4 = d350VarF4.a;
                    neVar.c = context4.getString(2131956285);
                    neVar.d = context4.getString(2131956284);
                    neVar.e = context4.getString(2131956283);
                    neVar.a = lrd0Var3;
                    neVar.b = hrd0Var5;
                    tqd0 tqd0VarI = neVar.i();
                    tqd0VarI.X(new nzx(d350VarF4.g, (byte) 0));
                    mrd0Var.j(tqd0VarI, true);
                    return;
                }
                if (grd0Var.equals(crd0.a)) {
                    d350 d350VarF5 = mrd0Var.f();
                    hrd0 hrd0Var6 = new hrd0(mrd0Var, (byte) 18);
                    lrd0 lrd0Var4 = new lrd0(mrd0Var, yqd0Var, (byte) 2);
                    ne neVar2 = d350VarF5.d;
                    Context context5 = d350VarF5.a;
                    neVar2.c = context5.getString(2131956303);
                    neVar2.d = context5.getString(2131956302);
                    neVar2.e = context5.getString(2131956301);
                    neVar2.a = lrd0Var4;
                    neVar2.b = hrd0Var6;
                    tqd0 tqd0VarI2 = neVar2.i();
                    tqd0VarI2.X(new nzx(d350VarF5.g, (byte) 0));
                    mrd0Var.j(tqd0VarI2, true);
                    return;
                }
                if (!grd0Var.equals(ard0.a)) {
                    if (grd0Var.equals(drd0.a)) {
                        mrd0Var.e();
                        return;
                    } else {
                        eg.o();
                        return;
                    }
                }
                d350 d350VarF6 = mrd0Var.f();
                hrd0 hrd0Var7 = new hrd0(mrd0Var, (byte) 15);
                hrd0 hrd0Var8 = new hrd0(mrd0Var, (byte) 16);
                g2z g2zVar2 = d350VarF6.f;
                Context context6 = d350VarF6.a;
                g2zVar2.a = context6.getString(2131956296);
                g2zVar2.b = context6.getString(2131956293);
                g2zVar2.c = context6.getString(2131956295);
                g2zVar2.e = context6.getString(2131956294);
                g2zVar2.d = hrd0Var7;
                g2zVar2.f = hrd0Var8;
                String str13 = (String) g2zVar2.a;
                String str14 = (String) g2zVar2.b;
                String str15 = (String) g2zVar2.c;
                String str16 = (String) g2zVar2.e;
                f350 f350Var = new f350();
                Bundle bundleF2 = pzm.f("title", str13, "subtitle", str14);
                bundleF2.putString("install_button_text", str15);
                bundleF2.putString("dismiss_button_text", str16);
                f350Var.T0(bundleF2);
                f350Var.W1 = (Function0) g2zVar2.d;
                f350Var.X1 = (Function0) g2zVar2.f;
                mrd0Var.j(f350Var, true);
                return;
            case 9:
                rzd0 rzd0Var = (rzd0) this.c;
                i8h1 i8h1Var = rzd0Var.a;
                h7l0 h7l0Var = rzd0Var.b;
                x6h1 x6h1VarC = h7l0Var.b.c();
                x6h1VarC.i.add(new a7h1("successful_action_modal", "upcoming_party_notify_me", (Integer) null, (String) null, (String) null));
                x6h1VarC.j = true;
                y6h1 y6h1VarA = x6h1VarC.a();
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1VarA;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                k7h1Var.e = h7l0Var.c;
                i8h1Var.f(k7h1Var.a(), (Set) null);
                kt91 kt91Var = (kt91) this.b;
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131957631});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                kt91Var.k(new er91((fs91) null, "", 2131957631, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                return;
            case 10:
                rzd0 rzd0Var2 = (rzd0) this.c;
                i8h1 i8h1Var2 = rzd0Var2.a;
                h7l0 h7l0Var2 = rzd0Var2.b;
                x6h1 x6h1VarC2 = h7l0Var2.b.c();
                x6h1VarC2.i.add(new a7h1("failure_action_modal", "upcoming_party_notify_me", (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = true;
                y6h1 y6h1VarA2 = x6h1VarC2.a();
                k7h1 k7h1Var2 = new k7h1();
                ((xjn) k7h1Var2).a = y6h1VarA2;
                ((xjn) k7h1Var2).c = Long.valueOf(System.currentTimeMillis());
                k7h1Var2.e = h7l0Var2.c;
                i8h1Var2.f(k7h1Var2.a(), (Set) null);
                ((Consumer) this.b).accept(new jxd0(new wvd0(((mxd0) obj).a)));
                return;
            case 11:
                ((bge0) this.c).b.a = ((com.spotify.player.model.Context) this.b).uri();
                return;
            case 12:
                ((t2j0) ((km0) this.c).c).a(LogoutEverywhereNonAuth.n().build());
                ((n4f0) this.b).c(yg8.e, 2);
                return;
            case 13:
                ((utg0) this.c).e.onNext(new ttg0((m0u0) this.b, (otg0) obj));
                return;
            case 14:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                mwg0 mwg0Var = (mwg0) this.b;
                iug0 iug0Var = ((ivg0) this.c).a;
                if (!zBooleanValue) {
                    String str17 = iug0Var.t;
                    String str18 = iug0Var.t;
                    if (str18 != null && str18.length() != 0) {
                        if (str17 == null || str17.length() == 0) {
                            return;
                        }
                        SpannableString spannableString = new SpannableString(f4i1.f(iug0Var.i, " ", str17));
                        int iW0 = ihc1.w0(spannableString, str17, 0, false, 6);
                        spannableString.setSpan(new StyleSpan(1), iW0, str17.length() + iW0, 33);
                        TextView textView = mwg0Var.M1;
                        if (textView == null) {
                            u890.C("legalTextView");
                            throw null;
                        }
                        textView.setText(spannableString);
                        TextView textView2 = mwg0Var.M1;
                        if (textView2 != null) {
                            textView2.setOnClickListener(new kwg0(mwg0Var, (byte) 2));
                            return;
                        } else {
                            u890.C("legalTextView");
                            throw null;
                        }
                    }
                }
                String str19 = iug0Var.i;
                TextView textView3 = mwg0Var.M1;
                if (textView3 != null) {
                    textView3.setText(str19);
                    return;
                } else {
                    u890.C("legalTextView");
                    throw null;
                }
            case 15:
                r0i0 r0i0Var = (r0i0) obj;
                h1i0 h1i0Var = (h1i0) this.c;
                y490 y490Var = (y490) this.b;
                h1i0Var.getClass();
                h1i0Var.g = r0i0Var.e == mgz.c ? r0i0Var : null;
                y490Var.l(r0i0Var);
                return;
            case 16:
                Throwable th = (Throwable) obj;
                CompletableSubject completableSubject = (CompletableSubject) ((kcs) this.c).b.remove((String) this.b);
                if (completableSubject != null) {
                    completableSubject.onError(th);
                    return;
                }
                return;
            case 17:
                m4p0 m4p0Var2 = (m4p0) obj;
                bjx bjxVar2 = (bjx) this.c;
                b4p0 b4p0Var = (b4p0) this.b;
                m4p0 m4p0Var3 = (m4p0) bjxVar2.g;
                if (m4p0Var3 != null) {
                    m4p0Var3.stop();
                }
                bjxVar2.g = m4p0Var2;
                ViewGroup viewGroup = b4p0Var.K1;
                if (viewGroup == null) {
                    u890.C("rootView");
                    throw null;
                }
                LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
                ViewGroup viewGroup2 = b4p0Var.K1;
                if (viewGroup2 == null) {
                    u890.C("rootView");
                    throw null;
                }
                LayoutInflater layoutInflaterCloneInContext = layoutInflaterFrom.cloneInContext(viewGroup2.getContext());
                ewx ewxVar = b4p0Var.H1;
                if (ewxVar == null) {
                    u890.C("encoreInflaterFactory");
                    throw null;
                }
                layoutInflaterCloneInContext.setFactory2(ewxVar);
                ViewGroup viewGroup3 = b4p0Var.K1;
                if (viewGroup3 == null) {
                    u890.C("rootView");
                    throw null;
                }
                View viewA = m4p0Var2.a(layoutInflaterCloneInContext, viewGroup3);
                ViewGroup viewGroup4 = b4p0Var.K1;
                if (viewGroup4 == null) {
                    u890.C("rootView");
                    throw null;
                }
                viewGroup4.removeAllViews();
                ViewGroup viewGroup5 = b4p0Var.K1;
                if (viewGroup5 == null) {
                    u890.C("rootView");
                    throw null;
                }
                viewGroup5.addView(viewA);
                b4p0Var.Y0();
                m4p0 m4p0Var4 = (m4p0) bjxVar2.g;
                if (m4p0Var4 != null) {
                    m4p0Var4.start();
                    return;
                }
                return;
            case 18:
                mmr0 mmr0Var = (mmr0) obj;
                u4p0 u4p0Var = (u4p0) this.b;
                o4p0 o4p0Var = (o4p0) mmr0Var.a;
                ufm0 ufm0Var = (ufm0) mmr0Var.b;
                r24 r24Var = (r24) this.c;
                p4p0 p4p0Var = (p4p0) r24Var.b;
                q2p0 q2p0Var = (q2p0) ((ynb0) r24Var.c).get();
                HashMap map = p4p0Var.a;
                Object objA = map.get(o4p0Var);
                if (objA == null) {
                    objA = o4p0Var.a(q2p0Var);
                    map.put(o4p0Var, objA);
                }
                n4p0 n4p0Var = (n4p0) objA;
                String strName = n4p0Var.name();
                String str20 = ufm0Var.a;
                String str21 = ufm0Var.b;
                ViewGroup viewGroup6 = u4p0Var.t;
                if (viewGroup6 == null) {
                    u890.C("rootView");
                    throw null;
                }
                ihl0 ihl0Var = new ihl0(strName, str21, str20, j7p1.s(viewGroup6));
                ViewGroup viewGroup7 = u4p0Var.t;
                if (viewGroup7 == null) {
                    u890.C("rootView");
                    throw null;
                }
                op80 op80VarK = j6p1.k(new g3h1(ihl0Var), new h3h1(new y3o0(ihl0Var, (byte) 20)));
                ViewGroup viewGroup8 = u4p0Var.t;
                if (viewGroup8 == null) {
                    u890.C("rootView");
                    throw null;
                }
                xhk1.c(viewGroup7, j6p1.k(j6p1.k(op80VarK, new jp80(viewGroup8)), new eq80(new e3h1((l6h1) u4p0Var.e.get(), (n7h1) u4p0Var.f.get(), (i8h1) u4p0Var.X.getValue()))));
                u4p0Var.c.a = ihl0Var.b();
                w4p0 w4p0Var = (w4p0) r24Var.g;
                if (((o4p0) r24Var.j) == o4p0Var) {
                    return;
                }
                m4p0 m4p0Var5 = (m4p0) r24Var.k;
                if (m4p0Var5 != null) {
                    m4p0Var5.stop();
                }
                if (((vu4) r24Var.h).a() && (m4p0Var = (m4p0) r24Var.k) != null) {
                    m4p0Var.destroy();
                }
                r24Var.j = o4p0Var;
                String strName2 = n4p0Var.name();
                if (!w4p0Var.h) {
                    w4p0Var.h = true;
                    iw4 iw4Var3 = w4p0Var.d;
                    if (iw4Var3 != null) {
                        t45 t45Var = iw4Var3.c;
                        if (t45Var != null) {
                            t45Var.b("npv_mode", strName2);
                        }
                        if (w4p0Var.g) {
                            iw4Var3.d = true;
                            iw4Var3.a(4);
                        }
                    }
                }
                if (!w4p0Var.i && (iw4Var2 = w4p0Var.d) != null) {
                    iw4Var2.e(3, false);
                }
                m4p0 m4p0Var6 = (m4p0) n4p0Var.a().invoke();
                if (!w4p0Var.i) {
                    w4p0Var.i = true;
                    iw4 iw4Var4 = w4p0Var.d;
                    if (iw4Var4 != null) {
                        iw4Var4.a(3);
                    }
                }
                w4p0 w4p0Var2 = u4p0Var.h;
                ViewGroup viewGroup9 = u4p0Var.t;
                if (viewGroup9 == null) {
                    u890.C("rootView");
                    throw null;
                }
                LayoutInflater layoutInflaterFrom2 = LayoutInflater.from(viewGroup9.getContext());
                ViewGroup viewGroup10 = u4p0Var.t;
                if (viewGroup10 == null) {
                    u890.C("rootView");
                    throw null;
                }
                LayoutInflater layoutInflaterCloneInContext2 = layoutInflaterFrom2.cloneInContext(viewGroup10.getContext());
                layoutInflaterCloneInContext2.setFactory2(u4p0Var.b);
                if (!u4p0Var.i.b()) {
                    ViewGroup viewGroup11 = u4p0Var.t;
                    if (viewGroup11 == null) {
                        u890.C("rootView");
                        throw null;
                    }
                    pg10 pg10Var = new pg10(1);
                    ((jhg1) pg10Var).c = 200L;
                    ((jhg1) pg10Var).d = hlv.e;
                    fjg1.a(viewGroup11, pg10Var);
                }
                ViewGroup viewGroup12 = u4p0Var.t;
                if (viewGroup12 == null) {
                    u890.C("rootView");
                    throw null;
                }
                m87.q(viewGroup12);
                ViewGroup viewGroup13 = u4p0Var.t;
                if (viewGroup13 == null) {
                    u890.C("rootView");
                    throw null;
                }
                viewGroup13.removeAllViews();
                if (!w4p0Var2.j && (iw4Var = w4p0Var2.d) != null) {
                    iw4Var.e(2, false);
                }
                ViewGroup viewGroup14 = u4p0Var.t;
                if (viewGroup14 == null) {
                    u890.C("rootView");
                    throw null;
                }
                View viewA2 = m4p0Var6.a(layoutInflaterCloneInContext2, viewGroup14);
                if (!w4p0Var2.j) {
                    w4p0Var2.j = true;
                    iw4 iw4Var5 = w4p0Var2.d;
                    if (iw4Var5 != null) {
                        iw4Var5.a(2);
                    }
                }
                ViewGroup viewGroup15 = u4p0Var.t;
                if (viewGroup15 == null) {
                    u890.C("rootView");
                    throw null;
                }
                viewGroup15.addView(viewA2);
                ViewGroup viewGroup16 = u4p0Var.t;
                if (viewGroup16 == null) {
                    u890.C("rootView");
                    throw null;
                }
                View viewB = u4p0Var.g.b(viewGroup16.getContext(), viewGroup16, 1, zg91.a);
                qhl qhlVar = new qhl(-1, 0);
                qhlVar.l = 0;
                viewB.setLayoutParams(qhlVar);
                viewGroup16.addView(viewB);
                aiq0.a(viewA2, new aih0(viewA2, u4p0Var, false, (byte) 7));
                ViewGroup viewGroup17 = u4p0Var.t;
                if (viewGroup17 == null) {
                    u890.C("rootView");
                    throw null;
                }
                WeakHashMap weakHashMap = b8k1.a;
                viewGroup17.requestApplyInsets();
                m4p0Var6.start();
                if (!w4p0Var.k) {
                    w4p0Var.k = true;
                    iw4 iw4Var6 = w4p0Var.d;
                    if (iw4Var6 != null) {
                        iw4Var6.e(5, false);
                    }
                }
                r24Var.k = m4p0Var6;
                return;
            case 19:
                String str22 = (String) obj;
                r2b1 r2b1Var = (r2b1) this.c;
                r2b1Var.getClass();
                r2b1Var.d(new k7a1(r2b1Var, str22, (byte) 7));
                n2b1 n2b1Var = (n2b1) ((km0) this.b).c;
                hma1 hma1VarEdit = n2b1Var.a.edit();
                hma1VarEdit.d(n2b1.c, str22);
                l1d.B(n2b1Var.b, hma1VarEdit, n2b1.d);
                return;
            case 20:
                Context context7 = (Context) this.c;
                pvo0 pvo0Var = (pvo0) this.b;
                uh3 uh3Var = new uh3(context7);
                qh3 qh3Var = uh3Var.a;
                qh3Var.f = qh3Var.a.getText(2131963013);
                uh3Var.setPositiveButton(2131963011, new nvo0(pvo0Var, (byte) 0)).setNegativeButton(2131963012, new nvo0(pvo0Var, (byte) 1));
                uh3Var.create().show();
                return;
            case 21:
                lcs.b((Context) this.b, (lcs) this.c);
                return;
            case 22:
                Notification notification = (Notification) obj;
                mgp0 mgp0Var = (mgp0) this.c;
                com.spotify.mobius.functions.Consumer consumer2 = (com.spotify.mobius.functions.Consumer) this.b;
                synchronized (mgp0Var) {
                    if (!mgp0Var.b) {
                        consumer2.accept(new ngp0(notification));
                    }
                    break;
                }
                return;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                ((elp0) this.c).N0.onNext(new i5w0((View) this.b));
                return;
            case 24:
                ((drp0) this.c).e.a(wdu0.a((String) null, (String) null, (n2v) null), (tv80) this.b, (Bundle) null);
                return;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                kz01 kz01Var = (kz01) obj;
                vu1.b((vu1) this.b, Collections.singletonList(kz01Var.a), ((lik1) this.c).a, kz01Var.b, kz01Var.c, (dy1) null, 48);
                return;
            case 26:
                ((qbs0) this.c).Z0().U(new x300(((ygw) this.b).a, (Throwable) obj));
                return;
            case 27:
                AddPendingEventResponse addPendingEventResponse = (AddPendingEventResponse) obj;
                if (addPendingEventResponse.o()) {
                    ((ConcurrentHashMap) ((myq0) this.c).c).put((String) this.b, new ufs0(addPendingEventResponse.p(), addPendingEventResponse.q()));
                    return;
                }
                return;
            case 28:
                if (((ReplacePendingEventResponse) obj).o()) {
                    myq0 myq0Var = (myq0) this.c;
                    ufs0 ufs0Var = (ufs0) this.b;
                    pqh pqhVarN = CommitPendingEventRequest.n();
                    pqhVarN.n(ufs0Var.a);
                    pqhVarN.q(ufs0Var.b);
                    CommitPendingEventRequest commitPendingEventRequestBuild = pqhVarN.build();
                    vfs0 vfs0Var = (vfs0) myq0Var.b;
                    commitPendingEventRequestBuild.getClass();
                    vfs0Var.callSingle("spotify.pending_events.esperanto.proto.PendingEvents", "CommitPendingEvent", commitPendingEventRequestBuild).map(xj20.W0).subscribe(zzc0.b1, zzc0.c1);
                    return;
                }
                return;
            default:
                TapNothingToPlayException tapNothingToPlayException = (Throwable) obj;
                hkt0 hkt0Var = (hkt0) this.c;
                boolean z = tapNothingToPlayException instanceof TapNothingToPlayException;
                if (z) {
                    str2 = "NOTHING_TO_PLAY";
                } else if (tapNothingToPlayException instanceof TapPlaybackException) {
                    str2 = "PLAYBACK_ERROR";
                } else {
                    str2 = tapNothingToPlayException instanceof TapLoggedOutException ? "USER_LOGGED_OUT" : "UNKNOWN_ERROR";
                }
                String str23 = str2;
                yfu yfuVar = ((tvt0) this.b).e;
                String str24 = hkt0Var.e;
                if (str24 == null) {
                    str24 = "";
                }
                String str25 = str24;
                String str26 = hkt0Var.a;
                String str27 = hkt0Var.c;
                String str28 = hkt0Var.b;
                String str29 = hkt0Var.d;
                TapNothingToPlayException tapNothingToPlayException2 = z ? tapNothingToPlayException : null;
                yfuVar.o(str25, str26, str27, str28, str29, "ERROR", str23, tapNothingToPlayException2 != null ? tapNothingToPlayException2.a : null);
                return;
        }
    }
}
