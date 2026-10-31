package p;

import android.content.Context;
import com.spotify.connectivity.AnalyticsDelegate;
import com.spotify.connectivity.AuthenticatedScopeConfiguration;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ang extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Function0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ang(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, tv30 tv30Var, Object obj8, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
        this.h = obj7;
        this.i = tv30Var;
        this.t = (Function0) obj8;
    }

    public final Object invoke() {
        byte b = this.a;
        cdp0 cdp0Var = this.t;
        Object obj = this.i;
        Object obj2 = this.h;
        Object obj3 = this.g;
        Object obj4 = this.e;
        Object obj5 = this.c;
        Object obj6 = this.b;
        Object obj7 = this.f;
        Object obj8 = this.d;
        switch (b) {
            case 0:
                ven0 ven0Var = (ven0) obj7;
                if (!((Boolean) ven0Var.getValue()).booleanValue()) {
                    ven0Var.setValue(Boolean.TRUE);
                    vwk0 vwk0Var = (vwk0) obj5;
                    vwk0Var.getClass();
                    x6h1 x6h1VarC = vwk0Var.a.c();
                    x6h1VarC.i.add(new a7h1("save_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    y6h1 y6h1VarA = x6h1VarC.a();
                    b7x b7xVar = b7x.a;
                    ((i8h1) obj6).m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("save_episode_changes", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
                    fn31.T((c9n) obj4, (o8n) null, 0, new zn0((k6a1) obj2, (bng) obj, ihc1.e1(((y7e1) obj8).d().d.toString()).toString(), (y7e1) obj8, this.t, (ven0) obj3, (ven0) obj7, (lnm) null, (byte) 5), 3);
                }
                return rih1.a;
            case 1:
                return new ws0((q8n) ((qcp0) obj6).invoke(), ((ucp0) obj5).b.r0, (a44) ((qcp0) obj8).invoke(), ((ucp0) obj4).b.q0, (zwz0) ((qcp0) obj7).invoke(), (crd) ((qcp0) obj3).invoke(), (xob1) ((qcp0) obj2).invoke(), (Context) ((qcp0) obj).invoke(), ((ucp0) cdp0Var).b.t0);
            case 2:
                luk lukVar = (luk) ((pbp0) obj6).invoke();
                krh krhVar = (krh) ((pbp0) obj5).invoke();
                RetrofitMaker retrofitMaker = (RetrofitMaker) ((pbp0) obj8).invoke();
                yqg yqgVar = (yqg) ((pbp0) obj4).invoke();
                Context context = (Context) ((pbp0) obj7).invoke();
                gma1 gma1Var = ((obp0) obj3).b.w3;
                Observable observable = ((obp0) obj2).b.v3;
                q8n q8nVar = (q8n) ((pbp0) obj).invoke();
                y2g0 y2g0Var = (y2g0) ((pbp0) cdp0Var).invoke();
                return new tz0(new eyh0(krhVar, sdd1.A(retrofitMaker, yqgVar, sdd1.D(gma1Var), context, new joo(observable, (byte) 1)), (jwo) new ham(new w4b1(lukVar, krhVar, retrofitMaker, yqgVar, context, gma1Var, observable, q8nVar, y2g0Var)).c, (byte) 14), y2g0Var, q8nVar);
            case 3:
                return new rj2((Context) ((qcp0) obj6).invoke(), (luk) ((qcp0) obj5).invoke(), (ov20) ((qcp0) obj8).invoke(), (ri2) ((qcp0) obj4).invoke(), (mbo0) ((qcp0) obj7).invoke(), (ohv0) ((qcp0) obj3).invoke(), (t2j0) ((qcp0) obj2).invoke(), (jqt) ((vcp0) obj).invoke(), (q8n) ((vcp0) cdp0Var).invoke());
            case 4:
                return new yv5((Context) ((fcp0) obj6).invoke(), (ajg) ((fcp0) obj5).invoke(), (Flowable) ((fcp0) obj8).invoke(), (yqg) ((fcp0) obj4).invoke(), ((rbp0) obj7).b.t(), (crd) ((fcp0) obj3).invoke(), (Observable) ((fcp0) obj2).invoke(), (q8n) ((fcp0) obj).invoke(), (q8n) ((fcp0) cdp0Var).invoke());
            case 5:
                return new ncl(((vap0) obj6).b.a(), ((vap0) obj5).b.u(), ((vap0) obj8).b.b(), (AnalyticsDelegate) ((gcp0) obj4).invoke(), (AuthenticatedScopeConfiguration) ((gcp0) obj7).invoke(), (ph61) ((hbp0) obj3).invoke(), (pmy0) ((hbp0) obj2).invoke(), (lmy0) ((gcp0) obj).invoke(), ((vap0) cdp0Var).b.o());
            case 6:
                ((sbp0) obj6).invoke();
                luk lukVar2 = (luk) ((sbp0) obj5).invoke();
                r0z0 r0z0Var = (r0z0) ((sbp0) obj8).invoke();
                return new ofb(new ke4(lukVar2), (r0z0) ((sbp0) obj4).invoke(), r0z0Var, (kly0) ((sap0) obj7).invoke(), (xvo) ((sbp0) obj3).invoke(), (w6y) ((sbp0) obj2).invoke(), (q8n) ((sbp0) obj).invoke(), (t6y) ((sbp0) cdp0Var).invoke());
            case 7:
                zor zorVar = (zor) ((zbp0) obj6).invoke();
                dfs dfsVar = (dfs) ((zbp0) obj5).invoke();
                Scheduler scheduler = (Scheduler) ((zbp0) obj8).invoke();
                Scheduler scheduler2 = (Scheduler) ((zbp0) obj4).invoke();
                g0l g0lVar = (g0l) ((zbp0) obj7).invoke();
                Observable observable2 = (Observable) ((zbp0) obj3).invoke();
                v5u0 v5u0VarF0 = ((rbp0) obj2).b.f0();
                Observable observable3 = (Observable) ((zbp0) obj).invoke();
                qqp qqpVar = new qqp(new r0s0(zorVar, dfsVar, scheduler, scheduler2, g0lVar, observable2, v5u0VarF0, observable3, (efs) ((zbp0) cdp0Var).invoke()));
                return new vf2((ywp) qqpVar.e, new vgr(g0lVar, observable2, v5u0VarF0, observable3, scheduler, scheduler2), (ywp) qqpVar.b, (ywp) qqpVar.c, scheduler, scheduler2);
            case 8:
                RetrofitMaker retrofitMaker2 = (RetrofitMaker) ((jdp0) obj6).invoke();
                Observable observable4 = (Observable) ((jdp0) obj5).invoke();
                cex0 cex0Var = (cex0) ((hdp0) obj8).invoke();
                mu2 mu2Var = (mu2) ((hdp0) obj4).invoke();
                m971 m971Var = (m971) ((jdp0) obj7).invoke();
                Context context2 = (Context) ((jdp0) obj3).invoke();
                add addVar = (add) ((jdp0) obj2).invoke();
                tjq tjqVar = new tjq(new vi11(retrofitMaker2, observable4, cex0Var, mu2Var, m971Var, context2, addVar, (pni1) ((jdp0) obj).invoke(), (kly0) ((hdp0) cdp0Var).invoke()));
                return new s971((j971) retrofitMaker2.createWebgateService(j971.class, "android-campfire-sharelist-impl"), observable4, (ipq) tjqVar.c, (ipq) tjqVar.a, m971Var, context2, addVar, (ipq) tjqVar.d, (ipq) tjqVar.e);
            default:
                mbu mbuVar = (mbu) ((cdp0) obj6).invoke();
                pni1 pni1Var = (pni1) ((cdp0) obj5).invoke();
                return new km0(mbuVar, (hsq) new k2q(new ywv0(mbuVar, pni1Var, (hes) ((cdp0) obj8).invoke(), (uz5) ((cdp0) obj4).invoke(), (fwn0) ((cdp0) obj7).invoke(), (RetrofitMaker) ((cdp0) obj3).invoke(), (mr20) ((cdp0) obj2).invoke(), (q8n) ((cdp0) obj).invoke(), (q8n) cdp0Var.invoke())).c, pni1Var);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ang(i8h1 i8h1Var, vwk0 vwk0Var, y7e1 y7e1Var, c9n c9nVar, ven0 ven0Var, k6a1 k6a1Var, bng bngVar, Function0 function0, ven0 ven0Var2) {
        super(0);
        this.a = (byte) 0;
        this.b = i8h1Var;
        this.c = vwk0Var;
        this.d = y7e1Var;
        this.e = c9nVar;
        this.f = ven0Var;
        this.h = k6a1Var;
        this.i = bngVar;
        this.t = function0;
        this.g = ven0Var2;
    }
}
