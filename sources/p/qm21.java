package p;

import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class qm21 {
    public static final Locale a = new Locale("en", "US", "POSIX");
    public static final se11 b = new se11("^[a-z0-9][a-z0-9._+-]*$");

    public static final String a(String str) {
        String str2;
        String str3;
        String lowerCase = ihc1.e1(ihc1.h1(ihc1.e1(str).toString(), new char[]{'@'})).toString().toLowerCase(a);
        if (lowerCase.length() == 0) {
            return null;
        }
        List listP0 = ihc1.P0(lowerCase, new char[]{'@'}, 6);
        int size = listP0.size();
        if (size == 1) {
            str2 = (String) o7h.V0(listP0);
            str3 = "spotify.com";
        } else {
            if (size != 2) {
                return null;
            }
            str2 = (String) listP0.get(0);
            str3 = (String) listP0.get(1);
        }
        if (!u890.j(str3, "spotify.com") || !b.e(str2) || ihc1.n0(str2, '.') || ihc1.h0(str2, "..", false)) {
            return null;
        }
        return f4i1.f(str2, "@", str3);
    }
}
