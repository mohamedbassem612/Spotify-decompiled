package p;

import com.spotify.accessory.statemanager.AccessoryStateManager;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class gqr implements enm, Function {
    public final Observable a;

    public gqr(Observable observable) {
        this.a = Observable.merge(observable.take(1L), observable.skip(1L)).map(new khc(this, (byte) 12)).distinctUntilChanged();
    }

    @Override // io.reactivex.rxjava3.functions.Function
    public Object apply(Object obj) {
        return this.a.first(Boolean.FALSE).map(new fey((AccessoryStateManager.Event) obj, (byte) 18));
    }

    public Observable b() {
        return this.a;
    }
}
