package p;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.os.Build;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableElementAtSingle;
import io.reactivex.rxjava3.internal.operators.observable.ObservableRefCount;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class pf90 implements ObservableSource {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public pf90(Observable observable, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = observable.distinctUntilChanged().onErrorReturnItem(Boolean.FALSE).map(sa20.g);
                break;
            case 5:
                this.b = observable.onErrorReturnItem(Boolean.TRUE).distinctUntilChanged().map(rdx0.Z);
                break;
            case 7:
                Boolean bool = Boolean.FALSE;
                this.b = observable.onErrorReturnItem(new y0a1(bool, bool)).distinctUntilChanged().map(e4x0.O0);
                break;
            default:
                this.b = observable.onErrorReturnItem(Boolean.TRUE).distinctUntilChanged().map(qs10.g);
                break;
        }
    }

    public final void subscribe(Observer observer) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((Observable) obj).subscribe(observer);
                break;
            case 1:
                ((Observable) obj).subscribe(observer);
                break;
            case 2:
                ((Observable) obj).subscribe(observer);
                break;
            case 3:
                ((Observable) obj).subscribe(observer);
                break;
            case 4:
                ((Observable) obj).subscribe(observer);
                break;
            case 5:
                ((Observable) obj).subscribe(observer);
                break;
            case 6:
                ((Observable) obj).subscribe(observer);
                break;
            case 7:
                ((Observable) obj).subscribe(observer);
                break;
            default:
                jfb jfbVar = (jfb) obj;
                Context context = jfbVar.a;
                Object systemService = context.getSystemService("bluetooth");
                BluetoothManager bluetoothManager = systemService instanceof BluetoothManager ? (BluetoothManager) systemService : null;
                BluetoothAdapter adapter = bluetoothManager != null ? bluetoothManager.getAdapter() : null;
                if (adapter == null || (Build.VERSION.SDK_INT >= 31 && x74.j(context, "android.permission.BLUETOOTH_CONNECT") != 0)) {
                    observer.onNext(new gfb(false, (pfb) null));
                    observer.onComplete();
                } else if (adapter.getProfileConnectionState(2) != 2) {
                    observer.onNext(new gfb(false, (pfb) null));
                    observer.onComplete();
                } else {
                    jfbVar.c = false;
                    adapter.getProfileProxy(context, new ifb(jfbVar, observer, adapter), 2);
                }
                break;
        }
    }

    public pf90(jfb jfbVar) {
        this.a = (byte) 8;
        this.b = jfbVar;
    }

    public pf90(vnd1 vnd1Var) {
        this.a = (byte) 2;
        this.b = yoi1.i(rqt0.u(((a4q0) vnd1Var.c).e(gtg1.t)), o6x.a).distinctUntilChanged().map(b610.U0);
    }

    public pf90(byte b, FlowableElementAtSingle flowableElementAtSingle, io91 io91Var) {
        this.a = b;
        switch (b) {
            case 4:
                this.b = flowableElementAtSingle.flatMapObservable(new aot0(io91Var, (byte) 1)).onErrorReturnItem(new sk91(0));
                break;
            default:
                this.b = flowableElementAtSingle.flatMapObservable(new aot0(io91Var, (byte) 0)).onErrorReturnItem(new pk91(0));
                break;
        }
    }

    public pf90(String str, li91 li91Var, il91 il91Var) {
        this.a = (byte) 6;
        ObservableRefCount observableRefCountF = il91Var.Y.d(Observable.defer(new inf0(str, li91Var, il91Var))).serialize().replay(1).f();
        this.b = Observable.merge(observableRefCountF.map(njx0.N0).distinctUntilChanged().map(w1x0.S0), observableRefCountF.map(y1x0.N0).distinctUntilChanged().concatMap(a2x0.O0));
    }
}
