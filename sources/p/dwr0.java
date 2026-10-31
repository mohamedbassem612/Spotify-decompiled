package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class dwr0 {
    public final g8h1 a;
    public final z6r0 b;

    public dwr0(g8h1 g8h1Var, z6r0 z6r0Var) {
        this.a = g8h1Var;
        this.b = z6r0Var;
    }

    public static String a(String str, String str2, vur0 vur0Var) {
        String str3;
        int iOrdinal = vur0Var.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            str3 = "change-to-managed-account";
        } else {
            if (iOrdinal != 2 && iOrdinal != 3) {
                eg.o();
                return null;
            }
            str3 = "create-managed-account";
        }
        Uri.Builder builderAppendPath = Uri.parse(str).buildUpon().appendPath(str3);
        if (str2.length() > 0) {
            builderAppendPath = builderAppendPath.appendQueryParameter("session", str2);
        }
        return builderAppendPath.appendQueryParameter("source", vur0Var.a()).build().toString();
    }
}
