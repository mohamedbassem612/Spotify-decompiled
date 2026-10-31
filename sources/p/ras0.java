package p;

import android.net.Uri;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class ras0 {
    public static final Set a = f46.S0(new String[]{"www.paypal.com", "www.sandbox.paypal.com"});

    public static final boolean a(Uri uri) {
        if (!nhc1.S(uri.getScheme(), "https", true)) {
            return false;
        }
        Set set = a;
        String host = uri.getHost();
        return o7h.i0(set, host != null ? host.toLowerCase(Locale.ROOT) : null);
    }
}
