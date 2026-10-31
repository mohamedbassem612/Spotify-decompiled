package p;

import android.webkit.CookieManager;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class x2n implements Callable {
    public static final x2n a = new x2n();

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return CookieManager.getInstance();
    }
}
