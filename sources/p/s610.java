package p;

import io.reactivex.rxjava3.processors.PublishProcessor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class s610 {
    public final zeu0 a;
    public final PublishProcessor b = new PublishProcessor();

    public s610(zeu0 zeu0Var) {
        this.a = zeu0Var;
    }

    public final void a(mkv mkvVar) {
        this.b.onNext(mkvVar);
    }
}
