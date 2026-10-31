package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final /* synthetic */ class wvo1 implements Callable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ot71 b;

    public /* synthetic */ wvo1(ot71 ot71Var, byte b) {
        this.a = b;
        this.b = ot71Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return this.b.a();
    }
}
