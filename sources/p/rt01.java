package p;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import com.spotify.cosmos.util.proto.PlayabilityRestriction;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.mobius.EventSource;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableRefCount;
import io.reactivex.rxjava3.subjects.PublishSubject;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rt01 implements wpw, cvl1 {
    public final /* synthetic */ byte a;
    public final rsw b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public rt01(lik1 lik1Var, iac0 iac0Var, w9u0 w9u0Var, Flowable flowable, mzr0 mzr0Var, jo91 jo91Var, pnq pnqVar, l0x0 l0x0Var, Scheduler scheduler, xqq xqqVar) {
        this.a = (byte) 29;
        lkw0 lkw0Var = new lkw0(iac0Var, w9u0Var, (ww81) mzr0Var.b, (iir) mzr0Var.f, flowable, (o241) mzr0Var.c, (Scheduler) mzr0Var.e, (mw7) mzr0Var.d, (yqg) mzr0Var.a, (hlr) mzr0Var.g);
        this.c = lkw0Var;
        PublishSubject publishSubject = new PublishSubject();
        this.d = publishSubject;
        h72 h72Var = (h72) xqqVar.a.c;
        Scheduler schedulerD0 = ((oo91) h72Var.b).d0();
        c8o.l(schedulerD0);
        oo91 oo91Var = (oo91) h72Var.b;
        Activity activityS = oo91Var.s();
        c8o.l(activityS);
        lzn0 lzn0VarC = oo91Var.c();
        c8o.l(lzn0VarC);
        a1r0 a1r0VarC = oo91Var.C();
        c8o.l(a1r0VarC);
        dsg dsgVar = new dsg(activityS, lzn0VarC, a1r0VarC, (byte) 0);
        oo91 oo91Var2 = (oo91) h72Var.b;
        Activity activityS2 = oo91Var2.s();
        c8o.l(activityS2);
        lzn0 lzn0VarC2 = oo91Var2.c();
        c8o.l(lzn0VarC2);
        a1r0 a1r0VarC2 = oo91Var2.C();
        c8o.l(a1r0VarC2);
        dsg dsgVar2 = new dsg(activityS2, lzn0VarC2, a1r0VarC2, (byte) 1);
        bk1 bk1Var = new bk1((gx01) ((jly0) h72Var.f).get(), (byte) 0);
        snq snqVar = (snq) ((jly0) h72Var.g).get();
        tnq tnqVar = (tnq) ((jly0) h72Var.h).get();
        bk1 bk1Var2 = new bk1(h72Var.H(), (byte) 13);
        unq unqVar = (unq) ((jly0) h72Var.i).get();
        cfr cfrVarJ = oo91Var2.j();
        c8o.l(cfrVarJ);
        sz01 sz01Var = new sz01(lik1Var, lkw0Var, schedulerD0, dsgVar, dsgVar2, bk1Var, snqVar, tnqVar, bk1Var2, unqVar, new yx11(cfrVarJ, (byte) 22), (vnq) ((jly0) h72Var.t).get());
        EventSource eventSourceX = l0x0Var.x(new yy01());
        kly0 kly0Var = jo91Var.a;
        this.e = sbl.B(new z011(((t35) kly0Var.get()).n(), ((t35) kly0Var.get()).m(), 103), gp71.h, sz01Var, yd81.U0, new mo91(publishSubject, eventSourceX, scheduler));
        this.f = n3o1.q(this).a(v691.X0, v691.Y0);
        this.b = jch0.j(new cq61((vyf1) new idd1(new fh61(pnqVar, this, (byte) 27)).getValue(), (byte) 25));
    }

    public static final /* synthetic */ k2q e(rt01 rt01Var) {
        return (k2q) rt01Var.c;
    }

    public static final /* synthetic */ agc0 f(rt01 rt01Var) {
        return (agc0) rt01Var.d;
    }

    public final rqw a() {
        byte b = this.a;
        Object obj = this.f;
        switch (b) {
            case 0:
                return (hy00) obj;
            case 1:
                return (eih1) obj;
            case 2:
                return (ia00) obj;
            case 3:
                return (ia00) obj;
            case 4:
                return (eih1) obj;
            case 5:
                return (eih1) obj;
            case 6:
                return (i7h1) obj;
            case 7:
                return (u7h1) obj;
            case 8:
                return (i7h1) obj;
            case 9:
                return (ia00) obj;
            case 10:
                return (i7h1) obj;
            case 11:
                return (eih1) obj;
            case 12:
                return (i7h1) obj;
            case 13:
                return (i7h1) obj;
            case 14:
                return (hy00) obj;
            case 15:
                return (ia00) this.e;
            case 16:
                return (ia00) obj;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return (eih1) obj;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return (eih1) obj;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return (ghz) obj;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return new ghz(this, (byte) 8);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return (ghz) obj;
            case 22:
                return new ghz(this, (byte) 10);
            case 23:
                return (ghz) obj;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return (c5o) obj;
            case 25:
                return (ia00) obj;
            case 26:
                return (ia00) obj;
            case 27:
                return (ia00) obj;
            case 28:
                return (eih1) obj;
            default:
                return (ia00) obj;
        }
    }

    public final rsw c() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                break;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                break;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                break;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                break;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                break;
            case 22:
                break;
            case 23:
                break;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                break;
            case 25:
                break;
            case 26:
                break;
            case 27:
                break;
            case 28:
                break;
        }
        return this.b;
    }

    public void g(htv0 htv0Var, int i, tv80 tv80Var) {
        hp20 hp20Var = (hp20) this.d;
        String str = htv0Var != null ? htv0Var.b.b : null;
        qp20 qp20Var = htv0Var != null ? htv0Var.d : null;
        if (qp20Var != null) {
            hp20Var.b(i, qp20Var, tv80Var);
        } else {
            if (str == null || str.length() == 0) {
                return;
            }
            hp20Var.a(htv0Var.b);
        }
    }

    public final mqw getBehavior() {
        byte b = this.a;
        Object obj = this.e;
        switch (b) {
            case 0:
                return (rey0) obj;
            case 1:
                return (poy0) obj;
            case 2:
                return (poy0) obj;
            case 3:
                return (rey0) obj;
            case 4:
                return (rey0) obj;
            case 5:
                return (rey0) obj;
            case 6:
                return (rey0) obj;
            case 7:
                return (rey0) obj;
            case 8:
                return (rey0) obj;
            case 9:
                return (rey0) obj;
            case 10:
                return (rey0) obj;
            case 11:
                return (js20) obj;
            case 12:
                return (rey0) obj;
            case 13:
                return (rey0) obj;
            case 14:
                return (rey0) obj;
            case 15:
                return (poy0) this.f;
            case 16:
                return (rey0) obj;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return (poy0) obj;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return (poy0) obj;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return (rey0) obj;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return (rey0) obj;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return (rey0) obj;
            case 22:
                return (rey0) obj;
            case 23:
                return (rey0) obj;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return (e7m0) obj;
            case 25:
                return (rey0) obj;
            case 26:
                return (rey0) obj;
            case 27:
                return (rey0) obj;
            case 28:
                return (poy0) obj;
            default:
                return (e7m0) obj;
        }
    }

    public rt01(lzn0 lzn0Var, w3l0 w3l0Var) {
        this.a = (byte) 12;
        this.c = lzn0Var;
        this.d = w3l0Var;
        this.e = ila0.D();
        this.f = new i7h1(new hg20(this, (byte) 0), je20.d);
        this.b = jch0.j(new hg20(this, (byte) 1));
    }

    public rt01(j4f1 j4f1Var, epq epqVar, zrg zrgVar, u710 u710Var) {
        this.a = (byte) 14;
        this.c = zrgVar;
        this.d = u710Var;
        this.e = new rey0(new gn50(this, (byte) 22));
        this.f = new hy00(j4f1Var, j830.Z, oe60.U0);
        this.b = jch0.j(new wh(epqVar, this, (byte) 14));
    }

    public rt01(Context context, bbm bbmVar, xfx xfxVar) {
        this.a = (byte) 3;
        this.c = context;
        this.d = bbmVar;
        this.e = new rey0(new o2(this, (byte) 28));
        this.f = n3o1.q(this).a(k63.f, new yxl1(this, (byte) 25));
        this.b = lnn1.h(new jm1(this, (byte) 19), b03.P0, new m73(xfxVar, (byte) 0));
    }

    public rt01(hjc hjcVar, yxk0 yxk0Var, m4c m4cVar) {
        this.a = (byte) 19;
        this.c = hjcVar;
        this.d = yxk0Var;
        this.e = ila0.D();
        this.f = new ghz(this, (byte) 5);
        this.b = lnn1.h(hlv0.f, hlv0.g, new n5u0(this, (byte) 26));
    }

    public rt01(hjc hjcVar, yxk0 yxk0Var, m4c m4cVar, byte b) {
        this.a = (byte) 23;
        this.c = hjcVar;
        this.d = yxk0Var;
        this.e = ila0.D();
        this.f = new ghz(this, (byte) 13);
        this.b = lnn1.h(xuv0.Z, xuv0.N0, new mwv0(this, (byte) 0));
    }

    public rt01(s880 s880Var, qzh qzhVar) {
        this.a = (byte) 17;
        this.c = s880Var;
        this.d = qzhVar;
        this.e = y3o1.Y((FlowableRefCount) s880Var.a, htn0.N0, new afm0(this, (byte) 16), new i5o0(this, (byte) 0), 8);
        this.f = new eih1();
        this.b = lnn1.h(htn0.O0, htn0.P0, new i5o0(this, (byte) 1));
    }

    public rt01(y1c1 y1c1Var, w3l0 w3l0Var) {
        this.a = (byte) 13;
        this.c = y1c1Var;
        this.d = w3l0Var;
        this.e = new rey0(new mp20(this, (byte) 4));
        this.f = new i7h1(new wx00(this, (byte) 12), je20.X0);
        this.b = jch0.j(je20.Y0);
    }

    public rt01(fwo fwoVar, rt01 rt01Var) {
        this.a = (byte) 4;
        this.c = fwoVar;
        this.d = rt01Var;
        this.e = ila0.D();
        this.f = new eih1();
        this.b = jch0.j(new v72(this, (byte) 5));
    }

    public rt01(zfx zfxVar, yxk0 yxk0Var, m4c m4cVar) {
        this.a = (byte) 21;
        this.c = zfxVar;
        this.d = yxk0Var;
        this.e = ila0.D();
        this.f = new ghz(this, (byte) 9);
        this.b = lnn1.h(hlv0.Y, hlv0.Z, new n5u0(this, (byte) 28));
    }

    public rt01(Observable observable, Resources resources, uer uerVar) {
        this.a = (byte) 1;
        this.c = resources;
        this.d = uerVar;
        this.e = y3o1.Y(observable.toFlowable(BackpressureStrategy.d), di0.Y, new ab(this, (byte) 17), (iu30) null, 24);
        this.f = new eih1();
        this.b = lnn1.h(di0.Z, di0.N0, new j2(this, (byte) 14));
    }

    public rt01(t8x t8xVar, urk0 urk0Var, wao0 wao0Var) {
        this.a = (byte) 10;
        this.c = t8xVar;
        this.d = urk0Var;
        this.f = new i7h1(new k9s(this, (byte) 28), c0z.Z);
        this.e = new rey0(new o8x(wao0Var, (byte) 14));
        this.b = lnn1.h(f9z.a1, f9z.b1, new nty(this, (byte) 21));
    }

    public rt01(fgx fgxVar, lo60 lo60Var, vgm vgmVar, agc0 agc0Var, bpb1 bpb1Var, boolean z) {
        this.a = (byte) 0;
        this.c = fgxVar;
        this.d = agc0Var;
        new idd1(new qwj(bpb1Var, (byte) 1));
        this.e = new rey0(new n8k0(lo60Var, vgmVar, z, (byte) 7));
        this.f = new hy00(rt01.class.getName(), kxz0.Y0, kxz0.Z0);
        this.b = lnn1.h(new hbz0(this, (byte) 6), fft0.Q0, new ak01(this, (byte) 4));
    }

    public rt01(lik1 lik1Var, Flowable flowable, igx igxVar, agc0 agc0Var, e111 e111Var) {
        this.a = (byte) 15;
        this.c = lik1Var;
        this.d = igxVar;
        this.e = n3o1.q(this).a(new bt70(this, (byte) 5), rb80.c);
        this.f = y3o1.Y(flowable, b980.f, new yg20(this, (byte) 22), new ux70(e111Var, (byte) 5), 8);
        this.b = lnn1.h(new z5z(this, (byte) 25), b980.g, new ux70(this, (byte) 6));
    }

    public rt01(ofx ofxVar, hp20 hp20Var, yxk0 yxk0Var, m4c m4cVar) {
        this.a = (byte) 20;
        this.c = ofxVar;
        this.d = hp20Var;
        this.f = yxk0Var;
        this.e = new rey0(new dvt0(this, (byte) 10));
        this.b = lnn1.h(new ewq0(this, (byte) 10), hlv0.X, new n5u0(this, (byte) 27));
    }

    public rt01(vmp vmpVar, urk0 urk0Var, iu30 iu30Var) {
        this.a = (byte) 25;
        this.c = vmpVar;
        this.d = iu30Var;
        this.e = ila0.D();
        this.f = n3o1.q(this).a(new zm01(urk0Var, (byte) 2), rw01.c);
        this.b = jch0.j(new g001(this, (byte) 13));
    }

    public rt01(k2q k2qVar, qzh qzhVar) {
        this.a = (byte) 2;
        this.c = k2qVar;
        this.d = qzhVar;
        this.e = y3o1.Y(((jl3) k2qVar.b).getState(), uh1.c1, ah1.f, new em1(this, (byte) 0), 8);
        this.b = lnn1.h(uh1.d1, uh1.e1, new em1(this, (byte) 1));
        this.f = n3o1.q(this).a(fp0.d1, fp0.e1);
    }

    public rt01(qm51 qm51Var, h791 h791Var, nn61 nn61Var, Flowable flowable, kn4 kn4Var) {
        Flowable flowableI;
        this.a = (byte) 28;
        this.c = qm51Var;
        this.d = h791Var;
        o791 o791Var = new o791(flowable, (uu00) nn61Var.b, (uvy) nn61Var.c);
        if (kn4Var.a()) {
            flowableI = yoi1.h(o791Var.c, o6x.a);
        } else {
            flowableI = Flowable.I(i791.a);
        }
        this.e = y3o1.Y(flowableI, er81.V0, z691.b, (iu30) null, 24);
        this.f = new eih1();
        this.b = jch0.j(new cq61(this, (byte) 19));
    }

    public rt01(u0i u0iVar, t4m0 t4m0Var) {
        this.a = (byte) 26;
        this.c = u0iVar;
        this.d = t4m0Var;
        this.e = new rey0(krz0.b1);
        this.f = n3o1.q(this).a(new cq61(this, (byte) 9), c781.b);
        this.b = lnn1.h(rz71.Q0, rz71.R0, new d781(this, (byte) 0));
    }

    public rt01(lzn0 lzn0Var, pp ppVar) {
        this.a = (byte) 8;
        this.c = lzn0Var;
        this.d = ppVar;
        this.e = new rey0(new ub3(this, (byte) 16));
        this.f = new i7h1(oy5.a1, oy5.b1);
        this.b = lnn1.h(cv6.W0, cv6.X0, new rr6(this, (byte) 5));
    }

    public rt01(ix7 ix7Var, lzn0 lzn0Var) {
        this.a = (byte) 9;
        this.c = ix7Var;
        this.d = lzn0Var;
        this.e = new rey0(new ub3(this, (byte) 22));
        this.f = n3o1.q(this).a(jb8.f, new v08(this, (byte) 1));
        this.b = jch0.j(jb8.g);
    }

    public rt01(hjc hjcVar, hp20 hp20Var, yxk0 yxk0Var, m4c m4cVar) {
        this.a = (byte) 22;
        this.c = hjcVar;
        this.d = hp20Var;
        this.f = yxk0Var;
        this.e = new rey0(new dvt0(this, (byte) 11));
        this.b = lnn1.h(new ewq0(this, (byte) 11), hlv0.N0, new zsv0(this, (byte) 1));
    }

    public rt01(lzn0 lzn0Var, xfx xfxVar, byte b) {
        this.a = b;
        switch (b) {
            case 6:
                this.c = lzn0Var;
                this.d = xfxVar;
                this.e = new rey0(new ub3(this, (byte) 0));
                this.f = new i7h1(k63.t, k63.X);
                this.b = lnn1.h(ra3.T0, ra3.U0, new jm1(this, (byte) 26));
                break;
            case 16:
                this.c = lzn0Var;
                this.d = xfxVar;
                this.e = new rey0(new otf0(this, (byte) 21));
                this.f = n3o1.q(this).a(fri0.f, fri0.g);
                this.b = lnn1.h(fii0.W0, fii0.X0, new z6h0(this, (byte) 27));
                break;
            default:
                this.c = new kdn0();
                this.d = new rt01(lzn0Var, xfxVar, (byte) 6);
                this.e = ila0.D();
                this.f = new eih1();
                this.b = jch0.j(new v72(this, (byte) 6));
                break;
        }
    }

    public rt01(lzn0 lzn0Var, r6h1 r6h1Var, xfx xfxVar) {
        this.a = (byte) 7;
        this.c = lzn0Var;
        this.d = new idd1(ou1.S0);
        this.e = new rey0(new ub3(this, (byte) 1));
        this.f = new u7h1(new xb2(r6h1Var, (byte) 12), new wf(r6h1Var, this, (byte) 14));
        this.b = lnn1.h(we3.V0, we3.W0, new m73(xfxVar, (byte) 2));
    }

    public rt01(FlowableMap flowableMap, iu30 iu30Var, Function0 function0) {
        this.a = (byte) 18;
        this.c = iu30Var;
        this.d = function0;
        this.e = y3o1.Y(flowableMap, o5v0.T0, fnt0.e1, (iu30) null, 24);
        this.f = new eih1();
        this.b = jch0.j(new ixt0(this, (byte) 4));
    }

    public rt01(egx egxVar, lo60 lo60Var) {
        this.a = (byte) 27;
        this.c = egxVar;
        this.d = lo60Var;
        this.e = new rey0(new k681(this, (byte) 11));
        this.f = n3o1.q(this).a(bnx0.i, c781.T0);
        this.b = lnn1.h(dw81.b, er81.c, new d781(this, (byte) 14));
    }

    public rt01(wpw wpwVar, vu30 vu30Var, zob1 zob1Var, o8n o8nVar) {
        this.a = (byte) 11;
        this.c = wpwVar;
        this.d = vu30Var;
        yty ytyVar = yty.W0;
        this.e = new js20(new z5d(zob1Var, (byte) 7), new ccb1(ytyVar, zob1Var, (byte) 7), ytyVar, new qtr(), false, o8nVar, true);
        this.f = new eih1();
        this.b = jch0.j(new wx00(this, (byte) 2));
    }

    public rt01(ggv ggvVar, gw70 gw70Var, egw0 egw0Var, xgw0 xgw0Var, y390 y390Var, yh2 yh2Var, t8u0 t8u0Var, q8n q8nVar, q8n q8nVar2, bdq bdqVar, cdq cdqVar, iac0 iac0Var, lik1 lik1Var, p6r0 p6r0Var, xfw0 xfw0Var) {
        this.a = (byte) 24;
        this.c = ggvVar;
        ghw0 ghw0Var = new ghw0(t8u0Var.a(iac0Var.getLifecycle()), (b7r0) cdqVar.a.b.p7.get());
        this.d = ghw0Var;
        mhw0 mhw0Var = new mhw0("", "", 2, new lhw0(), jhw0.a, PlayabilityRestriction.NO_RESTRICTION);
        t7p0 t7p0Var = t7p0.k;
        wr00 wr00VarA = y390Var.a(iac0Var, r6h1.c);
        teq teqVar = bdqVar.a.d;
        g1i g1iVar = new g1i((i4q) teqVar.t2.get(), new gal((quc0) teqVar.Mb.get(), (Context) teqVar.d.x1.a, (byte) 5), lik1Var, p6r0Var, xfw0Var, (byte) 2);
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        jgw0 jgw0Var = new jgw0(ghw0Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(agw0.class), runSequentially.a(jgw0Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(bgw0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new lgw0(ghw0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(zfw0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new hgw0(ghw0Var)));
        q8n q8nVar3 = egw0Var.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(yfw0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new fgw0(q8nVar3, g1iVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(dgw0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new ngw0(q8nVar3, wr00VarA)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(cgw0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new mgw0(q8nVar3, yh2Var)));
        this.e = sbl.B(mhw0Var, t7p0Var, new a(egw0Var.b, coroutinesSubtypeEffectHandlerBuilderI), new ygw0(xgw0Var, this, (byte) 0), new vvu0(xgw0Var, this, q8nVar, q8nVar2, (byte) 4));
        this.f = new c5o((byte) 3);
        this.b = f6o1.j((ViewGroup.LayoutParams) null, new j2i(1947816044, new t20(gw70Var, this, (byte) 21), true), 7);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public rt01(FlowableMap flowableMap, mo51 mo51Var, y441 y441Var, xfx xfxVar) {
        this(flowableMap, (iu30) new d(mo51Var, xfxVar, (byte) 15), (Function0) new z6v0(y441Var, (byte) 0));
        this.a = (byte) 18;
    }
}
