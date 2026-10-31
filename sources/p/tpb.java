package p;

import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.core.SingleOnSubscribe;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tpb implements SingleOnSubscribe {
    public final ne a;

    public void subscribe(SingleEmitter singleEmitter) {
        singleEmitter.onSuccess(((cj4) this.a.d).c().a.e);
    }
}
