package p;

import android.os.Build;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class yo5 implements dwo {
    public final /* synthetic */ byte a = 1;
    public Disposable b;

    public yo5(xo5 xo5Var, odb0 odb0Var, Observable observable) {
        Disposable disposableSubscribe = Build.VERSION.SDK_INT >= 33 ? observable.distinctUntilChanged().switchMapCompletable(new lan1(odb0Var, (byte) 21)).subscribe(ps4.d, nm.O0) : EmptyDisposable.a;
        disposableSubscribe.getClass();
        this.b = disposableSubscribe;
    }

    public final void shutdown() {
        switch (this.a) {
            case 0:
                this.b.dispose();
                break;
            default:
                this.b.dispose();
                break;
        }
    }

    public /* synthetic */ yo5() {
    }
}
