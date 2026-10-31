package p;

import com.spotify.mobius.android.MobiusLoopViewModel;
import com.spotify.mobius.functions.Consumer;
import io.reactivex.rxjava3.core.ObservableEmitter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final /* synthetic */ class ms20 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ms20(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void accept(Object obj) throws Throwable {
        Throwable thA;
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                Object objE = ilo1.E(obj, (ssw0) obj2);
                if ((objE instanceof pge) && (thA = qge.a(objE)) != null && !(thA instanceof InterruptedException)) {
                    throw thA;
                }
                return;
            case 1:
                ((MobiusLoopViewModel) obj2).b.j(obj);
                return;
            default:
                ((ObservableEmitter) obj2).onNext(obj);
                return;
        }
    }
}
