package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ilb extends Observable {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ ilb(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(Observer observer) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((Observable) obj).subscribe(new hlb(observer));
                break;
            default:
                dxc dxcVarClone = ((wyp0) obj).clone();
                hxc hxcVar = new hxc(dxcVarClone, observer);
                observer.onSubscribe(hxcVar);
                if (!hxcVar.isDisposed()) {
                    ((wyp0) dxcVarClone).p(hxcVar);
                }
                break;
        }
    }
}
