package rxdogtag2;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.observers.LambdaConsumerIntrospection;
import java.util.Objects;
import p.n6;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
final class DogTagObserver<T> implements Observer<T>, LambdaConsumerIntrospection {
    private final RxDogTag.Configuration config;
    private final Observer<T> delegate;
    private final Throwable t = new Throwable();

    public DogTagObserver(RxDogTag.Configuration configuration, Observer<T> observer) {
        this.config = configuration;
        this.delegate = observer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onComplete$6(Throwable th) {
        RxDogTag.reportError(this.config, this.t, th, "onComplete");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onError$4(Throwable th) {
        RxDogTag.reportError(this.config, this.t, th, "onError");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onError$5(Throwable th) {
        this.delegate.onError(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onNext$2(Throwable th) {
        RxDogTag.reportError(this.config, this.t, th, "onNext");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onNext$3(Object obj) {
        this.delegate.onNext(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onSubscribe$0(Throwable th) {
        RxDogTag.reportError(this.config, this.t, th, "onSubscribe");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onSubscribe$1(Disposable disposable) {
        this.delegate.onSubscribe(disposable);
    }

    @Override // io.reactivex.rxjava3.observers.LambdaConsumerIntrospection
    public boolean hasCustomOnError() {
        Observer<T> observer = this.delegate;
        return (observer instanceof LambdaConsumerIntrospection) && ((LambdaConsumerIntrospection) observer).hasCustomOnError();
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public void onComplete() {
        if (!this.config.guardObserverCallbacks) {
            this.delegate.onComplete();
            return;
        }
        g gVar = new g(this, (byte) 2);
        Observer<T> observer = this.delegate;
        Objects.requireNonNull(observer);
        RxDogTag.guardedDelegateCall(gVar, new n6(observer, (byte) 4));
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public void onError(Throwable th) {
        Observer<T> observer = this.delegate;
        boolean z = observer instanceof RxDogTagErrorReceiver;
        RxDogTag.Configuration configuration = this.config;
        if (!z) {
            RxDogTag.reportError(configuration, this.t, th, null);
            return;
        }
        if (observer instanceof RxDogTagTaggedExceptionReceiver) {
            observer.onError(RxDogTag.createException(configuration, this.t, th, null));
        } else if (configuration.guardObserverCallbacks) {
            RxDogTag.guardedDelegateCall(new c(this, (byte) 1), new d(this, th, (byte) 2));
        } else {
            observer.onError(th);
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public void onNext(T t) {
        if (this.config.guardObserverCallbacks) {
            RxDogTag.guardedDelegateCall(new g(this, (byte) 1), new b(this, t, (byte) 4));
        } else {
            this.delegate.onNext(t);
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public void onSubscribe(Disposable disposable) {
        if (this.config.guardObserverCallbacks) {
            RxDogTag.guardedDelegateCall(new g(this, (byte) 0), new b(this, disposable, (byte) 3));
        } else {
            this.delegate.onSubscribe(disposable);
        }
    }
}
