package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class yq implements ObservableTransformer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zq b;

    public /* synthetic */ yq(zq zqVar, byte b) {
        this.a = b;
        this.b = zqVar;
    }

    public final ObservableSource apply(Observable observable) {
        byte b = this.a;
        zq zqVar = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return observable.flatMap(new t7o0(zqVar, (byte) 3));
            default:
                return observable.flatMap(new ymm0(zqVar, (byte) 2));
        }
    }
}
