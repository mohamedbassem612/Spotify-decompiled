package p;

import android.os.Looper;
import android.view.View;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class jxc extends Observable {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ jxc(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void subscribeActual(Observer observer) {
        byte b = this.a;
        boolean z = true;
        Object obj = this.b;
        switch (b) {
            case 0:
                wyp0 wyp0VarClone = ((wyp0) obj).clone();
                ixc ixcVar = new ixc(wyp0VarClone);
                observer.onSubscribe(ixcVar);
                if (!ixcVar.isDisposed()) {
                    try {
                        sy21 sy21VarC = wyp0VarClone.c();
                        if (!ixcVar.isDisposed()) {
                            observer.onNext(sy21VarC);
                        }
                        if (!ixcVar.isDisposed()) {
                            try {
                                observer.onComplete();
                                break;
                            } catch (Throwable th) {
                                th = th;
                                Exceptions.a(th);
                                if (z) {
                                    RxJavaPlugins.b(th);
                                    return;
                                }
                                if (ixcVar.isDisposed()) {
                                    return;
                                }
                                try {
                                    observer.onError(th);
                                    return;
                                } catch (Throwable th2) {
                                    Exceptions.a(th2);
                                    RxJavaPlugins.b(new CompositeException(new Throwable[]{th, th2}));
                                    return;
                                }
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        z = false;
                    }
                }
                break;
            case 1:
                ((Observable) obj).subscribe(new keh(observer, (byte) 1));
                break;
            default:
                View view = (View) obj;
                if (!u890.j(Looper.myLooper(), Looper.getMainLooper())) {
                    observer.onSubscribe(Disposable.e(Functions.b));
                    observer.onError(new IllegalStateException("Expected to be called on the main thread but was " + Thread.currentThread().getName()));
                } else {
                    k7k1 k7k1Var = new k7k1(view, observer);
                    observer.onSubscribe(k7k1Var);
                    view.setOnClickListener(k7k1Var);
                }
                break;
        }
    }
}
