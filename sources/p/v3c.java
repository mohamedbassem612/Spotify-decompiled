package p;

import android.net.Uri;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class v3c implements uz71 {
    public static final Set a = dm61.z0(new String[]{"link.tospotify.com", "spotify.link", "spotify.app.link", "spotify-alternate.app.link", "spotify.test-app.link", "spotify-alternate.test-app.link"});

    public final boolean f(String str) {
        Uri uri = Uri.parse(str);
        if (!uri.isHierarchical()) {
            return false;
        }
        if (o7h.i0(a, uri.getAuthority())) {
            return true;
        }
        return u890.j(uri.getScheme(), "spotify") && uri.getQueryParameter("_branch_referrer") != null;
    }
}
