package p;

import android.net.ConnectivityManager;
import android.net.nsd.NsdManager;
import android.view.View;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Cancellable;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pc6 implements Cancellable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pc6(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public final void cancel() {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ((Disposable) obj2).dispose();
                ((Disposable) obj).dispose();
                break;
            case 1:
                jfb jfbVar = (jfb) obj2;
                jfbVar.a.unregisterReceiver((aia) obj);
                jfbVar.b.clear();
                break;
            case 2:
                ((ConnectivityManager) ((o1r) obj2).c.getValue()).unregisterNetworkCallback((ConnectivityManager.NetworkCallback) obj);
                break;
            case 3:
                try {
                    ((NsdManager) obj2).unregisterService((vv4) obj);
                } catch (ArrayIndexOutOfBoundsException e) {
                    e.toString();
                    return;
                } catch (IllegalArgumentException e2) {
                    e2.toString();
                    return;
                }
                break;
            case 4:
                ((iac0) obj2).getLifecycle().d((rjd) obj);
                break;
            case 5:
                ((rzq) obj2).h((ckv) obj);
                break;
            case 6:
                ((CopyOnWriteArraySet) ((zeu) obj2).b).remove((ObservableEmitter) obj);
                break;
            case 7:
                ((en70) obj2).c((fn70) obj);
                break;
            case 8:
                ((x8c0) obj2).d((it0) obj);
                break;
            case 9:
                ((x8c0) obj2).d((ek2) obj);
                break;
            case 10:
                ((en70) obj2).c((fn70) obj);
                break;
            case 11:
                ((r3b1) obj2).a.unregisterNetworkCallback((ConnectivityManager.NetworkCallback) obj);
                break;
            default:
                ((View) obj2).getViewTreeObserver().removeOnScrollChangedListener((abk1) obj);
                break;
        }
    }
}
