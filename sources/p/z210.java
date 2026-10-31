package p;

import android.net.Uri;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class z210 implements n2i1 {
    public static final Set a = f46.S0(new String[]{"http", "https"});

    public final boolean s(Uri uri) {
        String scheme = uri.getScheme();
        return !o7h.i0(a, scheme != null ? scheme.toLowerCase(Locale.ROOT) : null) || u890.j(uri.getHost(), "open.spotify.com");
    }
}
