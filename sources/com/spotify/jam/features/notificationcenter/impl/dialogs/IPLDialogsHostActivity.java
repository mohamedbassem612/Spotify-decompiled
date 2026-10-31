package com.spotify.jam.features.notificationcenter.impl.dialogs;

import android.R;
import android.app.Activity;
import android.os.Bundle;
import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import p.a7h1;
import p.afa0;
import p.b0s0;
import p.bbl0;
import p.bfa0;
import p.bj70;
import p.ci70;
import p.di70;
import p.dr91;
import p.eg;
import p.ei70;
import p.f0i;
import p.fi70;
import p.g2z;
import p.gi70;
import p.gj5;
import p.gj70;
import p.hi70;
import p.hj70;
import p.i4o;
import p.i8h1;
import p.ii70;
import p.iv81;
import p.ji70;
import p.k7h1;
import p.kj70;
import p.l1d;
import p.m4r;
import p.mn5;
import p.mw40;
import p.nj70;
import p.nxr;
import p.o1s;
import p.p1s;
import p.p7h;
import p.pdl0;
import p.pi70;
import p.pw40;
import p.q1s;
import p.q8h1;
import p.r1s;
import p.rih1;
import p.si70;
import p.t3b1;
import p.th30;
import p.ti70;
import p.tr41;
import p.u0a1;
import p.u1s;
import p.u890;
import p.ui70;
import p.v1s;
import p.vi70;
import p.w1s;
import p.wh91;
import p.wi70;
import p.x0a1;
import p.x1s;
import p.x6h1;
import p.xjn;
import p.xpq0;
import p.y1s;
import p.y6h1;
import p.yh70;
import p.yvg1;
import p.z1s;
import p.zf30;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/spotify/jam/features/notificationcenter/impl/dialogs/IPLDialogsHostActivity;", "Lp/t3b1;", "<init>", "()V", "p/wyo1", "src_main_java_com_spotify_jam_features_notificationcenter_impl-impl"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class IPLDialogsHostActivity extends t3b1 {
    public static final /* synthetic */ int j1 = 0;
    public x1s f1;
    public z1s g1;
    public z1s h1;
    public boolean i1;

    public final x1s o0() {
        x1s x1sVar = this.f1;
        if (x1sVar != null) {
            return x1sVar;
        }
        u890.C("iplDialogs");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(Bundle bundle) {
        hj70 hj70Var;
        super.onCreate(bundle);
        z1s z1sVar = this.g1;
        if (z1sVar == null) {
            u890.C("iplNotificationCenter");
            throw null;
        }
        ((f0i) this).a.a(new y1s(z1sVar, (byte) 0));
        if (bundle != null) {
            this.i1 = bundle.getBoolean("already_shown", false);
        }
        if (this.i1 || (hj70Var = (hj70) getIntent().getParcelableExtra("notification")) == null) {
            return;
        }
        z1s z1sVar2 = this.h1;
        if (z1sVar2 != null) {
            z1sVar2.h.onNext(new xpq0(new kj70(hj70Var, null)));
        } else {
            u890.C("iplNotificationEventSender");
            throw null;
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super/*p.dac0*/.onSaveInstanceState(bundle);
        bundle.putBoolean("already_shown", this.i1);
    }

    /* JADX WARN: Code duplicated, block: B:54:0x037b  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void onStart() {
        yvg1 yvg1Var;
        p1s p1sVar;
        Object next;
        super/*p.dac0*/.onStart();
        hj70 hj70Var = (hj70) getIntent().getParcelableExtra("notification");
        if (hj70Var == null) {
            finish();
            return;
        }
        if (hj70Var instanceof pi70) {
            x1s x1sVarO0 = o0();
            Activity activity = x1sVarO0.a;
            pi70 pi70Var = (pi70) hj70Var;
            mw40 mw40VarA = o1s.a(x1sVarO0.c, activity, activity.getString(2131956632, pi70Var.f), activity.getString(2131956631, pi70Var.d), activity.getString(R.string.ok), new nxr(x1sVarO0, pi70Var, (byte) 7), null, null, 1844);
            mw40VarA.e = true;
            mw40VarA.f = new mn5(x1sVarO0, pi70Var, (byte) 3);
            pw40 pw40VarB = mw40VarA.b();
            x1sVarO0.b(pi70Var, pw40VarB);
            pw40VarB.b();
            q8h1 q8h1Var = x1sVarO0.d;
            String str = pi70Var.e;
            i8h1 i8h1Var = q8h1Var.b;
            bbl0 bbl0Var = q8h1Var.a;
            x6h1 x6h1VarC = bbl0Var.b.c();
            x6h1VarC.i.add(new a7h1("host_ended_session_popup", str, (Integer) null, (String) null, (String) null));
            x6h1VarC.j = true;
            y6h1 y6h1VarA = x6h1VarC.a();
            k7h1 k7h1Var = new k7h1();
            ((xjn) k7h1Var).a = y6h1VarA;
            ((xjn) k7h1Var).b = bbl0Var.a;
            ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
            i8h1Var.f(k7h1Var.a(), (Set) null);
        } else {
            if (hj70Var instanceof yh70) {
                x1s x1sVarO1 = o0();
                yh70 yh70Var = (yh70) hj70Var;
                Activity activity2 = x1sVarO1.a;
                o1s o1sVar = x1sVarO1.c;
                boolean z = yh70Var.c;
                mw40 mw40VarA2 = o1s.a(o1sVar, activity2, activity2.getString(z ? 2131955894 : 2131962650), activity2.getString(z ? 2131955892 : 2131955891), activity2.getString(2131955893), new q1s(x1sVarO1, (byte) 0), null, null, 1844);
                mw40VarA2.e = true;
                mw40VarA2.f = new mn5(x1sVarO1, yh70Var, (byte) 1);
                pw40 pw40VarB2 = mw40VarA2.b();
                x1sVarO1.b(yh70Var, pw40VarB2);
                if (yh70Var.d) {
                    g2z g2zVar = x1sVarO1.f;
                    i8h1 i8h1Var2 = (i8h1) g2zVar.a;
                    x6h1 x6h1VarC2 = ((pdl0) g2zVar.f).b.c();
                    x6h1VarC2.i.add(new a7h1("deeplink_failed_dialog", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = true;
                    y6h1 y6h1VarA2 = x6h1VarC2.a();
                    k7h1 k7h1Var2 = new k7h1();
                    ((xjn) k7h1Var2).a = y6h1VarA2;
                    ((xjn) k7h1Var2).c = Long.valueOf(System.currentTimeMillis());
                    i8h1Var2.f(k7h1Var2.a(), (Set) null);
                }
                pw40VarB2.b();
            } else if (hj70Var instanceof si70) {
                x1s x1sVarO2 = o0();
                si70 si70Var = (si70) hj70Var;
                q8h1 q8h1Var2 = x1sVarO2.d;
                bbl0 bbl0Var2 = q8h1Var2.a;
                i8h1 i8h1Var3 = q8h1Var2.b;
                Activity activity3 = x1sVarO2.a;
                String str2 = si70Var.d;
                boolean z2 = si70Var.c;
                o1s o1sVar2 = x1sVarO2.c;
                if (z2) {
                    mw40 mw40VarA3 = o1s.a(o1sVar2, activity3, activity3.getString(2131955890), activity3.getString(2131955889), activity3.getString(2131955893), new u1s(x1sVarO2, si70Var, (byte) 0), null, null, 1844);
                    mw40VarA3.e = true;
                    mw40VarA3.f = new v1s(x1sVarO2, si70Var, (byte) 0);
                    pw40 pw40VarB3 = mw40VarA3.b();
                    x1sVarO2.b(si70Var, pw40VarB3);
                    pw40VarB3.b();
                    x6h1 x6h1VarC3 = bbl0Var2.b.c();
                    x6h1VarC3.i.add(new a7h1("join_session_failed_full_popup", str2, (Integer) null, (String) null, (String) null));
                    x6h1VarC3.j = true;
                    y6h1 y6h1VarA3 = x6h1VarC3.a();
                    k7h1 k7h1Var3 = new k7h1();
                    ((xjn) k7h1Var3).a = y6h1VarA3;
                    ((xjn) k7h1Var3).b = bbl0Var2.a;
                    ((xjn) k7h1Var3).c = Long.valueOf(System.currentTimeMillis());
                    i8h1Var3.f(k7h1Var3.a(), (Set) null);
                } else {
                    mw40 mw40VarA4 = o1s.a(o1sVar2, activity3, activity3.getString(2131955894), null, activity3.getString(2131955893), new u1s(x1sVarO2, si70Var, (byte) 1), null, null, 1852);
                    mw40VarA4.e = true;
                    mw40VarA4.f = new v1s(x1sVarO2, si70Var, (byte) 1);
                    pw40 pw40VarB4 = mw40VarA4.b();
                    x1sVarO2.b(si70Var, pw40VarB4);
                    pw40VarB4.b();
                    x6h1 x6h1VarC4 = bbl0Var2.b.c();
                    x6h1VarC4.i.add(new a7h1("join_session_failed_generic_popup", str2, (Integer) null, (String) null, (String) null));
                    x6h1VarC4.j = true;
                    y6h1 y6h1VarA4 = x6h1VarC4.a();
                    k7h1 k7h1Var4 = new k7h1();
                    ((xjn) k7h1Var4).a = y6h1VarA4;
                    ((xjn) k7h1Var4).b = bbl0Var2.a;
                    ((xjn) k7h1Var4).c = Long.valueOf(System.currentTimeMillis());
                    i8h1Var3.f(k7h1Var4.a(), (Set) null);
                }
            } else if (hj70Var instanceof bj70) {
                x1s x1sVarO3 = o0();
                Activity activity4 = x1sVarO3.a;
                bj70 bj70Var = (bj70) hj70Var;
                mw40 mw40VarA5 = o1s.a(x1sVarO3.c, activity4, activity4.getString(2131959665), null, activity4.getString(2131959664), new nxr(x1sVarO3, bj70Var, (byte) 10), null, null, 1852);
                mw40VarA5.e = true;
                mw40VarA5.f = new mn5(x1sVarO3, bj70Var, (byte) 7);
                pw40 pw40VarB5 = mw40VarA5.b();
                x1sVarO3.b(bj70Var, pw40VarB5);
                pw40VarB5.b();
            } else if (hj70Var instanceof gj70) {
                x1s x1sVarO4 = o0();
                Activity activity5 = x1sVarO4.a;
                gj70 gj70Var = (gj70) hj70Var;
                mw40 mw40VarA6 = o1s.a(x1sVarO4.c, activity5, activity5.getString(2131963956, gj70Var.c), null, activity5.getString(2131955893), new nxr(x1sVarO4, gj70Var, (byte) 11), null, null, 1852);
                mw40VarA6.e = true;
                mw40VarA6.f = new mn5(x1sVarO4, gj70Var, (byte) 8);
                pw40 pw40VarB6 = mw40VarA6.b();
                x1sVarO4.b(gj70Var, pw40VarB6);
                pw40VarB6.b();
                q8h1 q8h1Var3 = x1sVarO4.d;
                String str3 = gj70Var.d;
                i8h1 i8h1Var4 = q8h1Var3.b;
                bbl0 bbl0Var3 = q8h1Var3.a;
                x6h1 x6h1VarC5 = bbl0Var3.b.c();
                x6h1VarC5.i.add(new a7h1("you_were_kicked_popup", str3, (Integer) null, (String) null, (String) null));
                x6h1VarC5.j = true;
                y6h1 y6h1VarA5 = x6h1VarC5.a();
                k7h1 k7h1Var5 = new k7h1();
                ((xjn) k7h1Var5).a = y6h1VarA5;
                ((xjn) k7h1Var5).b = bbl0Var3.a;
                ((xjn) k7h1Var5).c = Long.valueOf(System.currentTimeMillis());
                i8h1Var4.f(k7h1Var5.a(), (Set) null);
            } else if (hj70Var instanceof ti70) {
                x1s x1sVarO5 = o0();
                ti70 ti70Var = (ti70) hj70Var;
                gj5 gj5Var = x1sVarO5.a;
                Iterator it = ti70Var.c.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!((nj70) next).d);
                nj70 nj70Var = (nj70) next;
                if (nj70Var != null) {
                    String str4 = nj70Var.b;
                    afa0 afa0Var = new afa0(gj5Var.getString(2131956131, str4), new b0s0(nj70Var.a, str4, nj70Var.c, nj70Var.d), ti70Var.d);
                    nxr nxrVar = new nxr(x1sVarO5, ti70Var, (byte) 8);
                    q1s q1sVar = new q1s(x1sVarO5, (byte) 4);
                    th30 th30VarE0 = gj5Var.e0();
                    i4o i4oVar = new i4o(nxrVar, (byte) 18);
                    m4r m4rVar = new m4r(q1sVar, (byte) 23);
                    String str5 = u0a1.j2;
                    u0a1 u0a1VarG = th30VarE0.G(str5);
                    if (u0a1VarG == null) {
                        u0a1VarG = null;
                    } else {
                        Bundle bundle = ((zf30) u0a1VarG).f;
                        if (!u890.j(bundle != null ? bundle.getSerializable("factory_key") : null, bfa0.class)) {
                            u0a1VarG = null;
                        }
                    }
                    u0a1 u0a1Var = u0a1VarG instanceof u0a1 ? u0a1VarG : null;
                    if (u0a1Var == null) {
                        u0a1Var = new u0a1();
                        Bundle bundle2 = new Bundle();
                        bundle2.putSerializable("factory_key", bfa0.class);
                        u0a1Var.T0(bundle2);
                    }
                    u0a1 u0a1Var2 = u0a1Var;
                    r1s r1sVar = new r1s(th30VarE0, u0a1Var2, afa0Var, i4oVar, m4rVar);
                    LinkedHashMap linkedHashMap = x1sVarO5.X;
                    if (linkedHashMap.containsKey(ti70Var)) {
                        List list = (List) linkedHashMap.get(ti70Var);
                        if (list != null) {
                            list.add(r1sVar);
                        }
                    } else {
                        linkedHashMap.put(ti70Var, p7h.O(new r1s[]{r1sVar}));
                    }
                    if (!th30VarE0.L) {
                        if (!u0a1Var2.q0() && !th30VarE0.U()) {
                            u0a1Var2.h1(th30VarE0, str5);
                        }
                        if (u0a1Var2.e2 != null) {
                            u0a1Var2.i2 = afa0Var;
                            u0a1Var2.p1().f(afa0Var);
                            u0a1Var2.p1().n(new iv81(u0a1Var2, new wh91(i4oVar, (byte) 4), (byte) 12));
                            u0a1Var2.g2 = m4rVar;
                            dr91 dr91Var = u0a1Var2.f2;
                            if (dr91Var == null) {
                                u890.C("modelProvider");
                                throw null;
                            }
                            Observable observableA = ((x0a1) dr91Var.b).a(rih1.a);
                            Scheduler scheduler = u0a1Var2.b2;
                            if (scheduler == null) {
                                u890.C("mainThread");
                                throw null;
                            }
                            u0a1Var2.h2.b(observableA.observeOn(scheduler).subscribe(new tr41(u0a1Var2, (byte) 29)));
                        }
                    }
                }
            } else if (hj70Var instanceof ji70) {
                x1s x1sVarO6 = o0();
                Activity activity6 = x1sVarO6.a;
                ji70 ji70Var = (ji70) hj70Var;
                if (ji70Var instanceof fi70) {
                    p1sVar = new p1s(activity6.getString(2131956620), activity6.getString(2131956619), activity6.getString(2131956618));
                } else if (ji70Var instanceof ei70) {
                    p1sVar = new p1s(activity6.getString(2131956625), activity6.getString(2131956617), activity6.getString(2131956624));
                } else if (ji70Var.equals(gi70.c)) {
                    p1sVar = new p1s(activity6.getString(2131956625), activity6.getString(2131956621), activity6.getString(2131956624));
                } else if (ji70Var.equals(hi70.c)) {
                    p1sVar = new p1s(activity6.getString(2131956625), activity6.getString(2131956622), activity6.getString(2131956624));
                } else if (ji70Var.equals(ci70.c)) {
                    p1sVar = new p1s(activity6.getString(2131956625), activity6.getString(2131956612), activity6.getString(2131956624));
                } else if (ji70Var.equals(di70.c)) {
                    p1sVar = new p1s(activity6.getString(2131956615), activity6.getString(2131956614), activity6.getString(2131956613));
                } else {
                    if (!ji70Var.equals(ii70.c)) {
                        eg.o();
                        return;
                    }
                    p1sVar = new p1s(activity6.getString(2131956625), activity6.getString(2131956630), activity6.getString(2131956624));
                }
                mw40 mw40VarA7 = o1s.a(x1sVarO6.c, activity6, p1sVar.a, p1sVar.b, p1sVar.c, new q1s(x1sVarO6, (byte) 1), null, null, 1844);
                mw40VarA7.e = true;
                mw40VarA7.f = new mn5(x1sVarO6, ji70Var, (byte) 2);
                pw40 pw40VarB7 = mw40VarA7.b();
                x1sVarO6.b(ji70Var, pw40VarB7);
                pw40VarB7.b();
            } else if (hj70Var instanceof vi70) {
                x1s x1sVarO7 = o0();
                Activity activity7 = x1sVarO7.a;
                vi70 vi70Var = (vi70) hj70Var;
                mw40 mw40VarA8 = o1s.a(x1sVarO7.c, activity7, activity7.getString(2131957449), activity7.getString(2131957448), activity7.getString(2131957447), new q1s(x1sVarO7, (byte) 5), null, null, 1844);
                mw40VarA8.e = true;
                mw40VarA8.f = new mn5(x1sVarO7, vi70Var, (byte) 5);
                pw40 pw40VarB8 = mw40VarA8.b();
                x1sVarO7.b(vi70Var, pw40VarB8);
                pw40VarB8.b();
            } else if (hj70Var instanceof wi70) {
                x1s x1sVarO8 = o0();
                Activity activity8 = x1sVarO8.a;
                wi70 wi70Var = (wi70) hj70Var;
                mw40 mw40VarA9 = o1s.a(x1sVarO8.c, activity8, activity8.getString(2131957453), activity8.getString(2131957452), activity8.getString(2131957451), new nxr(x1sVarO8, wi70Var, (byte) 9), activity8.getString(2131957450), new q1s(x1sVarO8, (byte) 6), 1076);
                mw40VarA9.e = true;
                mw40VarA9.f = new mn5(x1sVarO8, wi70Var, (byte) 6);
                pw40 pw40VarB9 = mw40VarA9.b();
                x1sVarO8.b(wi70Var, pw40VarB9);
                pw40VarB9.b();
            } else if (hj70Var instanceof ui70) {
                x1s x1sVarO9 = o0();
                Activity activity9 = x1sVarO9.a;
                ui70 ui70Var = (ui70) hj70Var;
                String str6 = ui70Var.e;
                int iC = l1d.C(ui70Var.d);
                if (iC == 0) {
                    yvg1Var = new yvg1(activity9.getString(2131957412, str6), activity9.getString(2131957411), activity9.getString(2131957410));
                } else {
                    if (iC != 1) {
                        eg.o();
                        return;
                    }
                    yvg1Var = new yvg1(activity9.getString(2131957415, str6), activity9.getString(2131957414), activity9.getString(2131957413));
                }
                mw40 mw40VarA10 = o1s.a(x1sVarO9.c, activity9, (String) yvg1Var.a, (String) yvg1Var.b, (String) yvg1Var.c, new w1s(x1sVarO9, ui70Var, (byte) 0), activity9.getString(2131957409), new w1s(x1sVarO9, ui70Var, (byte) 1), 1076);
                mw40VarA10.e = true;
                mw40VarA10.f = new mn5(x1sVarO9, ui70Var, (byte) 4);
                pw40 pw40VarB10 = mw40VarA10.b();
                x1sVarO9.b(ui70Var, pw40VarB10);
                pw40VarB10.b();
            } else {
                Logger.d("No such notification dialog: " + hj70Var, new Object[0]);
                finish();
            }
        }
        this.i1 = true;
    }
}
