package p;

import android.net.Uri;
import com.spotify.authentication.tokenexchangeapi.TokenExchangeException;
import io.reactivex.rxjava3.functions.Function;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class e810 implements Function {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Uri b;

    public /* synthetic */ e810(Uri uri, byte b) {
        this.a = b;
        this.b = uri;
    }

    public final Object apply(Object obj) throws Throwable {
        byte b = this.a;
        Uri uri = this.b;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                if ((th instanceof TokenExchangeException) || (th instanceof TimeoutException)) {
                    return uri;
                }
                throw th;
            default:
                Throwable th2 = (Throwable) obj;
                if ((th2 instanceof TokenExchangeException) || (th2 instanceof TimeoutException)) {
                    return uri;
                }
                throw th2;
        }
    }
}
