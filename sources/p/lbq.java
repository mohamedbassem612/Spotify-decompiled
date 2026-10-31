package p;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.spotify.collection_platform.esperanto.proto.CollectionPlatformItemsRequest;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.core.SingleOnSubscribe;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import j$.time.Clock;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class lbq implements dl4, Function, SingleOnSubscribe, myc, o2r0, k2r, mc41 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public lbq(ab71 ab71Var) {
        this.a = (byte) 9;
        this.b = ab71Var;
        this.c = iy81.a(new bpq(this, (byte) 15));
    }

    public boolean a() {
        int i = Build.VERSION.SDK_INT;
        return (i >= 36 || !(nhc1.S(Build.MANUFACTURER, "samsung", true) || nhc1.S(Build.BRAND, "samsung", true))) && i >= 34 && ((o4o0) this.c).a() && ((jo20) this.b).isEnabled();
    }

    public Object apply(Object obj) {
        byte b = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 20:
                g4o0 g4o0Var = (g4o0) obj;
                g4o0Var.name();
                if (g4o0Var == g4o0.c) {
                    return lcr.a;
                }
                k9r k9rVar = ((kcr) obj3).a;
                hi hiVar = ((hcr) obj2).a;
                if (k9rVar.k(hiVar)) {
                    Context context = (Context) k9rVar.b;
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.addFlags(268435456);
                    intent.setData(k9rVar.j(hiVar));
                    context.startActivity(intent);
                }
                return lcr.c;
            case 21:
            default:
                mmr0 mmr0Var = (mmr0) obj;
                fhr fhrVar = (fhr) mmr0Var.a;
                dma1 dma1Var = (dma1) mmr0Var.b;
                ghr ghrVar = (ghr) obj3;
                long jB = ghrVar.a.b();
                String strContextUri = ((PlayerState) obj2).contextUri();
                boolean zJ = u890.j(strContextUri, fhrVar.a);
                chr chrVar = chr.a;
                if (zJ) {
                    return jB - fhrVar.b < ((long) ghrVar.g.c()) * 60000 ? chrVar : new dhr(strContextUri);
                }
                strContextUri.getClass();
                hma1 hma1VarEdit = dma1Var.edit();
                hma1VarEdit.a.putString(ghr.k.a, strContextUri);
                hma1VarEdit.i();
                hma1VarEdit.c(ghr.l, jB);
                hma1VarEdit.g();
                return chrVar;
            case 22:
                fcc fccVar = fcc.R0;
                uh80 uh80Var = (uh80) obj;
                wj3 wj3Var = (wj3) obj3;
                String str = uh80Var.b;
                if (str.length() == 0 || !uh80Var.d || !uh80Var.k) {
                    return CompletableEmpty.a;
                }
                if (!uh80Var.i) {
                    return ((ip91) wj3Var.e).b(uh80Var.c, uh80Var.e).firstOrError().map(new zwa(uh80Var, (byte) 27)).flatMapCompletable(new k9r(uh80Var, wj3Var, (gl3) obj2, (byte) 6));
                }
                a1q a1qVarC = ((fl1) wj3Var.Z).c(str);
                CollectionPlatformItemsRequest collectionPlatformItemsRequest = (CollectionPlatformItemsRequest) a1qVarC.c;
                boolean z = uh80Var.a;
                w4h w4hVar = (w4h) a1qVarC.b;
                return z ? w4hVar.b(collectionPlatformItemsRequest).doOnSuccess(fccVar).ignoreElement().g(new dfr(wj3Var, (byte) 0)) : w4hVar.a(collectionPlatformItemsRequest).doOnSuccess(fccVar).ignoreElement().g(new dfr(wj3Var, (byte) 1));
            case 23:
                List list = (List) obj;
                wj3 wj3Var2 = (wj3) obj3;
                cfr cfrVar = (cfr) wj3Var2.t;
                String str2 = (String) wj3Var2.b;
                wh80 wh80Var = (wh80) obj2;
                String contextUri = wh80Var.getContextUri();
                String strC = wh80Var.c();
                if (strC == null) {
                    strC = wh80Var.getUri();
                }
                return cfr.b(cfrVar, Collections.singletonList(strC), str2, list, z6x.a, contextUri);
        }
    }

    public rok0 b() {
        t2n1 t2n1Var = (t2n1) this.b;
        RetrofitMaker retrofitMaker = (RetrofitMaker) t2n1Var.b.get();
        c8o.l(retrofitMaker);
        y2n1 y2n1VarC = yvm1.c(retrofitMaker);
        Clock clock = (Clock) t2n1Var.g.get();
        c8o.l(clock);
        return new rok0(y2n1VarC, new x94(new p5(clock, (byte) 16), (byte) 9), (byte) 14);
    }

    public ua91 c() {
        l3q l3qVar = (l3q) this.b;
        daq daqVar = l3qVar.a;
        t2j0 t2j0Var = (t2j0) daqVar.f2.get();
        c8o.l(t2j0Var);
        i8h1 i8h1Var = (i8h1) daqVar.A5.get();
        c8o.l(i8h1Var);
        eo0 eo0Var = (eo0) daqVar.a.B1.get();
        c8o.l(eo0Var);
        t2j0 t2j0Var2 = (t2j0) l3qVar.a.f2.get();
        c8o.l(t2j0Var2);
        rdo rdoVar = new rdo(t2j0Var2);
        Scheduler scheduler = (Scheduler) daqVar.A2.get();
        c8o.l(scheduler);
        return new ua91(t2j0Var, i8h1Var, eo0Var, rdoVar, scheduler, (byte) 20);
    }

    public Bundle d(Object obj) {
        return (Bundle) ((z5z) this.b).invoke(obj);
    }

    public Object e(Bundle bundle, Object obj) {
        return ((z5z) this.c).invoke(bundle);
    }

    public li9 f() {
        t2j0 t2j0Var = (t2j0) ((t2n1) this.b).q.get();
        c8o.l(t2j0Var);
        return new li9(t2j0Var);
    }

    public j4m g(nhr0 nhr0Var, Bundle bundle) {
        return (j4m) ((vu30) this.b).invoke(nhr0Var, (kdn0) ((w6e0) this.c).c);
    }

    public o2r j() {
        return new etr((Context) this.b, ((k2r) this.c).j());
    }

    public n2r k() {
        return (w6e0) this.c;
    }

    public void subscribe(SingleEmitter singleEmitter) {
        k9r k9rVar = (k9r) this.b;
        ixg ixgVarF = ((gw70) k9rVar.b).f((String) this.c);
        ixgVarF.s((ufg1) k9rVar.c);
        ixgVarF.r("ad_color_extraction");
        singleEmitter.setCancellable(new ter(ixgVarF, (byte) 0));
        ixgVarF.j(new vun(singleEmitter, (byte) 5));
    }

    public void u(dxc dxcVar, Throwable th) {
        ((okr) this.c).a.execute(new c45(this, (myc) this.b, th, (byte) 10));
    }

    public void w(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                ad31 ad31Var = (ad31) obj;
                ad31Var.W1 = (nxf0) ((daq) obj2).a.h1.get();
                ad31Var.V1 = (kg0) ((e3q) obj3).W0.get();
                break;
            case 1:
                k7c1 k7c1Var = (k7c1) obj;
                f0a f0aVar = (f0a) obj3;
                ((hip) k7c1Var).F1 = (jgu) ((p2q) f0aVar.f).get();
                w4c1 w4c1Var = (w4c1) ((jly0) f0aVar.i).get();
                BehaviorSubject behaviorSubject = ((las0) ((jly0) f0aVar.t).get()).a;
                BehaviorSubject behaviorSubject2 = ((v6c1) ((jly0) f0aVar.X).get()).a;
                i8h1 i8h1Var = (i8h1) ((daq) f0aVar.c).A5.get();
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                String str = yon1.g0().c;
                r6h1 r6h1Var = r6h1.c;
                daq daqVar = (daq) obj2;
                k7c1Var.K1 = new t7c1(w4c1Var, behaviorSubject, behaviorSubject2, new r2a1(i8h1Var, new h4l0(str, "spotify:blend:story"), (byte) 20), (q8n) daqVar.r2.get(), (q8n) daqVar.E1.get(), yon1.g0().c);
                k7c1Var.I1 = new q881((fgi1) ((jly0) f0aVar.P0).get(), (byte) 27);
                k7c1Var.J1 = new rmr((qy7) ((jly0) f0aVar.O0).get(), (byte) 12);
                k7c1Var.H1 = new l5b1((k9c1) ((jly0) f0aVar.Y).get(), (byte) 22);
                k7c1Var.G1 = new k7b1(1, (w4c1) ((jly0) f0aVar.i).get(), w4c1.class, "storyState", "storyState(I)Lcom/spotify/campaigns/storytelling/common/StoryState;", 0, (byte) 5);
                break;
            default:
                df81 df81Var = (df81) obj;
                df81Var.e2 = j380.l(zwv0.a, (szp) obj3);
                df81Var.d2 = (lzn0) ((v5q) obj2).U0.get();
                break;
        }
    }

    public void z(dxc dxcVar, sy21 sy21Var) {
        ((okr) this.c).a.execute(new c45(this, (myc) this.b, sy21Var, (byte) 9));
    }

    public lbq(q1n0 q1n0Var, x7e0 x7e0Var, Bundle bundle, vu30 vu30Var) {
        this.a = (byte) 27;
        this.b = vu30Var;
        this.c = new w6e0(q1n0Var, x7e0Var, bundle);
    }

    public /* synthetic */ lbq(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public lbq(dr41 dr41Var) {
        this.a = (byte) 13;
        this.b = dr41Var;
        this.c = iy81.a(new hsq(this, (byte) 6));
    }

    public lbq(hp91 hp91Var) {
        this.a = (byte) 8;
        this.b = hp91Var;
        this.c = iy81.a(new bpq(this, (byte) 12));
    }

    public lbq(ibq ibqVar) {
        this.a = (byte) 11;
        this.b = ibqVar;
        this.c = new hsq(this, (byte) 0);
    }

    public lbq(wzp wzpVar, qop qopVar) {
        this.a = (byte) 3;
        this.b = wzpVar;
        this.c = new uyp(this, (byte) 14);
    }

    public lbq(o0i1 o0i1Var, p0i1 p0i1Var) {
        this.a = (byte) 15;
        this.b = o0i1Var;
        this.c = xqu.b(new hsq(this, (byte) 15));
    }

    public lbq(lzp lzpVar, qop qopVar) {
        this.a = (byte) 18;
        this.b = lzpVar;
        this.c = iy81.a(new hsq(this, (byte) 25));
    }

    public lbq(xzp xzpVar, qop qopVar, gl90 gl90Var) {
        this.a = (byte) 14;
        this.b = xzpVar;
        this.c = new hsq(this, (byte) 11);
    }

    public lbq(oa21 oa21Var, q7r0 q7r0Var) {
        this.a = (byte) 4;
        this.b = q7r0Var;
        this.c = new uyp(this, (byte) 24);
    }

    public lbq(sh71 sh71Var, th71 th71Var) {
        this.a = (byte) 7;
        this.b = sh71Var;
        this.c = xqu.b(new bpq(this, (byte) 8));
    }

    public lbq(sgj1 sgj1Var) {
        this.a = (byte) 16;
        this.b = sgj1Var;
        this.c = xqu.b(new hsq(this, (byte) 18));
    }

    public lbq(xl21 xl21Var, yl21 yl21Var) {
        this.a = (byte) 5;
        this.b = xl21Var;
        this.c = xqu.b(new uyp(this, (byte) 27));
    }

    public lbq(b971 b971Var, c971 c971Var, q7r0 q7r0Var) {
        this.a = (byte) 6;
        this.b = q7r0Var;
        this.c = new bpq(this, (byte) 5);
    }

    public lbq(wgf1 wgf1Var) {
        this.a = (byte) 12;
        this.b = wgf1Var;
        this.c = iy81.a(new hsq(this, (byte) 3));
    }

    public lbq(sgj1 sgj1Var, byte b) {
        this.a = (byte) 17;
        this.b = sgj1Var;
        this.c = xqu.b(new hsq(this, (byte) 22));
    }

    public lbq(l3q l3qVar, qop qopVar, bct bctVar) {
        this.a = (byte) 10;
        this.b = l3qVar;
        this.c = iy81.a(new bpq(this, (byte) 27));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public lbq(Context context) {
        this(context, (k2r) new iir());
        this.a = (byte) 28;
    }

    public lbq(okr okrVar, myc mycVar) {
        this.a = (byte) 26;
        this.c = okrVar;
        this.b = mycVar;
    }

    public lbq(Context context, k2r k2rVar) {
        this.a = (byte) 28;
        this.b = context.getApplicationContext();
        this.c = k2rVar;
    }

    public lbq(t2n1 t2n1Var, zuj zujVar) {
        this.a = (byte) 19;
        this.b = t2n1Var;
        this.c = new xvq(this, (byte) 0);
    }

    public lbq(daq daqVar, v5q v5qVar) {
        this.a = (byte) 2;
        this.b = v5qVar;
        this.c = new szp(daqVar, (byte) 14);
    }
}
