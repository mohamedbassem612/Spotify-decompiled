package rxdogtag2;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final /* synthetic */ class i implements RxDogTag.NonCheckingConsumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ DogTagSubscriber b;

    public /* synthetic */ i(DogTagSubscriber dogTagSubscriber, byte b) {
        this.a = b;
        this.b = dogTagSubscriber;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        DogTagSubscriber dogTagSubscriber = this.b;
        Throwable th = (Throwable) obj;
        switch (b) {
            case 0:
                DogTagSubscriber.e(dogTagSubscriber, th);
                break;
            default:
                DogTagSubscriber.b(dogTagSubscriber, th);
                break;
        }
    }
}
