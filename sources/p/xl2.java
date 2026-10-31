package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class xl2 implements ObservableTransformer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yl2 b;
    public final /* synthetic */ String c;

    public /* synthetic */ xl2(yl2 yl2Var, String str, byte b) {
        this.a = b;
        this.b = yl2Var;
        this.c = str;
    }

    public final ObservableSource apply(Observable observable) {
        byte b = this.a;
        String str = this.c;
        yl2 yl2Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return observable.flatMapSingle(new oj80(yl2Var, str, (byte) 19));
            default:
                return observable.flatMapSingle(new ycc1(yl2Var, str, (byte) 20));
        }
    }
}
