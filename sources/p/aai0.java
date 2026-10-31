package p;

import android.content.Context;
import android.net.Uri;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class aai0 {
    public final String a;
    public final Context b;

    public aai0(Context context, String str) {
        this.a = str;
        this.b = context;
    }

    public static boolean a(Uri uri) {
        return uri != null && uri.toString().startsWith("android.resource");
    }

    public static Uri b(Uri uri) {
        String path = uri.getPath();
        if (path == null || path.isEmpty()) {
            return Uri.EMPTY;
        }
        if (!path.isEmpty() && '/' == path.charAt(0)) {
            path = path.substring(1);
        }
        if (path.startsWith("spotify:")) {
            return Uri.parse(path);
        }
        String queryParameter = uri.getQueryParameter("cdn");
        if (jhc1.F(queryParameter)) {
            queryParameter = "i.scdn.co";
        }
        Uri.Builder builderPath = new Uri.Builder().scheme("https").authority(queryParameter).path(path);
        for (String str : uri.getQueryParameterNames()) {
            if (!str.equals("cdn") && !str.equals("transformation") && !str.equals("dimension") && !str.equals("fallback")) {
                builderPath.appendQueryParameter(str, uri.getQueryParameter(str));
            }
        }
        return builderPath.build();
    }

    public final Uri c(int i) {
        Uri.Builder builderScheme = new Uri.Builder().scheme("android.resource");
        Context context = this.b;
        return builderScheme.authority(context.getResources().getResourcePackageName(i)).appendPath(context.getResources().getResourceTypeName(i)).appendPath(context.getResources().getResourceEntryName(i)).build();
    }

    public final Uri d(int i, Uri uri) {
        if (a(uri)) {
            return uri;
        }
        if (uri.toString().startsWith("spotify:")) {
            return h(null, Collections.singletonList(uri.toString()), null, i);
        }
        String authority = uri.getAuthority();
        return jhc1.F(authority) ? Uri.EMPTY : h(authority, uri.getPathSegments(), uri, i);
    }

    public final Uri e(Uri uri, int i, int i2) {
        String str;
        if (a(uri)) {
            return uri;
        }
        Uri.Builder builderBuildUpon = d(i, uri).buildUpon();
        if (i2 == 1) {
            str = "LARGE";
        } else if (i2 == 2) {
            str = "NORMAL";
        } else {
            if (i2 != 3) {
                throw null;
            }
            str = "SMALL";
        }
        return builderBuildUpon.appendQueryParameter("dimension", str).build();
    }

    public final Uri f(Uri uri, int i, Uri uri2) {
        Uri uriD = d(i, uri);
        Uri uri3 = Uri.EMPTY;
        return (uriD.equals(uri3) || a(uriD) || uri2 == null || uri2.equals(uri3)) ? uriD : uriD.buildUpon().appendQueryParameter("fallback", uri2.toString()).build();
    }

    public final Uri g(String str) {
        return (str == null || str.isEmpty()) ? Uri.EMPTY : d(3, Uri.parse(str));
    }

    public final Uri h(String str, List list, Uri uri, int i) {
        Uri.Builder builderAuthority = new Uri.Builder().scheme("content").authority(this.a);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            builderAuthority.appendPath((String) it.next());
        }
        if (uri != null && uri.getPath() != null && uri.getPath().endsWith("/")) {
            builderAuthority.appendEncodedPath("");
        }
        if (str != null) {
            builderAuthority.appendQueryParameter("cdn", str);
        }
        builderAuthority.appendQueryParameter("transformation", v8i0.m(i));
        if (uri != null) {
            for (String str2 : uri.getQueryParameterNames()) {
                builderAuthority.appendQueryParameter(str2, uri.getQueryParameter(str2));
            }
        }
        return builderAuthority.build();
    }
}
