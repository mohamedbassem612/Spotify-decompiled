package p;

import android.net.Uri;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class frv0 {
    public static final Set b = dm61.z0(new String[]{"/purchase/offer/", "/redirect-in-app/android_premium_promotion/"});
    public final h550 a;

    public frv0(h550 h550Var) {
        this.a = h550Var;
    }

    public final boolean a(Uri uri) {
        String path;
        String host;
        fm4 fm4Var = this.a.a;
        if (fm4Var.c() && fm4Var.b() && (path = uri.getPath()) != null && u890.j(uri.getScheme(), "https") && ((u890.j(uri.getHost(), "spotify.com") || ((host = uri.getHost()) != null && nhc1.R(host, ".spotify.com", false))) && uri.getQueryParameter("skip") == null)) {
            Set set = b;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    if (ihc1.j0(path, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
