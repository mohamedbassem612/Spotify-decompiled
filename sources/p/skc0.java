package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class skc0 {
    public final g8h1 a;
    public final z6r0 b;

    public skc0(g8h1 g8h1Var, z6r0 z6r0Var) {
        this.a = g8h1Var;
        this.b = z6r0Var;
    }

    public static String a(String str, String str2, String str3) {
        return Uri.parse(str).buildUpon().appendPath("link-account").appendPath(str2).appendQueryParameter("source", str3).build().toString();
    }

    public final String b(String str) {
        String strA;
        int iC = l1d.C(1);
        if (iC == 0) {
            strA = a("https://www.spotify.com/account/parental-consent", str, "dependent-initiated-linking");
        } else {
            if (iC != 1) {
                eg.o();
                return null;
            }
            strA = a("https://www.spotify.com/account/dependent-consent", str, "parent-initiated-linking");
        }
        y6r0 y6r0VarB = this.b.b();
        return this.a.b(Uri.parse(strA), y6r0VarB != null ? new xvn0(y6r0VarB) : null).toString();
    }
}
