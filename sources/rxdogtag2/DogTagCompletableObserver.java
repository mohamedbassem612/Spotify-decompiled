package rxdogtag2;

import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.observers.LambdaConsumerIntrospection;
import java.util.Objects;
import p.n6;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
final class DogTagCompletableObserver implements CompletableObserver, LambdaConsumerIntrospection {
    private final RxDogTag.Configuration config;
    private final CompletableObserver delegate;
    private final Throwable t = new Throwable();

    public DogTagCompletableObserver(RxDogTag.Configuration configuration, CompletableObserver completableObserver) {
        this.config = configuration;
        this.delegate = completableObserver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onComplete$4(Throwable th) {
        RxDogTag.reportError(this.config, this.t, th, "onComplete");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onError$2(Throwable th) {
        RxDogTag.reportError(this.config, this.t, th, "onError");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onError$3(Throwable th) {
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

    @Override // io.reactivex.rxjava3.observers.LambdaConsumerIntrospection
    public boolean hasCustomOnError() {
        CompletableObserver completableObserver = this.delegate;
        return (completableObserver instanceof LambdaConsumerIntrospection) && ((LambdaConsumerIntrospection) completableObserver).hasCustomOnError();
    }

    @Override // io.reactivex.rxjava3.core.CompletableObserver, io.reactivex.rxjava3.core.MaybeObserver
    public void onComplete() {
        if (!this.config.guardObserverCallbacks) {
            this.delegate.onComplete();
            return;
        }
        a aVar = new a(this, (byte) 1);
        CompletableObserver completableObserver = this.delegate;
        Objects.requireNonNull(completableObserver);
        RxDogTag.guardedDelegateCall(aVar, new n6(completableObserver, (byte) 3));
    }

    @Override // io.reactivex.rxjava3.core.CompletableObserver, io.reactivex.rxjava3.core.MaybeObserver
    public void onError(Throwable th) {
        CompletableObserver completableObserver = this.delegate;
        boolean z = completableObserver instanceof RxDogTagErrorReceiver;
        RxDogTag.Configuration configuration = this.config;
        if (!z) {
            RxDogTag.reportError(configuration, this.t, th, null);
            return;
        }
        if (completableObserver instanceof RxDogTagTaggedExceptionReceiver) {
            completableObserver.onError(RxDogTag.createException(configuration, this.t, th, null));
        } else if (configuration.guardObserverCallbacks) {
            RxDogTag.guardedDelegateCall(new c(this, (byte) 0), new d(this, th, (byte) 0));
        } else {
            completableObserver.onError(th);
        }
    }

    @Override // io.reactivex.rxjava3.core.CompletableObserver, io.reactivex.rxjava3.core.MaybeObserver
    public void onSubscribe(Disposable disposable) {
        if (this.config.guardObserverCallbacks) {
            RxDogTag.guardedDelegateCall(new a(this, (byte) 0), new b(this, disposable, (byte) 0));
        } else {
            this.delegate.onSubscribe(disposable);
        }
    }
}
