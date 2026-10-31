package rxdogtag2;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final /* synthetic */ class f implements RxDogTag.NonCheckingConsumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ DogTagMaybeObserver b;

    public /* synthetic */ f(DogTagMaybeObserver dogTagMaybeObserver, byte b) {
        this.a = b;
        this.b = dogTagMaybeObserver;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        DogTagMaybeObserver dogTagMaybeObserver = this.b;
        Throwable th = (Throwable) obj;
        switch (b) {
            case 0:
                DogTagMaybeObserver.c(dogTagMaybeObserver, th);
                break;
            default:
                DogTagMaybeObserver.b(dogTagMaybeObserver, th);
                break;
        }
    }
}
