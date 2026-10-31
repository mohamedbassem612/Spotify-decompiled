package rxdogtag2;

import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.observers.LambdaConsumerIntrospection;
import p.pnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ LambdaConsumerIntrospection b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b(LambdaConsumerIntrospection lambdaConsumerIntrospection, Object obj, byte b) {
        this.a = b;
        this.b = lambdaConsumerIntrospection;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Object obj = this.c;
        LambdaConsumerIntrospection lambdaConsumerIntrospection = this.b;
        switch (b) {
            case 0:
                ((DogTagCompletableObserver) lambdaConsumerIntrospection).lambda$onSubscribe$1((Disposable) obj);
                break;
            case 1:
                ((DogTagMaybeObserver) lambdaConsumerIntrospection).lambda$onSuccess$3(obj);
                break;
            case 2:
                ((DogTagMaybeObserver) lambdaConsumerIntrospection).lambda$onSubscribe$1((Disposable) obj);
                break;
            case 3:
                ((DogTagObserver) lambdaConsumerIntrospection).lambda$onSubscribe$1((Disposable) obj);
                break;
            case 4:
                ((DogTagObserver) lambdaConsumerIntrospection).lambda$onNext$3(obj);
                break;
            case 5:
                ((DogTagSingleObserver) lambdaConsumerIntrospection).lambda$onSuccess$3(obj);
                break;
            case 6:
                ((DogTagSingleObserver) lambdaConsumerIntrospection).lambda$onSubscribe$1((Disposable) obj);
                break;
            case 7:
                ((DogTagSubscriber) lambdaConsumerIntrospection).lambda$onNext$3(obj);
                break;
            default:
                ((DogTagSubscriber) lambdaConsumerIntrospection).lambda$onSubscribe$1((pnc1) obj);
                break;
        }
    }
}
