package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qs80 implements ps80 {
    public final String a(Uri uri) {
        String queryParameter;
        return (uri.isOpaque() || (queryParameter = uri.getQueryParameter("~campaign")) == null) ? "" : queryParameter;
    }

    public final boolean b(Uri uri) {
        return uri.isHierarchical() && uri.getQueryParameter("~campaign") != null;
    }
}
