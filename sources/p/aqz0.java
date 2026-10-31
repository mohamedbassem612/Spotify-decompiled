package p;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class aqz0 {
    public static final /* synthetic */ int a = 0;

    static {
        Pattern.compile("radio:", 16);
    }

    public static String a(String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("spotify:station:")) {
            if (!str.contains("cluster:")) {
                return "spotify:".concat(str.substring(16));
            }
        } else {
            if (str.startsWith("spotify:radio:")) {
                return "spotify:".concat(str.substring(14));
            }
            if (!str.startsWith("spotify:")) {
                return null;
            }
        }
        return str;
    }

    public static boolean b(String str) {
        return str != null && str.startsWith("spotify:station:");
    }
}
