package rxdogtag2;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final /* synthetic */ class e implements RxDogTag.NonCheckingConsumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ DogTagMaybeObserver b;

    public /* synthetic */ e(DogTagMaybeObserver dogTagMaybeObserver, byte b) {
        this.a = b;
        this.b = dogTagMaybeObserver;
    }

    @Override // rxdogtag2.RxDogTag.NonCheckingConsumer
    public final void accept(Object obj) {
        byte b = this.a;
        DogTagMaybeObserver dogTagMaybeObserver = this.b;
        Throwable th = (Throwable) obj;
        switch (b) {
            case 0:
                dogTagMaybeObserver.lambda$onSuccess$2(th);
                break;
            default:
                dogTagMaybeObserver.lambda$onSubscribe$0(th);
                break;
        }
    }
}
