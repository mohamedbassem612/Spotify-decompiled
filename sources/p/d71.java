package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class d71 implements ObservableTransformer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ j71 b;

    public /* synthetic */ d71(j71 j71Var, byte b) {
        this.a = b;
        this.b = j71Var;
    }

    public final ObservableSource apply(Observable observable) {
        byte b = this.a;
        j71 j71Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return observable.switchMap(new w4b1(j71Var, (byte) 8));
            case 1:
                return observable.switchMap(new lan1(j71Var, (byte) 6));
            default:
                return observable.switchMap(new yo31(j71Var, (byte) 7));
        }
    }
}
