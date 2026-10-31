package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class gn21 extends Observable implements Consumer {
    public abstract Observable a();

    public final void subscribeActual(Observer observer) {
        a().subscribe(observer);
    }
}
