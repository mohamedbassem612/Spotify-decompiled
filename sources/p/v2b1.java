package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class v2b1 {
    public static final se11 a = new se11("([\\w-]+\\.[\\w-]+\\.[\\w-]+\\.[\\w-]+$)");

    public static final String a(Uri uri) {
        String str;
        mbh0 mbh0VarA = se11.a(a, String.valueOf(uri.getHost()));
        return (mbh0VarA == null || (str = (String) mbh0VarA.a().get(1)) == null) ? uri.getHost() : str;
    }
}
