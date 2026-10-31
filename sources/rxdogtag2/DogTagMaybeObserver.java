package rxdogtag2;

import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.observers.LambdaConsumerIntrospection;
import java.util.Objects;
import p.fss;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
final class DogTagMaybeObserver<T> implements MaybeObserver<T>, LambdaConsumerIntrospection {
    private final RxDogTag.Configuration config;
    private final MaybeObserver<T> delegate;
    private final Throwable t = new Throwable();

    public DogTagMaybeObserver(RxDogTag.Configuration configuration, MaybeObserver<T> maybeObserver) {
        this.config = configuration;
        this.delegate = maybeObserver;
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
        MaybeObserver<T> maybeObserver = this.delegate;
        return (maybeObserver instanceof LambdaConsumerIntrospection) && ((LambdaConsumerIntrospection) maybeObserver).hasCustomOnError();
    }

    @Override // io.reactivex.rxjava3.core.MaybeObserver
    public void onComplete() {
        if (!this.config.guardObserverCallbacks) {
            this.delegate.onComplete();
            return;
        }
        f fVar = new f(this, (byte) 0);
        MaybeObserver<T> maybeObserver = this.delegate;
        Objects.requireNonNull(maybeObserver);
        RxDogTag.guardedDelegateCall(fVar, new fss(maybeObserver, (byte) 11));
    }

    @Override // io.reactivex.rxjava3.core.MaybeObserver
    public void onError(Throwable th) {
        MaybeObserver<T> maybeObserver = this.delegate;
        boolean z = maybeObserver instanceof RxDogTagErrorReceiver;
        RxDogTag.Configuration configuration = this.config;
        if (!z) {
            RxDogTag.reportError(configuration, this.t, th, null);
            return;
        }
        if (maybeObserver instanceof RxDogTagTaggedExceptionReceiver) {
            maybeObserver.onError(RxDogTag.createException(configuration, this.t, th, null));
        } else if (configuration.guardObserverCallbacks) {
            RxDogTag.guardedDelegateCall(new f(this, (byte) 1), new d(this, th, (byte) 1));
        } else {
            maybeObserver.onError(th);
        }
    }

    @Override // io.reactivex.rxjava3.core.MaybeObserver
    public void onSubscribe(Disposable disposable) {
        if (this.config.guardObserverCallbacks) {
            RxDogTag.guardedDelegateCall(new e(this, (byte) 1), new b(this, disposable, (byte) 2));
        } else {
            this.delegate.onSubscribe(disposable);
        }
    }

    @Override // io.reactivex.rxjava3.core.MaybeObserver
    public void onSuccess(T t) {
        if (this.config.guardObserverCallbacks) {
            RxDogTag.guardedDelegateCall(new e(this, (byte) 0), new b(this, t, (byte) 1));
        } else {
            this.delegate.onSuccess(t);
        }
    }
}
