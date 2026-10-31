package rxdogtag2;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.observers.LambdaConsumerIntrospection;
import java.util.Objects;
import p.fss;
import p.gnc1;
import p.pnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
final class DogTagSubscriber<T> implements FlowableSubscriber<T>, LambdaConsumerIntrospection {
    private final RxDogTag.Configuration config;
    private final gnc1 delegate;
    private final Throwable t = new Throwable();

    public DogTagSubscriber(RxDogTag.Configuration configuration, gnc1 gnc1Var) {
        this.config = configuration;
        this.delegate = gnc1Var;
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
    public /* synthetic */ void lambda$onSubscribe$1(pnc1 pnc1Var) {
        this.delegate.onSubscribe(pnc1Var);
    }

    @Override // io.reactivex.rxjava3.observers.LambdaConsumerIntrospection
    public boolean hasCustomOnError() {
        gnc1 gnc1Var = this.delegate;
        return (gnc1Var instanceof LambdaConsumerIntrospection) && ((LambdaConsumerIntrospection) gnc1Var).hasCustomOnError();
    }

    @Override // p.gnc1
    public void onComplete() {
        if (!this.config.guardObserverCallbacks) {
            this.delegate.onComplete();
            return;
        }
        i iVar = new i(this, (byte) 0);
        gnc1 gnc1Var = this.delegate;
        Objects.requireNonNull(gnc1Var);
        RxDogTag.guardedDelegateCall(iVar, new fss(gnc1Var, (byte) 12));
    }

    @Override // p.gnc1
    public void onError(Throwable th) {
        gnc1 gnc1Var = this.delegate;
        boolean z = gnc1Var instanceof RxDogTagErrorReceiver;
        RxDogTag.Configuration configuration = this.config;
        if (!z) {
            RxDogTag.reportError(configuration, this.t, th, null);
            return;
        }
        if (gnc1Var instanceof RxDogTagTaggedExceptionReceiver) {
            gnc1Var.onError(RxDogTag.createException(configuration, this.t, th, null));
        } else if (configuration.guardObserverCallbacks) {
            RxDogTag.guardedDelegateCall(new i(this, (byte) 1), new d(this, th, (byte) 4));
        } else {
            gnc1Var.onError(th);
        }
    }

    @Override // p.gnc1
    public void onNext(T t) {
        if (this.config.guardObserverCallbacks) {
            RxDogTag.guardedDelegateCall(new j(this, (byte) 0), new b(this, t, (byte) 7));
        } else {
            this.delegate.onNext(t);
        }
    }

    @Override // p.gnc1
    public void onSubscribe(pnc1 pnc1Var) {
        if (this.config.guardObserverCallbacks) {
            RxDogTag.guardedDelegateCall(new j(this, (byte) 1), new b(this, pnc1Var, (byte) 8));
        } else {
            this.delegate.onSubscribe(pnc1Var);
        }
    }
}
