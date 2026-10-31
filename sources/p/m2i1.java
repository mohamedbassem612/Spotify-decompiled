package p;

import android.net.Uri;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract class m2i1 {
    public static final Set a = f46.S0(new String[]{"http", "https"});
    public static final Set b = f46.S0(new se11[]{new se11("spotify\\.com"), new se11("www\\.spotify\\.com"), new se11(".*\\.spotify\\.com$")});

    public static final boolean a(Uri uri) {
        String host = uri.getHost();
        if (host != null && o7h.i0(a, uri.getScheme())) {
            Set set = b;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    if (((se11) it.next()).e(host)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
