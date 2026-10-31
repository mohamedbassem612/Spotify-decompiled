package p;

import android.net.Uri;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class g77 {
    public static final Pattern a = Pattern.compile("\\?.*");
    public static final Pattern b = Pattern.compile("^/+");
    public static final Pattern c = Pattern.compile("\\?.*");
    public static final Uri d = Uri.parse("https://open.spotify.com/internal/pullcontext");

    public static final String a(String str) {
        Uri uri = Uri.parse(str);
        if (!uri.isHierarchical()) {
            return c.matcher(str).replaceFirst("");
        }
        Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
        for (String str2 : uri.getQueryParameterNames()) {
            if (!u890.j(str2, "ecf")) {
                builderClearQuery.appendQueryParameter(str2, uri.getQueryParameter(str2));
            }
        }
        return builderClearQuery.build().toString();
    }
}
