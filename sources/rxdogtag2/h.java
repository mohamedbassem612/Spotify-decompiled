package rxdogtag2;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final /* synthetic */ class h implements RxDogTag.NonCheckingConsumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ DogTagSingleObserver b;

    public /* synthetic */ h(DogTagSingleObserver dogTagSingleObserver, byte b) {
        this.a = b;
        this.b = dogTagSingleObserver;
    }

    @Override // rxdogtag2.RxDogTag.NonCheckingConsumer
    public final void accept(Object obj) {
        byte b = this.a;
        DogTagSingleObserver dogTagSingleObserver = this.b;
        Throwable th = (Throwable) obj;
        switch (b) {
            case 0:
                dogTagSingleObserver.lambda$onSuccess$2(th);
                break;
            default:
                dogTagSingleObserver.lambda$onSubscribe$0(th);
                break;
        }
    }
}
