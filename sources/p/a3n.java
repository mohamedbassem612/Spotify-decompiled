package p;

import android.webkit.CookieManager;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class a3n implements Callable {
    public static final a3n b = new a3n(0);
    public static final a3n c = new a3n(1);
    public static final /* synthetic */ a3n d = new a3n(2);
    public final /* synthetic */ byte a;

    public /* synthetic */ a3n(byte b2) {
        this.a = b2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return CookieManager.getInstance();
            case 1:
                return ubm0.i;
            default:
                xot xotVar = f3m0.e;
                return null;
        }
    }
}
