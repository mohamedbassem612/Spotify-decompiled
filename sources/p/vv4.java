package p;

import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import io.reactivex.rxjava3.core.ObservableEmitter;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vv4 implements NsdManager.RegistrationListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vv4(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.net.nsd.NsdManager.RegistrationListener
    public final void onRegistrationFailed(NsdServiceInfo nsdServiceInfo, int i) {
        switch (this.a) {
            case 0:
                ObservableEmitter observableEmitter = (ObservableEmitter) this.b;
                uv4 uv4Var = new uv4(i, (byte) 0);
                List list = r110.a;
                if (!observableEmitter.isDisposed()) {
                    uv4Var.invoke(observableEmitter);
                }
                break;
            default:
                wvt.a((String) this.c);
                break;
        }
    }

    @Override // android.net.nsd.NsdManager.RegistrationListener
    public final void onServiceRegistered(NsdServiceInfo nsdServiceInfo) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ((ObservableEmitter) obj2).onNext(new tv4((jeh0) obj));
                break;
            default:
                if (!((String) obj2).equals(nsdServiceInfo.getServiceName())) {
                    wvt.a((String) obj);
                }
                break;
        }
    }

    @Override // android.net.nsd.NsdManager.RegistrationListener
    public final void onServiceUnregistered(NsdServiceInfo nsdServiceInfo) {
        switch (this.a) {
            case 0:
                ObservableEmitter observableEmitter = (ObservableEmitter) this.b;
                if (!observableEmitter.isDisposed()) {
                    observableEmitter.onComplete();
                }
                break;
        }
    }

    @Override // android.net.nsd.NsdManager.RegistrationListener
    public final void onUnregistrationFailed(NsdServiceInfo nsdServiceInfo, int i) {
        switch (this.a) {
            case 0:
                ObservableEmitter observableEmitter = (ObservableEmitter) this.b;
                uv4 uv4Var = new uv4(i, (byte) 1);
                List list = r110.a;
                if (!observableEmitter.isDisposed()) {
                    uv4Var.invoke(observableEmitter);
                }
                break;
        }
    }

    private final void a(NsdServiceInfo nsdServiceInfo) {
    }

    private final void b(NsdServiceInfo nsdServiceInfo, int i) {
    }
}
