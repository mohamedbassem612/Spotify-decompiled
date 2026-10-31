package p;

import android.webkit.ValueCallback;
import io.reactivex.rxjava3.core.CompletableEmitter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class b3n implements ValueCallback {
    public final /* synthetic */ CompletableEmitter a;

    public b3n(CompletableEmitter completableEmitter) {
        this.a = completableEmitter;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        this.a.onComplete();
    }
}
