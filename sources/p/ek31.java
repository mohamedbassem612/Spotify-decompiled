package p;

import java.net.URI;
import java.security.MessageDigest;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract class ek31 {
    public static final se11 a = new se11("[^A-Za-z0-9/_.-]");
    public static final se11 b = new se11("^[A-Za-z0-9_.-]+$");
    public static final se11 c = new se11("[^A-Za-z0-9_.-]");

    public static final String a(String str) {
        boolean zE = b.e(str);
        String strG = c.g("_", str.replace('/', '.'));
        int length = strG.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            char cCharAt = strG.charAt(!z ? i : length);
            boolean z2 = cCharAt == '.' || cCharAt == '_' || cCharAt == '-';
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        String string = strG.subSequence(i, length + 1).toString();
        if (ihc1.y0(string)) {
            string = "resource";
        }
        return zE ? string : f4i1.f(string, "-", o7h.y0(f46.J0(MessageDigest.getInstance("SHA-256").digest(str.getBytes(nne.a)), 4), "", (String) null, (String) null, oe31.a1, 30));
    }

    public static final String b(String str) {
        String m231Var;
        try {
            URI uri = new URI(str);
            String host = uri.getHost();
            if (host != null) {
                String lowerCase = host.toLowerCase(Locale.ROOT);
                if (ihc1.y0(lowerCase)) {
                    lowerCase = null;
                }
                if (lowerCase == null) {
                    m231Var = null;
                } else {
                    String path = uri.getPath();
                    if (path == null) {
                        path = "/";
                    } else {
                        if (ihc1.y0(path)) {
                            path = null;
                        }
                        if (path == null) {
                            path = "/";
                        }
                    }
                    m231Var = a.g("_", lowerCase.concat(path));
                }
            } else {
                m231Var = null;
            }
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        String str2 = m231Var instanceof m231 ? null : m231Var;
        return str2 == null ? "unresolved" : str2;
    }
}
