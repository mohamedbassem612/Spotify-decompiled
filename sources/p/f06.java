package p;

import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class f06 {
    public final Observable a;

    public f06(Observable observable, byte b) {
        switch (b) {
            case 1:
                this.a = observable.distinctUntilChanged().map(o810.b);
                break;
            default:
                this.a = observable;
                break;
        }
    }
}
