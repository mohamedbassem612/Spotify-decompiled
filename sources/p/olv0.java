package p;

import io.reactivex.rxjava3.core.ObservableEmitter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class olv0 implements jxg {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ olv0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void onColdStartupCompleted(String str) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ObservableEmitter observableEmitter = (ObservableEmitter) obj;
                observableEmitter.onNext(Boolean.TRUE);
                observableEmitter.onComplete();
                break;
            default:
                ((nl21) obj).c.m((Object) null, "operational");
                break;
        }
    }
}
