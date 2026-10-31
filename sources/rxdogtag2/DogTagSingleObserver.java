package rxdogtag2;

import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.observers.LambdaConsumerIntrospection;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
final class DogTagSingleObserver<T> implements SingleObserver<T>, LambdaConsumerIntrospection {
    private final RxDogTag.Configuration config;
    private final SingleObserver<T> delegate;
    private final Throwable t = new Throwable();

    public DogTagSingleObserver(RxDogTag.Configuration configuration, SingleObserver<T> singleObserver) {
        this.config = configuration;
        this.delegate = singleObserver;
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
    public /* synthetic */ void lambda$onSubscribe$0(Throwable th) {
        RxDogTag.reportError(this.config, this.t, th, "onSubscribe");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onSubscribe$1(Disposable disposable) {
        this.delegate.onSubscribe(disposable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onSuccess$2(Throwable th) {
        RxDogTag.reportError(this.config, this.t, th, "onSuccess");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onSuccess$3(Object obj) {
        this.delegate.onSuccess(obj);
    }

    @Override // io.reactivex.rxjava3.observers.LambdaConsumerIntrospection
    public boolean hasCustomOnError() {
        SingleObserver<T> singleObserver = this.delegate;
        return (singleObserver instanceof LambdaConsumerIntrospection) && ((LambdaConsumerIntrospection) singleObserver).hasCustomOnError();
    }

    @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver, io.reactivex.rxjava3.core.MaybeObserver
    public void onError(Throwable th) {
        SingleObserver<T> singleObserver = this.delegate;
        boolean z = singleObserver instanceof RxDogTagErrorReceiver;
        RxDogTag.Configuration configuration = this.config;
        if (!z) {
            RxDogTag.reportError(configuration, this.t, th, null);
            return;
        }
        if (singleObserver instanceof RxDogTagTaggedExceptionReceiver) {
            singleObserver.onError(RxDogTag.createException(configuration, this.t, th, null));
        } else if (configuration.guardObserverCallbacks) {
            RxDogTag.guardedDelegateCall(new c(this, (byte) 2), new d(this, th, (byte) 3));
        } else {
            singleObserver.onError(th);
        }
    }

    @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver, io.reactivex.rxjava3.core.MaybeObserver
    public void onSubscribe(Disposable disposable) {
        if (this.config.guardObserverCallbacks) {
            RxDogTag.guardedDelegateCall(new h(this, (byte) 1), new b(this, disposable, (byte) 6));
        } else {
            this.delegate.onSubscribe(disposable);
        }
    }

    @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.MaybeObserver
    public void onSuccess(T t) {
        if (this.config.guardObserverCallbacks) {
            RxDogTag.guardedDelegateCall(new h(this, (byte) 0), new b(this, t, (byte) 5));
        } else {
            this.delegate.onSuccess(t);
        }
    }
}
