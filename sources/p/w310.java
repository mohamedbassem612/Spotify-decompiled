package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public interface w310 {
    default Observable a(r9c r9cVar) {
        return b(r9cVar).toObservable();
    }

    default Single b(r9c r9cVar) {
        return Single.just(new z310(z6x.a));
    }
}
