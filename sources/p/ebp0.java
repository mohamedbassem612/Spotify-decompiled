package p;

import android.content.Context;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.cosmos.rxrouter.RxRouter;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ebp0 extends hab0 implements Function0 {
    public final /* synthetic */ Object N0;
    public final /* synthetic */ hab0 O0;
    public final /* synthetic */ tv30 P0;
    public final /* synthetic */ tv30 Q0;
    public final /* synthetic */ Object X;
    public final /* synthetic */ hab0 Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ byte a;
    public final /* synthetic */ tv30 b;
    public final /* synthetic */ hab0 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ tv30 f;
    public final /* synthetic */ tv30 g;
    public final /* synthetic */ tv30 h;
    public final /* synthetic */ tv30 i;
    public final /* synthetic */ tv30 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ebp0(tv30 tv30Var, hab0 hab0Var, Object obj, Object obj2, tv30 tv30Var2, tv30 tv30Var3, tv30 tv30Var4, tv30 tv30Var5, tv30 tv30Var6, Object obj3, hab0 hab0Var2, Object obj4, Object obj5, hab0 hab0Var3, tv30 tv30Var7, tv30 tv30Var8, byte b) {
        super(0);
        this.a = b;
        this.b = tv30Var;
        this.c = hab0Var;
        this.d = obj;
        this.e = obj2;
        this.f = tv30Var2;
        this.g = tv30Var3;
        this.h = tv30Var4;
        this.i = tv30Var5;
        this.t = tv30Var6;
        this.X = obj3;
        this.Y = hab0Var2;
        this.Z = obj4;
        this.N0 = obj5;
        this.O0 = hab0Var3;
        this.P0 = tv30Var7;
        this.Q0 = tv30Var8;
    }

    public final Object invoke() {
        byte b = this.a;
        cdp0 cdp0Var = this.Q0;
        cdp0 cdp0Var2 = this.P0;
        hab0 hab0Var = this.O0;
        Object obj = this.N0;
        Object obj2 = this.Z;
        hab0 hab0Var2 = this.Y;
        Object obj3 = this.X;
        tv30 tv30Var = this.t;
        tv30 tv30Var2 = this.i;
        tv30 tv30Var3 = this.h;
        cdp0 cdp0Var3 = this.g;
        cdp0 cdp0Var4 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        hab0 hab0Var3 = this.c;
        cdp0 cdp0Var5 = this.b;
        switch (b) {
            case 0:
                add addVar = (add) ((edp0) cdp0Var5).invoke();
                kbd kbdVar = (kbd) ((hbp0) hab0Var3).invoke();
                Observable observable = (Observable) ((edp0) obj5).invoke();
                nzc1 nzc1Var = (nzc1) ((edp0) obj4).invoke();
                q8n q8nVar = (q8n) ((edp0) cdp0Var4).invoke();
                q8n q8nVar2 = (q8n) ((edp0) cdp0Var3).invoke();
                RetrofitMaker retrofitMaker = (RetrofitMaker) ((edp0) tv30Var3).invoke();
                lmy0 lmy0Var = (lmy0) ((edp0) tv30Var2).invoke();
                Scheduler scheduler = (Scheduler) ((edp0) tv30Var).invoke();
                mu2 mu2Var = (mu2) ((hbp0) obj3).invoke();
                cex0 cex0Var = (cex0) ((hbp0) hab0Var2).invoke();
                rg31 rg31Var = (rg31) ((hbp0) obj2).invoke();
                lc71 lc71Var = (lc71) ((hbp0) obj).invoke();
                mtd1 mtd1Var = (mtd1) ((hbp0) hab0Var).invoke();
                gwy0 gwy0Var = (gwy0) ((edp0) cdp0Var2).invoke();
                zle1 zle1Var = (zle1) ((edp0) cdp0Var).invoke();
                cp31 cp31Var = new cp31();
                cp31Var.a = addVar;
                cp31Var.b = mu2Var;
                cp31Var.c = cex0Var;
                cp31Var.d = rg31Var;
                cp31Var.e = lc71Var;
                cp31Var.f = mtd1Var;
                toj0 toj0Var = new toj0(cp31Var);
                b2p b2pVar = (b2p) toj0Var.c;
                Object obj6 = toj0Var.d;
                c8o.l(addVar);
                aod aodVar = new aod(new v1k(b2pVar, (b2p) obj6, addVar, (byte) 25), toj0Var.h(), (byte) 8);
                pad padVar = (pad) retrofitMaker.createWebgateService(pad.class, "android-campfire-datasource-impl");
                c8o.l(addVar);
                c8o.l(addVar);
                ddd dddVar = new ddd(addVar, new sg31(addVar));
                c8o.l(addVar);
                nad nadVar = new nad(padVar, dddVar, new sg31(addVar));
                m3c m3cVar = new m3c(zle1Var);
                hod0 hod0Var = new hod0(gwy0Var, (byte) 24);
                c8o.l(addVar);
                xid xidVar = new xid(new v1k((b2p) toj0Var.c, (b2p) obj6, addVar, (byte) 25), toj0Var.h(), (byte) 9);
                p2o0 p2o0VarH = toj0Var.h();
                c8o.l(addVar);
                c8o.l(addVar);
                return new bfd(aodVar, nadVar, addVar, m3cVar, hod0Var, xidVar, p2o0VarH, observable, new cab(lmy0Var, scheduler, new ddd(addVar, new sg31(addVar)), (byte) 16), new cuw((byte) 1), nzc1Var, kbdVar, q8nVar, q8nVar2);
            default:
                Context context = (Context) cdp0Var5.invoke();
                xyl1 xyl1Var = (xyl1) ((ycp0) hab0Var3).invoke();
                y4m1 y4m1Var = (y4m1) ((ycp0) obj5).invoke();
                ytw0 ytw0VarP = ((ddp0) obj4).b.p();
                Flowable flowable = (Flowable) cdp0Var4.invoke();
                g0l g0lVar = (g0l) cdp0Var3.invoke();
                yqg yqgVar = (yqg) ((edp0) tv30Var3).invoke();
                RetrofitMaker retrofitMaker2 = (RetrofitMaker) ((edp0) tv30Var2).invoke();
                q8n q8nVar3 = (q8n) ((edp0) tv30Var).invoke();
                Scheduler scheduler2 = (Scheduler) ((cdp0) obj3).invoke();
                RxRouter rxRouterZ = ((rbp0) hab0Var2).b.z();
                luk lukVar = (luk) ((cdp0) obj2).invoke();
                t2j0 t2j0Var = (t2j0) ((cdp0) obj).invoke();
                ec4 ec4Var = (ec4) ((ycp0) hab0Var).b.d;
                zwz0 zwz0Var = (zwz0) cdp0Var2.invoke();
                xrc0 xrc0Var = (xrc0) cdp0Var.invoke();
                llm llmVarH = us71.h(q8nVar3);
                vi11 vi11Var = new vi11(y4m1Var, xrc0Var, zwz0Var, llmVarH);
                yjq yjqVar = new yjq(t2j0Var, vi11Var, llmVarH);
                oyl1 oyl1Var = new oyl1(flowable, y4m1Var, g0lVar, yqgVar);
                vhc vhcVar = new vhc((byte) 3);
                hur hurVar = new hur(context.getFilesDir(), yqgVar);
                tz01 tz01Var = new tz01((tig) retrofitMaker2.createWebgateService(tig.class, "android-fitness-workout-impl", ieo.a), (byte) 9);
                xaz0 xaz0Var = new xaz0((geo) retrofitMaker2.createWebgateService(geo.class, "android-fitness-workout-impl"), (byte) 14);
                pb00 pb00Var = new pb00(t2j0Var, yqgVar, zwz0Var, llmVarH, vi11Var);
                rxRouterZ.getClass();
                scheduler2.getClass();
                lukVar.getClass();
                return new qzl1(flowable, y4m1Var, xyl1Var, ytw0VarP, new xam0(oyl1Var, vhcVar, ytw0VarP, new p1f0(hurVar, tz01Var, xaz0Var, ec4Var, q8nVar3, pb00Var, yjqVar, new tzo(ce7.p(rxRouterZ, lukVar), (byte) 8)), yjqVar, vi11Var), llmVarH);
        }
    }
}
