package p;

import com.spotify.cosmos.servicebasedrouter.RemoteNativeCallbackRouter;
import com.spotify.cosmos.servicebasedrouter.RemoteNativeRouter;
import com.spotify.cosmos.sharedcosmosrouterapi.SharedCosmosRouterApi;
import io.reactivex.rxjava3.core.Observable;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ycp0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wdm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ycp0(wdm wdmVar, byte b) {
        super(0);
        this.a = b;
        this.b = wdmVar;
    }

    public final Object invoke() {
        byte b = this.a;
        wdm wdmVar = this.b;
        switch (b) {
            case 0:
                SharedCosmosRouterApi sharedCosmosRouterApiU = ((nx9) wdmVar.c).u();
                c8o.l(sharedCosmosRouterApiU);
                RemoteNativeRouter remoteNativeRouter = sharedCosmosRouterApiU.getRemoteNativeRouter();
                c8o.m(remoteNativeRouter);
                return new RemoteNativeCallbackRouter(remoteNativeRouter);
            case 1:
                luk lukVar = ((ra61) wdmVar.b).b;
                c8o.l(lukVar);
                return new fn20(new fj4(lukVar));
            case 2:
                return (y4m1) ((jly0) wdmVar.h).get();
            case 3:
                return (ec4) wdmVar.d;
            case 4:
                luk lukVar2 = ((ra61) wdmVar.b).b;
                c8o.l(lukVar2);
                return new xyl1(new fn20(new fj4(lukVar2)), new ytw0((byte) 21));
            case 5:
                return (y4m1) ((jly0) wdmVar.h).get();
            case 6:
                return (Observable) ((jly0) wdmVar.g).get();
            case 7:
                return (ipq) wdmVar.X;
            case 8:
                return (ipq) wdmVar.Y;
            case 9:
                return (ipq) wdmVar.Z;
            case 10:
                return (Observable) ((jly0) wdmVar.f).get();
            case 11:
                return wdmVar.o();
            case 12:
                SharedCosmosRouterApi sharedCosmosRouterApiU2 = ((nx9) wdmVar.c).u();
                c8o.l(sharedCosmosRouterApiU2);
                RemoteNativeRouter remoteNativeRouter2 = sharedCosmosRouterApiU2.getRemoteNativeRouter();
                c8o.m(remoteNativeRouter2);
                return new RemoteNativeCallbackRouter(remoteNativeRouter2);
            case 13:
                return wdmVar.o();
            case 14:
                SharedCosmosRouterApi sharedCosmosRouterApiU3 = ((nx9) wdmVar.c).u();
                c8o.l(sharedCosmosRouterApiU3);
                RemoteNativeRouter remoteNativeRouter3 = sharedCosmosRouterApiU3.getRemoteNativeRouter();
                c8o.m(remoteNativeRouter3);
                return new RemoteNativeCallbackRouter(remoteNativeRouter3);
            case 15:
                ynb0 ynb0VarA = xqu.a((ipq) wdmVar.e);
                ra61 ra61Var = (ra61) wdmVar.b;
                yqg yqgVar = ra61Var.a;
                c8o.l(yqgVar);
                cve0 cve0Var = new cve0(yqgVar);
                List list = ra61Var.d;
                c8o.l(list);
                return f2u0.n(ynb0VarA, cve0Var, list);
            case 16:
                return wdmVar.o();
            case 17:
                SharedCosmosRouterApi sharedCosmosRouterApiU4 = ((nx9) wdmVar.c).u();
                c8o.l(sharedCosmosRouterApiU4);
                RemoteNativeRouter remoteNativeRouter4 = sharedCosmosRouterApiU4.getRemoteNativeRouter();
                c8o.m(remoteNativeRouter4);
                return new RemoteNativeCallbackRouter(remoteNativeRouter4);
            default:
                gma1 gma1Var = ((ra61) wdmVar.b).c;
                c8o.l(gma1Var);
                return hl20.D(gma1Var);
        }
    }
}
