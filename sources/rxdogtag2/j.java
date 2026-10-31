package rxdogtag2;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final /* synthetic */ class j implements RxDogTag.NonCheckingConsumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ DogTagSubscriber b;

    public /* synthetic */ j(DogTagSubscriber dogTagSubscriber, byte b) {
        this.a = b;
        this.b = dogTagSubscriber;
    }

    @Override // rxdogtag2.RxDogTag.NonCheckingConsumer
    public final void accept(Object obj) {
        byte b = this.a;
        DogTagSubscriber dogTagSubscriber = this.b;
        Throwable th = (Throwable) obj;
        switch (b) {
            case 0:
                dogTagSubscriber.lambda$onNext$2(th);
                break;
            default:
                dogTagSubscriber.lambda$onSubscribe$0(th);
                break;
        }
    }
}
