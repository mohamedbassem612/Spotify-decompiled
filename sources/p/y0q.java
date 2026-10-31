package p;

import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.messaging.actionsimpl.email.EmailVerifyDispatcherService;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class y0q implements dl4 {
    public final /* synthetic */ byte a;
    public final daq b;

    public /* synthetic */ y0q(daq daqVar, byte b) {
        this.a = b;
        this.b = daqVar;
    }

    public void w(Object obj) {
        byte b = this.a;
        daq daqVar = this.b;
        switch (b) {
            case 1:
                EmailVerifyDispatcherService emailVerifyDispatcherService = (EmailVerifyDispatcherService) obj;
                emailVerifyDispatcherService.a = new m7y0((vyw) ((RetrofitMaker) ((esp) ((f9j0) daqVar.F6.get())).a.e.get()).createWebgateService(vyw.class, "android-email-verifyemail"), (byte) 10);
                emailVerifyDispatcherService.d = new vhc((byte) 8);
                emailVerifyDispatcherService.c = (Scheduler) daqVar.z1.get();
                emailVerifyDispatcherService.b = (kt91) daqVar.f8.get();
                break;
            default:
                ((lm21) obj).V1 = (g341) daqVar.Fh.get();
                break;
        }
    }

    public /* synthetic */ y0q(daq daqVar, teq teqVar, byte b) {
        this.a = b;
        this.b = daqVar;
    }
}
