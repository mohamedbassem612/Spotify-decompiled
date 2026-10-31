package rxdogtag2;

import io.reactivex.rxjava3.observers.LambdaConsumerIntrospection;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Throwable b;
    public final /* synthetic */ LambdaConsumerIntrospection c;

    public /* synthetic */ d(LambdaConsumerIntrospection lambdaConsumerIntrospection, Throwable th, byte b) {
        this.a = b;
        this.c = lambdaConsumerIntrospection;
        this.b = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Throwable th = this.b;
        DogTagSubscriber dogTagSubscriber = this.c;
        switch (b) {
            case 0:
                DogTagCompletableObserver.e((DogTagCompletableObserver) dogTagSubscriber, th);
                break;
            case 1:
                DogTagMaybeObserver.e((DogTagMaybeObserver) dogTagSubscriber, th);
                break;
            case 2:
                DogTagObserver.f((DogTagObserver) dogTagSubscriber, th);
                break;
            case 3:
                DogTagSingleObserver.a((DogTagSingleObserver) dogTagSubscriber, th);
                break;
            default:
                DogTagSubscriber.h(dogTagSubscriber, th);
                break;
        }
    }
}
