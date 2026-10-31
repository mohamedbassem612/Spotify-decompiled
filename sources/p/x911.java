package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class x911 {
    public static boolean a(Uri uri) {
        if (uri.toString().length() > 0) {
            String strH0 = ihc1.H0(uri.toString(), "android-app://");
            for (int i = 0; i < strH0.length(); i++) {
                char cCharAt = strH0.charAt(i);
                if (('0' <= cCharAt && cCharAt < ':') || (('A' <= cCharAt && cCharAt < '[') || (('a' <= cCharAt && cCharAt < '{') || cCharAt == '.' || cCharAt == '-' || cCharAt == '_'))) {
                }
            }
            return true;
        }
        return false;
    }
}
