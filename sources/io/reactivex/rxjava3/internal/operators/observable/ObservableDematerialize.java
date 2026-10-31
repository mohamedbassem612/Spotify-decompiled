package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Notification;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ObservableDematerialize<T, R> extends AbstractObservableWithUpstream<T, R> {
    public final Function b;

    public static final class DematerializeObserver<T, R> implements Observer<T>, Disposable {
        public final Observer a;
        public final Function b;
        public boolean c;
        public Disposable d;

        public DematerializeObserver(Observer observer, Function function) {
            this.a = observer;
            this.b = function;
        }

        public void dispose() {
            this.d.dispose();
        }

        public boolean isDisposed() {
            return this.d.isDisposed();
        }

        public final void onComplete() {
            if (this.c) {
                return;
            }
            this.c = true;
            this.a.onComplete();
        }

        public final void onError(Throwable th) {
            if (this.c) {
                RxJavaPlugins.b(th);
            } else {
                this.c = true;
                this.a.onError(th);
            }
        }

        public final void onNext(Object obj) {
            if (this.c) {
                if (obj instanceof Notification) {
                    Notification notification = (Notification) obj;
                    if (NotificationLite.h(notification.a)) {
                        RxJavaPlugins.b(notification.c());
                        return;
                    }
                    return;
                }
                return;
            }
            try {
                Object objApply = this.b.apply(obj);
                Objects.requireNonNull(objApply, "The selector returned a null Notification");
                Notification notification2 = (Notification) objApply;
                Object obj2 = notification2.a;
                if (NotificationLite.h(obj2)) {
                    this.d.dispose();
                    onError(notification2.c());
                } else if (obj2 != null) {
                    this.a.onNext(notification2.d());
                } else {
                    this.d.dispose();
                    onComplete();
                }
            } catch (Throwable th) {
                Exceptions.a(th);
                this.d.dispose();
                onError(th);
            }
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.h(this.d, disposable)) {
                this.d = disposable;
                this.a.onSubscribe(this);
            }
        }
    }

    public ObservableDematerialize(Observable observable, Function function) {
        super(observable);
        this.b = function;
    }

    public final void subscribeActual(Observer observer) {
        ((AbstractObservableWithUpstream) this).a.subscribe(new DematerializeObserver(observer, this.b));
    }
}
