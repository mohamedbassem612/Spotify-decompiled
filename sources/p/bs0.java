package p;

import android.content.Context;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bs0 implements wpw, cvl1 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final rsw c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final rqw g;

    public bs0(c9c0 c9c0Var, g5p0 g5p0Var, waz0 waz0Var, qzh qzhVar) {
        this.a = (byte) 14;
        this.d = g5p0Var;
        this.b = waz0Var;
        this.e = qzhVar;
        this.f = w3p1.p(c9c0Var == null ? r6x.a : new x010(hu20.c(c9c0Var.b.current(), new zio0(2, (lnm) null, (byte) 24)), waz0Var.e(), z6z0.h, (byte) 1), new x6z0(this, (byte) 0), j8y0.R0, (o8n) null, new x6z0(this, (byte) 1), 8);
        this.c = lnn1.h(ucy0.b1, ucy0.c1, new x6z0(this, (byte) 2));
        this.g = n3o1.q(this).a(g2z0.h, g2z0.i);
    }

    public static final /* synthetic */ qzh e(bs0 bs0Var) {
        return (qzh) bs0Var.e;
    }

    public static final /* synthetic */ g5p0 f(bs0 bs0Var) {
        return (g5p0) bs0Var.d;
    }

    public static g07 g(String str) {
        return new g07(str, yz6.d);
    }

    public final rqw a() {
        byte b = this.a;
        eih1 eih1Var = this.g;
        switch (b) {
            case 0:
                return (ia00) eih1Var;
            case 1:
                return eih1Var;
            case 2:
                return eih1Var;
            case 3:
                return (u7h1) eih1Var;
            case 4:
                return (hy00) eih1Var;
            case 5:
                return (ia00) eih1Var;
            case 6:
                return eih1Var;
            case 7:
                return (ia00) eih1Var;
            case 8:
                return (ia00) eih1Var;
            case 9:
                return eih1Var;
            case 10:
                return (ia00) eih1Var;
            case 11:
                return eih1Var;
            case 12:
                return eih1Var;
            case 13:
                return (hy00) eih1Var;
            case 14:
                return (ia00) eih1Var;
            case 15:
                return (i7h1) eih1Var;
            case 16:
                return (ia00) eih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return (ia00) eih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return (ia00) eih1Var;
            default:
                return eih1Var;
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
        }
        return this.c;
    }

    public final mqw getBehavior() {
        byte b = this.a;
        Object obj = this.f;
        switch (b) {
            case 0:
                return (k8d1) obj;
            case 1:
                return (poy0) obj;
            case 2:
                return (poy0) obj;
            case 3:
                return (poy0) obj;
            case 4:
                return (rey0) obj;
            case 5:
                return (mqw) this.e;
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
                return w0o1.i(new r7j0(this, (byte) 9), new yih0(this, (byte) 20), (ju70) null, 12);
            case 12:
                return (rey0) obj;
            case 13:
                return (rey0) obj;
            case 14:
                return (js20) obj;
            case 15:
                return (poy0) obj;
            case 16:
                return (rey0) obj;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return (poy0) obj;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return (poy0) obj;
            default:
                return (js20) obj;
        }
    }

    public bs0(dgx dgxVar, gis gisVar, gis gisVar2) {
        this.a = (byte) 16;
        this.d = dgxVar;
        this.b = gisVar;
        this.e = gisVar2;
        this.f = new rey0(new lw11(this, (byte) 14));
        this.g = n3o1.q(this).a(ve21.N0, ve21.O0);
        this.c = lnn1.h(xt21.P0, xt21.Q0, new zw11(this, (byte) 10));
    }

    public bs0(Context context, u0i u0iVar, r4m0 r4m0Var) {
        this.a = (byte) 10;
        this.d = context;
        this.b = u0iVar;
        this.e = r4m0Var;
        this.f = new rey0(j830.W0);
        this.g = n3o1.q(this).a(new bt70(this, (byte) 23), lta0.e1);
        this.c = lnn1.h(new jgc0(this, (byte) 0), xdc0.O0, new jgc0(this, (byte) 1));
    }

    public bs0(gw70 gw70Var, nww0 nww0Var, Function0 function0) {
        this.a = (byte) 9;
        this.d = gw70Var;
        this.b = nww0Var;
        this.e = function0;
        this.f = new rey0(new yy80(this, (byte) 5));
        this.g = new eih1();
        this.c = jch0.j(new bt70(this, (byte) 10));
    }

    public bs0(iu30 iu30Var, iu30 iu30Var2, wpw wpwVar) {
        this.a = (byte) 12;
        this.d = iu30Var;
        this.b = iu30Var2;
        this.e = wpwVar;
        this.f = ila0.D();
        this.g = new eih1();
        this.c = jch0.j(new x3o0(this, (byte) 4));
    }

    public bs0(ofx ofxVar, w3l0 w3l0Var, lzn0 lzn0Var, ymd0 ymd0Var, hsz0 hsz0Var) {
        this.a = (byte) 15;
        this.d = ofxVar;
        this.b = w3l0Var;
        this.e = hsz0Var;
        atz0 atz0Var = atz0.b;
        fbz0 fbz0Var = new fbz0(this, (byte) 12);
        bhh1 bhh1Var = igu.b;
        qtr qtrVar = new qtr();
        fbz0Var.invoke(qtrVar);
        this.f = new poy0(new w8z(ymd0Var, (byte) 4), new j2d0(atz0Var, ymd0Var, (byte) 6), atz0Var, qtrVar, false, bhh1Var);
        this.g = new i7h1(new dtz0(this, (byte) 0), new aaq0(this, (byte) 9));
        this.c = jch0.j(new dtz0(this, (byte) 1));
    }

    public bs0(th41 th41Var, agx agxVar, lzn0 lzn0Var) {
        this.a = (byte) 4;
        this.d = th41Var;
        this.b = agxVar;
        this.e = lzn0Var;
        this.f = new rey0(new gaa(this, (byte) 17));
        this.g = n3o1.r(this).c(s1b.R0, s1b.S0);
        this.c = lnn1.h(new rs7(this, (byte) 17), new rs7(this, (byte) 18), new tla(this, (byte) 27));
    }

    public bs0(h2q h2qVar, woa woaVar, kma kmaVar, fpa fpaVar, nwj nwjVar, lik1 lik1Var) {
        this.a = (byte) 19;
        this.d = h2qVar;
        this.b = lik1Var;
        this.e = new bsj1(woaVar, kmaVar, fpaVar, new gn10("video_preview_carousel"));
        bpb1 bpb1VarB = gio1.b(-1);
        this.f = w3p1.q(new gcv(bpb1VarB, (byte) 4), l6j1.i, zhi1.P0, (o8n) null, new rzf1(nwjVar, bpb1VarB, (byte) 28), 8);
        this.g = new eih1();
        this.c = jch0.j(new zyf1(this, (byte) 17));
    }

    public bs0(nfx nfxVar, lo60 lo60Var, vgm vgmVar) {
        this.a = (byte) 13;
        this.d = nfxVar;
        this.b = lo60Var;
        this.e = vgmVar;
        this.f = new rey0(new qsn0(this, (byte) 15));
        this.g = n3o1.r(this).c(rmp0.X, rmp0.Y);
        this.c = lnn1.h(new nrj0((Object) this, (byte) 23), k8b0.c1, new cnp0(this, (byte) 9));
    }

    public bs0(iac0 iac0Var, lwh lwhVar, yq41 yq41Var) {
        this.a = (byte) 6;
        this.d = iac0Var;
        this.b = lwhVar;
        this.e = yq41Var;
        this.f = ila0.D();
        this.g = new eih1();
        this.c = jch0.j(new hp9(this, (byte) 28));
    }

    public bs0(Flowable flowable, FlowableMap flowableMap, w9u0 w9u0Var, j62 j62Var, dfm dfmVar) {
        this.a = (byte) 1;
        this.b = flowableMap;
        this.d = w9u0Var;
        this.e = j62Var;
        this.f = y3o1.Y(Flowable.h(flowableMap, flowable, bya0.d), di0.U0, e3.U0, new j2(this, (byte) 17), 8);
        this.c = dfmVar.c;
        this.g = new eih1();
    }

    public bs0(d0r d0rVar, o3r o3rVar, vu30 vu30Var, qtw qtwVar) {
        this.a = (byte) 11;
        this.d = d0rVar;
        this.b = o3rVar;
        this.e = vu30Var;
        this.f = qtwVar;
        this.g = new eih1();
        this.c = jch0.j(new pah0(this, (byte) 12));
    }

    public bs0(Flowable flowable, Flowable flowable2, ijr ijrVar, sas sasVar, qzh qzhVar) {
        this.a = (byte) 3;
        this.d = ijrVar;
        this.b = sasVar;
        this.e = qzhVar;
        this.f = y3o1.Y(Flowable.h(flowable.s(m9h.Z), flowable2.t(Functions.a), p9w.Z), fr9.S0, new bom1((avl1) this, (byte) 28), new uv8(this, (byte) 23), 8);
        this.g = eth.a0((vu30) null, new ub3(this, (byte) 29), 1);
        this.c = jch0.j(new hp9(this, (byte) 6));
    }

    public bs0(km3 km3Var, b0p b0pVar) {
        this.a = (byte) 2;
        this.d = km3Var;
        this.b = b0pVar;
        this.e = new kdn0();
        this.f = y3o1.X(new er6(this, (byte) 0), gn6.U0, ad5.Q0, (iu30) null, 24);
        this.g = new eih1();
        this.c = jch0.j(new v72(this, (byte) 18));
    }

    public bs0(nfx nfxVar, vas vasVar, gis gisVar) {
        this.a = (byte) 8;
        this.d = nfxVar;
        this.b = vasVar;
        this.e = gisVar;
        this.f = new rey0(new oat(this, (byte) 8));
        this.g = n3o1.q(this).a(riu.g, riu.h);
        this.c = lnn1.h(wiu.e, wiu.f, new nit(this, (byte) 11));
    }

    public bs0(dnp dnpVar, urk0 urk0Var, iu30 iu30Var) {
        this.a = (byte) 7;
        this.d = dnpVar;
        this.b = urk0Var;
        this.e = iu30Var;
        this.f = ila0.D();
        this.g = n3o1.q(this).a(new nao(this, (byte) 0), cnn.W0);
        this.c = jch0.j(new nao(this, (byte) 1));
    }

    public bs0(hjc hjcVar, FlowableMap flowableMap, pxc pxcVar) {
        this.a = (byte) 0;
        this.d = hjcVar;
        this.b = flowableMap;
        this.e = pxcVar;
        this.f = new k8d1(igu.b, new r20((Object) this, (lnm) null, (byte) 4));
        this.g = n3o1.q(this).a(fp0.f, new yxl1(this, (byte) 21));
        this.c = jch0.j(new m3(this, (byte) 12));
    }

    public bs0(Flowable flowable, FlowableMap flowableMap, h991 h991Var, ynb0 ynb0Var) {
        this.a = (byte) 17;
        this.d = flowable;
        this.b = flowableMap;
        this.e = ynb0Var;
        this.f = y3o1.Y(Observable.combineLatest(new ObservableFromPublisher(flowableMap), Observable.defer(new yj1(h991Var, (byte) 29)), jcx0.N0).toFlowable(BackpressureStrategy.d), er81.a1, yd81.S0, new d781(this, (byte) 22), 8);
        this.c = jch0.j(v691.N0);
        this.g = n3o1.q(this).a(v691.Y, v691.Z);
    }

    public bs0(lzn0 lzn0Var, tm tmVar, cyd cydVar, hyd hydVar) {
        this.a = (byte) 5;
        this.d = tmVar;
        this.b = new kdn0();
        this.e = cydVar.a(this, new dyd(lzn0Var, (byte) 0));
        this.g = n3o1.q(this).a(new eyd(hydVar, (byte) 0), new eyd(hydVar, (byte) 1));
        this.c = jch0.j(new hp9(this, (byte) 26));
        this.f = new fyd((byte) 0);
    }

    public bs0(Observable observable, FlowableMap flowableMap, pta1 pta1Var, ynb0 ynb0Var, luk lukVar) {
        this.a = (byte) 18;
        this.b = flowableMap;
        this.d = ynb0Var;
        this.e = new iy4(false, false, lukVar);
        this.f = y3o1.Y(Observable.combineLatest(new ObservableFromPublisher(flowableMap.J(y6x0.P0)), pta1Var.b(), observable.startWithItem(Boolean.FALSE), l9x0.Q0).toFlowable(BackpressureStrategy.d), hea1.a1, h9a1.d1, new dr91(this, (byte) 24), 8);
        this.c = jch0.j(new fsa1(this, (byte) 1));
        this.g = n3o1.q(this).a(r8a1.X0, r8a1.Y0);
    }
}
