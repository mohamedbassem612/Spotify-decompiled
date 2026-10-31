package rxdogtag2;

import io.reactivex.rxjava3.observers.LambdaConsumerIntrospection;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final /* synthetic */ class c implements RxDogTag.NonCheckingConsumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ LambdaConsumerIntrospection b;

    public /* synthetic */ c(LambdaConsumerIntrospection lambdaConsumerIntrospection, byte b) {
        this.a = b;
        this.b = lambdaConsumerIntrospection;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        DogTagSingleObserver dogTagSingleObserver = this.b;
        switch (b) {
            case 0:
                DogTagCompletableObserver.c((DogTagCompletableObserver) dogTagSingleObserver, (Throwable) obj);
                break;
            case 1:
                DogTagObserver.g((DogTagObserver) dogTagSingleObserver, (Throwable) obj);
                break;
            default:
                DogTagSingleObserver.c(dogTagSingleObserver, (Throwable) obj);
                break;
        }
    }
}
