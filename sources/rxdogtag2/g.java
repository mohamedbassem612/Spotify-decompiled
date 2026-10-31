package rxdogtag2;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final /* synthetic */ class g implements RxDogTag.NonCheckingConsumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ DogTagObserver b;

    public /* synthetic */ g(DogTagObserver dogTagObserver, byte b) {
        this.a = b;
        this.b = dogTagObserver;
    }

    @Override // rxdogtag2.RxDogTag.NonCheckingConsumer
    public final void accept(Object obj) {
        byte b = this.a;
        DogTagObserver dogTagObserver = this.b;
        Throwable th = (Throwable) obj;
        switch (b) {
            case 0:
                dogTagObserver.lambda$onSubscribe$0(th);
                break;
            case 1:
                dogTagObserver.lambda$onNext$2(th);
                break;
            default:
                dogTagObserver.lambda$onComplete$6(th);
                break;
        }
    }
}
