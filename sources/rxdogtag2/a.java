package rxdogtag2;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final /* synthetic */ class a implements RxDogTag.NonCheckingConsumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ DogTagCompletableObserver b;

    public /* synthetic */ a(DogTagCompletableObserver dogTagCompletableObserver, byte b) {
        this.a = b;
        this.b = dogTagCompletableObserver;
    }

    @Override // rxdogtag2.RxDogTag.NonCheckingConsumer
    public final void accept(Object obj) {
        byte b = this.a;
        DogTagCompletableObserver dogTagCompletableObserver = this.b;
        Throwable th = (Throwable) obj;
        switch (b) {
            case 0:
                dogTagCompletableObserver.lambda$onSubscribe$0(th);
                break;
            default:
                dogTagCompletableObserver.lambda$onComplete$4(th);
                break;
        }
    }
}
