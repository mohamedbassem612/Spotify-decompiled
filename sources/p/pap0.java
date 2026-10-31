package p;

import android.content.Context;
import com.spotify.connectivity.AnalyticsDelegate;
import com.spotify.connectivity.ApplicationScopeConfiguration;
import com.spotify.connectivity.MobileDeviceInfo;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.core.http.CronetRuntime;
import com.spotify.cosmos.rxrouter.RxRouter;
import com.spotify.cosmos.sharedcosmosrouterapi.SharedCosmosRouterApi;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class pap0 extends hab0 implements Function0 {
    public final /* synthetic */ Object N0;
    public final /* synthetic */ Object O0;
    public final /* synthetic */ Object P0;
    public final /* synthetic */ Object Q0;
    public final /* synthetic */ Object R0;
    public final /* synthetic */ Object S0;
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ hab0 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pap0(tv30 tv30Var, hab0 hab0Var, Object obj, Object obj2, tv30 tv30Var2, Object obj3, Object obj4, tv30 tv30Var3, tv30 tv30Var4, Object obj5, tv30 tv30Var5, tv30 tv30Var6, Object obj6, tv30 tv30Var7, tv30 tv30Var8, tv30 tv30Var9, tv30 tv30Var10, Object obj7, byte b) {
        super(0);
        this.a = b;
        this.b = tv30Var;
        this.c = hab0Var;
        this.d = obj;
        this.e = obj2;
        this.f = tv30Var2;
        this.g = obj3;
        this.h = obj4;
        this.i = tv30Var3;
        this.t = tv30Var4;
        this.X = obj5;
        this.Y = tv30Var5;
        this.Z = tv30Var6;
        this.N0 = obj6;
        this.O0 = tv30Var7;
        this.P0 = tv30Var8;
        this.Q0 = tv30Var9;
        this.R0 = tv30Var10;
        this.S0 = obj7;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.a;
        Object obj = this.S0;
        Object obj2 = this.R0;
        Object obj3 = this.Q0;
        Object obj4 = this.P0;
        Object obj5 = this.O0;
        Object obj6 = this.N0;
        Object obj7 = this.Z;
        Object obj8 = this.Y;
        Object obj9 = this.X;
        Object obj10 = this.t;
        Object obj11 = this.i;
        Object obj12 = this.h;
        Object obj13 = this.g;
        Object obj14 = this.f;
        Object obj15 = this.e;
        Object obj16 = this.d;
        xap0 xap0Var = this.c;
        Object obj17 = this.b;
        switch (b) {
            case 0:
                return vzn1.i(new dj5((kly0) ((rdp0) obj17).invoke(), (kly0) ((rdp0) xap0Var).invoke(), (kly0) ((rdp0) obj16).invoke(), (kly0) ((rdp0) obj15).invoke(), (kly0) ((rdp0) obj14).invoke(), (kly0) ((rdp0) obj13).invoke(), (kly0) ((rdp0) obj12).invoke(), (kly0) ((rdp0) obj11).invoke(), (kly0) ((rdp0) obj10).invoke(), (kly0) ((rdp0) obj9).invoke(), (kly0) ((rdp0) obj8).invoke(), (kly0) ((rdp0) obj7).invoke(), (kly0) ((rdp0) obj6).invoke(), (kly0) ((rdp0) obj5).invoke(), (kly0) ((rdp0) obj4).invoke(), (kly0) ((rdp0) obj3).invoke(), (kly0) ((rdp0) obj2).invoke(), (kly0) ((rdp0) obj).invoke()));
            case 1:
                AnalyticsDelegate analyticsDelegate = (AnalyticsDelegate) ((bbp0) obj17).invoke();
                a8n a8nVar = (a8n) xap0Var.invoke();
                c8n c8nVar = (c8n) ((xap0) obj16).invoke();
                p5n p5nVar = (p5n) ((xap0) obj15).invoke();
                ApplicationScopeConfiguration applicationScopeConfiguration = (ApplicationScopeConfiguration) ((bbp0) obj14).invoke();
                e4g1 e4g1Var = (e4g1) ((xap0) obj13).invoke();
                exz0 exz0Var = (exz0) ((xap0) obj12).invoke();
                v4g1 v4g1Var = (v4g1) ((bbp0) obj11).invoke();
                MobileDeviceInfo mobileDeviceInfo = (MobileDeviceInfo) ((bbp0) obj10).invoke();
                SharedCosmosRouterApi sharedCosmosRouterApi = (SharedCosmosRouterApi) ((xap0) obj9).invoke();
                Context context = (Context) ((abp0) obj8).invoke();
                CronetRuntime cronetRuntime = (CronetRuntime) ((abp0) obj7).invoke();
                azp0 azp0Var = (azp0) ((ry9) obj6).invoke();
                Observable observable = (Observable) ((abp0) obj5).invoke();
                Observable observable2 = (Observable) ((abp0) obj4).invoke();
                Flowable flowable = (Flowable) ((abp0) obj3).invoke();
                ((bbp0) obj2).invoke();
                return new mcl(analyticsDelegate, a8nVar, c8nVar, p5nVar, applicationScopeConfiguration, e4g1Var, exz0Var, v4g1Var, mobileDeviceInfo, sharedCosmosRouterApi, context, cronetRuntime, azp0Var, observable, observable2, flowable, (i420) ((xap0) obj).invoke());
            default:
                luk lukVar = (luk) ((y52) obj17).invoke();
                RxRouter rxRouterZ = ((kb61) ((u6j0) xap0Var).b).z();
                Context context2 = (Context) ((adp0) obj16).invoke();
                RetrofitMaker retrofitMaker = (RetrofitMaker) ((adp0) obj15).invoke();
                g0l g0lVar = (g0l) ((adp0) obj14).invoke();
                Observable observable3 = (Observable) ((adp0) obj13).invoke();
                dma1 dma1Var = (dma1) ((adp0) obj12).invoke();
                dma1 dma1Var2 = (dma1) ((adp0) obj11).invoke();
                ((adp0) obj10).invoke();
                return o4o1.m(new i7d(lukVar, rxRouterZ, context2, retrofitMaker, g0lVar, observable3, dma1Var, dma1Var2, (dlq) ((y52) obj9).invoke(), (Scheduler) ((adp0) obj8).invoke(), (q8n) ((adp0) obj7).invoke(), (q8n) ((adp0) obj6).invoke(), (o241) ((adp0) obj5).invoke(), (Flowable) ((adp0) obj4).invoke(), (Flowable) ((adp0) obj3).invoke(), (t2j0) ((adp0) obj2).invoke(), (mw7) ((adp0) obj).invoke()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pap0(rdp0 rdp0Var, rdp0 rdp0Var2, rdp0 rdp0Var3, rdp0 rdp0Var4, rdp0 rdp0Var5, rdp0 rdp0Var6, rdp0 rdp0Var7, rdp0 rdp0Var8, rdp0 rdp0Var9, rdp0 rdp0Var10, rdp0 rdp0Var11, rdp0 rdp0Var12, rdp0 rdp0Var13, rdp0 rdp0Var14, rdp0 rdp0Var15, rdp0 rdp0Var16, rdp0 rdp0Var17, rdp0 rdp0Var18, rdp0 rdp0Var19) {
        super(0);
        this.a = (byte) 0;
        this.b = rdp0Var;
        this.c = rdp0Var2;
        this.d = rdp0Var3;
        this.e = rdp0Var4;
        this.f = rdp0Var5;
        this.g = rdp0Var6;
        this.h = rdp0Var7;
        this.i = rdp0Var8;
        this.t = rdp0Var9;
        this.X = rdp0Var10;
        this.Y = rdp0Var11;
        this.Z = rdp0Var12;
        this.N0 = rdp0Var13;
        this.O0 = rdp0Var15;
        this.P0 = rdp0Var16;
        this.Q0 = rdp0Var17;
        this.R0 = rdp0Var18;
        this.S0 = rdp0Var19;
    }
}
