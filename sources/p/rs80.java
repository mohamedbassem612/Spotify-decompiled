package p;

import android.net.Uri;
import com.spotify.base.java.logging.Logger;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class rs80 implements ps80 {
    public final String a(Uri uri) {
        if (uri.isOpaque()) {
            Logger.d("Got non-absolute install referrer: " + this, new Object[0]);
            return "";
        }
        ArrayList arrayList = new ArrayList();
        String queryParameter = uri.getQueryParameter("utm_campaign");
        if (queryParameter != null) {
            arrayList.add("utm_campaign=".concat(queryParameter));
        }
        String queryParameter2 = uri.getQueryParameter("utm_medium");
        if (queryParameter2 != null) {
            arrayList.add("utm_medium=".concat(queryParameter2));
        }
        String queryParameter3 = uri.getQueryParameter("utm_source");
        if (queryParameter3 != null) {
            arrayList.add("utm_source=".concat(queryParameter3));
        }
        return o7h.y0(arrayList, "&", (String) null, (String) null, (iu30) null, 62);
    }

    public final boolean b(Uri uri) {
        if (uri.isHierarchical()) {
            return (uri.getQueryParameter("utm_campaign") == null && uri.getQueryParameter("utm_medium") == null && uri.getQueryParameter("utm_source") == null) ? false : true;
        }
        return false;
    }
}
