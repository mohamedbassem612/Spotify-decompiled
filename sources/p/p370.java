package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class p370 {
    public static final bg11 a = b380.u("spotify:cached-files", "spotify:local-files:cover:v1");

    public static Uri a(String str) {
        if (str == null) {
            return Uri.EMPTY;
        }
        if (!str.startsWith("spotify:")) {
            return str.startsWith("https://") ? Uri.parse(str) : Uri.EMPTY;
        }
        if (!str.startsWith("spotify:mosaic:")) {
            if (!str.startsWith("spotify:image:")) {
                return (a.contains(str) || str.startsWith("spotify:localfileimage:")) ? Uri.parse(str) : Uri.EMPTY;
            }
            String[] strArrSplit = str.split(":");
            if (strArrSplit.length != 3) {
                return Uri.EMPTY;
            }
            return Uri.parse("https://image-cdn.spotifycdn.com/image/" + strArrSplit[2]);
        }
        Uri.Builder builderBuildUpon = Uri.parse("https://mosaic.scdn.co/").buildUpon();
        builderBuildUpon.appendPath("640");
        String[] strArrSplit2 = str.substring(15).split(":");
        StringBuilder sb = new StringBuilder();
        for (String str2 : strArrSplit2) {
            sb.append(str2);
        }
        builderBuildUpon.appendPath(sb.toString());
        return Uri.parse(builderBuildUpon.toString());
    }
}
