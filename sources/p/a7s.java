package p;

import io.reactivex.rxjava3.subjects.PublishSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class a7s {
    public final PublishSubject a;

    public a7s() {
        this.a = new PublishSubject();
    }

    public void a() {
        this.a.onNext(fxg0.a);
    }

    public a7s(PublishSubject publishSubject) {
        this.a = publishSubject;
    }
}
