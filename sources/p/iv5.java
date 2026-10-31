package p;

import com.spotify.interapp.service.service.AppProtocolRemoteService;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class iv5 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ AppProtocolRemoteService b;
    public final /* synthetic */ aos c;

    public /* synthetic */ iv5(AppProtocolRemoteService appProtocolRemoteService, aos aosVar, byte b) {
        this.a = b;
        this.b = appProtocolRemoteService;
        this.c = aosVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AppProtocolRemoteService appProtocolRemoteService = this.b;
                aos aosVar = this.c;
                int i = AppProtocolRemoteService.f1;
                if (aosVar.l != 2) {
                    aosVar.b("wamp.error.system_shutdown");
                    mj61 mj61Var = aosVar.g;
                    mj61Var.getClass();
                    int i2 = aosVar.e;
                    ConcurrentHashMap concurrentHashMap = mj61Var.a;
                    concurrentHashMap.remove(Integer.valueOf(i2));
                    mj61Var.b.onNext(new ArrayList(concurrentHashMap.values()));
                }
                appProtocolRemoteService.d1.remove(aosVar);
                break;
            case 1:
                AppProtocolRemoteService appProtocolRemoteService2 = this.b;
                aos aosVar2 = this.c;
                int i3 = AppProtocolRemoteService.f1;
                appProtocolRemoteService2.d1.remove(aosVar2);
                break;
            default:
                AppProtocolRemoteService appProtocolRemoteService3 = this.b;
                aos aosVar3 = this.c;
                int i4 = AppProtocolRemoteService.f1;
                appProtocolRemoteService3.d1.remove(aosVar3);
                break;
        }
    }
}
