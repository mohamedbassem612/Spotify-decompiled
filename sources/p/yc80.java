package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class yc80 implements ObservableTransformer {
    public final /* synthetic */ byte a;
    public final nf61 b;
    public final c23 c;
    public final phi0 d;
    public final Observable e;

    public /* synthetic */ yc80(nf61 nf61Var, c23 c23Var, phi0 phi0Var, Observable observable, byte b) {
        this.a = b;
        this.b = nf61Var;
        this.c = c23Var;
        this.d = phi0Var;
        this.e = observable;
    }

    public final ObservableSource apply(Observable observable) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return observable.switchMap(new bm00(this, (byte) 18));
            default:
                return observable.switchMap(new tz01(this, (byte) 2));
        }
    }
}
